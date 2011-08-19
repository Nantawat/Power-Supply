package sudoku2;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CellEventListener implements FocusListener {

    private JTextField field;
    int row;
    int column;
    int chk = 0;
    String countRow = "";
    String countCol = "";
    String[][] num;
    int Col = 0;
    int Row = 0;
    int chk2 = 0;

    public CellEventListener(JTextField field, String[][] num, int row, int column) {
        this.field = field;
        this.row = row;
        this.column = column;
        this.num = num;
    }

    @Override
    public void focusLost(FocusEvent e) {
        num[row][column] = field.getText();
        ///////////////////////////////////////////////////////////////////////
        chkSubTable();
        ///////////////////////////////////////////////////////////////////////
        for (int i = 1; i <= 9; i++) {
            countRow += (num[row][i]);
        }
        System.out.println("countRow: " + countRow);
        if (countRow.length() == 9) {
            for (int i = 1; i < 10; i++) {
                Row = Row + Integer.parseInt(countRow.substring(i - 1, i));
            }
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if ((num[i][j] == null)) {
                    } else if (num[i][j].matches("[1-9]")) {
                        chk++;
                    }
                }
            }
            System.out.println("chk " + chk);
            chk2 = chk;
            chk = 0;
        }
        countRow = "";
        ////////////////////////////////////////////////////////////////////////
        for (int i = 1; i <= 9; i++) {
            countCol += (num[i][column]);
        }
        System.out.println("countCol: " + countCol);
        if (countCol.length() == 9) {
            for (int i = 1; i < 10; i++) {
                Col = Col + Integer.parseInt(countCol.substring(i - 1, i));
            }
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if ((num[i][j] == null)) {
                    } else if (num[i][j].matches("[1-9]")) {
                        chk++;
                    }
                }
            }
            System.out.println("chk " + chk);
            chk2 = chk;
            chk = 0;
        }
        countCol = "";
        ////////////////////////////////////////////////////////////////////////
        System.out.println("chk2 " + chk2);
        int valueCol = 0;
        int valueCount = 0;
        int valueRow = 0;
        if (chk2 == 81) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    valueCol = valueCol + Integer.parseInt(num[j][i]);
                }
                if (valueCol == 45) {
                    valueCount++;
                    valueCol = 0;
                }
            }
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    valueRow = valueRow + Integer.parseInt(num[i][j]);
                }
                if (valueRow == 45) {
                    valueCount++;
                    valueRow = 0;
                }
            }
            if (valueCount == 18) {
                JOptionPane.showMessageDialog(null, "You Win!!");
//                System.out.println("You Win");
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }
    
    public void chkSubTable(){
        int subTable = 0;
        if ((1 <= column & column <= 3) & (1 <= row & row <= 3)) {
            subTable = 1;
        }else if ((4 <= column & column <= 6) & (1 <= row & row <= 3)) {
            subTable = 2;
        }else if ((7 <= column & column <= 9) & (1 <= row & row <= 3)) {
            subTable = 3;
        }else if ((1 <= column & column <= 3) & (4 <= row & row <= 6)) {
            subTable = 4;
        }else if ((4 <= column & column <= 6) & (4 <= row & row <= 6)) {
            subTable = 5;
        }else if ((7 <= column & column <= 9) & (4 <= row & row <= 6)) {
            subTable = 6;
        }else if ((1 <= column & column <= 3) & (7 <= row & row <= 9)) {
            subTable = 7;
        }else if ((4 <= column & column <= 6) & (7 <= row & row <= 9)) {
            subTable = 8;
        }else if ((7 <= column & column <= 9) & (7 <= row & row <= 9)) {
            subTable = 9;
        }
        switch (subTable) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j=1;j<=3;j++) {
                        if ((row!=i | column!=j) & (num[row][column].equals(num[i][j]))){
//                            System.out.println("NO");
                            JOptionPane.showMessageDialog(null, "Already!!",null,JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                break;
            case 2:
                for (int i = 1; i <= 3; i++) {
                    for (int j=4;j<=6;j++) {
                        if ((row!=i | column!=j) & (num[row][column].equals(num[i][j]))) {
//                            System.out.println("NO");
                            JOptionPane.showMessageDialog(null, "Already!!",null,JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }break;
            case 3:
                for (int i = 1; i <= 3; i++) {
                    for (int j=7;j<=9;j++) {
                        if ((row!=i | column!=j) & (num[row][column].equals(num[i][j]))) {
//                            System.out.println("NO");
                            JOptionPane.showMessageDialog(null, "Already!!",null,JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }break;
            case 4:
                for (int i = 4; i <= 6; i++) {
                    for (int j=1;j<=3;j++) {
                        if ((row!=i | column!=j) & (num[row][column].equals(num[i][j]))) {
//                            System.out.println("NO");
                            JOptionPane.showMessageDialog(null, "Already!!",null,JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }break;
            case 5:
                for (int i = 4; i <= 6; i++) {
                    for (int j=4;j<=6;j++) {
                        if ((row!=i | column!=j) & (num[row][column].equals(num[i][j]))) {
//                            System.out.println("NO");
                            JOptionPane.showMessageDialog(null, "Already!!",null,JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }break;
            case 6:
                for (int i = 4; i <= 6; i++) {
                    for (int j=7;j<=9;j++) {
                        if ((row!=i | column!=j) & (num[row][column].equals(num[i][j]))) {
//                            System.out.println("NO");
                            JOptionPane.showMessageDialog(null, "Already!!",null,JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }break;
            case 7:
                for (int i = 7; i <= 9; i++) {
                    for (int j=1;j<=3;j++) {
                        if ((row!=i | column!=j) & (num[row][column].equals(num[i][j]))) {
//                            System.out.println("NO");
                            JOptionPane.showMessageDialog(null, "Already!!",null,JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }break;
            case 8:
                for (int i = 7; i <= 9; i++) {
                    for (int j=4;j<=6;j++) {
                        if ((row!=i | column!=j) & (num[row][column].equals(num[i][j]))) {
//                            System.out.println("NO");
                            JOptionPane.showMessageDialog(null, "Already!!",null,JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }break;
            case 9:
                for (int i = 7; i <= 9; i++) {
                    for (int j=7;j<=9;j++) {
                        if ((row!=i | column!=j) & (num[row][column].equals(num[i][j]))) {
//                            System.out.println("NO");
                            JOptionPane.showMessageDialog(null, "Already!!",null,JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }break;
        }
    }
;
}
