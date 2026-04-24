public class CuentaCorriente extends CuentaBancaria{
    private double comisionPorTransaccion;
    private double limiteSOBREGIRO;

    public CuentaCorriente(String numeroCuenta, String titular, double saldo, double comisionPorTransaccion, double limiteSOBREGIRO) {
        super(numeroCuenta, titular, saldo);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSOBREGIRO = limiteSOBREGIRO;
    }

    public double getComisionPorTransaccion() {
        return comisionPorTransaccion;
    }
    public void setComisionPorTransaccion(double comisionPorTransaccion) {
        this.comisionPorTransaccion = comisionPorTransaccion;
    }

    public double getLimiteSOBREGIRO() {
        return limiteSOBREGIRO;
    }
    public void setLimiteSOBREGIRO(double limiteSOBREGIRO) {
        this.limiteSOBREGIRO = limiteSOBREGIRO;
    }

    @Override
    public String describir() {
        return super.describir() + " - La comisión por transacción es de: " + comisionPorTransaccion;
    }

    @Override
    public double calcularComision() {
        return comisionPorTransaccion;
    }

    @Override
    public void realizarRetiro(double monto) {
        double resultado = getSaldo() - monto - comisionPorTransaccion;
        if (resultado < -limiteSOBREGIRO) {
            System.out.println("Supera el límite de sobregiro");
        } else {
            setSaldo(resultado);
        }
    }
}