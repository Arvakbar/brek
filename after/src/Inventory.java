/**
 * Kelas Inventory untuk mengelola inventaris mobil di suatu lokasi tertentu.
 */
public class Inventory {
    private Car car;
    private String location;

    /**
     * Konstruktor untuk kelas Inventory.
     *
     * @param car Mobil yang tersedia di inventaris.
     * @param location Lokasi inventaris.
     */
    public Inventory(Car car, String location) {
        this.car = car;
        this.location = location;
    }

    /**
     * Setter untuk mengubah mobil di inventaris.
     *
     * @param car Mobil baru yang ingin diatur di inventaris.
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * Setter untuk mengubah lokasi inventaris.
     *
     * @param location Lokasi baru untuk inventaris.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Menampilkan informasi inventaris, termasuk lokasi dan informasi mobil.
     */
    public void showInventory() {
        System.out.println("Location: " + location);
        car.displayCar();
    }
}
