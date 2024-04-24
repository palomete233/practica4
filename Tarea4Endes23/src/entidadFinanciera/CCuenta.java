package entidadFinanciera;

/**
 * 
 * @author palom
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros de la clase.
     *
     * @param nom   Nombre de la persona titular.
     * @param cue   Número de cuenta.
     * @param sal   Saldo inicial de la cuenta.
     * @param tipo  Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * 
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre El nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * 
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * 
     * @param saldo El saldo actual de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * 
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * 
     * @param tipoInterés El tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * 
     * @return El saldo de la cuenta.
     */
    public double estado() {
        return this.getSaldo();
    }

    /**
     * Método para ingresar dinero a la cuenta.
     *
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


    
   