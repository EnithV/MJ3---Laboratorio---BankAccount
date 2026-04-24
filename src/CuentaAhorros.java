public class CuentaAhorros extends CuentaBancaria{
    // Campos propios
    private double tasaInteresMensual;
    private double saldoMinimo;
    // Constructor
    public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteresMensual, double saldoMinimo) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }
    // Sobreescribir describir() usando super.describir()
    @Override
    public String describir() {
        return super.describir() + " | Tasa mensual: " + tasaInteresMensual + "%";
    }
    // Sobreescribe calcularComision(): retorna 0.0 si el saldo es mayor o igual al mínimo, o 12000.0 si está por debajo.
    @Override
    public double calcularComision() {
        // retorna 0.0 si el saldo es mayor o igual al mínimo
        if (getSaldo() >= saldoMinimo) {
            return 0.0;
        // 12000.0 si está por debajo.
        } else  {
            return 12000.0;
        }
    }
    // Sobrecarga de realizarRetiro
    // Agrega una versión realizarRetiro(double monto, boolean esUrgente)
    public void realizarRetiro(double monto, boolean esUrgente) {
        double nuevoSaldo = getSaldo() - monto;

        if (esUrgente && nuevoSaldo < saldoMinimo) {
            nuevoSaldo = nuevoSaldo - calcularComision();
        }
        setSaldo(nuevoSaldo);
    }

    // Métod propio
    public double calcularInteresDelMes() {
        return getSaldo() * tasaInteresMensual / 100;
    }

}
