package InheritanceMostenirea;

public class Application {
    public static void main(String[] args) {
        Vehicul masinaKrina=new Vehicul();
        Masina masinaMarcel=new Masina("Mercedes");

        masinaKrina.setCuloare(" neagra");
        masinaKrina.setNrRoti(4);
        masinaKrina.afiseazaDetaliiVehicul();

        masinaMarcel.setNrRoti(4);
        masinaMarcel.setMarca("Mercedes");
        masinaMarcel.setCuloare(" neagra");
        masinaMarcel.afiseazaDetaliiVehicul();
    }

}
