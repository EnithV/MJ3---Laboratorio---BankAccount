public class CuentaInversion extends CuentaBancaria
{
    private double tasaAnual;
    private int plazoMeses;
    private double penalizacionRetiroAnticipado;

    public CuentaInversion(String numeroCuenta, String titular, double saldo,
                           double tasaAnual, int plazoMeses,
                           double penalizacionRetiroAnticipado)
    {
        super(numeroCuenta, titular, saldo);
        this.tasaAnual = tasaAnual;
        this.plazoMeses = plazoMeses;
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
    }

    @Override
    public String describir()
    {
        return super.describir() + " | Plazo: " + plazoMeses +
                "Meses - Tasa Anual: " + tasaAnual + "%";
    }

    @Override
    public double calcularComision()
    {
        return penalizacionRetiroAnticipado;
    }

    @Override
    public void realizarRetiro(double monto)
    {
        setSaldo(getSaldo() - monto - penalizacionRetiroAnticipado);
    }

    //Sobre carga
    public double calcularComision(int mesesTranscurrido)
    {
        return mesesTranscurrido >= plazoMeses
                ? 0.0
                : penalizacionRetiroAnticipado;
    }
}