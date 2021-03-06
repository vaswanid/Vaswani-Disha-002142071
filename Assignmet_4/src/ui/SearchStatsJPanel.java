/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author Disha
 */
public class SearchStatsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchStatsJPanel
     */
    PatientDirectory patientDirectory;
    public SearchStatsJPanel(PatientDirectory patientDirectory) {
        initComponents();
        
        this.patientDirectory = patientDirectory;
        
        populateAll();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgeOneToTwele = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAgeThirteenToTwentyFive = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAgeTwentySixAndAbove = new javax.swing.JTable();
        lblAgeOneToTwele = new javax.swing.JLabel();
        lblAgeTweleToTwentyFour = new javax.swing.JLabel();
        lblAgeTwentySixAndAbove = new javax.swing.JLabel();
        btnSearchAbnormal = new javax.swing.JButton();
        lblCommunity = new javax.swing.JLabel();
        txtSearchByCommunity = new javax.swing.JTextField();
        lblWarning = new javax.swing.JLabel();
        btnSearchByCommunityAbnormal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDisplayCount = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Search Stats");

        tblAgeOneToTwele.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "Community", "Age", "Gender", "Contact Number", "Street Name", "House Number", "City", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(tblAgeOneToTwele);

        tblAgeThirteenToTwentyFive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "Community", "Age", "Gender", "Contact Number", "Street Name", "House Number", "City", "Blood Pressure"
            }
        ));
        jScrollPane2.setViewportView(tblAgeThirteenToTwentyFive);

        tblAgeTwentySixAndAbove.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "Community", "Age", "Gender", "Contact Number", "Street Name", "House Number", "City", "Blood Pressure"
            }
        ));
        jScrollPane3.setViewportView(tblAgeTwentySixAndAbove);

        lblAgeOneToTwele.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAgeOneToTwele.setText("AGE: 1 - 12");

        lblAgeTweleToTwentyFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAgeTweleToTwentyFour.setText("AGE: 13 - 25");

        lblAgeTwentySixAndAbove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAgeTwentySixAndAbove.setText("AGE: 26 and above");

        btnSearchAbnormal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearchAbnormal.setText("Search BP Abnormal Patient By AGE Group");
        btnSearchAbnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAbnormalActionPerformed(evt);
            }
        });

        lblCommunity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommunity.setText("Community:");

        btnSearchByCommunityAbnormal.setText("Search Abnormal By Community");
        btnSearchByCommunityAbnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByCommunityAbnormalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total Patient:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgeTwentySixAndAbove)
                            .addComponent(lblAgeTweleToTwentyFour)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane3))
                            .addComponent(lblAgeOneToTwele, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDisplayCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btnSearchAbnormal)
                        .addGap(148, 148, 148)
                        .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearchByCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchByCommunityAbnormal)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAgeOneToTwele, lblAgeTweleToTwentyFour, lblAgeTwentySixAndAbove});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchByCommunity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearchByCommunityAbnormal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchAbnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgeOneToTwele, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarning, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblAgeTweleToTwentyFour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblAgeTwentySixAndAbove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisplayCount))
                .addGap(74, 74, 74))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAgeOneToTwele, lblAgeTweleToTwentyFour, lblAgeTwentySixAndAbove});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, lblDisplayCount});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchAbnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAbnormalActionPerformed
        // TODO add your handling code here:
        
        List<Patient> AllAbnormalPatientAgeOneToTwele = patientDirectory.findAbnormalPatientByAgeOneToTwele();
        populateTableOneToTwele(AllAbnormalPatientAgeOneToTwele);
        
        List<Patient> AllAbnormalPatientAgeThirteenToTwentyFive = patientDirectory.findAbnormalPatientByAgeThirteenToTwentyFive();
        populateTableThirteenToTwentyFive(AllAbnormalPatientAgeThirteenToTwentyFive);
        
        List<Patient> AllAbnormalPatientAgeTwentySixAndAbove = patientDirectory.findAbnormalPatientByAgeTwentySixAndAbove();
        populateTableTwentyFiveAndAbove(AllAbnormalPatientAgeTwentySixAndAbove);
        
    }//GEN-LAST:event_btnSearchAbnormalActionPerformed

    private void btnSearchByCommunityAbnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByCommunityAbnormalActionPerformed
        // TODO add your handling code here:
        
        String community = txtSearchByCommunity.getText();
        
        List<Patient> AllAbnormalByCommunityPatientAgeOneToTwele = patientDirectory.findAbnormalCommunityPatientByAgeOneToTwele(community);
        populateTableOneToTwele(AllAbnormalByCommunityPatientAgeOneToTwele);
        
        List<Patient> AllAbnormalByCommunityPatientAgeThirteenToTwentyFive = patientDirectory.findAbnormalCommunityPatientByAgeThirteenToTwentyFive(community);
        populateTableThirteenToTwentyFive(AllAbnormalByCommunityPatientAgeThirteenToTwentyFive);
        
        List<Patient> AllAbnormalByCommunityPatientAgeTwentySixAndAbove = patientDirectory.findAbnormalCommunityPatientByAgeTwentySixAndAbove(community);
        populateTableTwentyFiveAndAbove(AllAbnormalByCommunityPatientAgeTwentySixAndAbove);
        
        
    }//GEN-LAST:event_btnSearchByCommunityAbnormalActionPerformed
    
    private void populateTableOneToTwele(List<Patient> searchedPatientOneToTwele){
        
        DefaultTableModel model = (DefaultTableModel) tblAgeOneToTwele.getModel();
        model.setRowCount(0);
        
        for(Patient p: searchedPatientOneToTwele){
            
            Object[] row = new Object[10];
            
            House h = p.getHouse();
            VitalSigns vs = p.getVitals();
            
            row[0] = p;
            row[1] = p.getPatientId();
            row[2] = h.getCommunity();
            row[3] = p.getPatientAge();
            row[4] = p.getPatientSex();
            row[5] = p.getPatientContactNumber();
            row[6] = h.getStreetName();
            row[7] = h.getHouseNumber();
            row[8] = h.getCity();
            row[9] = vs.getBloodPressure();
            
            model.addRow(row);
            
            
        }
        
    }
    
    private void populateTableThirteenToTwentyFive(List<Patient> searchedPatientThirteenToTwentyFIve){
        
        DefaultTableModel model = (DefaultTableModel) tblAgeThirteenToTwentyFive.getModel();
        model.setRowCount(0);
        
        for(Patient p: searchedPatientThirteenToTwentyFIve){
            
            Object[] row = new Object[10];
            
            House h = p.getHouse();
            VitalSigns vs = p.getVitals();
            
            row[0] = p;
            row[1] = p.getPatientId();
            row[2] = h.getCommunity();
            row[3] = p.getPatientAge();
            row[4] = p.getPatientSex();
            row[5] = p.getPatientContactNumber();
            row[6] = h.getStreetName();
            row[7] = h.getHouseNumber();
            row[8] = h.getCity();
            row[9] = vs.getBloodPressure();
            
            model.addRow(row);
            
        }
    }
    
    private void populateTableTwentyFiveAndAbove(List<Patient> searchedPatientTwentySIxAndAbove){
        
        DefaultTableModel model = (DefaultTableModel) tblAgeTwentySixAndAbove.getModel();
        model.setRowCount(0);
        
        for(Patient p: searchedPatientTwentySIxAndAbove){
            
            Object[] row = new Object[10];
            
            House h = p.getHouse();
            VitalSigns vs = p.getVitals();
            
            row[0] = p;
            row[1] = p.getPatientId();
            row[2] = h.getCommunity();
            row[3] = p.getPatientAge();
            row[4] = p.getPatientSex();
            row[5] = p.getPatientContactNumber();
            row[6] = h.getStreetName();
            row[7] = h.getHouseNumber();
            row[8] = h.getCity();
            row[9] = vs.getBloodPressure();
            
            model.addRow(row);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchAbnormal;
    private javax.swing.JButton btnSearchByCommunityAbnormal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAgeOneToTwele;
    private javax.swing.JLabel lblAgeTweleToTwentyFour;
    private javax.swing.JLabel lblAgeTwentySixAndAbove;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDisplayCount;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTable tblAgeOneToTwele;
    private javax.swing.JTable tblAgeThirteenToTwentyFive;
    private javax.swing.JTable tblAgeTwentySixAndAbove;
    private javax.swing.JTextField txtSearchByCommunity;
    // End of variables declaration//GEN-END:variables

    private void populateAll() {
        
        List<Patient> AllPatientAgeOneToTwele = patientDirectory.findPatientByAgeOneToTwele();
        populateTableOneToTwele(AllPatientAgeOneToTwele);
        
        List<Patient> AllPatientAgeThirteenToTwentyFive = patientDirectory.findPatientByAgeThirteenToTwentyFive();
        populateTableThirteenToTwentyFive(AllPatientAgeThirteenToTwentyFive);
        
        List<Patient> AllPatientAgeTwentySixAndAbove = patientDirectory.findPatientByAgeTwentySixAndAbove();
        populateTableTwentyFiveAndAbove(AllPatientAgeTwentySixAndAbove);
    }
}
