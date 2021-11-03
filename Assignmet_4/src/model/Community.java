/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Disha
 */
import model.House;

public class Community {
    
    private ArrayList<House> houseList;
    private String communityName;
    
    public Community(){
        
        this.houseList = new ArrayList<House>();
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    /*public House addHouse1(House newHouse){
        
        houseList.add(newHouse);
        return newHouse;
    }
    
    public boolean isHouseAlreadyInList(House newHouse){
        
        int flag = 0;
        for(House houseInList: houseList){
            System.out.println(houseInList.getStreetName().equalsIgnoreCase(newHouse.getStreetName()));
            System.out.println(houseInList.getHouseNumber() == newHouse.getHouseNumber());
            System.out.println(houseInList.getCity().equalsIgnoreCase(newHouse.getCity()));
            System.out.println("\n");
            if(houseInList.getStreetName().equalsIgnoreCase(newHouse.getStreetName()) && 
                    (houseInList.getHouseNumber() == newHouse.getHouseNumber()) && 
                    houseInList.getCity().equalsIgnoreCase(newHouse.getCity())){
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
    */
    
    public House addHouse(){
        House newHouse = new House();
        houseList.add(newHouse);
        return newHouse;
    }
    
    
    
}
