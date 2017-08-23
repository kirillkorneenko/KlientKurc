package by.bsuir.trucking.window.admin;

import by.bsuir.trucking.entity.User;
import by.bsuir.trucking.window.StartWindow;
import by.bsuir.trucking.window.admin.area.PersonalAreaAdmin;
import by.bsuir.trucking.window.admin.cargo.WorkToCargoAdmin;
import by.bsuir.trucking.window.admin.ship.WorkToShip;

public class MenuAdmin extends javax.swing.JFrame {
    private User user;
    public MenuAdmin(User u) {
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("Добро пожаловать ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton1.setText("личный кабинет");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 270, 40));

        jButton2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton2.setText("работа с кораблями");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 270, 40));

        jButton3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton3.setText("работа с грузами");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 270, 40));

        jButton4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton4.setText("выход");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 270, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/trucking/image/Фон.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        pack();
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        WorkToShip workToShip =new WorkToShip(user);
        workToShip.setVisible(true);
        workToShip.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        PersonalAreaAdmin  personalArea =new PersonalAreaAdmin(user);
        personalArea.setVisible(true);
        personalArea.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        StartWindow startWindow=new StartWindow();
        startWindow.setVisible(true);
        startWindow.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        WorkToCargoAdmin workToCargoAdmin =new WorkToCargoAdmin(user);
        workToCargoAdmin.setVisible(true);
        workToCargoAdmin.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
