package webservicesandra.webservicesandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebserviceSandraApplication {

    private static String myMessage = "Hello world";
    private static int numberOne = 3;
    private static int numberTwo = 7;
    public static void main(String[] args) {
        System.out.println(String.format(myMessage, numberOne));
    }

    public int addition() {
        int sum = numberOne + numberTwo;
        return sum;
    }

}
