package question15;

import jdk.nashorn.internal.runtime.options.Option;

import java.util.Optional;

public class ExceptionDemo {
    public static void main(String[] args) {
        String a = null;
        Optional<String> b = Optional.empty();

        try
        {
            System.out.println(a.length());
            System.out.println(b.orElse("").length());

        }catch(Exception ex){
            System.out.println(a);
        }finally {
            a = "String";
            System.out.println(a.length());
            b = Optional.ofNullable("");
            System.out.println(b.get().length());
        }


        String message = "Enter the last password you remember";

        String[] pass = message.split(" ");

        System.out.println(pass[pass.length - 1]);
    }
}
