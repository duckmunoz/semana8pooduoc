/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ui;

import com.mycompany.s8swing.PantallaPrincipal;

import javax.swing.SwingUtilities;

/**
 *
 * @author morim
 */
public class S8swing {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            
            PantallaPrincipal ventana = new PantallaPrincipal();
            
            ventana.setVisible(true);
        
        });
    }
}
