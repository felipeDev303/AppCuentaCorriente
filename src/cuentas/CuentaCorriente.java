package cuentas;

public class CuentaCorriente {

    // Atributos de la clase
    private static int cuentaCounter = 1000; // Contador estático para números de cuenta
    private int numeroCuenta;
    private String titular;
    private int saldo;

    // Método constructor con saldo
    public CuentaCorriente(String titular, int saldo) {
        this.numeroCuenta = cuentaCounter++;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método constructor sin saldo
    public CuentaCorriente(String titular) {
        this.numeroCuenta = cuentaCounter++;
        this.titular = titular;
        this.saldo = 0;
    }

    // Getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    // Método toString
    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta=" + numeroCuenta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    // Métodos especiales
    public void abonar(int cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void cargar(int cantidad) {
        if (cantidad > 0) {
            saldo -= cantidad;
            if (saldo < 0) {
                saldo = 0;
            }
        }
    }
}
