import java.util.ArrayList;
import java.util.Arrays;
public class lambdaQ4 {
    public static ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        employeeList.removeIf(s -> ((s.length())%2 != 0));
        return employeeList;
    }
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<> (Arrays.asList("Paddy OFurniture","lavender", "OliveYew", "Aida Bugg", "Maureen Biologist"));
        System.out.println(removeOddLength(employeeList));
    }
}
