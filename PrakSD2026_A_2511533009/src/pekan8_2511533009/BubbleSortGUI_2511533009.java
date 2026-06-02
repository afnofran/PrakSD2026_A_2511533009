package pekan8_2511533009;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BubbleSortGUI_2511533009 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private int[] array_3009;
    private JLabel[] labelArray_3009;
    private JButton stepButton_3009,resetButton_3009, setButton_3009;
    private JTextField inputField_3009;
    private JPanel panelArray_3009;
    private JTextArea stepArea_3009;

    private int i_3009 = 1,j_3009;
    private boolean sorting_3009 = false;
    private int stepCount_3009 = 1;

    /**
     * Create the frame.
     */
    public BubbleSortGUI_2511533009() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        setTitle("Insertion Sort Langkah per Langkah");
        setSize(750,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        //Panel input
        JPanel inputPanel_3009 = new JPanel(new FlowLayout());
        inputField_3009 = new JTextField(30);
        setButton_3009 = new JButton("Set Array");
        inputPanel_3009.add(new JLabel("Masukkan angka (pisahkan  dengan koma):"));
        inputPanel_3009.add(inputField_3009);
        inputPanel_3009.add(setButton_3009);

        //Panel array visual
        panelArray_3009 = new JPanel();
        panelArray_3009 .setLayout(new FlowLayout());

        //Panel Kontrol
        JPanel controlPanel = new JPanel();
        stepButton_3009 = new JButton("Langkah Selanjutnya");
        resetButton_3009 = new JButton("Reset");
        stepButton_3009.setEnabled(false);
        controlPanel.add(stepButton_3009);
        controlPanel.add(resetButton_3009);

        //Area teks utuk log langkah-langkah
        stepArea_3009 = new JTextArea(8,60);
        stepArea_3009.setEditable(false);
        stepArea_3009.setFont(new Font("Monospaced",Font.PLAIN,14));
        JScrollPane scrollPane_3009 = new JScrollPane(stepArea_3009);


        //Tambhakn panel ke fram
        add(inputPanel_3009,BorderLayout.NORTH);
        add(panelArray_3009,BorderLayout.CENTER);;
        add(controlPanel,BorderLayout.SOUTH);
        add(scrollPane_3009,BorderLayout.EAST);

        //Event set array
        setButton_3009.addActionListener(e -> setArrayFromInput_3009());

        //Event Langkah Selanjutnya
        stepButton_3009.addActionListener(e -> performStep_3009());

        //Eent Reset
        resetButton_3009.addActionListener(e -> reset_3009());


    }

    private void setArrayFromInput_3009(){
    	
    }

    private void performStep_3009(){
        if (i_3009 < array_3009.length && sorting_3009){
            int key_3009 = array_3009[i_3009];
            j_3009 = i_3009-1;

            StringBuilder stepLog = new StringBuilder();
            stepLog.append("Langkah").append(stepCount_3009)
                    .append(": Memasukkan").append(key_3009).append("\n");

            while (j_3009 >= 0 && array_3009[j_3009] > key_3009){
                array_3009[j_3009+1] = array_3009[j_3009];
                j_3009--;
            }
            array_3009[j_3009+1]= key_3009;

            updateLabels_3009();
            stepLog.append("Hasil: ").append(arrayToString_3009(array_3009)).append("\n\n");
            stepArea_3009.append(stepLog.toString());

            i_3009++;
            stepCount_3009++;

            if (i_3009 == array_3009.length){
                sorting_3009 = false;
                stepButton_3009.setEnabled(false);
                JOptionPane.showMessageDialog(this,"Sorting selesai!");
            }
        }
    }

    private void updateLabels_3009(){
        for (int k_3009 = 0;k_3009< array_3009.length;k_3009++){
            labelArray_3009[k_3009].setText(String.valueOf(array_3009[k_3009]));
        }
    }

    private void reset_3009(){
        inputField_3009.setText("");
        panelArray_3009.removeAll();
        panelArray_3009.revalidate();
        panelArray_3009.repaint();
        stepArea_3009.setText("");
        stepButton_3009.setEnabled(false);
        sorting_3009 = false;
        i_3009 = 1;
        stepCount_3009 = 1;
    }

    private String arrayToString_3009(int[] arr_3009){
        StringBuilder sb_3009 = new StringBuilder();
        for (int k_3009=0;k_3009<arr_3009.length;k_3009++){
            sb_3009.append(arr_3009[k_3009]);
            if (k_3009 < arr_3009.length - 1) sb_3009.append(", ");
        }
        return sb_3009.toString();
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            BubbleSortGUI_2511533009 gui_3009 = new BubbleSortGUI_2511533009();
            gui_3009.setVisible(true);
        });
    }

}
