package Encapsulation;

public class Application {
    public static void main(String[] args) {
        ContBancar contCristina=new ContBancar(205185568L, 125.50);


        System.out.println(contCristina.getNumarCont());
        contCristina.setSold(50.0);
        System.out.println(contCristina.getSold());

    }
}

