/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.gui;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Lenovo
 */
public class PersonalExpenseFrame extends javax.swing.JFrame {

     ChartPanel chartPanel;
    /**
     * Creates new form PersonalExpenseFrame
     */
    public PersonalExpenseFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        display();
        
        //super.setLocation(340, 0);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblClose1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        InternalFrame = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnModifyBudget = new javax.swing.JButton();
        btnTxHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(2, 136, 209));

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblClose1.setForeground(new java.awt.Color(255, 255, 255));
        lblClose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose1.setText("X");
        lblClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose1MouseClicked(evt);
            }
        });
        jPanel7.add(lblClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 909, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 80));

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, -1, -1));

        InternalFrame.setBorder(null);
        InternalFrame.setEnabled(false);
        InternalFrame.setFocusable(false);
        InternalFrame.setVisible(true);
        InternalFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(InternalFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 880, 350));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 143, -1, 30));

        btnModifyBudget.setText("MODIFY BUDGET");
        jPanel5.add(btnModifyBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        btnTxHistory.setText("TRANSACTION HISTORY");
        jPanel5.add(btnTxHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 860, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblClose1MouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        InputCalculatorFrame cal= new InputCalculatorFrame();
        cal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(PersonalExpenseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalExpenseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalExpenseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalExpenseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PersonalExpenseFrame().setVisible(true);
               PersonalExpenseFrame pieChart = new PersonalExpenseFrame();
               
            pieChart.display();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrame;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnModifyBudget;
    private javax.swing.JButton btnTxHistory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblClose1;
    // End of variables declaration//GEN-END:variables

        private JFreeChart create3DPieChart(PieDataset dataset){

    /** Create a PieDataSet* */


    /** Create 3D Pie Chart based on this dataset* */
   JFreeChart chart=ChartFactory.createPieChart("", dataset, true, true, true);
 
//JFreeChart chart = ChartFactory.createPieChart3D("Result", dataset, true, true, true);

    return chart;


}
    private PieDataset createPieDataSet() {
        
           DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("English", new Integer(70));
        pieDataset.setValue("Math", new Integer(10));
        pieDataset.setValue("Physics", new Integer(75));
        pieDataset.setValue("Chemistry", new Integer(80));
        pieDataset.setValue("Urdu", new Integer(45));
        pieDataset.setValue("Islamiyat", new Integer(30));
   /* DefaultPieDataset pieDataset = new DefaultPieDataset();
    pieDataset.setValue("Othes", new Integer(15));
    pieDataset.setValue("PHP", new Integer(15));
    pieDataset.setValue("Java", new Integer(30));
    pieDataset.setValue("Perl", new Integer(10));
    pieDataset.setValue("C,C++,C#", new Integer(30));*/

    return pieDataset;

}

private void display(){

    final PieDataset dataset = this.createPieDataSet();
    final JFreeChart chart   = this.create3DPieChart(dataset);

    chartPanel = new ChartPanel(chart, false);
    this.InternalFrame.setContentPane(chartPanel);
    this.InternalFrame.pack();
    this.InternalFrame.setVisible(true);
    this.InternalFrame.setSize(10,10);

    this.pack();
    this.setVisible(true);

}
}
