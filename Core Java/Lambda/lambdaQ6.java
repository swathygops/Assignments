import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class lambdaQ6
{
    public static void main(String[] args)  
    {
        ArrayList<String> a = new ArrayList<>(Arrays.asList("As", "Bad", "Code", "Dev", "op"));
        System.out.println("Before Converting  : "+a+"\n");
        System.out.println("After Converting  : "+convertToUpperCase(a)+"\n");
    }
    public static List<String> convertToUpperCase(List<String> list) 
    {
        Consumer <List<String>> b = (p) -> p.replaceAll(String::toUpperCase);
        b.accept( list);
        return (list);
    }
}

