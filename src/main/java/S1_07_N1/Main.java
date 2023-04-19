package S1_07_N1;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        TreballadorPresencial tP = new TreballadorPresencial("Miquel", "Debon", 20, 50);
        TreballadorOnlie tO = new TreballadorOnlie("Eduard", "Debon", 20);

        System.out.println("TP: "+ tP.calcularSou(160));
        System.out.println("TO: " + tO.calcularSou(160));

        tP.printObsolet();
    }
}
