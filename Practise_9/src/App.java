public class App {
    public static void main(String[] args) {
        // TASK 1
        Nameable nameableItem;
        
        nameableItem = new Book("Титан", 450);
        System.out.println(nameableItem.getName());

        nameableItem = new Car("BMW", 3_000_000);
        System.out.println(nameableItem.getName());

        System.out.println("---");

        // TAsk 2
        Priceable priceableItem;

        priceableItem = new Book("Титан", 450);
        System.out.println(priceableItem.getPrice());

        priceableItem = new Car("BMW", 3_000_000);
        System.out.println(priceableItem.getPrice());
    }
}
