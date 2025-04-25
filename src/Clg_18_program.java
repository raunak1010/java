public class Clg_18_program {
    public static void main(String[] args) {

      int number = 1234;

      int first = number / 1000;
      int second = (number /100)%10;
      int third = (number/10)%10;
      int fourth = number %10;

      int sum = first + second + third + fourth;
        System.out.println(sum);
    }
}
