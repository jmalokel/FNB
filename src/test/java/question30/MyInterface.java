package question30;

import java.util.Collection;

public interface MyInterface {

    Collection<Integer> getCollection();
    default Integer getLargestAmount()
    {
        return null;
    }
}
