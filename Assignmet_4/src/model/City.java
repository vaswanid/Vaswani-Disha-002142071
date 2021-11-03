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
public class City {
    
    private ArrayList<Community> communityList;
    
    public City(){
        
        this.communityList = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community addCommunity(){
        
        Community newCommunity = new Community();
        communityList.add(newCommunity);
        return newCommunity;
        
    }
    
    /*
    public Community addCommunity1(Community newCommunity){
        
        communityList.add(newCommunity);
        return newCommunity;
        
    }
        
    public boolean isCommunityAlreadyInList(Community newCommunity){
        int flag = 0;
        for(Community oldCommunity: communityList){
            if(oldCommunity.getCommunityName().equalsIgnoreCase(newCommunity.getCommunityName())){
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
    
}
