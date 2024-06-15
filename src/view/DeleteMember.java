/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.DBConnection;
import Model.DBSearch;
import controller.DeleteMemberController;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class DeleteMember extends javax.swing.JFrame {

    /**
     * Creates new form DeleteMember
     */
    public DeleteMember() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchTF = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        exiteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        addbookjMenuItem1 = new javax.swing.JMenuItem();
        updatebookjMenuItem2 = new javax.swing.JMenuItem();
        deletejMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Delete Member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(0, 0, 153))); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Member ID", "First Name", "Last Name", "Date Of Birth", "Age", "Gender", "Address", "Email", "Telephone"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Enter Member ID");

        deleteBtn.setBackground(new java.awt.Color(0, 0, 153));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        exiteBtn.setBackground(new java.awt.Color(0, 0, 153));
        exiteBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exiteBtn.setForeground(new java.awt.Color(255, 255, 255));
        exiteBtn.setText("Exit");
        exiteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exiteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(deleteBtn)
                            .addGap(18, 18, 18)
                            .addComponent(exiteBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchBtn))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(exiteBtn))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(430, 260, 1120, 380);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alfons-morales-YLSwjSy7stw-unsplash.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1522, 761));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1080);

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setBorder(null);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setBorder(null);
        jMenu3.setForeground(new java.awt.Color(0, 0, 153));
        jMenu3.setText("    Public Library Meegoda                   ");
        jMenu3.setActionCommand("                                                                     ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 5, true));
        jMenu4.setForeground(new java.awt.Color(0, 0, 153));
        jMenu4.setText("  Book  ");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        addbookjMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addbookjMenuItem1.setForeground(new java.awt.Color(0, 0, 153));
        addbookjMenuItem1.setText("Add Book");
        addbookjMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookjMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(addbookjMenuItem1);

        updatebookjMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        updatebookjMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updatebookjMenuItem2.setForeground(new java.awt.Color(0, 0, 153));
        updatebookjMenuItem2.setText("Update Book");
        updatebookjMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebookjMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(updatebookjMenuItem2);

        deletejMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        deletejMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deletejMenuItem3.setForeground(new java.awt.Color(0, 0, 153));
        deletejMenuItem3.setText("Delete Book");
        deletejMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(deletejMenuItem3);

        jMenuBar2.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(0, 0, 153));
        jMenu5.setText(" Member ");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem4.setText("Add Member");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem5.setText("Update Member");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem6.setText("Delete  Member");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar2.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(255, 255, 255));
        jMenu6.setForeground(new java.awt.Color(0, 0, 153));
        jMenu6.setText("  Issue  ");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        jMenu7.setBackground(new java.awt.Color(255, 255, 255));
        jMenu7.setForeground(new java.awt.Color(0, 0, 153));
        jMenu7.setText(" Return ");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu7);

        jMenu8.setForeground(new java.awt.Color(0, 0, 153));
        jMenu8.setText(" Search ");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jMenuItem7.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem7.setText("Search Book");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem8.setText("Search Member");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuBar2.add(jMenu8);

        jMenu9.setForeground(new java.awt.Color(0, 0, 153));
        jMenu9.setText(" Log Out ");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu9);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:

        ResultSet r= new DBSearch().searchMember();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);//sets the number of rows in the table model

        try{
            String a=searchTF.getText();
            int b;
            b = 0;
            String add1 = null;
            String add2= null;
            Vector v;//variable ekak
            while (r.next()){
                add1=r.getString("memberid");
               
                if(a.equals(add1)){
                    v = new Vector();
                    v.add(r.getString("memberid"));
                    v.add(r.getString("membername"));
                    v.add(r.getString("memberlastname"));
                    v.add(r.getString("dfb"));
                    v.add(r.getString("age"));
                    v.add(r.getString("gender"));
                    v.add(r.getString("address"));
                    v.add(r.getString("email"));
                    v.add(r.getString("telephone"));
                    dtm.addRow(v);
                    b++;
                }

            }
            DBConnection.closeCon();
            if(b==0){
                JOptionPane.showMessageDialog(null," NOT FOUND","Error",JOptionPane.ERROR_MESSAGE);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        DeleteMemberController.deletemember(searchTF.getText());
        clearField();
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void exiteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exiteBtnActionPerformed
        // TODO add your handling code here:
        //new Home().setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_exiteBtnActionPerformed

    private void addbookjMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookjMenuItem1ActionPerformed
        // TODO add your handling code here:
        new view.AddBook().setVisible(true);
    }//GEN-LAST:event_addbookjMenuItem1ActionPerformed

    private void updatebookjMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebookjMenuItem2ActionPerformed
        // TODO add your handling code here:
        new view.UpdateBook().setVisible(true);
    }//GEN-LAST:event_updatebookjMenuItem2ActionPerformed

    private void deletejMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejMenuItem3ActionPerformed
        // TODO add your handling code here:
        new view.DeletBook().setVisible(true);
    }//GEN-LAST:event_deletejMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        new view.AddMember().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new view.UpdateMember().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new view.DeleteMember().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        new view.IssueBook().setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
        //new view.IssueBook().setVisible(true);
        new view.AddBook().setVisible(true);
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        new view.ReturnDate().setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
        new view.ReturnDate().setVisible(true);
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new view.SearchBook().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new view.SearchMember().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        // TODO add your handling code here:
        new view.Welcome().setVisible(true);
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        // TODO add your handling code here:
        new view.Welcome().setVisible(true);
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        new view.event().setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked
      public void clearField() {
        searchTF.setText("");
                
    }   
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
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addbookjMenuItem1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JMenuItem deletejMenuItem3;
    private javax.swing.JButton exiteBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTF;
    private javax.swing.JMenuItem updatebookjMenuItem2;
    // End of variables declaration//GEN-END:variables
}
