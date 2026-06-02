package pekan8_2511533009;

public class QuickSort_2511533009 {

    static void swap_3009(int[] arr_3009, int i_3009, int j_3009){
        int temp_3009 = arr_3009[i_3009];
        arr_3009[i_3009] = arr_3009[j_3009];
        arr_3009[j_3009] = temp_3009;
    }
    //Mtod tambahan untuk mengatur pivot menggunaakn median of tree
    static void medianOfThree(int[] arr_3009, int low_3009, int high_3009){
        int mid_3009 = low_3009 + (high_3009-low_3009) / 2;

        //urutkan elemen low, mid, dan high
        if (arr_3009[low_3009] > arr_3009[mid_3009]){
            swap_3009(arr_3009,low_3009,mid_3009);
        }
        if (arr_3009[low_3009] > arr_3009[high_3009]){
            swap_3009(arr_3009,low_3009,high_3009);
        }
        if (arr_3009[mid_3009] > arr_3009[high_3009]){
            swap_3009(arr_3009,mid_3009,high_3009);
        }
        swap_3009(arr_3009,mid_3009,high_3009);
    }
    static int partition_3009(int[] arr_3009, int low_3009,int high_3009){
        //Panggil fungsi medianOfThree sebelum menentukan pivot
        medianOfThree(arr_3009,low_3009,high_3009);

        int pivot_3009 = arr_3009[high_3009];
        int i_3009 = (low_3009-1);

        for (int j_3009 = low_3009; j_3009 <= high_3009 - 1; j_3009++){
            //jika elemn saat ini lebih keci dari atau sama dengan pivot
            if (arr_3009[j_3009] < pivot_3009){
                //increment indeks elemen nyang lebih kecil
                i_3009++;
                swap_3009(arr_3009,low_3009,high_3009);
            }
        }
        swap_3009(arr_3009,i_3009+1,high_3009);
        return (i_3009+1);
    }

    static void quickSort_3009(int[] arr_3009,int low_3009,int high_3009){
        if (low_3009<high_3009){
            int pi_3009 = partition_3009(arr_3009,low_3009,high_3009);
            quickSort_3009(arr_3009,low_3009,pi_3009-1);
            quickSort_3009(arr_3009,pi_3009+1,high_3009);
        }
    }

    static void printArr_3009(int[] arr_3009){
        for(int i_3009 = 0;i_3009< arr_3009.length;i_3009++)
            System.out.printf(arr_3009[i_3009] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr_3009 = {10,7,8,9,1,5};
        int N_3009 = arr_3009.length;
        System.out.printf("Data sebelum diurutkan: ");
        printArr_3009(arr_3009);

        quickSort_3009(arr_3009,0,N_3009-1);

        System.out.printf("Data Terurut quicksort: ");
        printArr_3009(arr_3009);
    }
}
