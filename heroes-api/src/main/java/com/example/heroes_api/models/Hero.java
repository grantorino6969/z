package com.example.heroes_api.models;

public class Hero {
    private int Id;
    private String Name;
    private String Attribute;
    private String Role;
    private boolean Deactivated;

    public Hero(int Id, String Name, String Attribute, String Role, boolean Deactivated){
        this.Id = Id;
        this.Name = Name;
        this.Attribute = Attribute;
        this.Role = Role;
        this.Deactivated = Deactivated;
    }

    public int getId(){
        return this.Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    
}
