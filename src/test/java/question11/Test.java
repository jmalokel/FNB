package question11;

public class Test {

    private static int x = 5;

    public static void main(String[] args) {

        x = ~x;
        x +=3;
//        x = !x;
//        x.value();
        x=x >> 1;
    }

}
