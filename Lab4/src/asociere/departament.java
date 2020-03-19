package asociere;

import java.util.Arrays;

public class departament {//has-a

    private String nume;
    private profesor[] profesori;

    public departament(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public profesor[] getProfesori() {
        return profesori;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setProfesori(profesor[] profesori) {
        this.profesori = profesori;
    }

    @Override
    public String toString() {
        return "Departament{nume:  " + nume +
                "profesori: " + Arrays.toString(profesori);
    }
}
