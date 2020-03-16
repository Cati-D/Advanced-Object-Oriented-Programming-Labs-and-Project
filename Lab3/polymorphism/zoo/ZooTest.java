package polymorphism.zoo;
import polymorphism.zoo.carnivor.Leu;
import polymorphism.zoo.carnivor.Pisica;
import polymorphism.zoo.ierbivor.Cal;
import polymorphism.zoo.ierbivor.Elefant;
import polymorphism.zoo.ominivor.Urs;
import polymorphism.zoo.ominivor.Caine;

//import java.util.Scanner;

public abstract class ZooTest {

    public static void main(String[] args) {
        Integer nrAnimaleZoo = Integer.valueOf(args[0]);
        System.out.println(nrAnimaleZoo);

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Precizati nr max de animale ce pot fi gazduite la zoo: ");
        int nrAnimaleZoo = scanner.nextInt();
        scanner.close();*/

        Zoo zooBucuresti = new Zoo(nrAnimaleZoo);
        for (int i = 0; i < zooBucuresti.animalZoo.length && zooBucuresti.animalZoo[i] != null; i++) {
            Animal animal = zooBucuresti.animalZoo[i];
            animal.afiseazaDetalii();
            animal.seHraneste();
            animal.scoateSunet();
        }
    }

    public static void adaugaAnimalLaZoo(Zoo zoo) {
        Leu leu = new Leu("Simba", 7);
        zoo.adaugaAnimal(leu);
        Elefant elefant = new Elefant("eli", 10);
        zoo.adaugaAnimal(elefant);
        Urs urs = new Urs("Fram", 4);
        zoo.adaugaAnimal(urs);
        Pisica pisica = new Pisica("Tom", 2);
        zoo.adaugaAnimal(pisica);
        Caine caine = new Caine("Toto", 3);
        zoo.adaugaAnimal(caine);
        Cal cal = new Cal("Condrat", 3);
        zoo.adaugaAnimal(cal);
    }

}
