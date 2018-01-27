package decorator2;

abstract class Samochod  {
    protected String samochod = "Samochod podstawowy";

    public String about()  {
        return samochod;
    }

    public abstract double cena();
}
