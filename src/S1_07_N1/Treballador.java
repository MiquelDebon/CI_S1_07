package S1_07_N1;

public class Treballador {
    private String name;
    private String surname;
    private int hourPrice;


    public Treballador(String name, String surname, int hourPrice) {
        this.name = name;
        this.surname = surname;
        this.hourPrice = hourPrice;
    }


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getHourPrice() {
        return this.hourPrice;
    }
    public void setHourPrice(int hourPrice) {
        this.hourPrice = hourPrice;
    }


    public int calcularSou(int amountOfHours){
        return this.hourPrice * amountOfHours;
    }
}
