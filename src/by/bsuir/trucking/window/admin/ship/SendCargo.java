package by.bsuir.trucking.window.admin.ship;

import by.bsuir.trucking.connection.Connection;
import by.bsuir.trucking.entity.Batch;
import by.bsuir.trucking.entity.Ship;
import by.bsuir.trucking.entity.User;

import javax.swing.*;

public class SendCargo extends javax.swing.JFrame {

    private User user;
    public SendCargo(User u) {
        user = u;
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, 50));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.yellow);
        jLabel2.setText("Введите номер корабля:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 30));

        jToggleButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jToggleButton1.setText("Погрузить");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 250, 47));

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton1.setText("Назад");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 250, 41));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("Погрузка грузов");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/trucking/image/Фон.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        pack();
    }// </editor-fold>

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Ship ship = new Ship();
        ship.setId(Integer.parseInt(jTextField1.getText()));
        Batch batch = new Batch(true,"FIND_MAX_QUANTITY",null,ship);
        Batch result = Connection.connection(batch);
        if(!result.isResult()){
            JOptionPane.showMessageDialog(new JDialog(),
                    "Проверьте правильность введенных данных",
                    "Ошибка ввода",
                    JOptionPane.ERROR_MESSAGE);
        }
        WorkToShip workToShip =new WorkToShip(user);
        workToShip.setVisible(true);
        workToShip.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        WorkToShip workToShip =new WorkToShip(user);
        workToShip.setVisible(true);
        workToShip.setLocationRelativeTo(null);
        this.setVisible(false);
    }


    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration
}
