
package br.com.tjdiego.bhaskara;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Teste {
    
    public static void main (String args []){
    
    
        int a,b,c, delta;
        double x1,x2;
        
        a = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com o valor de a"));
        b = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com o valor de b"));
        b = b*(-1);
        c = Integer.parseInt(JOptionPane.showInputDialog
        ("Entre com o valor de c"));
        
        delta = (b*b)-4*(a*c);
        
        JOptionPane.showMessageDialog(null, delta);
        
        x1 = -b + Math.sqrt(delta)/2*a;
        x2 = -b - Math.sqrt(delta)/2*a;
        
        JOptionPane.showMessageDialog(null, x1+" e "+x2);
    }
}
