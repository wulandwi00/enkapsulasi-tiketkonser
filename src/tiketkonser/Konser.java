/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiketKonser;
/**
 *
 * @author win10
 */
public class Konser {
     //Variable (Private)
    private String tempatduduk;
    private double harga;
    private boolean spesial;
    
    //Method Setter (Public) dengan Parameter
    public void settempatduduk(String tempatduduk){
        this.tempatduduk = tempatduduk;
    }
    public void setharga(double harga){
        this.harga = harga;
    }
    public void setSpesial(boolean spesial){
        this.spesial = spesial;
    }
    
    //Method Getter (Public)
    public String gettempatduduk(){
        return tempatduduk;
    }
    public double getHarga(){
        return harga;
    }
    public boolean getSpesial(){
        return spesial;
    }
}
