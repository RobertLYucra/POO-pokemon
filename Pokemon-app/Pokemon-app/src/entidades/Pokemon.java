
package entidades;


public class Pokemon {
    private String nombre;
    private int vida;
    int nivel;

    public Pokemon(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.nivel = 5;
        this.vida = 40 + this.nivel*5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
    
    public void Atacar(Pokemon oponente){
        
        int atacar = this.vida -40;
    }
    
    
}
