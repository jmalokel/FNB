package question26;

public class Parent {

    protected static int count = 0;
    public Parent()
    {
        count++;
    }

    public static int getCount()
    {
        return count;
    }
}
