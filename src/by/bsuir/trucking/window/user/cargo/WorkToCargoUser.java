package by.bsuir.trucking.window.user.cargo;

import by.bsuir.trucking.entity.User;
import by.bsuir.trucking.window.user.MenuWindow;

public class WorkToCargoUser extends javax.swing.JFrame {

    private User user;

    public WorkToCargoUser(User u) {
        user= u;
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton1.setText("Просмотр своих грузов");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 310, 40));

        jButton2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton2.setText("Добавить груз");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 310, 40));

        jButton3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton3.setText("Удалить груз");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 310, 40));

        jButton4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton4.setText("Изменить груз");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 310, 40));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("Работа с грузами");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 11, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton5.setText("Назад");
        jButton5.setActionCommand("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 310, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/trucking/image/Фон.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        ViewCargo viewCargo = new ViewCargo(user);
        viewCargo.setVisible(true);
        viewCargo.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        MenuWindow menuWindow= new MenuWindow(user);
        menuWindow.setVisible(true);
        menuWindow.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        AddCargo addCargo =new AddCargo(user);
        addCargo.setVisible(true);
        addCargo.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        DeleteCargo deleteCargo = new DeleteCargo(user);
        deleteCargo.setVisible(true);
        deleteCargo.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        UpdateCargo updateCargo = new UpdateCargo(user);
        updateCargo.setVisible(true);
        updateCargo.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
