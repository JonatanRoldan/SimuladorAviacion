package com.Clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bryan
 */
public class AvionesClass implements Runnable{
    private int id;
    private String tipo;
    private int combustible;
    private String state;
    private AvionesClass self = null;
    /* 
        processState 1 -> Volando
        processState 2 -> Aterrizaje Normal
        processState 3 -> Aterrizaje Emergencia
        processState 4 -> Aterrizaje
        processState 5 -> Desbordaje
        processState 6 -> Mantenimiento
        processState 7 -> Despegue
        processState 8 -> Estrellado
    */
    
    private int processState = 1;
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the combustible
     */
    public int getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void run() {
        try {
            
            int x = 1;
            
            switch (x) {
                case 1:
                    System.out.println("Volando");
                    
                    
                    
                    Thread.sleep(200);
                    
                    
                    
                    break;
                case 2:
                    System.out.println("Aterrizaje Normal");
                    break;
                case 3:
                    System.out.println("Aterrizaje Emergencia");
                    break;
                case 4:
                    System.out.println("Aterrizaje");
                    break;
                case 5:
                    System.out.println("Desbordaje");
                    break;
                case 6:
                    System.out.println("Mantenimiento");
                    break;
                case 7:
                    System.out.println("Despegue");
                    break;
                case 8:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(AvionesClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
