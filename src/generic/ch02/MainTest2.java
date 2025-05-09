package generic.ch02;

public class MainTest2 {

    public static void main(String[] args) {

        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        GenericPrinter<Plastic> genericPrinter1 = new GenericPrinter<>();
        genericPrinter1.setMaterial(plastic1);
        System.out.println(genericPrinter1.toString());

        Plastic usePlastic = genericPrinter1.getMaterial();

        //Powder usePowder =  genericPrinter1.getMaterial();

        Water water = new Water();
        GenericPrinter<Water> genericPrinter2 = new GenericPrinter<>();
        genericPrinter2.setMaterial(water);

    }

}
