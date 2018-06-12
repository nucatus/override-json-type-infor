package model;

import java.util.List;

/**
 * @author alexandru.ionita
 * @since 1.0.0
 */
public class Container<T>
{
    private List<T> data;

    public List<T> getData()
    {
        return data;
    }

    public void setData(List<T> data)
    {
        this.data = data;
    }
}
