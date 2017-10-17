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

          FileImport fileImport = new FileImport("/tmp/peserta.tx");
          fileImport.proses();
    }
    
}
