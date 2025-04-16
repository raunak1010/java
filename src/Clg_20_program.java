import java.util.Scanner;
public class Clg_20_program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter value of arr");
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i<n; i++){
           System.out.println(arr[i]);
        }

    }
}
