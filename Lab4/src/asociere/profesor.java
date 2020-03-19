package asociere;

public class profesor {

    private int id;
    private String nume;

    public profesor(int id, String nume) {
        this.nume = nume;
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Profesor{ " +
                "id: " + id +
                ", nume: " + nume + '\'' + "}";
    }
}
