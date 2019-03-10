/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentrupp;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class TableModify extends DefaultTableModel{
    public void RemoveAll(){
        while(this.getRowCount()>0){
            this.removeRow(0);
        }
    }
    private boolean b;
    public boolean isCellEditable(int r,int c){
        return b;
    }
    public void removeAllRows(boolean b){
        this.b=b;
    }
     public boolean isCellEditable(){
        return b;
    }
}
