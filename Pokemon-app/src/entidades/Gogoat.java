/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author user
 */
public class Gogoat extends Pokemon{
    
    public Gogoat(String nombre) {
        super(nombre);
    }
    public String atacar(Charizard rival){
        
        int Cri = (int)(Math.random()*100);
        int at = (int)(Math.random()*100);
        int evad = (int)(Math.random()*100);
        
        if (Cri<=probabilidad){
                    this.dano = dano*critico;
        }
        if(evad<=evasion){
            rival.vida = rival.vida;
        }
        else{
                rival.vida = rival.vida -dano;
        }
        
      
        
        if (rival.vida<0){
            rival.vida = 0;
        }
        String resultado ="";
            
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
        
            
        
        
        return resultado;
    }
}
