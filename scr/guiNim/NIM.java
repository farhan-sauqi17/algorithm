package guiNim;
import javax.swing.JOptionPane;

public class NIM extends javax.swing.JFrame {

    String nim = "";

    public NIM() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nimInput = new javax.swing.JTextField();
        cek = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NIM APP");

        nimInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimInputActionPerformed(evt);
            }
        });

        cek.setText("Cek");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });

        jLabel2.setText("Masukkan Nama");

        jLabel3.setText("Masukkan NIM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nama)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(cek)
                                                .addGap(0, 126, Short.MAX_VALUE))
                                        .addComponent(nimInput))
                                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nimInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cek)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nimInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimInputActionPerformed
    }

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed
        nim = nimInput.getText();
        String name = nama.getText();
        String jenjangPendidikan = jenjangPendidikan();
        String angkatan = angkatan();
        String fakultas = fakultas();
        String prodi = prodi();
        String jeniKelamin = jenisKelamin();
        String noUnik = noUnik();

        String message = "Nama : " + name + "\n" +
                "NIM : " + nim + "\n" +
                "Jenjang Pendidikan : " + jenjangPendidikan + "\n" +
                "Angkatan : " + angkatan + "\n" +
                "Fakultas : " + fakultas + "\n" +
                "Prodi : " + prodi + "\n" +
                "Jenis Kelamin : " + jeniKelamin + "\n" +
                "No Unik : " + noUnik + "\n";

        JOptionPane.showMessageDialog(null, message);

    }
    public String jenjangPendidikan() {
        String jenjang = this.nim.substring(0, 1);

        if (jenjang.equalsIgnoreCase("1")) {
            return "S1 (Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2 (Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3 (Doktor)";
        }
        return "NOT FOUND";
    }

    // 18 19 20
    public String angkatan() {
        if (this.nim.substring(1,3).equalsIgnoreCase("18")) {
            return "2018";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else {
            return "NOT FOUND";
        }
    }

    // 5
    public String fakultas() {
        String fac =  this.nim.substring(3,4);
        if (fac.equalsIgnoreCase("5")) {
            return "Fakultas Teknik";
        }else if (fac.equalsIgnoreCase("1")) {
            return "Fakultas Ekonomi";
        }else if (fac.equalsIgnoreCase("2")) {
            return "Fakultas MIPA";
        }else if (fac.equalsIgnoreCase("3")) {
            return "Fakultas Hukum";
        }else {
            return "NOT FOUND";
        }
    }

    // 01
    public String prodi() {
        if (this.nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Prodi Teknik Informatika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("02")) {
            return "Prodi Teknik Industri";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Informasi";
        }
        return "NOT FOUND";
    }

    // 01
    public String jenisKelamin() {
        if (this.nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.nim.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "NOT FOUND";
    }

    public String noUnik() {
        return this.nim.substring(7,11);
    }

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
            java.util.logging.Logger.getLogger(NIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NIM().setVisible(true);
            }
        });
    }

    private javax.swing.JButton cek;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nimInput;
}

