/**
 * @author Extremetech
 */
public class Cuenta {
    
    //Variables
    private String numeroCuenta;
    private String duenioCuenta;
    private String fechaApertura;
    private double balance;
    
    //Metodo constructor
    public Cuenta(String numeroCuenta, String duenioCuenta, String fechaApertura, double balance) {
        this.numeroCuenta = numeroCuenta;
        this.duenioCuenta = duenioCuenta;
        this.fechaApertura = fechaApertura;
        this.balance = balance;
    }
    
    //Metodos Get y Set
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDuenioCuenta() {
        return duenioCuenta;
    }

    public void setDuenioCuenta(String duenioCuenta) {
        this.duenioCuenta = duenioCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    //Metodo para extraer
    public void extraer(double monto) {
        this.balance = this.balance - monto;
    }
    
    //Metodo para depositar
    public void depositar(double monto) {
        this.balance = this.balance + monto;
    }
    
    //Metodo para transferir
    public void transferir(Cuenta a, double monto) {
        this.extraer(monto);
        a.depositar(monto);
    }
    
    //Override metodo toString, para desplegar numeroCuenta
    @Override
    public String toString() {
        return this.numeroCuenta;
    }
}
