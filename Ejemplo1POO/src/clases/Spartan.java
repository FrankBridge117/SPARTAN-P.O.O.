package clases;

public class Spartan {
    // Empezamos con atributos (también llamados Propiedades) de nuestro Spartan
    private String nombre;
    private int rango;
    private String armadura;
    private Arma nuestraArma;

    // Crear nuestro método Constructor
    public Spartan(String nombre, int rango, String armadura) {
        
        this.nombre = nombre;
        this.rango = rango;
        this.armadura = armadura;
    }

    // Crear el método para mostrar las características de nuestro Spartan
    public void infoSpartan() {
        
        System.out.println("Name: " + nombre);
        System.out.println("Rango: " + rango);
        System.out.println("Armadura: " + armadura);
    }

    // Crear el método para que se suba de rango el Spartan
    public void subirRango() {
        
        rango++;
        System.out.println(nombre + ", SUBISTE DE RANGO A " + rango + "!:D");
    }
    
    //Nuestro nuevo atributo de nuestra arma
    public void nuevaArma(Arma arma){
    
        this.nuestraArma = arma;
        System.out.println(nombre + " recibio su arma " +arma.getNombre());
    }
    
    //Nuestro atributo para que ataquemos con el arma
    public void disparar(){
        if (nuestraArma != null){
            System.out.println(nombre +" esta disparando.");
            nuestraArma.disparar();} else {
            System.out.println(nombre +"No tiene una arma propia");
            
            }
            
        }
    }
    


