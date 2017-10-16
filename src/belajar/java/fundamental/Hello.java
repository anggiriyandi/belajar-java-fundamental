package belajar.java.fundamental;

import aplikasi.pendaftaran.Peserta;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hello {

    public void tampilkanWaktuSekarang() {
        System.out.println("Tanggal Sekarang : ");
    }

    public String tampilkanNama(String nama) {
        return nama;
    }

    public static void main(String[] arr) {
//        System.out.println("Menjalankan method main !!");
//        System.out.println("Sekarang : " + new Date());
//
//        Peserta.jumlah = 1;
//
//        Peserta peserta1 = new Peserta("anggi");
//        System.out.println("jumlah peserta di peserta1: "
//                + peserta1.jumlah);
//
//        peserta1.jumlah = 2;
//
//        Peserta peserta2 = new Peserta("dadang");
//        System.out.println("Jumlah peserta di object peserta 2 : ");
//
//        System.out.println("jumlah peserta di peserta1: "
//                + peserta1.jumlah);
//
//        Peserta peserta3 = new Peserta("wahyu");
//        peserta3.setNama("wahyu2");
//
//        System.out.println("Hallo : "
//                + peserta1.getNama());

//        Pelajar pelajar = new Pelajar();
//        pelajar.setNama("anggi");
//        pelajar.setAlamat("jakarta");
//        
//        System.out.println(pelajar.getNama());
//        System.out.println(pelajar.getAlamat());
        
//        Pekerja pekerja = new Pekerja();

        List<Pekerja> list = new ArrayList<Pekerja>();
        Pekerja p = new Pekerja();
        p.setNama("Anggi");
        p.setAlamat("jakarta");
        list.add(p);
        
        Pekerja p1 = new Pekerja();
        p1.setNama("dadang");
        p1.setAlamat("jakarta");
        p1.getNoTelepon().add("08777878788");
        p1.getNoTelepon().add("087778788989");
        list.add(p1);
        
        Pekerja p2 = new Pekerja();
        p2.setNama("wahyu");
        p2.setAlamat("jakarta");
        list.add(p2);
        
        for (Pekerja pekerja : list) {
            System.out.println("nama pekerja yang ada di list : "+ 
                    pekerja.getNama());
            System.out.println("alamat pekerja yang ada di list : "+ 
                    pekerja.getAlamat());
            if(pekerja.getNoTelepon().size() > 0){
                System.out.println("No telp ke 1 : "+pekerja.getNoTelepon().get(0));
            }
            
            for(String noTelp : pekerja.getNoTelepon()){
                System.out.println("daftar no telp : "+noTelp);
            }
        }
        
        List<String> daftarBuah = new ArrayList<String>();
        daftarBuah.add("pisang");
        daftarBuah.add("mangga");
        daftarBuah.add("jambu");
        daftarBuah.add("jambu");
        
        for (String buah : daftarBuah) {
            System.out.println("daftar urutan buah : "+ buah);
        }
        
        Set<String> setDaftarBuah = new HashSet<String>();
        setDaftarBuah.add("pisang");
        setDaftarBuah.add("mangga");
        setDaftarBuah.add("jambu");
        setDaftarBuah.add("jambu");
        
        for (String buah : setDaftarBuah) {
            System.out.println("daftar set buat : "+buah);
        }
               
        Person person = new Pelajar();
        person.setAlamat("jakarta");
        System.out.println("alamat : "
                +person.getAlamat());
    }
}