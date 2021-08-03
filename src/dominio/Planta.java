
package dominio;


public class Planta extends SerVivo {
    
    @Override
    public void alimentarse(){
        System.out.println("----------------------------------------------------------");
        System.out.println("|| * Una planta es el girasol                           ||");
        System.out.println("|| * La planta se alimenta a traves de la fotosistesis  ||");
        System.out.println("----------------------------------------------------------");
    }
}
