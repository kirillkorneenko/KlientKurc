package by.bsuir.trucking.window.admin.ship;

import by.bsuir.trucking.entity.Batch;
import by.bsuir.trucking.entity.Ship;
import by.bsuir.trucking.entity.User;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

import static by.bsuir.trucking.connection.Connection.connection;

public class ViewShip extends javax.swing.JFrame {

    private User user;
    public ViewShip(User u)
    {
        user = u;
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CargoJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("Список кораблей:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        CargoJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "№", "Масса", "Дата отплытия"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Batch batch = new Batch(true,"SELECT_SHIP",null,user);
        Batch result = connection(batch);
        ArrayList<Ship> arrayList = new ArrayList<Ship>();
        arrayList = (ArrayList<Ship>) result.getList();
        DefaultTableModel model = (DefaultTableModel) CargoJTable.getModel();
        for(Ship ship:arrayList){
            model.addRow(new Object[]{ship.getId(),ship.getMaxWeight(),ship.getDepartureDate()});
        }

        CargoJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(CargoJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 375, 176));

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton1.setText("Назад");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 375, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/trucking/image/Фон.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        WorkToShip workToShip= new WorkToShip(user);
        workToShip.setVisible(true);
        workToShip.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private javax.swing.JTable CargoJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
