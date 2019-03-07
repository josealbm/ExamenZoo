//José Alberto Martín Marí - Examen 1º DAW

package josealbertomartinmari;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public abstract class Animal {
    protected static int contador;
    protected int id;
    protected String nombre;
    protected float peso;

    public Animal() {
        this.id=contador++;
    }

    public Animal(int id, String nombre, float peso) {
        Scanner sc = new Scanner(System.in);
        this.id = contador++;
        this.nombre = nombre.toLowerCase();
        while (peso<=0) {
            System.out.println("El peso no puede ser menor o igual que 0, "
                    + "por favor, vuelve a introducirlo");
            peso=sc.nextFloat();
        this.peso = peso;
        }
    }

    public Animal(Animal a) {
        this.id = a.id;
        this.nombre = a.nombre;
        this.peso = a.peso;
    }
    public static int getContador() {
        return contador;
    }

    public static void setContador(int id_contador) {
        Animal.contador = id_contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        Scanner sc = new Scanner(System.in);
        while (peso<=0) {
            System.out.println("El peso no puede ser menor o igual que 0, "
                    + "por favor, vuelve a introducirlo");
            peso=sc.nextFloat();
        }
        this.peso = peso;
    }
    
    public void mostrarAnimal(){
        System.out.println("ID del animal: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Peso: " + this.peso);
    }
    public abstract void mostrarContador();
}


