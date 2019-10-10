/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package form_port_app;

import java.awt.Component;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seven_User
 */
public class ViewApproved_EBAS extends javax.swing.JFrame {

    private Component frame;
    public static int cnt;
    public static int cntInProc;
    public static String[] recLine = new String[5000];
    public static String[] inprocess = new String[5000];
    public static String strGt;
    public static FileWriter fWriter;
    public static BufferedWriter writer;
    public static int cntWrtLine;
    public static String[] wrtLine = new String[5000];
    public static String[] formN = new String[5000];

    /**
     * Creates new form IAS
     */
    public ViewApproved_EBAS() {
        initComponents();
        if (GetForms_InvAdj.usrType.equals("dl")) {
            // exBtn.setEnabled(false);
        }
        jTable1.setAutoCreateRowSorter(true);
        String[] args = null;
        GtDates.main(args);
        try {
            fTable();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ViewApproved_EBAS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        iasBtn = new javax.swing.JButton();
        ebasBtn = new javax.swing.JButton();
        nebasBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1108, 605));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(153, 180, 209));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1160, 630));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        exitBtn.setBackground(new java.awt.Color(255, 0, 51));
        exitBtn.setText("Close");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Form Name", "SKU","Qty", "New/Used", "Description", "Reason", "Desc_Damage", "Original SKU", "Manuf Inspection", "Cust Satisfaction", "Warranty"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Inventory Adjustment (View All Approved) EBAS");

        iasBtn.setBackground(new java.awt.Color(255, 153, 0));
        iasBtn.setText("IAS");
        iasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iasBtnActionPerformed(evt);
            }
        });

        ebasBtn.setBackground(new java.awt.Color(0, 204, 204));
        ebasBtn.setText("EBAS");
        ebasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebasBtnActionPerformed(evt);
            }
        });

        nebasBtn.setBackground(new java.awt.Color(204, 0, 204));
        nebasBtn.setText("NEBAS");
        nebasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nebasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nebasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ebasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(exitBtn))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ebasBtn)
                        .addGap(18, 18, 18)
                        .addComponent(iasBtn)
                        .addGap(18, 18, 18)
                        .addComponent(nebasBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void iasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iasBtnActionPerformed
        String[] args = null;
        // JOptionPane.showMessageDialog(frame, "Getting IAS Line Data");
        ViewApproved.main(args);
        this.dispose();
    }//GEN-LAST:event_iasBtnActionPerformed

    private void ebasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebasBtnActionPerformed
        String[] args = null;
        // JOptionPane.showMessageDialog(frame, "Getting EBAS Line Data");
        ViewApproved_EBAS.main(args);
        this.dispose();
    }//GEN-LAST:event_ebasBtnActionPerformed

    private void nebasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nebasBtnActionPerformed
        String[] args = null;
        // JOptionPane.showMessageDialog(frame, "Getting NEBAS Line Data");
        ViewApproved_NEBAS.main(args);
        this.dispose();
    }//GEN-LAST:event_nebasBtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewApproved_EBAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewApproved_EBAS().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ebasBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton iasBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JButton nebasBtn;
    // End of variables declaration//GEN-END:variables

    //Fill Table
    public static void fTable() throws ClassNotFoundException, SQLException {

        cnt = 0;
        cntInProc = 0;
        cntWrtLine = 0;

        GtStore.GtStore();
        try (Statement s1 = DBConnect.connection.createStatement()) {
            String selTable01 = "SELECT Store AS str, Form_Name As frm FROM existing_forms WHERE Store = '" + GtStore.store.toLowerCase() + "' AND Status = 'Approved' AND Form_NAME LIKE 'ebas%'";
            s1.execute(selTable01);
            try (ResultSet rs01 = s1.getResultSet()) {
                while (rs01.next()) {
                    cntInProc = cntInProc + 1;
                    String st = rs01.getString("str");
                    String fr = rs01.getString("frm");
                    inprocess[cntInProc] = st + ";" + fr;
                    formN[cntInProc] = fr;
                }
            }
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            for (int y = 1; y < cntInProc + 1; y++) {
                String frm = inprocess[y].split(";")[1];
                for (int w = 1; w < 21; w++) {
                    strGt = "SELECT SKU AS rslt, Qty As rslt2, New_Used As rslt3, Description1 As rslt4, "
                            + "Reason As rslt5, Desc_Damage As rslt6, Orig_SKU As rslt7, "
                            + "Manuf_Inspection As rslt8, Cust_Satisf As rslt9, Warranty As rslt10 "
                            + "FROM " + frm + " WHERE Line = " + w;
                    s1.execute(strGt);
                    try (ResultSet rs3 = s1.getResultSet()) {
                        while (rs3.next()) {
                            String sku = rs3.getString("rslt");
                            String qty = rs3.getString("rslt2");
                            String nwusd = rs3.getString("rslt3");
                            String desc1 = rs3.getString("rslt4");
                            String reas = rs3.getString("rslt5");
                            String descDmg = rs3.getString("rslt6");
                            String orgSku = rs3.getString("rslt7");
                            String manIns = rs3.getString("rslt8");
                            String custSat = rs3.getString("rslt9");
                            String wrnty = rs3.getString("rslt10");
                            if (sku != null) {
                                model.addRow(new Object[]{frm, sku, qty, nwusd, desc1, reas, descDmg, orgSku, manIns, custSat, wrnty});
                                cntWrtLine = cntWrtLine + 1;
                                wrtLine[cntWrtLine] = frm + "," + sku + "," + qty + "," + nwusd + "," + desc1 + "," + reas + "," + descDmg + "," + orgSku + "," + manIns + "," + custSat + "," + wrnty;
                            }
                        }
                    }
                }
            }
        }
    }

    //Export Table to .csv
    public void exTable() throws ClassNotFoundException, SQLException, IOException {
        if (cntWrtLine > 0) {
            String[] args = null;
            GtDates.main(args);
            try (Statement s1 = DBConnect.connection.createStatement()) {
                for (int w = 1; w < cntInProc + 1; w++) {
                    // Update Form Definitions
                    String dTable = "Drop Table " + formN[w];
                    String rmForm = "DELETE FROM existing_forms "
                            + " WHERE Form_Name = '" + formN[w] + "'";
                    
                    String upTable = "INSERT INTO completed_forms"
                            + "(Store, Form_Name, Date_Created, Last_Updated, Status) "
                            + "VALUES("
                            + "'" + formN[w].split("_")[1] + "'" + ","
                            + "'" + formN[w] + "'" + ","
                            + "'" + GtDates.tdate + "'" + ","
                            + "'" + GtDates.tdate + "'" + ","
                            + "'" + "Completed" + "'"
                            + ")";
                    
                    s1.execute(dTable);
                    s1.execute(rmForm);
                    s1.execute(upTable);
                }
            }
            EBASdao.nwFrm = "yes";
            InvAdj_Admin.Rpnt();
            InvAdj.Rpnt();

            fWriter = new FileWriter("exports/" + inprocess[cntInProc].split(";")[1].replace(":", "_") + ".csv", false);
            writer = new BufferedWriter(fWriter);
            String header = "store_code,item_number,qty,new_used,description,adj_reason,damage,original_sku,manuf_Insp,cust_Satisf,warranty";
            writer.write(header);
            writer.newLine();
            for (int y = 1; y < cntWrtLine + 1; y++) {
                writer.write(wrtLine[y]);
                writer.newLine();
            }
            writer.close();
            JOptionPane.showMessageDialog(frame, "Form Has Been Exported In '.csv' Format");
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Store", "SKU", "Qty", "New/Used", "Description", "Reason", "Desc_Damage", "Original SKU", "Manuf Inspection", "Cust Satisfaction", "Warranty"
                    }));
            GtForm();
        }
    }

    public static void GtForm() throws IOException {
        Desktop.getDesktop().open(new File("exports/" + inprocess[cntInProc].split(";")[1].replace(":", "_") + ".csv"));
    }
}