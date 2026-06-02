package pekan8_2511533009;

public class ShellSort_2511533009 {

    public static void shellSort_3009(int[] A_3009){
        int n_3009 = A_3009.length;
        int gap_3009 = n_3009/2;
        while (gap_3009 > 0){
            for (int i_3009 = gap_3009;i_3009<n_3009;i_3009++){
                int temp_3009 = A_3009[i_3009];
                int j_3009 = i_3009;
                while (j_3009 >= gap_3009 && A_3009[j_3009-gap_3009] > temp_3009){
                    A_3009[j_3009] = A_3009[j_3009 - gap_3009];
                    j_3009=j_3009-gap_3009;
                }
                A_3009[j_3009 ] = temp_3009;
            }
            gap_3009 = gap_3009/2;
        }
    }

    public static void main(String [] args){
        int[] data_3009 = {3,10,4,6,8,9,7,2,1,5};
        System.out.print("Sebelum: ");
        printArray(data_3009);

        shellSort_3009(data_3009);

        System.out.print("Sesudah (Shell Sort): ");
        printArray(data_3009);
    }

    private static void printArray(int[] arr_3009) {
        for (int i_3009 : arr_3009) System.out.printf(i_3009 + "  ");
        System.out.println();
    }
}
