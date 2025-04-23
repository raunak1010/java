public class Clg_22_program {
    public static void main(String[] args) {

        String str = "hello";
        String str1 = "hiiii";
          int count =0;
        for(int i = 0 ; i <= str.length()-1;i++){
            if (str.charAt(i) == str1.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
