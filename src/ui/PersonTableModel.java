/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Person;

/**
 *
 * @author muchlas
 */
public class PersonTableModel extends AbstractTableModel {

    private List<Person> db;
    private String[] colNames = {"ID", "Name", "Age", "Status", "Department", "Tax ID"};

    public PersonTableModel() {
        
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    public void setData(List<Person> db) {
        this.db = db;
    }

    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person = db.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return person.getId();
            case 1:
                return person.getName();
            case 2:
                return person.getAge();
            case 3:
                return person.getStatusCategory();
            case 4:
                return person.getDeptCategory();
//            case 5:
//                return person.isUsCitizen();
            case 5:
                return person.getTaxId();

        }

        return null;
    }

}
