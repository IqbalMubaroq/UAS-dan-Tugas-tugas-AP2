/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author iqbal
 */
public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(String Kode, String Kate, String Judul_buku, String Penerbit, String Pengarang) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "insert into buku values('" + Kode + "','" + Kate + "','" + Judul_buku + "','" + Penerbit + "','" + Pengarang + "')";
            
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
