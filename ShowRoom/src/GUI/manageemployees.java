package GUI;
import java.sql.*;
import Class.TestConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class manageemployees extends javax.swing.JInternalFrame {
    TestConnection db;
    /**
     * Creates new form manageemployees
     */
    public manageemployees() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        DefaultTableModel model = null;
        try {
            db = new TestConnection();
            ResultSet rs = db.getConnect("select * from employees");
            String[] colname = {"id", "first_name", "last_name", "queue", "free"};
            int i = 0;
            model = new DefaultTableModel(colname, 0);
            while (rs.next()) {
                i++;
                String id = rs.getString("id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String queue = rs.getString("queue");
                String free = rs.getString("free");
                String[] row = {id, first_name, last_name, queue, free};
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.disconnect();
        JScrollPane jScrollPane1 = new JScrollPane();

        JTable jTable1 = new JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Employees");
        setPreferredSize(new java.awt.Dimension(1077, 687));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jTable1.setModel(model);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(569, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
