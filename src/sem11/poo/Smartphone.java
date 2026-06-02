/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem11.poo;

/**
 *
 * @author UCC20419
 */
public class Smartphone {
    private String modelo;
    private int nroChips;

    public Smartphone(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNroChips() {
        return nroChips;
    }

    public void setNroChips(int nroChips) {
        this.nroChips = nroChips;
    }
    
    public void mostrar(){
        System.out.println("Smartphone: " + this.modelo + "con maximo de chips: " +
                this.nroChips);
    }
    public void agregarChip(){
        
    }
    
}
