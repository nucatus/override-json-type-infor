import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Child;
import model.Container;
import org.junit.Test;

import java.io.IOException;

/**
 * @author alexandru.ionita
 * @since 1.0.0
 */
public class OverrideJsonTypeInfo
{

    public static final String INPUT = "{" +
            "  \"data\":[" +
            "    {" +
            "      \"id\":\"95ae408f-e786-4471-9dd6-2395fee09cc9\"," +
            "      \"name\":\"testName\"" +
            "    }" +
            "  ]" +
            "}";


    /**
     * In case a {@link TypeReference} is provided, this should instruct
     * the deserializer to favor the type reference in the detriment of a
     * {@link com.fasterxml.jackson.annotation.JsonTypeInfo} annotation.
     *
     * @throws IOException
     */
    @Test
    public void overrideTypeInfoTest() throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Object val = mapper.readValue( INPUT, new TypeReference<Container<Child>>(){} );

        assert val != null;
    }
}
