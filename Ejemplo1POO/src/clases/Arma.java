package clases;

public class Arma {
    private String nombre;
    private int munición;
    
    public Arma(String nombre, int munición){
        
        this.nombre= nombre;
        this.munición= munición;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void disparar(){
        if (munición > 0){
            munición --;
            System.out.println(nombre + " disparo. Municion que resta: " +munición);
            
        }else{
            System.out.println(nombre + "No le queda municiones.");
        }
    }
    
    public void recargar(int cantidad){
        
        munición += cantidad;
        System.out.println(nombre + " ya esta recargado con " +cantidad + " balas. Ahora tiene " +munición);
    }
}
