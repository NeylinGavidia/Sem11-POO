/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem11.poo;

/**
 *
 * @author UCC20419
 */
public class Sem11POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Chip c1 = new Chip("Claro", 968765431);
        Chip c2 = new Chip("Movistar", 965432167);
        Chip c3 = new Chip("Bitel", 965432321);
        Smartphone s1 = new Smartphone("Galaxy plus S4", 432000, "Samsung");
        s1.agregarChip(c1);
        s1.agregarChip(c2);
        s1.agregarChip(c3);
        s1.mostrar();
    }
    
}
