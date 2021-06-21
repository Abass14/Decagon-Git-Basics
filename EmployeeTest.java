import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.*;

public class EmployeeTest {
    public static void main(String[] args){
        Employee empOne = new Employee(30);
        Employee empTwo = new Employee(40);

        empOne.setName("Abass");
        empOne.setSalary(100_000.00);
        // empOne.printEmployee();

        empTwo.setName("Bob");
        empTwo.setSalary(350_000.00);
        // empTwo.printEmployee();

    //    String car = "Volvo  lovers";

    //    System.out.println(car.substring(1, 13));
        
        int[] myList = {2, 5, 7, 9, 11, 13};

        int totalSum = 0;
        int max = myList[0];
        for(int i = 1; i < myList.length; i++){
            // System.out.println(myList[i]);
            // totalSum += myList[i];
            if(myList[i] > max){
                max = myList[i];
                
            }
            
        }
        System.out.println("Max value: " + max);
        System.out.println(totalSum);

        Date date = new Date();
        // System.out.println(date.getMonth() + 1);
        // System.out.println(date.getYear() + 1900);

        // SimpleDateFormat simpleDate = new SimpleDateFormat("E, dd-MM-yyyy HH:mm:ss");
        // System.out.println(simpleDate.format(date));

        // String line = "his order was placed for QT3000! and Q3111 OK?";
        // String pattern = "(.*)(\\d+)(.*)";

        // Pattern r = Pattern.compile(pattern);

        // Matcher m = r.matcher(line);
        // if(m.find()){
        //     System.out.println("Found value: " + m.group(0));
        //     System.out.println("Found value: " + m.group(1));
        //     System.out.println("Found value: " + m.group(2));
        //     System.out.println("Found value: " + m.group(3));
        // }else{
        //     System.out.println("NO MATCH");
        // }

        


    }
}
