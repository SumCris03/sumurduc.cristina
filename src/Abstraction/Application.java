package Abstraction;

public class Application {
    public static void main(String[] args) {
        FormaGeometrica triunghi1=new Triunghi(4.2,2.2);
        triunghi1.calculArie();
        System.out.println("Aria triunghiului ete egala cu " + triunghi1.calculArie());

        FormaGeometrica patrat1=new Patrat(22.2);
        System.out.println ("Acest patrat are aria egala cu " + patrat1.calculArie());
    }
}
