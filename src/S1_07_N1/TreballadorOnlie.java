package S1_07_N1;

public class TreballadorOnlie extends Treballador{
    private static final int internet = 20;
    public TreballadorOnlie(String name, String surname, int hourPrice) {
        super(name, surname, hourPrice);
    }


    @Override
    public int calcularSou(int amountOfHours) {
        return super.calcularSou(amountOfHours) + TreballadorOnlie.internet;
    }

    @Deprecated
    public void printObsolet(){
        System.out.println("Methode obsolet");
    }

}
