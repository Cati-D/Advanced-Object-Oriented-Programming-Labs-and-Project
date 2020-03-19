package asociere;

public class Main {

    public static void main(String[] args) {
        profesor profesorPrincipalMate = new profesor(1, "Mincu");
        profesor profesorSecundarMate = new profesor(2, "Baetica");
        profesor profesorInfo = new profesor(1, "Alexe");
        profesor profesorInfoSiMate = new profesor(4, "Petrescu");
        profesor profesorMateSiInfo = new profesor(5, "Andrei");

        departament departamentInfo = new departament("info");
        departamentInfo.setProfesori(new profesor[]{profesorInfo, profesorInfoSiMate, profesorMateSiInfo});
        departament departamentMate = new departament("mate");
        departamentMate.setProfesori(new profesor[]{profesorPrincipalMate, profesorSecundarMate, profesorInfoSiMate, profesorMateSiInfo});

        universitate unibuc = new universitate("UNIBUC", new departament[]{departamentInfo, departamentMate});

        System.out.println(unibuc);

        departamentInfo = null;
        System.out.println(unibuc);

        System.out.println(departamentMate);
        profesorSecundarMate = null;
        departamentMate.getProfesori()[1] = null;
        System.out.println(departamentMate);
        System.out.println(profesorSecundarMate);


    }
}
