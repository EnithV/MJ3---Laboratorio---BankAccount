public class CuentaBancaria
{
    //Variables
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo)
    {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Getters
    public String getNumeroCuenta()
    {
        return numeroCuenta;
    }

    public String getTitular()
    {
        return titular;
    }

    public double getSaldo()
    {
        return saldo;
    }

    //Setters
    protected void setNumeroCuenta(String numeroCuenta)
    {
        this.numeroCuenta = numeroCuenta;
    }

    protected void setTitular(String titular)
    {
        this.titular = titular;
    }

    protected void setSaldo(double nuevoSaldo)
    {
        this.saldo = nuevoSaldo;
    }

    //Metodos
    public String describir()
    {
        return "Cuenta " + numeroCuenta +
                " - Titular: " + titular +
                " - Saldo: $" + saldo;
    }

    public double calcularComision()
    {
        return 0.0;
    }

    public void realizarRetiro(double monto)
    {
        setSaldo(getSaldo() - monto);
    }
}