/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.gui;

import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Maraxys
 */
public class InputCalculatorFrame extends javax.swing.JFrame {

    /**
     * Creates new form InputCalculatorFrame
     */
    char operator;
    double num1,ans;
    boolean isSelected=false;
    boolean isResult=false;
    String temp;
    public InputCalculatorFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        txtInputField = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnAddExpense = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCategory = new javax.swing.JButton();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        lblBack.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("Go Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(644, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 720));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setForeground(new java.awt.Color(51, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1126, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 0, -1, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel4.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 63, 58));

        btn9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel4.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 63, 58));

        btn4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel4.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 63, 58));

        btn5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel4.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 63, 58));

        btn8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel4.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 63, 58));

        btnMultiply.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnMultiply.setText("x");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        jPanel4.add(btnMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 69, 63));

        btn1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 63, 66));

        btn0.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel4.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 378, 63, 60));

        btn3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 63, 66));

        btn2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 63, 66));

        btn10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn10.setText(".");
        jPanel4.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 63, 60));

        btnEqual.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        jPanel4.add(btnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 377, 160, 60));

        btnClear.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 152, 60));

        btnSubtract.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        jPanel4.add(btnSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 67, 68));

        btnDivide.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        jPanel4.add(btnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 65, 66));

        btnAdd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 67, 160));

        btn6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel4.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 63, 58));

        txtInputField.setEditable(false);
        txtInputField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtInputField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInputFieldKeyTyped(evt);
            }
        });
        jPanel4.add(txtInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 420, 60));

        btnAddExpense.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddExpense.setText("ADD EXPENSE");
        btnAddExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExpenseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("Add Expense Description (Optional)");

        btnCategory.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnCategory.setText("Select a Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });

        DateChooser.setDateFormatString("dd-MMM-yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btnAddExpense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnAddExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 1120, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(isResult){
            txtInputField.setText("");
            isResult=false;
        }
        txtInputField.setText(txtInputField.getText()+btn3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        // TODO add your handling code here:'
        if(checkEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a number first","Empty Field",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        
        operator='-';
        
        compute();
        txtInputField.setText("-");
        //operator=txtInputField.getText().charAt(0);
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(checkEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a number first","Empty Field",JOptionPane.ERROR_MESSAGE);
            return;
        }
        operator='+';
        compute();
        txtInputField.setText("+");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        // TODO add your handling code here:
        if(checkEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a number first","Empty Field",JOptionPane.ERROR_MESSAGE);
            return;
        }
        operator='/';
        compute();
        txtInputField.setText("/");
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        // TODO add your handling code here:
        replace();
        isSelected=false;
        isResult=true;
        switch (operator){
            case '+':
                ans= num1+Integer.parseInt(temp);
                txtInputField.setText(Double.toString(ans));
                break;
                
            case '-':
                ans= num1-Integer.parseInt(temp);
                txtInputField.setText(Double.toString(ans));
                break;
                
            case 'x':
                ans= num1*Integer.parseInt(temp);
                txtInputField.setText(Double.toString(ans));
                break;
                
            case '/':
                ans= num1/Integer.parseInt(temp);
                txtInputField.setText(Double.toString(ans)); 
                System.out.printf("Value: %.2f", ans);
                break;
        }
    }//GEN-LAST:event_btnEqualActionPerformed

    private void txtInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputFieldKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
            if(!(Character.isDigit(c))||c==KeyEvent.VK_BACKSPACE||c==KeyEvent.VK_DELETE){
                evt.consume();
            }
    }//GEN-LAST:event_txtInputFieldKeyTyped

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtInputField.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if(isResult){
            txtInputField.setText("");
            isResult=false;
        }
        txtInputField.setText(txtInputField.getText()+btn1.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if(isResult){
            txtInputField.setText("");
            isResult=false;
        }
        txtInputField.setText(txtInputField.getText()+btn2.getText());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(isResult){
            txtInputField.setText("");
            isResult=false;
        }
        txtInputField.setText(txtInputField.getText()+btn4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if(isResult){
            txtInputField.setText("");
            isResult=false;
        }
        txtInputField.setText(txtInputField.getText()+btn5.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if(isResult){
            txtInputField.setText("");
            isResult=false;
        }
        txtInputField.setText(txtInputField.getText()+btn6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if(isResult){
            txtInputField.setText("");
            isResult=false;
        }
        txtInputField.setText(txtInputField.getText()+btn7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if(isResult){
            txtInputField.setText("");
            isResult=false;
        }
        txtInputField.setText(txtInputField.getText()+btn8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if(isResult){
            txtInputField.setText("");
            isResult=false;
        }
        txtInputField.setText(txtInputField.getText()+btn9.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        if(!(txtInputField.getText().isEmpty()))
         txtInputField.setText(txtInputField.getText()+btn0.getText());   
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        // TODO add your handling code here:num1=Integer.parseInt(txtInputField.getText());
        if(checkEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a number first","Empty Field",JOptionPane.ERROR_MESSAGE);
            return;
        }
        operator='x';
        compute();
        txtInputField.setText("x");
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        PersonalExpenseFrame personal=new PersonalExpenseFrame();
        personal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
        this.disable();
        CategorySelectionFrame categoryFrame=new CategorySelectionFrame();
        categoryFrame.setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnAddExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExpenseActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dformat= new SimpleDateFormat("dd-MMM-yyyy");
        String date=dformat.format(DateChooser.getDate());
        System.out.println(date);
        
    }//GEN-LAST:event_btnAddExpenseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputCalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputCalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputCalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputCalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputCalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddExpense;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBack;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtInputField;
    // End of variables declaration//GEN-END:variables

    private void compute() {
        if(isSelected){
            JOptionPane.showMessageDialog(null, "Please press '=' before proceeding","SQL Exception",JOptionPane.ERROR_MESSAGE);
            return;
        }
        isSelected=true;
        num1=Double.parseDouble(txtInputField.getText());
        txtInputField.setText("");
    }

    private boolean checkEmpty() {
        if(txtInputField.getText().isEmpty()){
            return true;
        }
        return false;
    }

   
    
    
    private void replace() {
        
        switch (operator){
            case '+':
                temp=txtInputField.getText();
                temp=temp.replaceAll("\\+","");
                break;
                
            case '-':
                temp=txtInputField.getText();
                temp=temp.replaceAll("\\-","");
                break;
                
            case 'x':
                temp=txtInputField.getText();
                temp=temp.replaceAll("x","");
                break;
                
            case '/':
                temp=txtInputField.getText();
                temp=temp.replaceAll("/","");
                break;
                //System.out.printf("Value: %.2f", ans);
                
        
        
    }   
    
    
    
}
}
