public class Clg_17_program {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = rows; j <= 1; j++){
                System.out.println("*");
            }
            for(int k = 5; k>=i; k--){
                System.out.println(" ");
            }
            for (int l=5; l>=i+1; l--){
                System.out.println("*");
            }
            System.out.println();
                      }

    }
}
