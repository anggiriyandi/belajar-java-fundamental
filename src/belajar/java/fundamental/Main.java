/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental;

import java.util.List;

/**
 *
 * @author anggi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String a = "123123";
//        a.concat(" tambah concat");
//        
//        System.out.println(a);
//        
//        StringBuilder builder = new StringBuilder();
//        builder.append("123123123");
//        builder.append(" ditambah method sebelumnya");
//        
//        System.out.println(builder.toString());

        FileImport fileImport = new FileImport("/tmp/peserta.txt");
        List<Pekerja> list = fileImport.proses();
        for (Pekerja pekerja : list) {
            System.out.println("========= daftar pekerja dari file =============");
            System.out.println("Nama : "+pekerja.getNama());
            System.out.println("Alamat : "+pekerja.getAlamat());
        }
    }
    
}
