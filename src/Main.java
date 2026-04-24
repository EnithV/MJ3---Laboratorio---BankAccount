public class Main
{
    public static void main(String[] args)
    {
        //Instanciones
        CuentaBancaria cuentaBancaria1 = new CuentaAhorros("123",
                "Oscar", 1000, 2.0, 5.000);

        CuentaBancaria cuentaBancaria2 = new CuentaCorriente("456",
                "Enith", 2000, 500, 10000);

        CuentaBancaria cuentaBancaria3 = new CuentaInversion("789",
                "Lucas", 3000, 2.5, 12, 20000);

        //Describir
        System.out.println(cuentaBancaria1.describir());
        System.out.println(cuentaBancaria2.describir());
        System.out.println(cuentaBancaria3.describir());

        //Comision
        System.out.println("Comisión ahorros: " + cuentaBancaria1.calcularComision());
        System.out.println("Comisión Corriente: " + cuentaBancaria2.calcularComision());
        System.out.println("Comision Inversion: " + cuentaBancaria3.calcularComision());

        //Retiros
        cuentaBancaria1.realizarRetiro(2000);
        cuentaBancaria2.realizarRetiro(3000);
        cuentaBancaria3.realizarRetiro(4000);

        System.out.println("Saldo Ahorros: " + cuentaBancaria1.getSaldo());
        System.out.println("Saldo Corriente: " + cuentaBancaria2.getSaldo());
        System.out.println("Saldo Inversion: " + cuentaBancaria3.getSaldo());
    }
}

/* Por que usar CuentaBancaria como tipo de variable? Porque permite polimorfismo, una variable del tipo padre puede almacenar cualquier objeto hijo.
La ventaja es que Main no necesita saber que tipo de cuenta especifica tiene cada variable para que tod funcione correctamente. */