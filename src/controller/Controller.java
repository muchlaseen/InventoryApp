/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import model.StatusCategory;
import model.Database;
import model.EmploymentCategory;
import model.Gender;
import model.Person;
import ui.FormEvent;

/**
 *
 * @author muchlas
 */
public class Controller {

    Database db = new Database();
    
    public List<Person> getPeople() {
        return db.getPeople();
    }

    public void addPerson(FormEvent ev) {
        String name = ev.getName();
        String occupation = ev.getAge();
        int ageCatId = ev.getAgeCategory();
        String empCat = ev.getEmpCategory();
        boolean isUs = ev.isUsCitizen();
        String taxId = ev.getTaxId();
        String gender = ev.getGender();

        StatusCategory statusCategory = null;
        switch (ageCatId) {
            case 0:
                statusCategory = StatusCategory.married;
                break;
            case 1:
                statusCategory = StatusCategory.single;
                break;
            case 2:
                statusCategory = StatusCategory.other;
                break;
            default:
        }

        EmploymentCategory empCategory;
        if (empCat.equals("empliyed")) {
            empCategory = EmploymentCategory.employed;
        } else if (empCat.equals("self-employed")) {
            empCategory = EmploymentCategory.selfEmployed;
        } else if (empCat.equals("unemployed")) {
            empCategory = EmploymentCategory.unEmployed;
        } else {
            empCategory = EmploymentCategory.other;
            System.err.println(empCat);
        }
        
        Gender genderCat;
        if (gender.equals("Male")) {
            genderCat = Gender.male;
        }
        else {
            genderCat = Gender.female;
        }
                
        Person person = new Person(name, occupation, statusCategory, empCategory, taxId, isUs, genderCat);

        db.addPerson(person);

    }
    
    public void saveToFile(File file) throws IOException {
        db.saveToFile(file);
    }
    
    public void openFromFile (File file) throws IOException {
        db.openFromFile(file);
    }
}
