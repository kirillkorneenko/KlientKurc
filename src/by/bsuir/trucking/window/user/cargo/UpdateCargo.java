package by.bsuir.trucking.window.user.cargo;

import by.bsuir.trucking.connection.Connection;
import by.bsuir.trucking.entity.Batch;
import by.bsuir.trucking.entity.Cargo;
import by.bsuir.trucking.entity.User;

import javax.swing.*;

public class UpdateCargo extends javax.swing.JFrame {

    private User user;
    public UpdateCargo(User u) {
        user = u;
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("Изменение груза");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton4.setText("Назад");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 209, 40));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.yellow);
        jLabel4.setText("Введите номер груза:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 184, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.yellow);
        jLabel6.setText("Введите новую цену:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 184, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.yellow);
        jLabel3.setText("Введите новую массу:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 184, -1));

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton1.setText("Изменить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 210, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/trucking/image/Фон.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        pack();
    }// </editor-fold>

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        WorkToCargoUser workToCargoUser =new WorkToCargoUser(user);
        workToCargoUser.setVisible(true);
        workToCargoUser.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Cargo cargo = new Cargo();
        cargo.setId(Integer.parseInt(jTextField3.getText()));
        cargo.setWeight(Float.parseFloat(jTextField2.getText()));
        cargo.setPrice(Float.parseFloat(jTextField5.getText()));
        cargo.setUserId(user.getId());
        Batch batch = new Batch(true,"UPDATE_CARGO",null,cargo);
        Batch result= Connection.connection(batch);
        if(!result.isResult()){
            JOptionPane.showMessageDialog(new JDialog(),
                    "Проверьте правильность введенных данных",
                    "Ошибка ввода",
                    JOptionPane.ERROR_MESSAGE);
        }
        WorkToCargoUser workToCargoUser =new WorkToCargoUser(user);
        workToCargoUser.setVisible(true);
        workToCargoUser.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration
}
