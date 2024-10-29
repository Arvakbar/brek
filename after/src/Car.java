/**
 * Kelas Car untuk mendefinisikan properti dan operasi terkait mobil.
 */
public class Car {
    private String model;
    private double price;
    private int stock;

    private static final double DISCOUNT_RATE = 0.1;

    /**
     * Konstruktor untuk kelas Car.
     *
     * @param model Model mobil.
     * @param price Harga mobil.
     * @param stock Jumlah stok mobil.
     */
    public Car(String model, double price, int stock) {
        this.model = model;
        this.price = price;
        this.stock = stock;
    }

    /**
     * Getter untuk model mobil.
     *
     * @return Model mobil.
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter untuk model mobil.
     *
     * @param model Model baru untuk mobil.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter untuk harga mobil.
     *
     * @return Harga mobil.
     */
    public double getPrice() {
        return price;
    }



    /**
     * Getter untuk stok mobil.
     *
     * @return Stok mobil.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Setter untuk stok mobil.
     *
     * @param stock Jumlah stok baru untuk mobil.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Menghitung harga setelah diskon.
     *
     * @return Harga setelah diskon.
     */
    public double calculateDiscount() {
        return price * (1 - DISCOUNT_RATE);
    }

    /**
     * Menampilkan informasi mobil, termasuk model, harga, harga diskon, dan stok.
     */
    public void displayCar() {
        System.out.println("Car Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Discounted Price: $" + calculateDiscount());
        System.out.println("Stock: " + stock);
    }

    /**
     * Menyesuaikan jumlah stok mobil.
     *
     * @param adjustment Penyesuaian jumlah stok.
     */
    public void applyStockAdjustment(int adjustment) {
        stock += adjustment;
        System.out.println("Stock adjusted. New stock: " + stock);
    }

}
