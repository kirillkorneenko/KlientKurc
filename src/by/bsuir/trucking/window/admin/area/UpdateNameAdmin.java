package by.bsuir.trucking.window.admin.area;

import by.bsuir.trucking.connection.Connection;
import by.bsuir.trucking.entity.Batch;
import by.bsuir.trucking.entity.User;

import javax.swing.*;

public class UpdateNameAdmin extends javax.swing.JFrame {

    private User user;
    public UpdateNameAdmin(User u) {
        user = u;
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.yellow);
        jLabel2.setText("Введите новое имя:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 200, 32));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.yellow);
        jLabel3.setText("Введите новую фамилию:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 200, 32));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.yellow);
        jLabel4.setText("Введите новый логин:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 200, 32));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 200, 32));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.yellow);
        jLabel5.setText("Введите новый пароль:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("Изменить");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton1.setText("Ввод");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 220, 40));

        jButton2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton2.setText("Назад");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 126, 40));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        jLabel7.setForeground(java.awt.Color.yellow);
        jLabel7.setText("информацию");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/trucking/image/Фон.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        pack();
    }// </editor-fold>

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        User user = new User();
        user.setId(this.user.getId());
        user.setName(jTextField1.getText());
        user.setSurname(jTextField2.getText());
        user.setLogin(jTextField3.getText());
        user.setPassword(jPasswordField1.getText());
        user.setStatus(this.user.getStatus());

        Batch batch = new Batch(true,"UPDATE_USER",null,user);
        Batch result = Connection.connection(batch);
        if(!result.isResult()){
            JOptionPane.showMessageDialog(new JDialog(),
                    "Проверьте правильность введенных данных",
                    "Ошибка ввода",
                    JOptionPane.ERROR_MESSAGE);
        }
        PersonalAreaAdmin personalAreaAdmin =new PersonalAreaAdmin(user);
        personalAreaAdmin.setVisible(true);
        personalAreaAdmin.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        PersonalAreaAdmin personalAreaAdmin =new PersonalAreaAdmin(user);
        personalAreaAdmin.setVisible(true);
        personalAreaAdmin.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration
}
