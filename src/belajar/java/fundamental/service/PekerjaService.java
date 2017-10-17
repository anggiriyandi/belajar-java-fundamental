/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental.service;

import belajar.java.fundamental.Pekerja;
import belajar.java.fundamental.Person;
import belajar.java.fundamental.dao.PekerjaDao;
import belajar.java.fundamental.dao.PersonDao;
import belajar.java.fundamental.dao.impl.PekerjaDaoImpl;
import belajar.java.fundamental.dao.impl.PersonDaoImpl;
import java.util.List;

/**
 *
 * @author anggi
 */
public class PekerjaService {

    private PekerjaDao pekerjaDao = new PekerjaDaoImpl();

    public void LoadPesertaFromFile(Person person) {

//        FileImport fileImport = new FileImport("/tmp/peserta.txt");
//        List<Pekerja> list = fileImport.proses();
        List<Pekerja> list = pekerjaDao.cariSemua();
        for (Pekerja pekerja : list) {
            System.out.println("========= daftar pekerja dari file =============");
            System.out.println("Nama : " + pekerja.getNama());
            System.out.println("Alamat : " + pekerja.getAlamat());
//            pekerjaDao.simpan(pekerja);
        }
    }

    public void readPekerjaFromDatabase() {
        List<Pekerja> list = pekerjaDao.cariSemua();
        for (Pekerja pekerja : list) {
            System.out.println("========= daftar pekerja dari file =============");
            System.out.println("Nama : " + pekerja.getNama());
            System.out.println("Alamat : " + pekerja.getAlamat());
//            pekerjaDao.simpan(pekerja);
        }
    }
}
