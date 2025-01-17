/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.DBConnection;
import Model.DBSearch;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class SearchMember extends javax.swing.JFrame {

    /**
     * Creates new form SearchMember
     */
    public SearchMember() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        deletBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(null);

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Member ID", "First Name", "Last Name", "DOB", "Age", "Gender", "Address", "Tel No", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(90, 270, 920, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Enter Member ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(560, 110, 170, 35);
        jPanel2.add(searchTF);
        searchTF.setBounds(740, 110, 244, 32);

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchBtn);
        searchBtn.setBounds(990, 110, 29, 35);

        exitBtn.setBackground(new java.awt.Color(0, 0, 204));
        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel2.add(exitBtn);
        exitBtn.setBounds(1030, 270, 110, 50);

        deletBtn.setBackground(new java.awt.Color(0, 0, 153));
        deletBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletBtn.setForeground(new java.awt.Color(255, 255, 255));
        deletBtn.setText("DELETE");
        deletBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deletBtn);
        deletBtn.setBounds(1030, 190, 110, 50);

        updateBtn.setBackground(new java.awt.Color(0, 0, 153));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn);
        updateBtn.setBounds(1030, 110, 110, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(380, 260, 1210, 470);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alfons-morales-YLSwjSy7stw-unsplash.jpg"))); // NOI18N
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
            String add1;
            
            Vector v;//variable ekak
            while (r.next()){
                add1=r.getString("memberid");
                
                if(a.equals(add1)){
                    v = new Vector();
                    v.add(r.getString("memberid"));
                    v.add(r.getString("membername"));
                    v.add(r.getString("memberlastname"));
                    v.add(r.getString("gender"));
                    v.add(r.getString("dfb"));
                    v.add(r.getString("age"));
                    v.add(r.getString("telephone"));
                    v.add(r.getString("address"));
                    v.add(r.getString("email"));
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

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
      //  new Home().setVisible(true);
            setVisible(false);

    }//GEN-LAST:event_exitBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        new UpdateMember().setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deletBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletBtnActionPerformed
        // TODO add your handling code here:
        new DeleteMember().setVisible(true);
    }//GEN-LAST:event_deletBtnActionPerformed

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
       // new view.SearchMember().setVisible(true);
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
            java.util.logging.Logger.getLogger(SearchMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addbookjMenuItem1;
    private javax.swing.JButton deletBtn;
    private javax.swing.JMenuItem deletejMenuItem3;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTF;
    private javax.swing.JButton updateBtn;
    private javax.swing.JMenuItem updatebookjMenuItem2;
    // End of variables declaration//GEN-END:variables
}
