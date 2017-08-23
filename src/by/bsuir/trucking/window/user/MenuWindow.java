package by.bsuir.trucking.window.user;

import by.bsuir.trucking.entity.User;
import by.bsuir.trucking.window.StartWindow;
import by.bsuir.trucking.window.user.area.PersonalArea;
import by.bsuir.trucking.window.user.cargo.WorkToCargoUser;

public class MenuWindow extends javax.swing.JFrame {
    private User user;

    public MenuWindow(User u) {
        user = u;
        initComponents();
    }

    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();


        jLabel3.setText(user.getName());

        jMenu1.setText("Добавить");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("Добро пожаловать ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton6.setText("Работа с гузами");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, 52));

        jButton7.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton7.setText("Личный кабинет");
        jButton7.setActionCommand("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 250, 52));

        jButton2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton2.setText("Выход");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 250, 37));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.yellow);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 170, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/trucking/image/Фон.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        pack();
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        StartWindow startWindow = new StartWindow();
        startWindow.setVisible(true);
        startWindow.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        PersonalArea personalArea = new PersonalArea(user);
        personalArea.setVisible(true);
        this.setVisible(false);
        personalArea.setLocationRelativeTo(null);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        WorkToCargoUser workToCargoUser= new WorkToCargoUser(user);
        workToCargoUser.setVisible(true);
        this.setVisible(false);
        workToCargoUser.setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
