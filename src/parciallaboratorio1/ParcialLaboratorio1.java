/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallaboratorio1;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class ParcialLaboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dato1,dato2,dato3;
                 
        dato1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer valor"));
        dato2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo valor"));
        dato3=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer valor valor"));
        
        if (dato1==dato2 && dato1==dato3 && dato2==dato3) {
            JOptionPane.showMessageDialog(null, "todos los valores ingresados son iguales");
        }else{
            JOptionPane.showMessageDialog(null, "los valores ingresados no son iguales");
        }
        
    }
    
}
