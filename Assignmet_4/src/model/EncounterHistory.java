/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Disha
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory(){
        
        this.encounterHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addEncounter(){
        
        Encounter newEncounter = new Encounter();
        encounterHistory.add(newEncounter);
        return newEncounter;
    }
    
    public int findPatientById(int num){
        
        //ArrayList<Encounter> tempEncounterById = new ArrayList<Encounter>();
        int count = 0;
        //for(Encounter e: encounterHistory ){
        for(int i =0; i < encounterHistory.size() - 1;i++){
            
            Encounter e = encounterHistory.get(i); 
            //System.out.println(encounterHistory.size()); 
            Patient p = e.getEncounterPatient(); 
            //System.out.println(p.getPatientName());
            //System.out.println(p.getPatientId());
            //System.out.println(p.getPatientId() == num);
            if(p.getPatientId() == num){
                
                //tempEncounterById.add(e);
                //System.out.println(tempEncounterById.get(j));
                count = count + 1; 
            }
            
        }
        
        
        System.out.println(count);
        return count;
        
        //return encounterHistory.stream().filter(p -> p.getEncounterPatient().getPatientId() == num).collect(toList());     
    }
    
    
}
