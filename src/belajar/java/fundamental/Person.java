/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anggi
 */
public class Person {
    protected String nama;
    protected String alamat;
    public List<String> noTelepon = new ArrayList<>();

    public Person() {
//        System.out.println("CONSTRUCTOR DI CLASS : PERSON");
    }

    public String getNama() {
//        System.out.println("METHOD GET NAMA DARI PERSON");
        return nama;
    }

    public void setNama(String nama) {
//        System.out.println("METHOD SET NAMA DARI PERSON");
        this.nama = nama;
    }

    public String getAlamat() {
//        System.out.println("METHOD GET ALAMAT DARI PERSON");
        return alamat;
    }
    
    public void setAlamat(String alamat) {
//         System.out.println("METHOD SET ALAMAT DARI PERSON");
        this.alamat = alamat;
    }

    public List<String> getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(List<String> noTelepon) {
        this.noTelepon = noTelepon;
    }
}
