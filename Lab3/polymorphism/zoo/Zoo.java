package polymorphism.zoo;

public class Zoo {

    private final int nrMaxAnimale;
    Animal[] animalZoo;
    private int indexCurent;
    public Zoo(int nrMaxAnimale) {
        if (nrMaxAnimale > 0) {
            this.nrMaxAnimale = nrMaxAnimale;
            this.animalZoo = new Animal[nrMaxAnimale];
        }
        else {
            throw new RuntimeException("Nu ati introdus un numar intreg pozitiv");
        }
    }

    public void adaugaAnimal(Animal animal) {
        if (indexCurent < animalZoo.length) {
            animalZoo[indexCurent] = animal;
            System.out.println("Adaugat animal " + animal.getClass().getSimpleName() + "la pozitia " + indexCurent++);
        }
    }
}
