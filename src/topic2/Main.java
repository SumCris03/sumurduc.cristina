package topic2;

public class Main {
    public static void main(String[] args) {
        Persona fiinta = new Persona();
        fiinta.nume = "Sumurduc";
        fiinta.prenume = "Cristina";
        fiinta.gen = "F";
        fiinta.greutate = 60;
        fiinta.setVirsta(32);
        System.out.println("Doamna " + fiinta.nume + " " + fiinta.prenume + " are virsta de " + fiinta.getVirsta() + " ani," +
                " si greutatea de " + fiinta.greutate + "kg.");


    }
}
