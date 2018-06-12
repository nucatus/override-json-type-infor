package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * @author alexandru.ionita
 * @since 1.0.0
 */
public class Child extends Top
{
    private String name;

    @JsonCreator
    public Child(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name)
    {
        super( UUID.fromString( id ) );
        this.name = name;
    }
}
