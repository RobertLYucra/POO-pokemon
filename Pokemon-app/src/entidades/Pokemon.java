
package entidades;


public class Pokemon {
    private String nombre;
    private int vidaInicial;
    private int vidaactual;
    private int dano;
    private int nivel = 5;
    private int pocion = 15;
    private int cantPocion = 3;
    private int critico ;

    public Pokemon(String nombre, int dano, int critico) {
        this.nombre = nombre;
        this.vidaInicial = 40 + nivel*5;
        this.vidaactual = vidaactual;
        this.dano = dano;
        this.critico = critico;
    }
    

    
    
    String atacar(Pokemon c){
        int x = (int)(Math.random()*100);
        int critico = (int)(Math.random()*100);
        if (x>=1 & x<=70){
            c.vidaactual = c.vidaInicial - dano;
        }
        else{
            for (int i = 0; i <3; i++) {
                this.vidaactual = this.vidaactual + pocion;
                cantPocion = cantPocion -1;
            }
            if (cantPocion ==0){
                c.vidaactual = c.vidaactual - dano;
            }
        }
        
        
        return null;
    }
    
    String Atacar(Pokemon c){
         return null;
    } 
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVida() {
        return vidaInicial;
    }
    public void setVida(int vida) {
        this.vidaInicial = vida;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
    
    
    
}
