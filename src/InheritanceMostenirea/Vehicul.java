package InheritanceMostenirea;

public class Vehicul {
    private String culoare;
    private Integer nrRoti;
    public Vehicul(){

    }
    public String getCuloare(){
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public Integer getNrRoti() {
            return nrRoti;
    }
    public Void setNrRoti(Integer nrRoti) {
            this.nrRoti = nrRoti;
        return null;
    }
        public void afiseazaDetaliiVehicul(){
        System.out.println("vehiculul dat are culoare" + getCuloare() +" si " + getNrRoti() + "roti.");

    }
}
