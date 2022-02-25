   
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class lambdaQ5 {
    public static String processWords(List<String> list) {
        StringBuilder result = new StringBuilder("");
        for(String e :list) {
            Consumer <StringBuilder> sb = (p) -> result.append(p.charAt(0));;
            sb.accept(new StringBuilder(e));
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
            System.out.println(processWords(list));
    }
}