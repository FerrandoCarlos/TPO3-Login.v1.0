
package controller;

import javax.swing.JOptionPane;
import view.loginView;

/**
 * @author Ferrando Carlos
 */
public class main {
    public static loginView lv;
   
    public static void main(String[] args) {
        lv=new loginView();
        lv.setLocationRelativeTo(null);
        lv.setVisible(true);
        
    }
    
        // 0 o 1 tipo de informacion o warning
       public static void viewDialogo(String msj, String titulo, int tipo) {
        JOptionPane.showMessageDialog(lv, msj, titulo, tipo);
    }

    public static void viewDialogo(String msj, int tipo) {
        JOptionPane.showMessageDialog(lv, msj, "", tipo);
    }

}
