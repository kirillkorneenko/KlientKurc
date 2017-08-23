package by.bsuir.trucking.window.admin.ship;

import by.bsuir.trucking.entity.User;
import by.bsuir.trucking.window.admin.MenuAdmin;

public class WorkToShip extends javax.swing.JFrame {

    private User user;
    public WorkToShip(User u) {
        user = u;
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("Работа с кораблями");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton1.setText("погрузить грузы на корабль");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 360, 40));

        jButton2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton2.setText("добавить корабль");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 360, 40));

        jButton3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton3.setText("удалить корабль");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 360, 40));

        jButton4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton4.setText("изменить корабль");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 360, 40));

        jButton5.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton5.setText("просмотреть все корабли");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 360, 40));

        jButton6.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton6.setText("назад");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 360, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/trucking/image/Фон.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        pack();
    }// </editor-fold>

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        UpdateShip updateShip =new UpdateShip(user);
        updateShip.setVisible(true);
        updateShip.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        MenuAdmin menuAdmin =new MenuAdmin(user);
        menuAdmin.setVisible(true);
        menuAdmin.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        AddShip addShip =new AddShip(user);
        addShip.setVisible(true);
        addShip.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        DeleteShip deleteShip = new DeleteShip(user);
        deleteShip.setVisible(true);
        deleteShip.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        ViewShip viewShip =new ViewShip(user);
        viewShip.setVisible(true);
        viewShip.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        SendCargo sendCargo = new SendCargo(user);
        sendCargo.setVisible(true);
        sendCargo.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
