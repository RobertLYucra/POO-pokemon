
package entidades;
import java.applet.AudioClip;
public class sonido {
    AudioClip player;
    public sonido(){
        player = java.applet.Applet.newAudioClip(getClass().getResource("/entidades/PokemonSheetMusic.wav"));
        player.play();
    }
    public void apagar(){
        player.stop();
    }
}
