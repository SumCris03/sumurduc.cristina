package Polimorphism;

public class Application {
    public static void main(String[] args) {
        Animal ciineleNostru = new Ciine();
        ciineleNostru.emiteSunet();
        Animal pisicaMea = new Pisica();
        pisicaMea.emiteSunet();
    }

}
