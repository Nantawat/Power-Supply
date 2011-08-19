/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TableNine.java
 *
 * Created on 17 เธช.เธ�. 2554, 13:24:43
 */
package sudoku2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TableNine extends javax.swing.JFrame {
    
    JPanel mainPanel = new JPanel();
    JPanel subPanel = new JPanel();
    JButton win = new JButton();
    
    public TableNine() {
        initComponent();
        add(mainPanel,BorderLayout.CENTER);
        mainPanel.setLayout(new GridLayout(9,9));
        setSize(400,400);
        
//        add(subPanel,BorderLayout.SOUTH);
//        win = new JButton("Reset");
//        win.setSize(250, 30);
//        subPanel.add(win);
        
        setVisible(true);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    JTextField a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30;
    JTextField a31,a32,a33,a34,a35,a36,a37,a38,a39,a40,a41,a42,a43,a44,a45,a46,a47,a48,a49,a50,a51,a52,a53,a54,a55,a56,a57,a58,a59,a60;
    JTextField a61,a62,a63,a64,a65,a66,a67,a68,a69,a70,a71,a72,a73,a74,a75,a76,a77,a78,a79,a80,a81;
    
    private void creatTextField(){
      //an = new JTextField("");//row column subTable
    	a1 = new JTextField();//1 1 1
        a2 = new JTextField();//1 2 1
        a3 = new JTextField();//1 3 1
        a4 = new JTextField();//1 4 2
        a5 = new JTextField();//1 5 2
        a6 = new JTextField();//1 6 2
        a7 = new JTextField();//1 7 3
        a8 = new JTextField();//1 8 3
        a9 = new JTextField();//1 9 3
        a10 = new JTextField();//2 1 1
        a11 = new JTextField();//2 2 1
        a12 = new JTextField();//2 3 1
        a13 = new JTextField();//2 4 2
        a14 = new JTextField();//2 5 2
        a15 = new JTextField();//2 6 2
        a16 = new JTextField();//2 7 3
        a17 = new JTextField();//2 8 3
        a18 = new JTextField();//2 9 3
        a19 = new JTextField();//3 1 1
        a20 = new JTextField();//3 2 1
        a21 = new JTextField();//3 3 1
        a22 = new JTextField();//3 4 2
        a23 = new JTextField();//3 5 2
        a24 = new JTextField();//3 6 2
        a25 = new JTextField();//3 7 3
        a26 = new JTextField();//3 8 3
        a27 = new JTextField();//3 9 3
        a28 = new JTextField();//4 1 4
        a29 = new JTextField();//4 2 4
        a30 = new JTextField();//4 3 4 
        a31 = new JTextField();//4 4 5 
        a32 = new JTextField();//4 5 5
        a33 = new JTextField();//4 6 5
        a34 = new JTextField();//4 7 6
        a35 = new JTextField();//4 8 6
        a36 = new JTextField();//4 9 6
        a37 = new JTextField();//5 1 4
        a38 = new JTextField();//5 2 4
        a39 = new JTextField();//5 3 4
        a40 = new JTextField();//5 4 5
        a41 = new JTextField();//5 5 5
        a42 = new JTextField();//5 6 5
        a43 = new JTextField();//5 7 6
        a44 = new JTextField();//5 8 6
        a45 = new JTextField();//5 9 6
        a46 = new JTextField();//6 1 4
        a47 = new JTextField();//6 2 4
        a48 = new JTextField();//6 3 4
        a49 = new JTextField();//6 4 5
        a50 = new JTextField();//6 5 5
        a51 = new JTextField();//6 6 5
        a52 = new JTextField();//6 7 6
        a53 = new JTextField();//6 8 6
        a54 = new JTextField();//6 9 6
        a55 = new JTextField();//7 1 7
        a56 = new JTextField();//7 2 7
        a57 = new JTextField();//7 3 7
        a58 = new JTextField();//7 4 8
        a59 = new JTextField();//7 5 8
        a60 = new JTextField();//7 6 8
        a61 = new JTextField();//7 7 9
        a62 = new JTextField();//7 8 9
        a63 = new JTextField();//7 9 9
        a64 = new JTextField();//8 1 7
        a65 = new JTextField();//8 2 7
        a66 = new JTextField();//8 3 7
        a67 = new JTextField();//8 4 8
        a68 = new JTextField();//8 5 8
        a69 = new JTextField();//8 6 8
        a70 = new JTextField();//8 7 9
        a71 = new JTextField();//8 8 9
        a72 = new JTextField();//8 9 9
        a73 = new JTextField();//9 1 7
        a74 = new JTextField();//9 2 7
        a75 = new JTextField();//9 3 7
        a76 = new JTextField();//9 4 8
        a77 = new JTextField();//9 5 8
        a78 = new JTextField();//9 6 8
        a79 = new JTextField();//9 7 9
        a80 = new JTextField();//9 8 9
        a81 = new JTextField();//9 9 9
    }
    
    private void setTextCenter(){
    	
        a1.setHorizontalAlignment(JTextField.CENTER);
        a2.setHorizontalAlignment(JTextField.CENTER);
        a3.setHorizontalAlignment(JTextField.CENTER);
        a4.setHorizontalAlignment(JTextField.CENTER);
        a5.setHorizontalAlignment(JTextField.CENTER);
        a6.setHorizontalAlignment(JTextField.CENTER);
        a7.setHorizontalAlignment(JTextField.CENTER);
        a8.setHorizontalAlignment(JTextField.CENTER);
        a9.setHorizontalAlignment(JTextField.CENTER);
        a10.setHorizontalAlignment(JTextField.CENTER);
    	a11.setHorizontalAlignment(JTextField.CENTER);
        a12.setHorizontalAlignment(JTextField.CENTER);
        a13.setHorizontalAlignment(JTextField.CENTER);
        a14.setHorizontalAlignment(JTextField.CENTER);
        a15.setHorizontalAlignment(JTextField.CENTER);
        a16.setHorizontalAlignment(JTextField.CENTER);
        a17.setHorizontalAlignment(JTextField.CENTER);
        a18.setHorizontalAlignment(JTextField.CENTER);
        a19.setHorizontalAlignment(JTextField.CENTER);
        a20.setHorizontalAlignment(JTextField.CENTER);
        a21.setHorizontalAlignment(JTextField.CENTER);
        a22.setHorizontalAlignment(JTextField.CENTER);
        a23.setHorizontalAlignment(JTextField.CENTER);
        a24.setHorizontalAlignment(JTextField.CENTER);
        a25.setHorizontalAlignment(JTextField.CENTER);
        a26.setHorizontalAlignment(JTextField.CENTER);
        a27.setHorizontalAlignment(JTextField.CENTER);
        a28.setHorizontalAlignment(JTextField.CENTER);
        a29.setHorizontalAlignment(JTextField.CENTER);
        a30.setHorizontalAlignment(JTextField.CENTER);
        a31.setHorizontalAlignment(JTextField.CENTER);
        a32.setHorizontalAlignment(JTextField.CENTER);
        a33.setHorizontalAlignment(JTextField.CENTER);
        a34.setHorizontalAlignment(JTextField.CENTER);
        a35.setHorizontalAlignment(JTextField.CENTER);
        a36.setHorizontalAlignment(JTextField.CENTER);
        a37.setHorizontalAlignment(JTextField.CENTER);
        a38.setHorizontalAlignment(JTextField.CENTER);
        a39.setHorizontalAlignment(JTextField.CENTER);
        a40.setHorizontalAlignment(JTextField.CENTER);
        a41.setHorizontalAlignment(JTextField.CENTER);
        a42.setHorizontalAlignment(JTextField.CENTER);
        a43.setHorizontalAlignment(JTextField.CENTER);
        a44.setHorizontalAlignment(JTextField.CENTER);
        a45.setHorizontalAlignment(JTextField.CENTER);
        a46.setHorizontalAlignment(JTextField.CENTER);
        a47.setHorizontalAlignment(JTextField.CENTER);
        a48.setHorizontalAlignment(JTextField.CENTER);
        a49.setHorizontalAlignment(JTextField.CENTER);
        a50.setHorizontalAlignment(JTextField.CENTER);
        a51.setHorizontalAlignment(JTextField.CENTER);
        a52.setHorizontalAlignment(JTextField.CENTER);
        a53.setHorizontalAlignment(JTextField.CENTER);
        a54.setHorizontalAlignment(JTextField.CENTER);
        a55.setHorizontalAlignment(JTextField.CENTER);
        a56.setHorizontalAlignment(JTextField.CENTER);
        a57.setHorizontalAlignment(JTextField.CENTER);
        a58.setHorizontalAlignment(JTextField.CENTER);
        a59.setHorizontalAlignment(JTextField.CENTER);
        a60.setHorizontalAlignment(JTextField.CENTER);
        a61.setHorizontalAlignment(JTextField.CENTER);
        a62.setHorizontalAlignment(JTextField.CENTER);
        a63.setHorizontalAlignment(JTextField.CENTER);
        a64.setHorizontalAlignment(JTextField.CENTER);
        a65.setHorizontalAlignment(JTextField.CENTER);
        a66.setHorizontalAlignment(JTextField.CENTER);
        a67.setHorizontalAlignment(JTextField.CENTER);
        a68.setHorizontalAlignment(JTextField.CENTER);
        a69.setHorizontalAlignment(JTextField.CENTER);
        a70.setHorizontalAlignment(JTextField.CENTER);
        a71.setHorizontalAlignment(JTextField.CENTER);
        a72.setHorizontalAlignment(JTextField.CENTER);
        a73.setHorizontalAlignment(JTextField.CENTER);
        a74.setHorizontalAlignment(JTextField.CENTER);
        a75.setHorizontalAlignment(JTextField.CENTER);
        a76.setHorizontalAlignment(JTextField.CENTER);
        a77.setHorizontalAlignment(JTextField.CENTER);
        a78.setHorizontalAlignment(JTextField.CENTER);
        a79.setHorizontalAlignment(JTextField.CENTER);
        a80.setHorizontalAlignment(JTextField.CENTER);
        a81.setHorizontalAlignment(JTextField.CENTER);


    }
      
    private void addToPanel(){
    	 mainPanel.add(a1);
         mainPanel.add(a2);
         mainPanel.add(a3);
         mainPanel.add(a4);
         mainPanel.add(a5);
         mainPanel.add(a6);
         mainPanel.add(a7);
         mainPanel.add(a8);
         mainPanel.add(a9);
    	mainPanel.add(a10);
    	mainPanel.add(a11);
        mainPanel.add(a12);
        mainPanel.add(a13);
        mainPanel.add(a14);
        mainPanel.add(a15);
        mainPanel.add(a16);
        mainPanel.add(a17);
        mainPanel.add(a18);
        mainPanel.add(a19);
        mainPanel.add(a20);     
        mainPanel.add(a21);
        mainPanel.add(a22);
        mainPanel.add(a23);
        mainPanel.add(a24);
        mainPanel.add(a25);
        mainPanel.add(a26);
        mainPanel.add(a27);
        mainPanel.add(a28);
        mainPanel.add(a29);
        mainPanel.add(a30);
        mainPanel.add(a31);
        mainPanel.add(a32);
        mainPanel.add(a33);
        mainPanel.add(a34);
        mainPanel.add(a35);
        mainPanel.add(a36);
        mainPanel.add(a37);
        mainPanel.add(a38);
        mainPanel.add(a39);
        mainPanel.add(a40);
        mainPanel.add(a41);
        mainPanel.add(a42);
        mainPanel.add(a43);
        mainPanel.add(a44);
        mainPanel.add(a45);
        mainPanel.add(a46);
        mainPanel.add(a47);
        mainPanel.add(a48);
        mainPanel.add(a49);
        mainPanel.add(a50);
        mainPanel.add(a51);
        mainPanel.add(a52);
        mainPanel.add(a53);
        mainPanel.add(a54);
        mainPanel.add(a55);
        mainPanel.add(a56);
        mainPanel.add(a57);
        mainPanel.add(a58);
        mainPanel.add(a59);
        mainPanel.add(a60);
        mainPanel.add(a61);
        mainPanel.add(a62);
        mainPanel.add(a63);
        mainPanel.add(a64);
        mainPanel.add(a65);
        mainPanel.add(a66);
        mainPanel.add(a67);
        mainPanel.add(a68);
        mainPanel.add(a69);
        mainPanel.add(a70);
        mainPanel.add(a71);
        mainPanel.add(a72);
        mainPanel.add(a73);
        mainPanel.add(a74);
        mainPanel.add(a75);
        mainPanel.add(a76);
        mainPanel.add(a77);
        mainPanel.add(a78);
        mainPanel.add(a79);
        mainPanel.add(a80);
        mainPanel.add(a81);
    }
    
    private void setOneNumber(){
        a1.setDocument(new JTextFieldLimit(1));
        a2.setDocument(new JTextFieldLimit(1));
        a3.setDocument(new JTextFieldLimit(1));
        a4.setDocument(new JTextFieldLimit(1));
        a5.setDocument(new JTextFieldLimit(1));
        a6.setDocument(new JTextFieldLimit(1));
        a7.setDocument(new JTextFieldLimit(1));
        a10.setDocument(new JTextFieldLimit(1));
        a11.setDocument(new JTextFieldLimit(1));
        a12.setDocument(new JTextFieldLimit(1));
        a13.setDocument(new JTextFieldLimit(1));
        a14.setDocument(new JTextFieldLimit(1));
        a15.setDocument(new JTextFieldLimit(1));
        a16.setDocument(new JTextFieldLimit(1));
        a17.setDocument(new JTextFieldLimit(1));
        a18.setDocument(new JTextFieldLimit(1));
        a19.setDocument(new JTextFieldLimit(1));
        a20.setDocument(new JTextFieldLimit(1));
        a21.setDocument(new JTextFieldLimit(1));
        a22.setDocument(new JTextFieldLimit(1));
        a23.setDocument(new JTextFieldLimit(1));
        a24.setDocument(new JTextFieldLimit(1));
        a25.setDocument(new JTextFieldLimit(1));
        a26.setDocument(new JTextFieldLimit(1));
        a27.setDocument(new JTextFieldLimit(1));
        a28.setDocument(new JTextFieldLimit(1));
        a29.setDocument(new JTextFieldLimit(1));
        a30.setDocument(new JTextFieldLimit(1));
        a31.setDocument(new JTextFieldLimit(1));
        a32.setDocument(new JTextFieldLimit(1));
        a33.setDocument(new JTextFieldLimit(1));
        a34.setDocument(new JTextFieldLimit(1));
        a35.setDocument(new JTextFieldLimit(1));
        a36.setDocument(new JTextFieldLimit(1));
        a37.setDocument(new JTextFieldLimit(1));
        a38.setDocument(new JTextFieldLimit(1));
        a39.setDocument(new JTextFieldLimit(1));
        a40.setDocument(new JTextFieldLimit(1));
        a41.setDocument(new JTextFieldLimit(1));
        a42.setDocument(new JTextFieldLimit(1));
        a43.setDocument(new JTextFieldLimit(1));
        a44.setDocument(new JTextFieldLimit(1));
        a45.setDocument(new JTextFieldLimit(1));
        a46.setDocument(new JTextFieldLimit(1));
        a47.setDocument(new JTextFieldLimit(1));
        a48.setDocument(new JTextFieldLimit(1));
        a49.setDocument(new JTextFieldLimit(1));
        a50.setDocument(new JTextFieldLimit(1));
        a51.setDocument(new JTextFieldLimit(1));
        a52.setDocument(new JTextFieldLimit(1));
        a53.setDocument(new JTextFieldLimit(1));
        a54.setDocument(new JTextFieldLimit(1));
        a55.setDocument(new JTextFieldLimit(1));
        a56.setDocument(new JTextFieldLimit(1));
        a57.setDocument(new JTextFieldLimit(1));
        a58.setDocument(new JTextFieldLimit(1));
        a59.setDocument(new JTextFieldLimit(1));
        a60.setDocument(new JTextFieldLimit(1));
        a61.setDocument(new JTextFieldLimit(1));
        a62.setDocument(new JTextFieldLimit(1));
        a63.setDocument(new JTextFieldLimit(1));
        a64.setDocument(new JTextFieldLimit(1));
        a65.setDocument(new JTextFieldLimit(1));
        a66.setDocument(new JTextFieldLimit(1));
        a67.setDocument(new JTextFieldLimit(1));
        a68.setDocument(new JTextFieldLimit(1));
        a69.setDocument(new JTextFieldLimit(1));
        a70.setDocument(new JTextFieldLimit(1));
        a71.setDocument(new JTextFieldLimit(1));
        a72.setDocument(new JTextFieldLimit(1));
        a73.setDocument(new JTextFieldLimit(1));
        a74.setDocument(new JTextFieldLimit(1));
        a75.setDocument(new JTextFieldLimit(1));
        a76.setDocument(new JTextFieldLimit(1));
        a77.setDocument(new JTextFieldLimit(1));
        a78.setDocument(new JTextFieldLimit(1));
        a79.setDocument(new JTextFieldLimit(1));
        a80.setDocument(new JTextFieldLimit(1));
        a81.setDocument(new JTextFieldLimit(1));     
    }
    
    private void setProblem(){
        a1.setText("9");a2.setText("6");a3.setText("3");a4.setText("1");a5.setText("7");
        a6.setText("4");a7.setText("2");a8.setText("5");a9.setText("8");a10.setText("1");
        a11.setText("7");a12.setText("8");a13.setText("3");a14.setText("2");a15.setText("5");
        a16.setText("6");a17.setText("4");a18.setText("9");a19.setText("2");a20.setText("5");
        a22.setText("6");a23.setText("8");a24.setText("9");a25.setText("7");a26.setText("3");
        a27.setText("1");a28.setText("8");a29.setText("2");a30.setText("1");a31.setText("4");
        a32.setText("3");a33.setText("7");a34.setText("5");a36.setText("6");a38.setText("9");
        a39.setText("6");a41.setText("5");a42.setText("2");a43.setText("3");a44.setText("1");
        a45.setText("7");a46.setText("7");a47.setText("3");a48.setText("5");a49.setText("9");
        a50.setText("6");a51.setText("1");a52.setText("8");a53.setText("2");a54.setText("4");
        a55.setText("5");a56.setText("8");a57.setText("9");a58.setText("7");a59.setText("1");
        a60.setText("3");a62.setText("6");a63.setText("2");a64.setText("3");a66.setText("7");
        a67.setText("2");a68.setText("4");a69.setText("6");a70.setText("9");a71.setText("8");
        a72.setText("5");a73.setText("6");a74.setText("4");a75.setText("2");a76.setText("5");
        a77.setText("9");a78.setText("8");a79.setText("1");a80.setText("7");a81.setText("3");
    }
    
    private void setProblemDisableButton(JTextField field) {
        field.setEditable(false);
    }
    
    private void disableButton(){
    	setProblemDisableButton(a1);setProblemDisableButton(a2);setProblemDisableButton(a3);setProblemDisableButton(a4);setProblemDisableButton(a5);
        setProblemDisableButton(a6);setProblemDisableButton(a7);setProblemDisableButton(a8);setProblemDisableButton(a9);setProblemDisableButton(a10);
        setProblemDisableButton(a11);setProblemDisableButton(a12);setProblemDisableButton(a13);setProblemDisableButton(a14);setProblemDisableButton(a15);
        setProblemDisableButton(a16);setProblemDisableButton(a17);setProblemDisableButton(a18);setProblemDisableButton(a19);setProblemDisableButton(a20);
        setProblemDisableButton(a22);setProblemDisableButton(a23);setProblemDisableButton(a24);setProblemDisableButton(a25);setProblemDisableButton(a26);
        setProblemDisableButton(a27);setProblemDisableButton(a28);setProblemDisableButton(a29);setProblemDisableButton(a30);setProblemDisableButton(a31);
        setProblemDisableButton(a32);setProblemDisableButton(a33);setProblemDisableButton(a34);setProblemDisableButton(a36);setProblemDisableButton(a38);
        setProblemDisableButton(a39);setProblemDisableButton(a41);setProblemDisableButton(a42);setProblemDisableButton(a43);setProblemDisableButton(a44);
        setProblemDisableButton(a45);setProblemDisableButton(a46);setProblemDisableButton(a47);setProblemDisableButton(a48);setProblemDisableButton(a49);
        setProblemDisableButton(a50);setProblemDisableButton(a51);setProblemDisableButton(a52);setProblemDisableButton(a53);setProblemDisableButton(a54);
        setProblemDisableButton(a55);setProblemDisableButton(a56);setProblemDisableButton(a57);setProblemDisableButton(a58);setProblemDisableButton(a59);
        setProblemDisableButton(a60);setProblemDisableButton(a62);setProblemDisableButton(a63);setProblemDisableButton(a64);setProblemDisableButton(a66);
        setProblemDisableButton(a67);setProblemDisableButton(a68);setProblemDisableButton(a69);setProblemDisableButton(a70);setProblemDisableButton(a71);
        setProblemDisableButton(a72);setProblemDisableButton(a73);setProblemDisableButton(a74);setProblemDisableButton(a75);setProblemDisableButton(a76);
        setProblemDisableButton(a77);setProblemDisableButton(a78);setProblemDisableButton(a79);setProblemDisableButton(a80);setProblemDisableButton(a81);
        }
    
    
    private void setColor(){
        a4.setBackground(Color.gray);a5.setBackground(Color.gray);a6.setBackground(Color.gray);
        a13.setBackground(Color.gray);a14.setBackground(Color.gray);a15.setBackground(Color.gray);
        a22.setBackground(Color.gray);a23.setBackground(Color.gray);a24.setBackground(Color.gray);
        a28.setBackground(Color.gray);a29.setBackground(Color.gray);a30.setBackground(Color.gray);
        a34.setBackground(Color.gray);a35.setBackground(Color.gray);a36.setBackground(Color.gray);
        a37.setBackground(Color.gray);a38.setBackground(Color.gray);a39.setBackground(Color.gray);
        a45.setBackground(Color.gray);a44.setBackground(Color.gray);a43.setBackground(Color.gray);
        a46.setBackground(Color.gray);a47.setBackground(Color.gray);a48.setBackground(Color.gray);
        a54.setBackground(Color.gray);a53.setBackground(Color.gray);a52.setBackground(Color.gray);
        a58.setBackground(Color.gray);a59.setBackground(Color.gray);a60.setBackground(Color.gray);
        a67.setBackground(Color.gray);a68.setBackground(Color.gray);a69.setBackground(Color.gray);
        a76.setBackground(Color.gray);a77.setBackground(Color.gray);a78.setBackground(Color.gray);
    }
        
    private void addFocusForATextField(JTextField field, String[][] num, int row, int col) {
        field.addFocusListener(new CellEventListener(field ,num, row,col));        
    }
    
    private void addFocus(){
        String[][] num = new String[10][10];
        addFocusForATextField(a1,num,1,1);num[1][1] = "9";
        addFocusForATextField(a2,num,1,2);num[1][2] = "6";
        addFocusForATextField(a3,num,1,3);num[1][3] = "3";
        addFocusForATextField(a4,num,1,4);num[1][4] = "1";
        addFocusForATextField(a5,num,1,5);num[1][5] = "7";
        addFocusForATextField(a6,num,1,6);num[1][6] = "4";
        addFocusForATextField(a7,num,1,7);num[1][7] = "2";
        addFocusForATextField(a8,num,1,8);num[1][8] = "5";
        addFocusForATextField(a9,num,1,9);num[1][9] = "8";
        addFocusForATextField(a10,num,2,1);num[2][1] = "1";
        addFocusForATextField(a11,num,2,2);num[2][2] = "7";
        addFocusForATextField(a12,num,2,3);num[2][3] = "8";
        addFocusForATextField(a13,num,2,4);num[2][4] = "3";
        addFocusForATextField(a14,num,2,5);num[2][5] = "2";
        addFocusForATextField(a15,num,2,6);num[2][6] = "5";
        addFocusForATextField(a16,num,2,7);num[2][7] = "6";
        addFocusForATextField(a17,num,2,8);num[2][8] = "4";
        addFocusForATextField(a18,num,2,9);num[2][9] = "9";
        addFocusForATextField(a19,num,3,1);num[3][1] = "2";
        addFocusForATextField(a20,num,3,2);num[3][2] = "5";
        addFocusForATextField(a21,num,3,3);//
        addFocusForATextField(a22,num,3,4);num[3][4] = "6";
        addFocusForATextField(a23,num,3,5);num[3][5] = "8";
        addFocusForATextField(a24,num,3,6);num[3][6] = "9";
        addFocusForATextField(a25,num,3,7);num[3][7] = "7";
        addFocusForATextField(a26,num,3,8);num[3][8] = "3";
        addFocusForATextField(a27, num,3,9);num[3][9] = "1";
        addFocusForATextField(a28, num,4,1);num[4][1] = "8";
        addFocusForATextField(a29, num,4,2);num[4][2] = "2";
        addFocusForATextField(a30, num,4,3);num[4][3] = "1";
        addFocusForATextField(a31, num,4,4);num[4][4] = "4";
        addFocusForATextField(a32, num,4,5);num[4][5] = "3";
        addFocusForATextField(a33, num,4,6);num[4][6] = "7";
        addFocusForATextField(a34, num,4,7);num[4][7] = "5";
        addFocusForATextField(a35, num,4,8);//
        addFocusForATextField(a36, num,4,9);num[4][9] = "6";
        addFocusForATextField(a37, num,5,1);//
        addFocusForATextField(a38, num,5,2);num[5][2] = "9";
        addFocusForATextField(a39, num,5,3);num[5][3] = "6";
        addFocusForATextField(a40, num,5,4);//
        addFocusForATextField(a41, num,5,5);num[5][5] = "5";
        addFocusForATextField(a42, num,5,6);num[5][6] = "2";
        addFocusForATextField(a43, num,5,7);num[5][7] = "3";
        addFocusForATextField(a44, num,5,8);num[5][8] = "1";
        addFocusForATextField(a45, num,5,9);num[5][9] = "7";
        addFocusForATextField(a46, num,6,1);num[6][1] = "7";
        addFocusForATextField(a47, num,6,2);num[6][2] = "3";
        addFocusForATextField(a48, num,6,3);num[6][3] = "5";
        addFocusForATextField(a49, num,6,4);num[6][4] = "9";
        addFocusForATextField(a50, num,6,5);num[6][5] = "6";
        addFocusForATextField(a51, num,6,6);num[6][6] = "1";
        addFocusForATextField(a52, num,6,7);num[6][7] = "8";
        addFocusForATextField(a53, num,6,8);num[6][8] = "2";
        addFocusForATextField(a54, num,6,9);num[6][9] = "4";
        addFocusForATextField(a55, num,7,1);num[7][1] = "5";
        addFocusForATextField(a56, num,7,2);num[7][2] = "8";
        addFocusForATextField(a57, num,7,3);num[7][3] = "9";
        addFocusForATextField(a58, num,7,4);num[7][4] = "7";
        addFocusForATextField(a59, num,7,5);num[7][5] = "1";
        addFocusForATextField(a60, num,7,6);num[7][6] = "3";
        addFocusForATextField(a61, num,7,7);//
        addFocusForATextField(a62, num,7,8);num[7][8] = "6";
        addFocusForATextField(a63, num,7,9);num[7][9] = "2";
        addFocusForATextField(a64, num,8,1);num[8][1] = "3";
        addFocusForATextField(a65, num,8,2);//
        addFocusForATextField(a66, num,8,3);num[8][3] = "7";
        addFocusForATextField(a67, num,8,4);num[8][4] = "2";
        addFocusForATextField(a68, num,8,5);num[8][5] = "4";
        addFocusForATextField(a69, num,8,6);num[8][6] = "6";
        addFocusForATextField(a70, num,8,7);num[8][7] = "9";
        addFocusForATextField(a71, num,8,8);num[8][8] = "8";
        addFocusForATextField(a72, num,8,9);num[8][9] = "5";
        addFocusForATextField(a73, num,9,1);num[9][1] = "6";
        addFocusForATextField(a74, num,9,2);num[9][2] = "4";
        addFocusForATextField(a75, num,9,3);num[9][3] = "2";
        addFocusForATextField(a76, num,9,4);num[9][4] = "5";
        addFocusForATextField(a77, num,9,5);num[9][5] = "9";
        addFocusForATextField(a78, num,9,6);num[9][6] = "8";
        addFocusForATextField(a79, num,9,7);num[9][7] = "1";
        addFocusForATextField(a80, num,9,8);num[9][8] = "7";
        addFocusForATextField(a81, num,9,9);num[9][9] = "3";
    }
    
    private void initComponent(){
        
    	creatTextField();
    	setTextCenter();
    	setOneNumber();
        setProblem();
        setColor();
        disableButton();
    	addToPanel();
    	addFocus();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new TableNine();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
