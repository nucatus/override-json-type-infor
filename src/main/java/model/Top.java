package model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.UUID;

/**
 * @author alexandru.ionita
 * @since 1.0.0
 */
@JsonTypeInfo( use=JsonTypeInfo.Id.CLASS )
public abstract class Top
{
    private UUID id;

    public Top(UUID id)
    {
        this.id = id;
    }
}
