/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.EventObject;

/**
 *
 * @author muchlas
 */
public class FormEvent extends EventObject {

    private String name;
    private String age;
    private int ageCategory;
    private String empCategory;
    private String taxId;
    private boolean usCitizen;
    private String gender;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String age, int ageCat, String empCat,
            String taxId, boolean usCitizen, String gender) {
        
        super(source);

        this.name = name;
        this.age = age;
        this.ageCategory = ageCat;
        this.empCategory = empCat;
        this.taxId = taxId;
        this.usCitizen = usCitizen;
        this.gender = gender;

    }
    
    public String getGender() {
        return gender;
    }

    public String getTaxId() {
        return taxId;
    }

    public boolean isUsCitizen() {
        return usCitizen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public String getEmpCategory() {
        return empCategory;
    }

}
