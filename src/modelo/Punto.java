/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tatia
 */
public class Punto {
    // variables instancia
    private int x;
    private int y;
    
    // 1er constructor
    public Punto(){
        x = 0;
        y = 0;
    }
    
    // 2do constructor
    public Punto (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // 3er contructor
    public Punto(Punto p){
       int a = p.getx(x);
       int b = p.gety(y);
       this.x = a;
       this.y = b;
    }
    
    public void Desplazar(int deltax, int deltay){
        deltax = this.x + x;
        deltay = this.y + y;
    }
    
    public void Mover(int x, int y){
        x = this.x;
        y = this.y;
    }
    
    public int getx(int x){
        return x;
    }
    
    public int gety(int y){
        return y;
    }
    
    @Override
    public String toString(){
        return String.format("p(%,%" ,
           getx(x), gety(y), ")");
    }
}
