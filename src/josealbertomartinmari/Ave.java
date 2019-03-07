//José Alberto Martín Marí - Examen 1º DAW
package josealbertomartinmari;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Ave extends Animal{
    private static int num_de_aves;
    private int id_ave;
    private int num_alas;
    private float long_vuelo;  

    
    //Agregamos los contadores al constructor vacío para controlarlos cuando
    //se inicien así
    public Ave() {
        this.id = contador++;
        this.id_ave = num_de_aves++;
    }

    public Ave(int num_alas, int long_vuelo, int id, String nombre, float peso, 
            int id_ave){
        super(id, nombre, peso);
        this.num_alas = num_alas;
        this.long_vuelo = long_vuelo;
        this.id_ave = num_de_aves++;
    }
    
    public Ave(Ave a){
        this.id = a.id;
        this.nombre = a.nombre;
        this.peso = a.peso;
        this.num_alas = a.num_alas;
        this.long_vuelo = a.long_vuelo;
    }

    public int getId_ave() {
        return id_ave;
    }

    public void setId_ave(int id_ave) {
        this.id_ave = id_ave;
    }

    public static int getNum_de_aves() {
        return num_de_aves;
    }

    public static void setNum_de_aves(int num_de_aves) {
        Ave.num_de_aves = num_de_aves;
    }

    public int getNum_alas() {
        return num_alas;
    }

    public void setNum_alas(int num_alas) {
        this.num_alas = num_alas;
    }

    public float getLong_vuelo() {
        return long_vuelo;
    }

    public void setLong_vuelo(float long_vuelo) {
        this.long_vuelo = long_vuelo;
    }
    
    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre");
        setNombre(sc.nextLine().toLowerCase());
        System.out.println("Dime el peso");
        setPeso(sc.nextFloat());
        System.out.println("Dime la longitud del vuelo");
        setLong_vuelo(sc.nextFloat());
        System.out.println("¿Qué número de alas tiene?");
        setNum_alas(sc.nextInt());
        }
    @Override
    public void mostrarAnimal(){
        super.mostrarAnimal();
        System.out.println("ID Ave: " + this.id_ave);
        System.out.println("Número de alas: " + this.num_alas);
        System.out.println("Longitud de vuelo: " + this.long_vuelo);
        }
    

    @Override
    public void mostrarContador() {
        System.out.println("El número total de de animales es" + contador);
        System.out.println("El número total de aves es" +num_de_aves);
    }
    
    
    
    
}


