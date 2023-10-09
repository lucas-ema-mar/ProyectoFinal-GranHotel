/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.granhotel;

import GranHotel_AccesoADatos.Conexion;
import GranHotel_AccesoADatos.HabitacionData;
import GranHotel_AccesoADatos.HuespedData;
import GranHotel_AccesoADatos.TipoHabitacionData;
import java.sql.Connection;

/**
 *
 * @author Usuario
 */
public class ProyectoFinalGranHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
//      Connection con = Conexion.getConexion();

        
        HuespedData hd = new HuespedData();
//        hd.guardarHuesped(new Huesped(34771759, "Rao", "Martin", "Av. Siempre viva 123", "martin.rao@hotmail.com", 123456789));
//        hd.guardarHuesped(new Huesped(38794649, "Schiaverano", "Michelle", "Libertad 123", "Michelle@hotmail.com", 123456789));
//        hd.guardarHuesped(new Huesped(20622354, "Merlo", "Ruben", "Zapiola 123", "Ruben@hotmail.com", 123456789));
//        hd.modificarHuesped(new Huesped(34771759, "Rao", "Martin", "Cochabamba 123", "martin@hotmail.com", 123456789));
//        System.out.println(hd.buscarHuespedPorDni(38794649));
//        List<Huesped> huespedes = hd.listarHistorialDeHuespedes();
//        for(Huesped huesped : huespedes){
//            System.out.println(huesped);
//        }
        
        TipoHabitacionData thd = new TipoHabitacionData();
//        thd.guardarTipoHabitacion(new TipoHabitacion(1, 1, TipoCama.SIMPLE, 9500.00));
//        thd.guardarTipoHabitacion(new TipoHabitacion(2, 2, TipoCama.SIMPLE, 16500.00));
//        thd.guardarTipoHabitacion(new TipoHabitacion(2, 1, TipoCama.QUEEN, 15000.00));
//        thd.guardarTipoHabitacion(new TipoHabitacion(2, 1, TipoCama.KING_SIZE, 16000.00));
//        thd.guardarTipoHabitacion(new TipoHabitacion(3, 3, TipoCama.SIMPLE, 27500.00));
//        thd.guardarTipoHabitacion(new TipoHabitacion(3, 2, TipoCama.QUEEN, 25000.00));
//        thd.guardarTipoHabitacion(new TipoHabitacion(4, 4, TipoCama.SIMPLE, 36000.00));
//        thd.guardarTipoHabitacion(new TipoHabitacion(4, 2, TipoCama.KING_SIZE, 30000.00));
//        System.out.println(thd.buscarTipoHabitacion(2));
//        thd.cambiarPrecio(2, 17500.00);
//        thd.cambiarPrecio(new TipoHabitacion(4, 2, 1, TipoCama.KING_SIZE, 16500.00));
//        List<TipoHabitacion> tipos = thd.listarTiposDeHabitaciones();
//        for(TipoHabitacion th : tipos){
//            System.out.println(th);
//        }
//        List<TipoHabitacion> tipos = thd.listarTipoHabitacion(2);
//        for(TipoHabitacion th : tipos){
//            System.out.println(th);
//        }
        
        HabitacionData habData = new HabitacionData();
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacion(1)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacion(1)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacion(2)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacion(3)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacion(4)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacion(5)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacion(6)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacion(7)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacion(8)));
        
        System.out.println("Probando el push y pull");
        
        
        
        
        
        
    }
    

}
