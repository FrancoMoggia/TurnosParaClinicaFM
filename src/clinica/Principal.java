package clinica;

import DAO.Coneccion;
import java.sql.SQLException;
import visual.Bienvenido;


public class Principal {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Bienvenido holaMundo = new Bienvenido();
        holaMundo.setVisible(true);
        holaMundo.setAlwaysOnTop(true);
    }
    
}
