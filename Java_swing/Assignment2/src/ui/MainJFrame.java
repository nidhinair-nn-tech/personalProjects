/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;
import ui.PersonManager.AddJPanel;
import ui.PersonManager.ListJPanel;
import ui.PersonManager.ViewJPanel;


/**
 *
 * @author nidhinair
 */
public class MainJFrame extends javax.swing.JFrame {
    private PersonDirectory personDirectory;
    private JPanel workArea;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.personDirectory = new PersonDirectory();
        // Set background color to lavender
        ControlPanel.setBackground(new Color(216, 230, 250));  // Lavender color
        ControlPanel.setOpaque(true);  // Ensure the ControlPanel is opaque
        //initPanels();
        generateDemoData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        btnAddP = new javax.swing.JButton();
        btnListP = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearchBox = new javax.swing.JTextField();
        WorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddP.setText("Add Person");
        btnAddP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPActionPerformed(evt);
            }
        });

        btnListP.setText("List Person");
        btnListP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListPActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Person Profile");

        btnSearch.setText("Search for Person");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearchBox.setText("Type name or city");

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ControlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(107, 107, 107)
                .addComponent(btnAddP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListP)
                .addGap(87, 87, 87)
                .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(ControlPanel);

        WorkArea.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPActionPerformed
        // TODO add your handling code here:
        AddJPanel panel = new AddJPanel(WorkArea,personDirectory);
        WorkArea.add("AddPJPanel", panel);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnAddPActionPerformed

    private void btnListPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListPActionPerformed
        // TODO add your handling code here:
        ListJPanel panel = new ListJPanel(WorkArea, personDirectory);
        WorkArea.add("ListJPanel", panel);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnListPActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String keyword = txtSearchBox.getText();
        Person foundPerson = personDirectory.searchPerson(keyword);

    if (foundPerson != null) {
        ViewJPanel panel = new ViewJPanel(WorkArea,personDirectory,foundPerson);
        WorkArea.add("ViewJPanel",panel);
        CardLayout layout = (CardLayout)WorkArea.getLayout();
        layout.next(WorkArea);
        
    } else {
        JOptionPane.showMessageDialog(this, "No person found.");
    }
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnAddP;
    private javax.swing.JButton btnListP;
    private javax.swing.JButton btnSearch;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables

    private void generateDemoData() {
        Person newPerson = personDirectory.addPerson();
        newPerson.setFirstName("Katrina");
        newPerson.setLastName("Kaif");
        newPerson.setSocialSecurityNumber("2321455111");
        newPerson.setAge(35);
        Address homeAddress = new Address("Alphonsus Street","45","London","NY".toCharArray(),23423,8989888000L);
        newPerson.setHomeAddress(homeAddress);
        Address workAddress = new Address("Cool Street","4","Bombay","MH".toCharArray(),56880,5643332888L);
        newPerson.setWorkAddress(workAddress);
        
        Person newPerson1 = personDirectory.addPerson();
        newPerson1.setFirstName("Vicky");
        newPerson1.setLastName("Kaushal");
        newPerson1.setAge(35);
        newPerson1.setSocialSecurityNumber("2321455111");
        Address homeAddress1 = new Address("Alphonsus Street","15","Mumbai","BG".toCharArray(),42332,5627823334L);
        newPerson1.setHomeAddress(homeAddress1);
        Address workAddress1 = new Address("Newbury Street","55","Mumbai","MH".toCharArray(),88065,1231455788L);
        newPerson1.setWorkAddress(workAddress1);
        
        Person newPerson2 = personDirectory.addPerson();
        newPerson2.setFirstName("Sharauk");
        newPerson2.setLastName("Khan");
        newPerson2.setAge(56);
        newPerson2.setSocialSecurityNumber("345676781881");
        Address homeAddress2 = new Address("Al Street", "1", "Mumbai", "MH".toCharArray(), 11233, 4898900011L);
        newPerson2.setHomeAddress(homeAddress2);
        Address workAddress2 = new Address ("New Street","567","Dubai","CO".toCharArray(),85654,3422564332L);
        newPerson2.setWorkAddress(workAddress2);

        Person newPerson3 = personDirectory.addPerson();
        newPerson3.setFirstName("Alia");
        newPerson3.setLastName("Bhatt");
        newPerson3.setAge(30);
        newPerson3.setSocialSecurityNumber("767818813456");
        Address homeAddress3 = new Address("Park Street","121","Delhi","MI".toCharArray(),22120,987367357272L);
        newPerson3.setHomeAddress(homeAddress3);
        Address workAddress3 = new Address("Newport Street","57","Boston","MA".toCharArray(),22120,972728736735L);
        newPerson3.setWorkAddress(workAddress3 );
        
        Person newPerson4 = personDirectory.addPerson();
        newPerson4.setFirstName("John");
        newPerson4.setLastName("Abraham");
        newPerson4.setAge(47);
        newPerson4.setSocialSecurityNumber("818813767456");
        Address homeAddress4 = new Address("Diamond Street","121","Kollam","SA".toCharArray(),31113,81914516717L);
        newPerson4.setHomeAddress(homeAddress4);
        
        Address workAddress4 = new Address("Fairy Street","57","Cochin","FG".toCharArray(),55554,987727236735L);
        newPerson4.setWorkAddress(workAddress4);
        
    }
   
}

