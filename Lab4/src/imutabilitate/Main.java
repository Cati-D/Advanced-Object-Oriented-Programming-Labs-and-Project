package imutabilitate;

public class Main {

    public static void main(String[] args) {

        /*Persoana student = new Student(1, "Teo");

        Persoana[] persoane = new Persoana[2];

        persoane[0] = student;
        System.out.println(Arrays.toString(persoane));
        student.nume = "Alex";
        System.out.println(Arrays.toString(persoane));*/

        Adresa domiciliu = new Adresa("Timisoara", "4A");

        Persoana persoana = new Persoana(1, "Teo", domiciliu);
        String numePersoana = persoana.getNume().toUpperCase();
        System.out.println(persoana);
        System.out.println(numePersoana);

        String stradaUpperCase = domiciliu.getStrada().toUpperCase();
        domiciliu.setStrada(stradaUpperCase);
        System.out.println(persoana);

        Adresa adresaDomiciliu = persoana.getAdresa();
        String strada = adresaDomiciliu.getStrada();
        adresaDomiciliu.setStrada(strada.toUpperCase());

        System.out.println(persoana);
    }
}
