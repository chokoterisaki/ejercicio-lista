import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Persona persona1;
    static Persona persona2;
    static ArrayList<Persona> personas = new ArrayList<>();
    static int n = 3;
    static float promedio = 0;
    static Scanner scanner = new Scanner(System.in);

    static Persona mayor(){
        persona1 = personas.get(0);
        for(int i = 1; i < n; i++){
            if(personas.get(i).edad() > persona1.edad()){
                persona1 = personas.get(i);
            }
        }
        return persona1;
    }

    static void menor(){
        ArrayList<Persona> temporal = new ArrayList<>();
        temporal = personas;
        persona1 = temporal.get(0);
        for(int i = 1; i < temporal.size(); i++){
            if(temporal.get(i).edad() < persona1.edad()){
                persona1 = temporal.get(i);
            }
        }
        temporal.remove(persona1);


        persona2 = temporal.get(0);
        for(int i = 1; i < temporal.size(); i++){
            if(temporal.get(i).edad() < persona2.edad()){
                persona2 = temporal.get(i);
            }
        }

    }

    static float promedio(){
        int prome = 0;
        for (int i = 0; i < n; i++){
            persona1 = personas.get(i);
            prome += persona1.edad();
        }
        promedio = prome / n;
        return promedio;
    }

    public static void main(String[] args){
        String inputNombre = "";
        String inputFecha = "";
        Scanner inputEscaner = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Ingresar nombre: ");
            inputNombre = inputEscaner.nextLine();
            System.out.print("Ingresar fecha de nacimiento: ");
            inputFecha = inputEscaner.nextLine();
            persona1 = new Persona(inputNombre,inputFecha);
            personas.add(persona1);
        }

        promedio = promedio();
        persona1 = mayor();
        System.out.println("La persona mayor es: " + persona1.nombre + " (" + persona1.edad() + " años)");
        menor();
        System.out.println("Las personas menores son: " + persona1.nombre + " (" + persona1.edad() + " años)" + " y " + persona2.nombre  + " ( " + persona2.edad() + " años)");

        System.out.println("Promedio de edad: " + promedio);

    }
}