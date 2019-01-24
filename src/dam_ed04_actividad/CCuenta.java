/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**JAVADOC de la tarea
    *clase pública CCuenta
    * @author ED y modificado por Mario Rubio Avila
    * @version  23/01/2019
    */
public class CCuenta {

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**JAVADOC de la tarea
     * constructor por defecto de CCuenta sin parámetros
     */
    public CCuenta()
    {
    }
    
    /**JAVADOC de la tarea
     * constructor con parámetros de CCuenta
     * crea el objeto y asigna el valor a las variables miembro nombre, cuenta 
     * y saldo e con tipo pues no hace nada ¿?
     * @param nom nombre del cliente
     * @param cue número de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés ¿?
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**JAVADOC de la tarea
     * método que invoca al setter de la variable nombre
     * @param nom nombre del cliente
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**JAVADOC de la tarea
     * Método que invoca el getter de la variable nombre
     * @return getNombre() getter de la variable nombre
     */
    public String obtenerNombre()
    {
        return getNombre();
    }
    
    /**JAVADOC de la tarea
     * método que invoca el getter de la variable saldo dando el estado de la cuenta
     * @return getSaldo() getter de la variable saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**JAVADOC de la tarea
     * método para modificar la variable saldo, sumándole la cantidad anterior 
     * y la nueva.
     * @param cantidad cantidad a ingresar
     * @throws Exception se generará si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**JAVADOC de la tarea
     * método para modificar la variable saldo, restando la cantidad nueva 
     * a la anterior.
     * @param cantidad cantidad a retirar
     * @throws Exception se generarán si el valor de cantidad es negativa
     * o si el valor de cantidad es mayor que el el saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**JAVADOC de la tarea
     * método que invoca el getter de la variable cuenta para devolver el
     * resultado de lo que llama es decir la variable cuenta
     * @return getCuenta() getter de la variable cuenta
    */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**JAVADOC de la tarea
     * método getter de la variable nombre
     * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**JAVADOC de la tarea
     * Método setter de la variable nombre
     * @param nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**JAVADOC de la tarea
     * método getter de la variable tipoInterés
     * @return tipoInterés
    */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**JAVADOC de la tarea
     * Método setter de la variable tipoInterés
     * @param tipoInterés
    */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
