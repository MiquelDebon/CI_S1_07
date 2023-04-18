package S1_07_N1;

public class TreballadorPresencial extends Treballador{
    private static int benzina;
    public TreballadorPresencial(String name, String surname, int hourPrice, int benzina) {
        super(name, surname, hourPrice);
        TreballadorPresencial.benzina = benzina;
    }


    @Override
    public int calcularSou(int amountOfHours) {
        return super.calcularSou(amountOfHours) + TreballadorPresencial.benzina;
    }

    @Deprecated
    public void printObsolet(){
        System.out.println("Methode obsolet");
    }
}
