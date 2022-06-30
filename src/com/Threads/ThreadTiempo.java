/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jony
 */
public class ThreadTiempo extends Thread {
    public ThreadTiempo(String process){
        super(process);
    }
    public void run()
    {
        for(int i=0;i<=100;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTiempo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
