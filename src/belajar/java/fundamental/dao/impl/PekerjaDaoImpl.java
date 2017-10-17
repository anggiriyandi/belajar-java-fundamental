/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental.dao.impl;

import aplikasi.pendaftaran.JenisKelamin;
import belajar.java.fundamental.Datasource;
import belajar.java.fundamental.Pekerja;
import belajar.java.fundamental.dao.PekerjaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anggi
 */
public class PekerjaDaoImpl implements PekerjaDao {
    
    String queryInsertPeserta = "insert into "
            + "pekerja (nama,alamat,jenisKelamin,noTelepon) "
            + "values (?,?,?,?)" ;
    
    String queryCariSemua = "select * from pekerja";

    @Override
    public void simpan(Pekerja pekerja) {
        Connection conn = Datasource.getConnection();
        
        try {
            PreparedStatement ps = conn.prepareStatement(queryInsertPeserta);
            ps.setString(1, pekerja.getNama());
            ps.setString(2, pekerja.getAlamat());
            ps.setString(3, pekerja.getJenisKelamin().toString());
            
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i < pekerja.getNoTelepon().size(); i++){
                sb.append(pekerja.getNoTelepon().get(i));
                if(i < pekerja.getNoTelepon().size() - 1){
                    sb.append(",");
                }
            }
            
            ps.setString(4, sb.toString());
            ps.executeUpdate();
            
            conn.close();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(PekerjaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Pekerja> cariSemua() {
        try {
            List<Pekerja> list = new ArrayList<>();
            Connection conn = Datasource.getConnection();
            PreparedStatement ps = conn.prepareStatement(queryCariSemua);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Pekerja pekerja = new Pekerja();
                pekerja.setNama(rs.getString("nama"));
                pekerja.setAlamat(rs.getString("alamat"));
                
                if(rs.getString("jenisKelamin").equalsIgnoreCase("laki-laki")){
                    pekerja.setJenisKelamin(JenisKelamin.LAKI_LAKI);
                }else{
                    pekerja.setJenisKelamin(JenisKelamin.PEREMPUAN);
                }
                
                String[] noTelpArr = rs.getString("noTelepon").split(",");
                
                for(int i = 0; i < noTelpArr.length; i++){
                    pekerja.getNoTelepon().add(noTelpArr[i]);
                }
                
                list.add(pekerja);
            }
            
            conn.close();
            ps.close();
            
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }    
}
