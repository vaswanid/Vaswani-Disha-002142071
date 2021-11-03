/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Disha
 */
public class Encounter {
    
    private int encounterNumber;
    private Patient encounterPatient;

    public int getEncounterNumber() {
        return encounterNumber;
    }

    public void setEncounterNumber(int encounterNumber) {
        this.encounterNumber = encounterNumber;
    }

    public Patient getEncounterPatient() {
        return encounterPatient;
    }

    public void setEncounterPatient(Patient encounterPatient) {
        this.encounterPatient = encounterPatient;
    }
    
    
    
    
}
