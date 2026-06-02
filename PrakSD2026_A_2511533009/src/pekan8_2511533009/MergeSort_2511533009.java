package pekan8_2511533009;

public class MergeSort_2511533009 {
    void merge_2011(int arr_3009[], int l_3009, int m_3009, int r_3009) {
        int n1_3009 = m_3009 - l_3009 + 1;
        int n2_3009 = r_3009 - m_3009;

        int L_3009[] = new int[n1_3009];
        int R_3009[] = new int[n2_3009];

        for (int i_3009 = 0; i_3009 < n1_3009; ++i_3009) {
            L_3009[i_3009] = arr_3009[l_3009 + i_3009];
        }

        for (int j_3009 = 0; j_3009 < n2_3009; ++j_3009) {
            R_3009[j_3009] = arr_3009[m_3009 + 1 + j_3009];
        }

        int i_3009 = 0, j_3009 = 0;

        int k_3009 = l_3009;

        while (i_3009 < n1_3009 && j_3009 < n2_3009) {
            if (L_3009[i_3009] <= R_3009[j_3009]) {
                arr_3009[k_3009] = L_3009[i_3009];
                i_3009++;
            } else {
                arr_3009[k_3009] = R_3009[j_3009];
                j_3009++;
            }
            k_3009++;
        }

        while (i_3009 < n1_3009) {
            arr_3009[k_3009] = L_3009[i_3009];
            i_3009++;
            k_3009++;
        }

        while (j_3009 < n2_3009) {
            arr_3009[k_3009] = R_3009[j_3009];
            j_3009++;
            k_3009++;
        }
    }

    void sort_3009(int arr_3009[], int l_3009,int r_3009){
        if (l_3009<r_3009){
            // Fin the middle point
            int m_3009 = (l_3009+r_3009) / 2;
            sort_3009(arr_3009,l_3009,m_3009);
            sort_3009(arr_3009,m_3009+1,r_3009);
            //merge the sorted halves
            merge_2011(arr_3009,l_3009,m_3009,r_3009);
        }
    }

    static void printArray_3009(int arr_3009[]){
        int n_3009 = arr_3009.length;
        for (int i_3009 = 0; i_3009<n_3009;++i_3009)
            System.out.printf(arr_3009[i_3009] + " ");
        System.out.println();
    }

    public static void main(String [] args){
        int arr_3009[] = {12,11,13,5,6,7};
        System.out.println("Sebelum terurut: ");
        printArray_3009(arr_3009);
        MergeSort_2511533009 ob_3009 = new MergeSort_2511533009();
        ob_3009.sort_3009(arr_3009,0, arr_3009.length - 1);
        System.out.println("\nSesudah terurut menggunakan merge Sort");
        printArray_3009(arr_3009);
    }
}
