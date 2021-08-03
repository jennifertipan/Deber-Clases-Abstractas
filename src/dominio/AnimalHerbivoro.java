
package dominio;


public class AnimalHerbivoro extends Animal {
    @Override
    public void alimentarse(){
        System.out.println("|| * Un animal hervivoro es la vaca                     ||");
        System.out.println("|| * El animal hervivoro se alimenta de hierva          ||");
        System.out.println("----------------------------------------------------------");
    }
}
