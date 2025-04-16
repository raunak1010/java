public class Clg_18_program {
    public static void main(String[] args) {

      int number = 123;

      int first = number / 100;
      int second = (number / 10) %10;
      int third = number % 10;

      int sum = first + second + third;
        System.out.println(sum);
    }
}
