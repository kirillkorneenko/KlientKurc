package by.bsuir.trucking.window.admin.cargo;

import by.bsuir.trucking.entity.Batch;
import by.bsuir.trucking.entity.Cargo;
import by.bsuir.trucking.entity.User;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

import static by.bsuir.trucking.connection.Connection.connection;

public class ViewCargoAdmin extends javax.swing.JFrame {

    private User user;
    public ViewCargoAdmin(User u) {
        user = u;
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CargoJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CargoJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "№", "Масса", "Цена", "№ корабля"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Batch batch = new Batch(true,"SELECT_CARGO",null,user);
        Batch result = connection(batch);
        ArrayList<by.bsuir.trucking.entity.Cargo> arrayList = new ArrayList<Cargo>();
        arrayList = (ArrayList<Cargo>) result.getList();
        DefaultTableModel model = (DefaultTableModel) CargoJTable.getModel();
        for(Cargo cargo:arrayList){
            model.addRow(new Object[]{cargo.getId(),cargo.getWeight(),cargo.getPrice(),cargo.getShipId()});
        }

        CargoJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(CargoJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 375, 176));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("Список грузов:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton1.setText("Назад");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 375, 41));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/trucking/image/Фон.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        WorkToCargoAdmin workToCargoAdmin=new WorkToCargoAdmin(user);
        workToCargoAdmin.setVisible(true);
        workToCargoAdmin.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private javax.swing.JTable CargoJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
