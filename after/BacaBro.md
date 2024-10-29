# Program Inventaris Mobil

## Deskripsi
Program ini adalah sistem sederhana untuk mengelola inventaris mobil di suatu lokasi showroom. Program menggunakan tiga kelas utama:
- `Main` - Berfungsi sebagai titik masuk untuk menjalankan program.
- `Car` - Mewakili informasi terkait mobil, seperti model, harga, dan stok.
- `Inventory` - Mengelola inventaris mobil di suatu lokasi tertentu.

## Struktur Program

### 1. Main.java
File ini adalah titik masuk utama program, yang membuat objek `Car` dan `Inventory`, kemudian menampilkan informasi inventaris dan menyesuaikan stok mobil.

### 2. Inventory.java
Kelas `Inventory` mengelola inventaris mobil di suatu lokasi showroom. Kelas ini memiliki metode untuk menampilkan inventaris yang mencakup informasi mobil dan lokasi.

### 3. Car.java
Kelas `Car` berisi informasi terkait mobil seperti model, harga, dan stok. Kelas ini juga menyediakan metode untuk menghitung harga setelah diskon dan menyesuaikan jumlah stok.

## Cara Menjalankan Program
1. Pastikan Anda memiliki JDK (Java Development Kit) yang terinstal di komputer Anda.
2. Salin semua file `.java` ke dalam folder proyek.
3. Buka terminal atau command prompt, arahkan ke folder proyek, lalu jalankan perintah berikut untuk mengompilasi kode:
   ```bash
   javac Main.java Inventory.java Car.java
