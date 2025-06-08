package ejemplo1poo;
import clases.Spartan;
import clases.Arma;

public class Ejemplo1POO {

    public static void main(String[] args) {
       //INSTANCIAMOS LA CLASE PARA PODER USARLA. HACERLA FUNCIONAR
       Spartan masterChief = new Spartan("Jefe Maestro", 117, "Mjolnir Mark VI");
       //INSTANCIAMOS LA CLASE Arma PARA CREARLE UN OBJETO
       Arma pistolaMagnum = new Arma ("Pistola Magnum", 8);
       
       masterChief.infoSpartan();
       masterChief.subirRango();
       masterChief.infoSpartan();
       masterChief.nuevaArma(pistolaMagnum);
       
       masterChief.disparar();
       masterChief.disparar();
       masterChief.disparar();
       masterChief.disparar();
       masterChief.disparar();
       masterChief.disparar();
       masterChief.disparar();
       masterChief.disparar();
       
       pistolaMagnum.recargar(8);
       
       masterChief.disparar();
       masterChief.disparar();
       
    }
    
}
