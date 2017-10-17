/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
    
    public void bukaFile() throws FileNotFoundException{
        
        if(!file.exists()) {
            throw new FileNotFoundException("File tidak ditemukan");
        }
        
        reader = new BufferedReader(new FileReader(file));
    }
    
    public void tutupFile() throws IOException{
        if(reader != null){
            reader.close();
        }
    }
    
    public void proses(){
        try {
            bukaFile();
            String data = reader.readLine();
            System.out.println("Data Header "+data);
            data = reader.readLine();
            
            while (data != null) {                
                System.out.println("Data Peserta : "+data);
                data = reader.readLine();
            }
            tutupFile();
            
//            return null;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
//        return null;
    }
}
