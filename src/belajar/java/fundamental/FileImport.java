/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental;

import aplikasi.pendaftaran.JenisKelamin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anggi
 */
public class FileImport {

    private File file;
    private BufferedReader reader;

    public FileImport(String filePath) {
        this.file = new File(filePath);
    }

    public void bukaFile() throws FileNotFoundException {

        if (!file.exists()) {
            throw new FileNotFoundException("File tidak ditemukan");
        }
        reader = new BufferedReader(new FileReader(file));
    }

    public void tutupFile() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }

    public List<Pekerja> proses() {
        List<Pekerja> datarPekerja = new ArrayList<Pekerja>();
        try {
            bukaFile();
            String data = reader.readLine();
            System.out.println("Data Header " + data);
            data = reader.readLine();

            while (data != null) {
//                System.out.println("Data Peserta : " + data);
                String[] isi = data.split(",");
                
                if(isi.length != 5){
                    throw new IllegalStateException("data tidak sesuai");
                }
                
                Pekerja pekerja = new Pekerja();

                pekerja.setNama(isi[0]);
                pekerja.setAlamat(isi[1]);

                if (isi[2].equals("laki-laki")) {
                    pekerja.setJenisKelamin(JenisKelamin.LAKI_LAKI);
                } else if(isi[2].equals("perempuan")) {
                    pekerja.setJenisKelamin(JenisKelamin.PEREMPUAN);
                }else {
                    throw new IllegalStateException("DATA JENIS KELAMIN TIDAK TERDAFTAR !!");
                }
                pekerja.getNoTelepon().add(isi[3]);
                pekerja.getNoTelepon().add(isi[4]);
                
                datarPekerja.add(pekerja);

                data = reader.readLine();
            }
            tutupFile();
            return datarPekerja;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return datarPekerja;
    }
}
