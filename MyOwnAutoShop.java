public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(233,40000,"red",34);
        Ford ford1 = new Ford(299,23000.0,"white",56,23000);
        Ford ford2 = new Ford(100,4900.0,"Blac",35,50000);
        Car car = new Car(500,7900.5,"Yellow");

        System.out.println("Seden Price is: "+sedan.getSalePrice());
        System.out.println("Ford1 Price is: "+ford1.getSalePrice());
        System.out.println("Ford2 Price is: "+ford2.getSalePrice());
        System.out.println("Car Price is: "+car.getSalePrice());
    }
}