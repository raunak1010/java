public class Methods_02 {
    static void sum(int a){
//          int a = 1234;

          int first = a/1000;
          int second  = (a/100)%10;
          int third = (a/10)%10;
          int fourth  = a%10;
          int sum = first + second+ third + fourth;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(1234);
    }
}
