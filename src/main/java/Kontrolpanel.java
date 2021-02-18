import java.util.ArrayList;

public class Kontrolpanel {

    ArrayList<String> options = new ArrayList<>();

    public Kontrolpanel(){
        addOptions();
    }



    public void displayOptions() {
        System.out.println(this.options.get(0));
        System.out.println(this.options.get(1));
        System.out.println(this.options.get(2));
        System.out.println(this.options.get(3));
        System.out.println(this.options.get(4));
        System.out.println(this.options.get(5));
        System.out.println(this.options.get(6));

    }

    public void addOptions() {
        this.options.add("1) Make customer");
        this.options.add("2) Show customer");
        this.options.add("3) Insert amount");
        this.options.add("4) Show amount");
        this.options.add("5) Create employee");
        this.options.add("6) Show employee");
        this.options.add("0) Afslut");
    }
}