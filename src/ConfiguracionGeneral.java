
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bryan
 */
public class ConfiguracionGeneral {
    
    private LoadData  datos;
    private static ConfiguracionGeneral configuracionGeneralInstancia = null;
    private int tiempoConsumoCombustible;
    private int tiempoAterrizaje;
    private int tiempoDesbordaje;
    private int tiempoMantenimiento;
    private int tiempoDespegue;
    
    ConfiguracionGeneral(){
        datos = new LoadData();
        tiempoConsumoCombustible=1;
        tiempoAterrizaje=1;
        tiempoDesbordaje=1;
        tiempoMantenimiento=1;
        tiempoDespegue=1;
    }
    
    public static ConfiguracionGeneral getConfiguracionGeneral(){
        
        if( getConfiguracionGeneralInstancia() == null ){
            configuracionGeneralInstancia  = new ConfiguracionGeneral();
        }
        return getConfiguracionGeneralInstancia();
    } 

    /**
     * @return the datos
     */
    public LoadData getDatos() {
        return datos;
    }

    /**
     * @return the configuracionGeneralInstancia
     */
    public static ConfiguracionGeneral getConfiguracionGeneralInstancia() {
        return configuracionGeneralInstancia;
    }

    /**
     * @return the tiempoConsumoCombustible
     */
    public int getTiempoConsumoCombustible() {
        return tiempoConsumoCombustible;
    }

    /**
     * @param tiempoConsumoCombustible the tiempoConsumoCombustible to set
     */
    public void setTiempoConsumoCombustible(int tiempoConsumoCombustible) {
        this.tiempoConsumoCombustible = tiempoConsumoCombustible;
        System.out.println("gasto Combustible"+tiempoConsumoCombustible);
    }

    /**
     * @return the tiempoAterrizaje
     */
    public int getTiempoAterrizaje() {
        return tiempoAterrizaje;
    }

    /**
     * @param tiempoAterrizaje the tiempoAterrizaje to set
     */
    public void setTiempoAterrizaje(int tiempoAterrizaje) {
        this.tiempoAterrizaje = tiempoAterrizaje;
        System.out.println("aterrizaje"+tiempoAterrizaje);
    }

    /**
     * @return the tiempoDesbordaje
     */
    public int getTiempoDesbordaje() {
        return tiempoDesbordaje;
    }

    /**
     * @param tiempoDesbordaje the tiempoDesbordaje to set
     */
    public void setTiempoDesbordaje(int tiempoDesbordaje) {
        this.tiempoDesbordaje = tiempoDesbordaje;
        System.out.println("Desbordaje "+tiempoDesbordaje);
    }

    /**
     * @return the tiempoMantenimiento
     */
    public int getTiempoMantenimiento() {
        return tiempoMantenimiento;
    }

    /**
     * @param tiempoMantenimiento the tiempoMantenimiento to set
     */
    public void setTiempoMantenimiento(int tiempoMantenimiento) {
        this.tiempoMantenimiento = tiempoMantenimiento;
        System.out.println("mantenimiento " + tiempoMantenimiento);
    }

    /**
     * @return the tiempoDespegue
     */
    public int getTiempoDespegue() {
        return tiempoDespegue;
    }

    /**
     * @param tiempoDespegue the tiempoDespegue to set
     */
    public void setTiempoDespegue(int tiempoDespegue) {
        this.tiempoDespegue = tiempoDespegue;
         System.out.println("despegue " + tiempoDespegue);
    }
}
