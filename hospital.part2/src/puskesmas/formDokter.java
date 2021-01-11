/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puskesmas;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wawan Chahyo Nugroho
 */
public class formDokter extends javax.swing.JDialog {
    DefaultTableModel modelTabel;
    /**
     * Creates new form formDokter
     */
    public formDokter(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    
        String[] judul = {"Kode Dokter","Nama","Alamat"};
        modelTabel = new DefaultTableModel(null, judul);
        tabelDokter.setModel(modelTabel);
        
        tampil();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kd_dokter = new javax.swing.JTextField();
        nmDokter = new javax.swing.JTextField();
        almtDokter = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDokter = new javax.swing.JTable();
        butHapus = new javax.swing.JButton();
        butGanti = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Formulir Dokter");

        jLabel2.setText("Kode Dokter");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        tabelDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDokter);

        butHapus.setText("Hapus");
        butHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butHapusActionPerformed(evt);
            }
        });

        butGanti.setText("Ganti");
        butGanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGantiActionPerformed(evt);
            }
        });

        jLabel6.setText("Pencarian");

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(simpan))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(kd_dokter)
                                .addComponent(nmDokter)
                                .addComponent(almtDokter, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butHapus)
                                .addGap(27, 27, 27)
                                .addComponent(butGanti, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kd_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nmDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(almtDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(butHapus)
                    .addComponent(butGanti))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try {
            MysqlDataSource server = new MysqlDataSource();
            server.setServerName("localhost");
            server.setUser("root");
            server.setPassword("");
            server.setPort(3306);
            server.setDatabaseName("puskesmas");
            Connection koneksi = server.getConnection();
            koneksi.prepareStatement("insert into dokter value ('"+kd_dokter.getText()+
                    "','"+nmDokter.getText()+
                    "','"+almtDokter.getText()+"')").execute();
                    
            JOptionPane.showConfirmDialog(rootPane, "Data berhasil masuk!");
           
           
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showConfirmDialog(rootPane, "Maaf data sudah ada!");
           
        }
       
        tampil();
    }//GEN-LAST:event_simpanActionPerformed

    private void tabelDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDokterMouseClicked
        if(tabelDokter.getRowCount()>0){
        kd_dokter.setText(tabelDokter.getValueAt(tabelDokter.getSelectedRow(), 0).toString());
        nmDokter.setText(tabelDokter.getValueAt(tabelDokter.getSelectedRow(), 1).toString());
        almtDokter.setText(tabelDokter.getValueAt(tabelDokter.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tabelDokterMouseClicked

    private void butHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butHapusActionPerformed
        try {
            MysqlDataSource server = new MysqlDataSource();
            server.setServerName("localhost");
            server.setUser("root");
            server.setPassword("");
            server.setPort(3306);
            server.setDatabaseName("puskesmas");
            Connection koneksi = server.getConnection();
            koneksi.prepareStatement("delete from dokter where kode_dokter='"+kd_dokter.getText()+"'").execute();
                    
            JOptionPane.showConfirmDialog(rootPane, "Data berhasil dihapus!");
           
           
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showConfirmDialog(rootPane, "Maaf data sudah ada!");
           
        }
       
        tampil();
    }//GEN-LAST:event_butHapusActionPerformed

    private void butGantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGantiActionPerformed
        try {
            MysqlDataSource server = new MysqlDataSource();
            server.setServerName("localhost");
            server.setUser("root");
            server.setPassword("");
            server.setPort(3306);
            server.setDatabaseName("puskesmas");
            Connection koneksi = server.getConnection();
            koneksi.prepareStatement("update dokter set kode_dokter='"+kd_dokter.getText()+
            "',nama='"+nmDokter.getText()+
            "',alamat='"+almtDokter.getText()+
            "' where kode_dokter='"+tabelDokter.getValueAt(tabelDokter.getSelectedRow(), 0).toString()+"'").execute();
                    
            JOptionPane.showConfirmDialog(rootPane, "Data berhasil diganti!");
           
           
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showConfirmDialog(rootPane, "Maaf data sudah ada!");
           
        }
       
        tampil();
    }//GEN-LAST:event_butGantiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int baris = modelTabel.getRowCount();
        for(int i=1; i<=baris; i++){
        modelTabel.removeRow(0);
        }
        
        try {
            MysqlDataSource server = new MysqlDataSource();
            server.setServerName("localhost");
            server.setUser("root");
            server.setPassword("");
            server.setPort(3306);
            server.setDatabaseName("puskesmas");
            Connection koneksi = server.getConnection();
            ResultSet rec = koneksi.prepareStatement("select * from dokter where "+
              "kode_dokter like '%"+cari.getText()+"%' or "+
              "nama like '%"+cari.getText()+"%' or "+
              "alamat like '%"+cari.getText()+"%'").executeQuery();
                    
            while(rec.next()){
            modelTabel.addRow(new String[]{
            rec.getString(1),rec.getString(2),rec.getString(3),
            });
            
            }
           
           
            
        } catch (Exception e) {
            System.out.println(e);
             
           
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(formDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formDokter dialog = new formDokter(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almtDokter;
    private javax.swing.JButton butGanti;
    private javax.swing.JButton butHapus;
    private javax.swing.JTextField cari;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kd_dokter;
    private javax.swing.JTextField nmDokter;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelDokter;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
      
        int baris = modelTabel.getRowCount();
        for(int i=1; i<=baris; i++){
        modelTabel.removeRow(0);
        }
        
        try {
            MysqlDataSource server = new MysqlDataSource();
            server.setServerName("localhost");
            server.setUser("root");
            server.setPassword("");
            server.setPort(3306);
            server.setDatabaseName("puskesmas");
            Connection koneksi = server.getConnection();
            ResultSet rec = koneksi.prepareStatement("select * from dokter").executeQuery();
                    
            while(rec.next()){
            modelTabel.addRow(new String[]{
            rec.getString(1),rec.getString(2),rec.getString(3),
            });
            
            }
           
           
            
        } catch (Exception e) {
            System.out.println(e);
             
           
        }
        
    }

   
    
}
