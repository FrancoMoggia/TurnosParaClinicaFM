/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import DAO.Coneccion;
import DAO.Conectate;
import java.sql.SQLException;
import visual.Bienvenido;

public class Principal {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Conectate con=new Conectate();
        Bienvenido holaMundo = new Bienvenido();
        holaMundo.setVisible(true);
        holaMundo.setAlwaysOnTop(true);


    }
    
}
