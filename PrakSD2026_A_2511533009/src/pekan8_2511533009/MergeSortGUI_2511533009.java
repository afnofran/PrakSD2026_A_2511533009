package pekan8_2511533009;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MergeSortGUI_2511533009 extends JFrame {

    private static final long serialVersionUID_3009 = 1L;

    private int[] array_3009;
    private JLabel[] labelArray_3009;
    private JButton stepButton_3009, resetButton_3009, setButton_3009;
    private JTextField inputField_3009;
    private JPanel panelArray_3009;
    private JTextArea stepArea_3009;

    private int i_3009, j_3009, k_3009;
    private int left_3009, mid_3009, right_3009;
    private int[] temp_3009;

    private boolean isMerging_3009 = false;
    private boolean copying_3009 = false;
    private int stepCount_3009 = 1;

    private Queue<int[]> mergeQueue_3009 = new LinkedList<>();

    public MergeSortGUI_2511533009() {
        setTitle("Merge Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel_3009 = new JPanel(new FlowLayout());
        inputField_3009 = new JTextField(30);
        setButton_3009 = new JButton("Set Array");
        inputPanel_3009.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_3009.add(inputField_3009);
        inputPanel_3009.add(setButton_3009);

        // Panel array visual
        panelArray_3009 = new JPanel();
        panelArray_3009.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel_3009 = new JPanel();
        stepButton_3009 = new JButton("Langkah Selanjutnya");
        resetButton_3009 = new JButton("Reset");
        stepButton_3009.setEnabled(false);
        controlPanel_3009.add(stepButton_3009);
        controlPanel_3009.add(resetButton_3009);

        // Area teks untuk log langkah-langkah
        stepArea_3009 = new JTextArea(8, 60);
        stepArea_3009.setEditable(false);
        stepArea_3009.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_3009 = new JScrollPane(stepArea_3009);

        // Tambahkan panel ke frame
        add(inputPanel_3009, BorderLayout.NORTH);
        add(panelArray_3009, BorderLayout.CENTER);
        add(controlPanel_3009, BorderLayout.SOUTH);
        add(scrollPane_3009, BorderLayout.EAST);

        // Event Set Array
        setButton_3009.addActionListener(e_3009 -> setArrayFromInput_3009());

        // Event Langkah Selanjutnya
        stepButton_3009.addActionListener(e_3009 -> performStep_3009());

        // Event Reset
        resetButton_3009.addActionListener(e_3009 -> reset_3009());
    }

    private void setArrayFromInput_3009() {
        String text_3009 = inputField_3009.getText().trim();
        if (text_3009.isEmpty()) return;

        String[] parts_3009 = text_3009.split(",");
        array_3009 = new int[parts_3009.length];

        try {
            for (int i_3009 = 0; i_3009 < parts_3009.length; i_3009++) {
                array_3009[i_3009] = Integer.parseInt(parts_3009[i_3009].trim());
            }
        } catch (NumberFormatException e_3009) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        labelArray_3009 = new JLabel[array_3009.length];
        panelArray_3009.removeAll();

        for (int i_3009 = 0; i_3009 < array_3009.length; i_3009++) {
            labelArray_3009[i_3009] = new JLabel(String.valueOf(array_3009[i_3009]));
            labelArray_3009[i_3009].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3009[i_3009].setOpaque(true);
            labelArray_3009[i_3009].setBackground(Color.WHITE);
            labelArray_3009[i_3009].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3009[i_3009].setPreferredSize(new Dimension(50, 50));
            labelArray_3009[i_3009].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3009.add(labelArray_3009[i_3009]);
        }

        mergeQueue_3009.clear();
        generateMergeSteps_3009(0, array_3009.length - 1);

        stepButton_3009.setEnabled(true);
        stepArea_3009.setText("");
        stepCount_3009 = 1;
        isMerging_3009 = false;
        copying_3009 = false;

        panelArray_3009.revalidate();
        panelArray_3009.repaint();
    }

    private void generateMergeSteps_3009(int left_3009, int right_3009) {
        if (left_3009 < right_3009) {
            int mid_3009 = left_3009 + (right_3009 - left_3009) / 2;

            generateMergeSteps_3009(left_3009, mid_3009);
            generateMergeSteps_3009(mid_3009 + 1, right_3009);

            mergeQueue_3009.add(new int[] { left_3009, mid_3009, right_3009 });
        }
    }

    private void performStep_3009() {
        resetHighlights_3009();

        if (!isMerging_3009 && !mergeQueue_3009.isEmpty()) {
            int[] range_3009 = mergeQueue_3009.poll();

            left_3009 = range_3009[0];
            mid_3009 = range_3009[1];
            right_3009 = range_3009[2];

            temp_3009 = new int[right_3009 - left_3009 + 1];

            i_3009 = left_3009;
            j_3009 = mid_3009 + 1;
            k_3009 = 0;

            copying_3009 = false;
            isMerging_3009 = true;

            stepArea_3009.append(
                    "Langkah " + stepCount_3009++
                            + ": Mulai merge dari "
                            + left_3009 + " ke "
                            + right_3009 + "\n"
            );

            return;
        }

        if (isMerging_3009 && !copying_3009) {
            if (i_3009 <= mid_3009 && j_3009 <= right_3009) {
                labelArray_3009[i_3009].setBackground(Color.CYAN);
                labelArray_3009[j_3009].setBackground(Color.CYAN);

                if (array_3009[i_3009] <= array_3009[j_3009]) {
                    temp_3009[k_3009++] = array_3009[i_3009++];
                } else {
                    temp_3009[k_3009++] = array_3009[j_3009++];
                }

                stepArea_3009.append(
                        "Langkah " + stepCount_3009++
                                + ": Bandingkan dan salin elemen\n"
                );

                return;

            } else if (i_3009 <= mid_3009) {
                temp_3009[k_3009++] = array_3009[i_3009++];

                stepArea_3009.append(
                        "Langkah " + stepCount_3009++
                                + ": Salin sisa kiri\n"
                );

                return;

            } else if (j_3009 <= right_3009) {
                temp_3009[k_3009++] = array_3009[j_3009++];

                stepArea_3009.append(
                        "Langkah " + stepCount_3009++
                                + ": Salin sisa kanan\n"
                );

                return;

            } else {
                copying_3009 = true;
                k_3009 = 0;
                return;
            }
        }

        if (copying_3009 && k_3009 < temp_3009.length) {
            array_3009[left_3009 + k_3009] = temp_3009[k_3009];
            labelArray_3009[left_3009 + k_3009].setText(String.valueOf(temp_3009[k_3009]));
            labelArray_3009[left_3009 + k_3009].setBackground(Color.GREEN);
            k_3009++;

            stepArea_3009.append("Langkah " + stepCount_3009++ + ": Tempelkan ke array utama\n");
            return;
        }

        if (copying_3009 && k_3009 == temp_3009.length) {
            isMerging_3009 = false;
            copying_3009 = false;
        }

        if (mergeQueue_3009.isEmpty() && !isMerging_3009) {
            stepArea_3009.append("Selesai.\n");
            stepButton_3009.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void resetHighlights_3009() {
        if (labelArray_3009 == null) return;

        for (JLabel label_3009 : labelArray_3009) {
            label_3009.setBackground(Color.WHITE);
        }
    }

    private void reset_3009() {
        inputField_3009.setText("");
        panelArray_3009.removeAll();
        panelArray_3009.revalidate();
        panelArray_3009.repaint();
        stepArea_3009.setText("");
        stepButton_3009.setEnabled(false);
        mergeQueue_3009.clear();
        isMerging_3009 = false;
        copying_3009 = false;
        stepCount_3009 = 1;
    }

    public static void main(String[] args_3009) {
        SwingUtilities.invokeLater(() -> {
            MergeSortGUI_2511533009 frame_3009 = new MergeSortGUI_2511533009();
            frame_3009.setVisible(true);
        });
    }
}