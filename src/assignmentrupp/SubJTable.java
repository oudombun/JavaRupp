/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentrupp;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ASUS
 */
public class SubJTable extends JTable{
    public Component prepareRenderer(TableCellRenderer ren,int r , int c){
        Component compo = super.prepareRenderer(ren, r, c);
        if(r%2==0 && !isCellSelected(r, c)){
            compo.setBackground(new Color(255,182,113));
        }else if(!isCellSelected(r, c)){
            compo.setBackground(new Color(255,153,62));
        }else{
            compo.setBackground(new Color(57,105,138));
        }
        return compo;
        
    }
}
