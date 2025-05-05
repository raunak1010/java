import java.util.Arrays;
public class Bubble_sort2 {
    //    public static void sort(String[] arr) {
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void main(String[] args) {
//        String[] str = {"B", "A", "c"};
//        sort(str);
//    }
    static void Sort() {
        String[] str = {"B", "C", "A"};
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
            if((int)str[j].charAt(0)>(int)str[j+1].charAt(0));
            String temp = str[j];
            str[j] = str[j+1];
            str[j+1] = temp;
            }
        }
    }

    public static void main(String[] args) {


    }
}