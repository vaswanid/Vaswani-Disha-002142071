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
public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;
        
    
    public PatientDirectory(){
        
        this.patientDirectory = new ArrayList<Patient>();
      
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient addPatient(){
        
        Patient newPatient = new Patient();
        patientDirectory.add(newPatient);
        return newPatient;
    }
    
    public boolean isAlreadyPatient(Person newPerson){
        
        int flag = 0;
        House newPatientHouse = newPerson.getHouse();
        for(Patient oldPatient: patientDirectory){
            
            House oldPatientHouse = oldPatient.getHouse();
            
            if(oldPatientHouse.getCommunity().equalsIgnoreCase(newPatientHouse.getCommunity()) && 
                oldPatient.getPatientName().equalsIgnoreCase(newPerson.getPersonName()) &&
                oldPatientHouse.getStreetName().equalsIgnoreCase(newPatientHouse.getStreetName()) &&
                (oldPatientHouse.getHouseNumber() == newPatientHouse.getHouseNumber()) && 
                oldPatientHouse.getCity().equalsIgnoreCase(newPatientHouse.getCity())){
                flag = 1;
                break;
            }
        }
        
        if(flag == 1){
            return true;
        }
        else{
            return false;
        }
                
    }
    
    public boolean isAlreadyPatientId(int id){
        
        int flag = 0;
        for(Patient oldPatient: patientDirectory){
         
            if(oldPatient.getPatientId() == id){
                flag = 1;
                break;
            }
            
        }
        
        if(flag == 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public List<Patient> findPatientByAgeOneToTwele(){
        
        int min = 1;
        int max = 12;
        return patientDirectory.stream().filter(p -> (p.getPatientAge() >= min && p.getPatientAge() <= max)).collect(toList());
  
    }
    
     public List<Patient> findPatientByAgeThirteenToTwentyFive(){
        
        int min = 13;
        int max = 25;
        return patientDirectory.stream().filter(p -> (p.getPatientAge() >= min && p.getPatientAge() <= max)).collect(toList());
    }
     
      public List<Patient> findPatientByAgeTwentySixAndAbove(){
        
        int min = 26;
        int max = 100;
        return patientDirectory.stream().filter(p -> (p.getPatientAge() >= min && p.getPatientAge() <= max)).collect(toList());
    }
      
    public List<Patient> findAbnormalPatientByAgeOneToTwele(){
        
        int min = 1;
        int max = 12;
        int bpMin = 70;
        int bpMax = 120;
        
        List<Patient> tempBPPatientByAge = new ArrayList<Patient>();
    
        for(Patient p: patientDirectory ){
    
            VitalSigns vs = p.getVitals();
            if(p.getPatientAge() >= min && p.getPatientAge() <=max ){
                
                if(vs.getBloodPressure() < bpMin || vs.getBloodPressure() > bpMax){
                    tempBPPatientByAge.add(p);
                }
            }
            
        }
        
        return tempBPPatientByAge;
        
  
    }
    
     public List<Patient> findAbnormalPatientByAgeThirteenToTwentyFive(){
        
        int min = 13;
        int max = 25;
        int bpMin = 100;
        int bpMax = 120;
        
        List<Patient> tempBPPatientByAge = new ArrayList<Patient>();
        
        for(Patient p: patientDirectory ){
            
            VitalSigns vs = p.getVitals();
            if(p.getPatientAge() >= min && p.getPatientAge() <=max ){
    
                if(vs.getBloodPressure() < bpMin || vs.getBloodPressure() > bpMax){
                    tempBPPatientByAge.add(p);
                }
            }
            
        }
        
        return tempBPPatientByAge;
    }
     
      public List<Patient> findAbnormalPatientByAgeTwentySixAndAbove(){
        
        int min = 26;
        int max = 100;
        int bpMin = 110;
        int bpMax = 130;
        
        List<Patient> tempBPPatientByAge = new ArrayList<Patient>();
        
        for(Patient p: patientDirectory ){
           
            VitalSigns vs = p.getVitals();
            if(p.getPatientAge() >= min && p.getPatientAge() <=max ){
                
                if(vs.getBloodPressure() < bpMin || vs.getBloodPressure() > bpMax){
                    tempBPPatientByAge.add(p);
                }
               
            }
            
        }
        
        return tempBPPatientByAge;
    }
      
    public List<Patient> findAbnormalCommunityPatientByAgeOneToTwele(String nameCommunity){
        
        int min = 1;
        int max = 12;
        int bpMin = 70;
        int bpMax = 120;
        
        List<Patient> tempBPPatientByAge = new ArrayList<Patient>();
       
        for(Patient p: patientDirectory ){
            
            House h = p.getHouse();
            VitalSigns vs = p.getVitals();
            if(p.getPatientAge() >= min && p.getPatientAge() <=max ){
                
                if(h.getCommunity().equalsIgnoreCase(nameCommunity)){   
                   
                   if(vs.getBloodPressure() < bpMin || vs.getBloodPressure() > bpMax){
                       tempBPPatientByAge.add(p);
                   }
               }
               
            }
            
        }
        
        return tempBPPatientByAge;
        
  
    }
    
     public List<Patient> findAbnormalCommunityPatientByAgeThirteenToTwentyFive(String nameCommunity){
        
        int min = 13;
        int max = 25;
        int bpMin = 100;
        int bpMax = 120;
        
        List<Patient> tempBPPatientByAge = new ArrayList<Patient>();
      
        for(Patient p: patientDirectory ){
            
            House h = p.getHouse();
            VitalSigns vs = p.getVitals();
            if(p.getPatientAge() >= min && p.getPatientAge() <=max ){
                
                if(h.getCommunity().equalsIgnoreCase(nameCommunity)){
                    
                    if(vs.getBloodPressure() < bpMin || vs.getBloodPressure() > bpMax){
                        tempBPPatientByAge.add(p);
                    }
                }
            }
            
        }
        
        return tempBPPatientByAge;
    }
     
      public List<Patient> findAbnormalCommunityPatientByAgeTwentySixAndAbove(String nameCommunity){
        
        int min = 26;
        int max = 100;
        int bpMin = 110;
        int bpMax = 130;
        
        List<Patient> tempBPPatientByAge = new ArrayList<Patient>();
       
        for(Patient p: patientDirectory ){ 
            House h = p.getHouse();
            VitalSigns vs = p.getVitals();
            if(p.getPatientAge() >= min && p.getPatientAge() <=max ){
                
                if(h.getCommunity().equalsIgnoreCase(nameCommunity)){
                    
                    if(vs.getBloodPressure() < bpMin || vs.getBloodPressure() > bpMax){
                        tempBPPatientByAge.add(p);
                    }
                }
                
            }
            
        }
        
        return tempBPPatientByAge;
    }
}
