package asociere;

import java.util.Arrays;

public class universitate {//has-to-has-a

    private String nume;
    private departament[] departaments;

    public universitate(String nume, departament[] departaments) {
        this.nume = nume;
        this.departaments = Arrays.copyOf(departaments, departaments.length);
    }

    @Override
    public String toString() {
        return "Universitatea{nume:  " + nume + ", departamente: " + Arrays.toString(departaments) + "}";
    }
}
