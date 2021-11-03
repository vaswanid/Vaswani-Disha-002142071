/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Disha
 */
public class Patient {
    
    private int patientId;
    private String patientName;
    private long patientContactNumber;
    private int patientAge;
    private String patientSex;
    House house;
    VitalSigns vitals;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public long getPatientContactNumber() {
        return patientContactNumber;
    }

    public void setPatientContactNumber(long patientContactNumber) {
       {
         if(String.valueOf(patientContactNumber).length() == 10) {
            this.patientContactNumber = patientContactNumber;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Patient Contact Number.");
        }
    }
    }
    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    public VitalSigns getVitals() {
        return vitals;
    }

    public void setVitals(VitalSigns vitals) {
        this.vitals = vitals;
    }

    @Override
    public String toString(){
        return patientName;
    }
}
