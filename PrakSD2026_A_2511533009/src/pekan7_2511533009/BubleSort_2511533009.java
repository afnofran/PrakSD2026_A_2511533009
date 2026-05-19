package pekan7_2511533009;

public class BubleSort_2511533009 {
    public static void bubbleSort_3009(int[] arr_3009){
        int n_3009 = arr_3009.length;
        for (int i_3009 = 0; i_3009 < n_3009; i_3009++){
            for (int j_3009 = 0;j_3009<n_3009-i_3009-1;j_3009++){
                if (arr_3009[j_3009] > arr_3009[j_3009+1]){
                    int temp_3009 = arr_3009[j_3009];
                    arr_3009[j_3009] = arr_3009[j_3009+1];
                    arr_3009[j_3009+1] = temp_3009;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr_3009[] = {23, 78, 45 ,8, 32, 56, 1};
        int n_3009 = arr_3009.length;
        System.out.printf("array yang belum terurut:\n");
        for (int i_3009 = 0; i_3009 < n_3009;i_3009++)
            System.out.print(arr_3009[i_3009] + " ");
        System.out.println("");
        bubbleSort_3009(arr_3009);
        System.out.printf("array yang terurut menggunakan BubbleSort:");
        for (int i_3009 = 0;i_3009<n_3009; i_3009++)
            System.out.print(arr_3009[i_3009]+" ");
        System.out.println("");
    }
}
