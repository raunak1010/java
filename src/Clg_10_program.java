import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

//Q7
public class Clg_10_program {
    public static void main(String[] args) {
        int x = 40;
        int y = 60;

        System.out.println("Before Swapping");
        System.out.println("x = "+ x + ", y = "+ y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping");
        System.out.println("x = " + x + ", y = " + y);
    }
}
