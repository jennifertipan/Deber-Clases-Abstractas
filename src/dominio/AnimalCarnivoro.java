
package dominio;


public class AnimalCarnivoro extends Animal{
    @Override
    public void alimentarse(){
        System.out.println("|| * Un animal carnivoro es el leon.                    ||");
        System.out.println("|| * El animal carnivoro se alimenta de carne.          ||");
        System.out.println("----------------------------------------------------------");
    }
}
