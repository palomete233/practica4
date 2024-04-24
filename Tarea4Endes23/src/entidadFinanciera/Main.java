package entidadFinanciera;

/**
 * Clase principal que contiene el método main para probar la clase CCuenta.
 */
public class Main {

    /**
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es: " + saldoActual);
    }

    /**
     * Método para probar si se puede ingresar dinero.
     *
     * @param c                 La cuenta en la que se realizará la operación.
     * @param cantidad          La cantidad de dinero a ingresar.
     * @param cantidadEsperada  La cantidad esperada después de realizar la operación.
     * @throws Exception        Si la cantidad es negativa.
     */
    public static void probarIngresar(CCuenta c, int cantidad, CCuenta cantidadEsperada) throws Exception {
        c.ingresar(cantidad);
    }

    /**
     * Método para probar si se puede retirar dinero.
     *
     * @param c                 La cuenta en la que se realizará la operación.
     * @param cantidad          La cantidad de dinero a retirar.
     * @param cantidadEsperada  La cantidad esperada después de realizar la operación.
     * @throws Exception        Si la cantidad es negativa o no hay saldo suficiente.
     */
    public static void probarRetirar(CCuenta c, int cantidad, CCuenta cantidadEsperada) throws Exception {
        c.retirar(cantidad);
    }
}

