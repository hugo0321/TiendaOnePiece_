/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaonepiece;

import InterfazOnePiece.InicioSesion;
import InterfazOnePiece.Interfaz;

/**
 *
 * @author Hugo
 */
public class TiendaOnePiece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InicioSesion interfaz= InicioSesion.getInstance();
        interfaz.setVisible(true);
    }
    
}
