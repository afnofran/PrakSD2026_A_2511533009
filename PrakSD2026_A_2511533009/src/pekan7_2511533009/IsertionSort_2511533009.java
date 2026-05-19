package pekan7_2511533009;

public class IsertionSort_2511533009 {
    public static void insertionSort_3009(int[] arr_3009){
        int n_3009 = arr_3009.length;
        for (int i_3009 = 1; i_3009<n_3009;i_3009++){
            int key_3009 = arr_3009[i_3009];
            int j_3009 = i_3009-1;
            while (j_3009>= 0 && arr_3009[j_3009] > key_3009){
                arr_3009[j_3009+1] = arr_3009[j_3009];;
                j_3009--;
            }
            arr_3009[j_3009+1] = key_3009;
        }
    }

    public static void main(String[] args){
        int arr_3009[] = {23, 78, 45 ,8, 32, 56, 1};
        int n_3009 = arr_3009.length;
        System.out.printf("array yang belum terurut:\n");
        for (int i_3009 = 0; i_3009 < n_3009;i_3009++)
            System.out.print(arr_3009[i_3009] + " ");
        System.out.println("");
        insertionSort_3009(arr_3009);
        System.out.printf("array yang terurut: \n");
        for (int i_3009 = 0;i_3009<n_3009; i_3009++)
            System.out.print(arr_3009[i_3009]+" ");
        System.out.println();
    }
}
