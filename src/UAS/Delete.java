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
public class Delete {
    Koneksi konek = new Koneksi();

    
    
    public void delete( String kode_buku) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
           
            String sql = "delete from buku where CodeBuku = '" + kode_buku + "'";

         
            statement.executeUpdate(sql);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
