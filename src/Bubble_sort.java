public class Bubble_sort {
    public static void sort(int[]arr) {
        for(int i = 0 ; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }}

        public static void main(String[] args){
            int arr[]={1,3,8,5,7,20};
            sort(arr);

            for(int i = 0 ; i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }

        }

    }

