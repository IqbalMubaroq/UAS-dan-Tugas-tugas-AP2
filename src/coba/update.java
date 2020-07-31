/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;


import javax.swing.JOptionPane;

/**
 *
 * @author iqbal
 */
public class update {

    Koneksi konek = new Koneksi();

    public void update(String kode, String kategori, String judul, String penerbit, String pengarang) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_kate = "update buku set Kategori = '" + kategori + "'where CodeBuku = '" + kode + "'";
            String sql_judul = "update buku  set JudulBuku = '" + judul + "'where CodeBuku = '" + kode + "'";
            String sql_penerbit = "update buku set Penerbit = '" + penerbit + "'where CodeBuku = '" + kode + "'";
            String sql_pengarang = "update buku set Pengarang = '" + pengarang + "'where CodeBuku = '" + kode + "'";
            
            statement.executeUpdate(sql_kate);
            statement.executeUpdate(sql_judul);
            statement.executeUpdate(sql_penerbit);
            statement.executeUpdate(sql_pengarang);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
