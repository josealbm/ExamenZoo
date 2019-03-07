// José Alberto Martín Marí - Examen 1º DAW

package josealbertomartinmari;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Zoo {

    public static void mostrarOrdenado_longitud(ArrayList<Animal> listaAnimales){
        ArrayList<Ave> listaAves = new ArrayList<>();
        //Intento agregar únicamente las aves a una lista aparte para separar 
        //por clases
        for (int i = 0; i < listaAnimales.size(); i++) {
           if (listaAnimales.get(i) instanceof Ave){
               listaAves.add((Ave) listaAnimales.get(i));
           }
        }
        //una vez separada por clases pasamos a buscar por el parámetro 
        //seleccionado y lo almacenamos en una lista temporal
        ArrayList<Ave> listaOrdenada = new ArrayList<>();
        for (int j = 0; j < listaAves.size(); j++) {
            //seleccionamos la primera como menor y hacemos el bucle buscando
            //una cifra menor a la guardada
            float menor = listaAves.get(j).getLong_vuelo();
            if (menor>listaAves.get(j).getLong_vuelo()){
                menor=listaAves.get(j).getLong_vuelo();
                //agregamos a la primera posición siempre el número menor
                listaOrdenada.add(0, listaAves.get(j));
            }
        }
        for (int i = 0; i < listaOrdenada.size(); i++){
            System.out.println("La lista ordenada de aves es: " 
                    +(i+1)+")"+listaOrdenada.get(i).mostrarAnimal());
        }
    }
                        
    public static void mostrarOrdenado_peso(ArrayList<Animal> listaAnimales){
        ArrayList<Ave> listaAves = new ArrayList<>();
        //Intento agregar únicamente las aves a una lista aparte para separar 
        //por clases
        for (int i = 0; i < listaAnimales.size(); i++) {
           if (listaAnimales.get(i) instanceof Ave){
               listaAves.add((Ave) listaAnimales.get(i));
           }
        }
        //una vez separada por clase pasamos a buscar por el parámetro
        ArrayList<Ave> listaOrdenada = new ArrayList<>();
        for (int j = 0; j < listaAves.size(); j++) {
            //seleccionamos la primera como menor y hacemos el bucle buscando
            //una cifra menor a la guardada
            float menor = listaAves.get(j).getPeso();
            if (menor>listaAves.get(j).getPeso()){
                menor=listaAves.get(j).getPeso();
                //agregamos a la primera posición siempre el número menor
                listaOrdenada.add(0, listaAves.get(j));
            }
        }
        for (int i = 0; i < listaOrdenada.size(); i++){
            System.out.println("==============================");
            System.out.println("La lista ordenada de aves es: " 
                  +(i+1)+")" +listaOrdenada.get(i).mostrarAnimal()); 
            System.out.println("==============================");
        }
    }
        
    
    public static void main(String[] args) {
       ArrayList<Animal> listaAnimales = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       boolean salir = false;
       int opcion;
       while (!salir){
            System.out.println("Bienvenidos/as al sistema de gestión del zoo");
            System.out.println("Por favor, escoge una de las opciones");
            System.out.println("1. Dar de alta un ave");
            System.out.println("2. Mostrar ordenado");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case(1):{
                    System.out.println("Vamos a dar de alta a un ave");
                    Ave pajaro = new Ave();
                    pajaro.pedirAlta();
                    listaAnimales.add(pajaro);
                    break;
                }
                case(2):{
                   boolean salir2 = false;
                   while (!salir2){
                    System.out.println("¿Cómo quieres ver las aves ordenadas?");
                    System.out.println("Opción 1: Por Longitud de vuelo");
                    System.out.println("Opción 2: Por número de alas");
                    System.out.println("Opción 3: Salir");
                    int opcion2 = sc.nextInt();
                        switch(opcion2){
                            case(1):{
                                mostrarOrdenado_longitud(listaAnimales);
                                break;
                            }
                            case(2):{
                                mostrarOrdenado_peso(listaAnimales);
                                break;
                            }
                            case(3):{
                                salir2 = true;
                                break;
                            }
                            default:{
                            System.out.println("Opción incorrecta, "
                            + "escoge una de las opciones que aparecen");
                            break;
                            }
                        }
                    }
                    break;
                }
                case(3):{
                    salir = true;
                    break;
                }
                default:{
                    System.out.println("Por favor, elige una opción válida");
                }
            }
       }
    }
}
