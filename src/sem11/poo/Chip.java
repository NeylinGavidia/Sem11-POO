/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem11.poo;

/**
 *
 * @author UCC20419
 */
public class Chip {
    
    private String empresa;
    private int nroCel;

    public Chip(String empresa, int nroCel) {
        this.empresa = empresa;
        this.nroCel = nroCel;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNroCel() {
        return nroCel;
    }

    public void setNroCel(int nroCel) {
        this.nroCel = nroCel;
    }
    
    public void mostrar(){
        System.out.println("El chip pertence a la empresa " + this.empresa + 
                " y tiene el numero de telefono: " + this.nroCel);
    }
}
