
package GranHotel_AccesoADatos;

import GranHotel_Entidades.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HuespedData {
     private Connection con = null;

    public HuespedData() {
        this.con = Conexion.getConexion();
    }
    
    public void guardarHuesped(Huesped huesped){
        
        if (buscarHuespedPorDni(huesped.getDni()) == null) {
            
            String sql = "INSERT INTO huesped (dni, apellido, nombre, domicilio, correo, celular, activo) "
                    + "VALUES (?,?,?,?,?,?,?)";

            try {

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, huesped.getDni());
                ps.setString(2, huesped.getApellido());
                ps.setString(3, huesped.getNombre());
                ps.setString(4, huesped.getDomicilio());
                ps.setString(5, huesped.getCorreo());
                ps.setInt(6, huesped.getCelular());
                ps.setBoolean(7, huesped.isActivo());
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "HUESPED GUARDADO EXITOSAMENTE");
                }
                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER EN LA TABLA HUESPED. " + ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "YA EXISTE EL HUESPED");
        }
    }
    
    public void modificarHuesped(Huesped huesped){
        
        String sql = "UPDATE huesped SET apellido=?, nombre=?, domicilio=?, correo=?, celular=?, activo=?"
                + "WHERE dni=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huesped.getApellido());
            ps.setString(2, huesped.getNombre());
            ps.setString(3, huesped.getDomicilio());
            ps.setString(4, huesped.getCorreo());
            ps.setInt(5, huesped.getCelular());
            ps.setInt(6, huesped.getDni());
            ps.setBoolean(7, huesped.isActivo());
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "HUESPED MODIFICADO EXITOSAMENTE");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER EN LA TABLA HUESPED. " + ex.getMessage());
        }
    }
    
    public Huesped buscarHuespedPorDni(int dni){
        
        String sql = "SELECT apellido, nombre, domicilio, correo, celular, activo "
                + "FROM huesped WHERE dni=?";
        Huesped huesped = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                huesped = new Huesped();
                huesped.setDni(dni);
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setActivo(rs.getBoolean("activo"));
            }else{
                JOptionPane.showMessageDialog(null, "NO EXISTE EL HUESPED");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER EN LA TABLA HUESPED. " + ex.getMessage());
        }
        return huesped;
    }
    
    public List<Huesped> listarHistorialDeHuespedes(){
        
        String sql = "SELECT dni, apellido, nombre, domicilio, correo, celular, activo "
                + "FROM huesped";
        ArrayList<Huesped> huespedes = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Huesped huesped = new Huesped();
                huesped.setDni(rs.getInt("dni"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setActivo(rs.getBoolean("activo"));
                
                huespedes.add(huesped);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER EN LA TABLA HUESPED. " + ex.getMessage());
        }
        return huespedes;
    }
    
    public List<Huesped> listarHuespedesActivos(){
        
        String sql = "SELECT dni, apellido, nombre, domicilio, correo, celular "
                + "FROM huesped WHERE activo = 1";
        ArrayList<Huesped> huespedes = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Huesped huesped = new Huesped();
                huesped.setDni(rs.getInt("dni"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setActivo(true);
                
                huespedes.add(huesped);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER EN LA TABLA HUESPED. " + ex.getMessage());
        }
        return huespedes;
    }
    
    
}


