package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        try {
            probarIngresar(objetoCuenta, 2000, CCuenta);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            probarRetirar(objetoCuenta, 3000, CCuenta);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
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

