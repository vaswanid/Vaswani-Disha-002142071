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
public class Person {
    
    private String personName;
    private long personContactNumber;
    private String personAge;
    private String personSex;
    House house;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        if(personName.matches("[a-zA-Z]*")) {
            this.personName = personName;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Person's Name.");
        }
    }

    public long getPersonContactNumber() {
        return personContactNumber;
    }

    public void setPersonContactNumber(long personContactNumber) {
        String mn = String.valueOf(personContactNumber);
        if(mn.matches("^[0-9]{10}$"))
        {
            this.personContactNumber = personContactNumber;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Contact Number of the Person.");
        }
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        String mn = String.valueOf(personAge);
        if(mn.matches("^[0-9]$"))
        {
            this.personAge = personAge;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Age of the Person.");
        }
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex;
           if(personSex.matches("[a-zA-Z]*")) {
            this.personSex = personSex;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid person Sex.");
        }
        
    }

 public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    @Override
    public String toString(){
        return personName;
    }
}
