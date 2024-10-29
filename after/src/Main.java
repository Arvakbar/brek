// Kelas Main
/**
 * Main class untuk menjalankan program Inventory mobil.
 */
public class Main {
    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args argumen command-line (tidak digunakan).
     */
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", 79999.99, 30);
        Inventory inv = new Inventory(car, "Showroom A");

        inv.showInventory();
        car.applyStockAdjustment(5);
        inv.showInventory();
    }
}
