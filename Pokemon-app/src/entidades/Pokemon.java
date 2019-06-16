
package entidades;


public class Pokemon {
    protected String nombre;
    protected int vida;
    protected int dano;
    protected int nivel = 5;
    protected int pocion = 15;
    protected int cantPocion = 3;
    protected int probabilidad =20;
    protected int critico = 2;
    protected int evasion = 15;
    
    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.vida = 40 + nivel*5;
        this.dano = (int)(Math.random()*5+5); 
        
        
        
        
    }
    
    
    public String atacar(Pokemon rival){
        
        int Cri = (int)(Math.random()*100);
        int at = (int)(Math.random()*100);
        int evad = (int)(Math.random()*100);
        
        if(at<=75){
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
        else if(at>75){
            
            if(cantPocion<=0){
                this.cantPocion = this.cantPocion -1;
                rival.vida=rival.vida + 15;
                
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
        if(at<=75){
            
            if(Cri<=probabilidad){
                if(evad>evasion){
                    resultado =this.nombre + " ataco con un daño crítico de " + this.dano + " a " + rival.nombre;
                }
                else if(evad<=evasion){
                    resultado = this.nombre + " atacó con un ataque crítico de " + this.dano +
                            " pero " + rival.nombre + " evadió";
                }
            }
            else if(Cri>probabilidad){
                if(evad>evasion){
                    resultado =this.nombre + " atacó con un daño normal de " + this.dano + " a " + rival.nombre;
                }
                else if(evad<=evasion){
                    resultado = this.nombre + " atacó con un ataque normal de " + this.dano +
                            " pero " + rival.nombre + " evadió";
                }
            }
        }
            
        else if(at>75){
            
            resultado = this.nombre + " usó la poción de curación";
        }
        
        
        return resultado;
    }
    public String MostrarEstado() {
        String estado = this.nombre + " / " + this.vida 
                + " HP";
        return estado;
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

    

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }
   
    
    }
    
    
    
    
    

