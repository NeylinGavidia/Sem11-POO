/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem11.poo;

import java.util.ArrayList;

/**
 *
 * @author UCC20419
 */
public class Smartphone {
    private String modelo;
    private int nroChips;
    private ArrayList<Chip> c = new ArrayList(); 
    private Bateria pow;

    public Smartphone(String modelo) {
        this.modelo = modelo;
        this.nroChips = 0; 
    }

    public Smartphone(String modelo, int cantA, String marcaBateria) {
        this.modelo = modelo;
        this.nroChips = 0; 
        this.pow = new Bateria(cantA, marcaBateria);
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
        System.out.println("Smartphone: " + this.modelo + " con maximo de chips (2) ");
        if (this.nroChips > 0){
            System.out.println("Los chips son: ");
            for (int i= 0; i<c.size(); i++){
                c.get(i).mostrar();
            }
        }
    }
    public void agregarChip(Chip nc){
        if (c.size()<2){
            c.add(nc);
            System.out.println("Chip agregado correctamente ^^");
            nroChips++;
        }
        else{
            System.out.println("Ya no puede agregarse mas chips");
        }
    }
}
