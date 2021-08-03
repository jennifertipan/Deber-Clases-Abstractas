
package dominio;


public class Principal {
    public static void main(String[] args) {
      Planta planta = new Planta ();
      AnimalCarnivoro animalCar = new AnimalCarnivoro();
      AnimalHerbivoro animalHer = new AnimalHerbivoro();
      planta.alimentarse();
      animalCar.alimentarse();
      animalHer.alimentarse();
    }
    
}
