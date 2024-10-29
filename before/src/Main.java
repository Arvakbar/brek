// Kelas Product diubah menjadi Car
public class Car {
    public String model;
    public double price;
    public int stock;

    public Car(String model, double price, int stock) {
        this.model = model;
        this.price = price;
        this.stock = stock;
    }

    public void displayCar() {
        double discountedPrice = price * 0.9; // 10% diskon
        System.out.println("Car Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
        System.out.println("Stock: " + stock);
    }

    public void applyStockAdjustment(int adjustment) {
        stock += adjustment;
        System.out.println("Stock adjusted. New stock: " + stock);
    }
}

// Kelas Inventory tetap digunakan untuk menyimpan informasi stok dan lokasi
public class Inventory {
    public Car car;
    public String location;

    public Inventory(Car car, String location) {
        this.car = car;
        this.location = location;
    }

    public void showInventory() {
        System.out.println("Location: " + location);
        car.displayCar();
    }
}

// Kelas MainApp diubah menjadi Main
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", 79999.99, 30);
        Inventory inv = new Inventory(car, "Showroom A");

        inv.showInventory();
        car.applyStockAdjustment(5);
        inv.showInventory();
    }
}
