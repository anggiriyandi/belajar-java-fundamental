/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental;


/**
 *
 * @author anggi
 */
public class Pelajar extends Person {
    public Pelajar(){
        System.out.println("CONSTRUCTOR DI CLASS : PELAJAR");
    }

    @Override
    public void setAlamat(String alamat) {
        System.out.println("METHOD SET ALAMAT DARI Pelajar");
        super.alamat = alamat;
    }

    @Override
    public String getAlamat() {
        System.out.println("METHOD GET ALAMAT DARI Pelajar");
        return super.alamat;
    }  
    
    
}
