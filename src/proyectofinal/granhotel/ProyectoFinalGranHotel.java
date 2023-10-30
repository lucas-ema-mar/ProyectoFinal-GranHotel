/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.granhotel;

import GranHotel_AccesoADatos.Conexion;
import GranHotel_AccesoADatos.HabitacionData;
import GranHotel_AccesoADatos.HuespedData;
import GranHotel_AccesoADatos.ReservaData;
import GranHotel_AccesoADatos.TipoHabitacionData;
import GranHotel_Entidades.Habitacion;
import GranHotel_Entidades.Huesped;
import GranHotel_Entidades.TipoCama;
import GranHotel_Entidades.TipoHabitacion;
import GranHotel_Entidades.Reserva;
import java.sql.Connection;
import java.util.List;

import java.sql.Connection;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;

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
//        hd.guardarHuesped(new Huesped(34771759, "Rao", "Martin", "Av. Siempre viva 123", "martin.rao@hotmail.com", 123456789, true));
//        hd.guardarHuesped(new Huesped(38794649, "Schiaverano", "Michelle", "Libertad 123", "michelle@hotmail.com", 123456789, true));
//        hd.guardarHuesped(new Huesped(20622354, "Merlo", "Ruben", "Zapiola 123", "ruben@hotmail.com", 123456789, true));
//        hd.guardarHuesped(new Huesped(12345678, "Miranda", "Enzo", "Av. Siempre viva 123", "enzo.miranda@hotmail.com", 123456789, true));
//        hd.modificarHuesped(new Huesped(34771759, "Rao", "Martin", "Cochabamba 123", "martin@hotmail.com", 123456789, true));
//        hd.modificarHuesped(new Huesped(12345678, "Miranda", "Enzo", "Av. Curupaiti 123", "enzo.miranda@hotmail.com", 123456789, true));
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
//        System.out.println(thd.buscarTipoHabitacionPorCodigo(2));
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
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacionPorCodigo(1)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacionPorCodigo(1)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacionPorCodigo(2)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacionPorCodigo(3)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacionPorCodigo(4)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacionPorCodigo(5)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacionPorCodigo(6)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacionPorCodigo(7)));
//        habData.guardarHabitacion(new Habitacion(false, thd.buscarTipoHabitacionPorCodigo(8)));
//        habData.modificarHabitacion(new Habitacion(1, true, thd.buscarTipoHabitacionPorCodigo(1)));
//        habData.modificarHabitacion(new Habitacion(3, true, thd.buscarTipoHabitacionPorCodigo(2)));
//        habData.modificarHabitacion(new Habitacion(5, true, thd.buscarTipoHabitacionPorCodigo(4)));
//        habData.modificarHabitacion(new Habitacion(7, true, thd.buscarTipoHabitacionPorCodigo(6)));
//        habData.modificarHabitacion(new Habitacion(9, true, thd.buscarTipoHabitacionPorCodigo(8)));
//        List<Habitacion> habitaciones = habData.listarHabitaciones();
//        for(Habitacion hab : habitaciones){
//            System.out.println(hab);
//        }
//        List<Habitacion> habitaciones = habData.listarDisponibles();
//        for(Habitacion hab : habitaciones){
//            System.out.println(hab);
//        }
//        System.out.println("Hay " + habData.cantidadHabiSegunTipo(2) + " habitaciones para 2 personas.");
//        System.out.println("Disponibles las siguientes: ");
//        List<Habitacion> habitaciones = habData.listarPorCantidadPersonas(2);
//        for(Habitacion hab : habitaciones){
//            System.out.println(hab);
//        }
//        System.out.println(habData.buscarHabitacion(1));
        
        ReservaData resData = new ReservaData();
//        resData.crearReserva(new Reserva(hd.buscarHuespedPorDni(34771759), habData.buscarHabitacion(2), 
//            LocalDate.now().plusDays(15), LocalDate.now().plusDays(19), 1, true));
//        resData.crearReserva(new Reserva(hd.buscarHuespedPorDni(20622354), habData.buscarHabitacion(6), 
//            LocalDate.now().plusDays(15), LocalDate.now().plusDays(17), 4, true));
//        resData.crearReserva(new Reserva(hd.buscarHuespedPorDni(38794649), habData.buscarHabitacion(4), 
//            LocalDate.now().plusDays(17), LocalDate.now().plusDays(20), 3, true));
//        resData.crearReserva(new Reserva(hd.buscarHuespedPorDni(34771759), habData.buscarHabitacion(1), 
//            LocalDate.now().plusDays(20), LocalDate.now().plusDays(21), 1, true));
//        resData.crearReserva(new Reserva(hd.buscarHuespedPorDni(34771759), habData.buscarHabitacion(10), 
//            LocalDate.now().plusDays(20), LocalDate.now().plusDays(21), 1, true));
//        resData.modificarReserva(new Reserva(1, hd.buscarHuespedPorDni(34771759), habData.buscarHabitacion(2), 
//            LocalDate.now(), LocalDate.now().plusDays(4), 1, true));
//        resData.modificarReserva(new Reserva(2, hd.buscarHuespedPorDni(20622354), habData.buscarHabitacion(6), 
//            LocalDate.now(), LocalDate.now().plusDays(2), 4, true));
//        resData.modificarReserva(new Reserva(3, hd.buscarHuespedPorDni(38794649), habData.buscarHabitacion(4), 
//            LocalDate.now(), LocalDate.now().plusDays(3), 3, true));
//        resData.modificarReserva(new Reserva(4, hd.buscarHuespedPorDni(34771759), habData.buscarHabitacion(1), 
//            LocalDate.now(), LocalDate.now().plusDays(1), 1, true));

//        System.out.println(resData.buscarPorId(2));
//        List<Reserva> reservas = resData.buscarPorDni(34771759);
//        for(Reserva res : reservas){
//            System.out.println(res);
//            System.out.println("---------------");
////        }
        List<Reserva> reservas = resData.reservasActivas();
        for(Reserva res : reservas){
            System.out.println(res);
            System.out.println("---------------");
        }
        System.out.println(reservas.remove(resData.buscarPorId(1)));
        System.out.println("---------");
        for(Reserva res : reservas){
            System.out.println(res);
            System.out.println("---------------");
        }

//        System.out.println(LocalDate.now().plusDays(1).compareTo(LocalDate.now()));
//        System.out.println(LocalDate.now().compareTo(LocalDate.now()));
//        System.out.println(LocalDate.now().compareTo(LocalDate.now().plusDays(1)));


        
    }
    

}
