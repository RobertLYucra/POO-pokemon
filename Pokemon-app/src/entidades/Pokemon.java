
package entidades;


public class Pokemon {
    private String nombre;
    private int vida;
    private int dano;
    private int nivel = 5;
    private int pocion = 15;
    private int cantPocion = 3;
    private int probabilidad =20;
    private int critico = 2;
    private int cantpocion;
    private int evasion = 15;
    
    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.vida = 40 + nivel*5;
        this.dano = (int)(Math.random()*5+5); 
        
        
        
        
    }
    
    public String MostrarEstado() {
        String estado = this.nombre + " / " + this.vida 
                + " HP";
        return estado;
    }
    public String atacar(Pokemon rival){
        
        int Cri = (int)(Math.random()*100);
        int at = (int)(Math.random()*100);
        int evad = (int)(Math.random()*100);
        
        if(at<=70){
            if (Cri<=probabilidad){
                    this.dano = dano*critico;
            }
            if(evad<=evasion){
                rival.vida = rival.vida;
            }
            else{
                rival.vida = rival.vida -dano;
            }
        }
        else{
            if(cantPocion>0){
                this.vida=this.vida + pocion;
                this.cantPocion = cantPocion -1;
            }
            else{
                if (Cri<=probabilidad){
                    this.dano = dano*critico;
                }
                if(evad<=evasion){
                    rival.vida = rival.vida;
                }
                else{
                    rival.vida = rival.vida -dano;
                }
            }
        }
        
        if (rival.vida<0){
            rival.vida = 0;
        }
        String resultado ="";
        
        if(Cri<=probabilidad){
            resultado =rival.nombre + " recibió un daño crítico de " + this.dano;
        }
        else if(Cri>=probabilidad){
            resultado = rival.nombre + " recibió un daño normal de " + this.dano;
        }
        else if(at>70){
            resultado = this.nombre + " Usó la pocion de curacón";
        }
        else if(evad<=evasion){
            resultado = this.nombre + " evadío el ataque de " + this.dano + "de daño";
            
        }
        
        return resultado;
    }
    
    

    public String getNombre(){
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

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPocion() {
        return pocion;
    }

    public void setPocion(int pocion) {
        this.pocion = pocion;
    }

    public int getCantPocion() {
        return cantPocion;
    }

    public void setCantPocion(int cantPocion) {
        this.cantPocion = cantPocion;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }

    

    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    public int getCantpocion() {
        return cantpocion;
    }

    public void setCantpocion(int cantpocion) {
        this.cantpocion = cantpocion;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }
   
    
    }
    
    
    
    
    

