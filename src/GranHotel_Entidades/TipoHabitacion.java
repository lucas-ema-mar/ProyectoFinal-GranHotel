
package GranHotel_Entidades;


public class TipoHabitacion {
    
 private int codigo;
    private int maxPersonas;
    private int cantCamas;
    private TipoCama tipoDeCama;
    private double precio;

    public TipoHabitacion() {
    }

    public TipoHabitacion(int maxPersonas, int cantCamas, TipoCama tipoDeCama, double precio) {
        this.maxPersonas = maxPersonas;
        this.cantCamas = cantCamas;
        this.tipoDeCama = tipoDeCama;
        this.precio = precio;
    }

    public TipoHabitacion(int codigo, int maxPersonas, int cantCamas, TipoCama tipoDeCama, double precio) {
        this.codigo = codigo;
        this.maxPersonas = maxPersonas;
        this.cantCamas = cantCamas;
        this.tipoDeCama = tipoDeCama;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public TipoCama getTipoDeCama() {
        return tipoDeCama;
    }

    public void setTipoDeCama(TipoCama tipoDeCama) {
        this.tipoDeCama = tipoDeCama;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " - " 
                + (maxPersonas==1 ? "Habitacion Simple, " : maxPersonas==2 ? "Habitacion Doble, " : maxPersonas==3 ? "Habitacion Triple, " : "Suite de Lujo, ")
                + "maximo " + maxPersonas + " personas, tiene " + cantCamas + " camas, todas tipo " + tipoDeCama + ". Precio: $ " + precio;
    }
    
    
    
}

