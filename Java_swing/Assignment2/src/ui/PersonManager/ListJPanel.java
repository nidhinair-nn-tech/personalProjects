/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author nidhinair
 */
public class ListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListJPanel
     */
    private JPanel WorkArea;
    private PersonDirectory personDirectory;

    public ListJPanel(JPanel workArea, PersonDirectory directory) {
        initComponents();
        this.WorkArea = workArea;
        this.personDirectory = directory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Home City", "Home Zip", "Work City", "Work Zip"
            }
        ));
        jScrollPane1.setViewportView(tblPerson);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnDelete)
                .addContainerGap(299, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        WorkArea.remove(this);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.previous(WorkArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPerson.getSelectedRow();
        if(selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete the selected account?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION) {
                Person person = personDirectory.getPersonList().get(selectedRow);
                personDirectory.deletePerson(person);
                //Person selectedAccount = (Person) tblPerson.getValueAt(selectedRow , 0);
                //personDirectory.deletePerson(selectedAccount);
                populateTable();
            }

        }else{
            JOptionPane.showMessageDialog(null,"Please select an account from this list.","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerson;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        // Define the table model with column names
        DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        model.setRowCount(0);  // Clear existing data

        // Loop through the person directory and add rows to the table
        for (Person p : personDirectory.getPersonList()) {
            Object[] row = new Object[6];
            row[0] = p.getFirstName();
            row[1] = p.getLastName();
            row[2] = p.getHomeAddress().getCity();
            row[3] = String.valueOf(p.getHomeAddress().getZipCode());
            row[4] = p.getWorkAddress().getCity();
            row[5] = String.valueOf(p.getWorkAddress().getZipCode());
            
            model.addRow(row);  // Add row to the table
        }
    }
}
