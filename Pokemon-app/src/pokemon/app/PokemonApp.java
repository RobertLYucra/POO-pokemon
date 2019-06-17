
package pokemon.app;

import Interfaces.jFPresentacion;
import entidades.sonido;

public class PokemonApp {

    public static void main(String[] args) throws Exception {
      
        jFPresentacion pres = new jFPresentacion();
        pres.setVisible(true);
        sonido sound = new sonido();
        cargarMusica();
    }
    public static void cargarMusica(){
        try{
            Thread.sleep(15000);
        }
        catch(InterruptedException e ){}
    }
    
}
