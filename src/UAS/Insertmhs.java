/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import javax.swing.JOptionPane;

/**
 *
 * @author iqbal
 */
public class Insertmhs {
    Koneksi konek = new Koneksi();

    public void insertmhs(String nama, String alamat, String jk, String kodebuku, String judulbuku) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "insert into mhs values('" + nama + "','" + alamat + "','" + jk + "','" + kodebuku + "','" + judulbuku + "')";
            
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

