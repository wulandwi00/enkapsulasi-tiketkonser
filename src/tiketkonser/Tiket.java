/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiketKonser;

import TiketKonser.Konser;

/**
 *
 * @author win10
 */
public class Tiket {
    public static void main(String[] args){
        //Membuat Instence/Objek dari Class restoran
        Konser data = new Konser();
        
        //Memasukan Data pada Variable
        data.settempatduduk("VVIP");
        data.setharga(2000000.0);
        data.setSpesial(true);
        
        //Memanggil Method Get dari Class restoran dan Menampilkannya
        System.out.println("tempat duduk: "+data.gettempatduduk());
        System.out.println("Harga tiket: Rp."+data.getHarga());
        System.out.println("souvenir konser: "+data.getSpesial());
    }
}
