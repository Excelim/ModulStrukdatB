/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modul1strukdat;

/**
 *
 * @author EXCEL
 */
public class Konsumsi<M, I> {
    private M m;
    private I i;
    
    public M getM(){
        return m;
    }
    
    public I getI(){
        return i;
    }
    /**
     * @param args the command line arguments
     */
    public void setKonsumsi(M makanan, I minuman) {
        // TODO code application logic here
        this.m = makanan;
        this.i = minuman;
    }
    
}
