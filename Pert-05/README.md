# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

| Informasi Praktikan | Keterangan |
| :--- | :--- |
| **Nama** | Qowiyul Amin |
| **NPM** | 4525210135 |
| **Kelas** | A |
| **Mata Kuliah** | Pemrograman Berbasis Objek (PBO) |
| **Pertemuan** | 5 - Polimorfisme |
| **Tanggal** | Khamis, 1 Oktober 2026 |

---

## 1. Implementasi Java

### 1.1. File: `AntiPattern.java`
**Penjelasan Kode:**
> Program AntiPattern.java merupakan contoh program perhitungan luas bangun datar yang belum menerapkan konsep polimorfisme. Program menggunakan record untuk menyimpan data lingkaran, persegi, dan segitiga, kemudian method hitungLuas() menentukan rumus yang digunakan melalui percabangan if-else.
Pada method main(), program membuat daftar tiga bangun datar, menghitung luas masing-masing, lalu menjumlahkan hasilnya untuk mendapatkan total luas. Program ini menunjukkan bahwa penambahan jenis bangun datar baru mengharuskan method hitungLuas() diubah, sehingga kode menjadi kurang fleksibel dan lebih sulit dikembangkan.
Oleh karena itu, program ini digunakan sebagai bahan latihan untuk melakukan refaktor dengan menerapkan polimorfisme.


**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1561" height="928" alt="image" src="https://github.com/user-attachments/assets/207827f7-9565-455e-af98-8f86eaca34ba" />
<img width="1557" height="67" alt="image" src="https://github.com/user-attachments/assets/22498efb-adcf-4761-917e-f6ca5d543beb" />



* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1559" height="937" alt="image" src="https://github.com/user-attachments/assets/09f45a0b-e02f-42ef-9d6e-d580c3f04f60" />



### 1.2. File: `BangunDatar.java`
**Penjelasan Kode:**
> Program BangunDatar.java merupakan class induk abstrak yang menjadi dasar bagi berbagai jenis bangun datar. Class ini menyimpan atribut nama dan menyediakan method abstrak luas() serta keliling() yang wajib diimplementasikan oleh class turunannya.
Method getNama() digunakan untuk mengambil nama bangun datar, sedangkan toString() menampilkan nama, luas, dan keliling dalam format yang rapi.
Program ini menerapkan konsep abstraction dan polymorphism, sehingga setiap bangun datar dapat memiliki cara perhitungan yang berbeda melalui method yang sama.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1565" height="608" alt="image" src="https://github.com/user-attachments/assets/324c90ed-909a-4c7c-8518-79a7f664802d" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1565" height="594" alt="image" src="https://github.com/user-attachments/assets/cb62c8c9-4f20-4636-b436-d037a2099e17" />


### 1.3. File: Lingkaran.java
*Penjelasan Kode:*
> Program Lingkaran.java merupakan class turunan dari BangunDatar yang digunakan untuk menghitung luas dan keliling lingkaran. Class ini memiliki atribut jariJari untuk menyimpan ukuran jari-jari lingkaran dan menggunakan super("Lingkaran") untuk memberikan nama kepada class induknya.
Constructor melakukan validasi agar jari-jari harus lebih besar dari nol. Method luas() menghitung luas menggunakan rumus π × r², sedangkan keliling() menghitung keliling menggunakan rumus 2 × π × r.
Program juga menyediakan getJariJari() untuk mengambil nilai jari-jari. Class ini menerapkan konsep inheritance dan polymorphism melalui implementasi method dari class induk BangunDatar.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1563" height="396" alt="image" src="https://github.com/user-attachments/assets/d66b1861-cb37-45e9-9710-09112f043ff6" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1555" height="460" alt="image" src="https://github.com/user-attachments/assets/19864336-0321-4de6-8889-681ab690021b" />


### 1.4. File: Persegi.java
*Penjelasan Kode:*
> Program Persegi.java merupakan class turunan dari BangunDatar yang digunakan untuk menghitung luas dan keliling persegi. Class ini memiliki atribut sisi untuk menyimpan panjang sisi persegi dan menggunakan super("Persegi") untuk menetapkan nama bangun pada class induknya.
Constructor melakukan validasi agar panjang sisi harus lebih besar dari nol. Method luas() menghitung luas dengan rumus sisi × sisi, sedangkan keliling() menghitung keliling dengan rumus 4 × sisi.
Class ini menerapkan konsep inheritance dan polymorphism dengan mengimplementasikan method abstrak dari class BangunDatar.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1559" height="363" alt="image" src="https://github.com/user-attachments/assets/9c4df0cc-cf48-43c7-aede-773693653e27" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1563" height="440" alt="image" src="https://github.com/user-attachments/assets/237782af-4952-4a97-9af4-19e1ff315bb2" />


### 1.5. File: Segitiga.java
*Penjelasan Kode:*
> Program Segitiga.java merupakan class turunan dari BangunDatar yang digunakan untuk menghitung luas dan keliling segitiga. Class ini memiliki atribut Alas, Tinggi, dan sisi untuk menyimpan ukuran segitiga, serta menggunakan super("Segitiga") untuk menetapkan nama bangun pada class induknya.
Constructor melakukan validasi agar semua ukuran harus lebih besar dari nol. Method luas() menghitung luas menggunakan rumus (alas × tinggi) / 2, sedangkan keliling() menghitung keliling dengan menjumlahkan nilai sisi sebanyak tiga kali.
Class ini menerapkan konsep inheritance dan polymorphism dengan mengimplementasikan method dari class BangunDatar.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1559" height="592" alt="image" src="https://github.com/user-attachments/assets/5a09741a-a83d-44a3-9905-035431a5d23a" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1559" height="592" alt="image" src="https://github.com/user-attachments/assets/b69020bd-2c0f-4faf-aead-1b5cabb36caa" />


### 1.6. File: Trapesium.java
*Penjelasan Kode:*
> Program Trapesium.java merupakan class turunan dari BangunDatar yang digunakan untuk menghitung luas dan keliling trapesium. Class ini memiliki atribut sisiAtas, sisiBawah, sisiSamping, dan tinggi untuk menyimpan ukuran trapesium.
 Constructor menggunakan super("Trapesium") untuk menetapkan nama bangun pada class induknya.
Method luas() menghitung luas dengan rumus ((sisi atas + sisi bawah) / 2) × tinggi. Sementara itu, method keliling() menjumlahkan sisi atas, sisi bawah, sisi samping, dan tinggi sesuai rumus yang ditulis dalam kode. Class ini menerapkan konsep inheritance dan polymorphism dengan mengimplementasikan method dari class BangunDatar.


*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1560" height="629" alt="image" src="https://github.com/user-attachments/assets/07042f98-2181-423c-a13b-62a3b06db5cd" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1560" height="629" alt="image" src="https://github.com/user-attachments/assets/9f15e609-db73-4035-b156-093aecd19cbe" />


### 1.7. File: `Main.java`
**Penjelasan Kode:**
> Program Main.java digunakan untuk menguji perhitungan luas dan keliling berbagai bangun datar dengan menerapkan konsep polimorfisme. Program menyimpan objek Lingkaran, Persegi, Segitiga, dan Trapesium ke dalam array bertipe BangunDatar.
Melalui perulangan for, program menampilkan informasi setiap bangun datar dan menghitung total luas menggunakan method luas().
Program juga menerapkan upcasting, yaitu menyimpan objek turunan dalam variabel bertipe class induk, serta downcasting menggunakan instanceof untuk mengambil jari-jari khusus objek lingkaran.
Dengan polimorfisme, program dapat memanggil method yang sama pada berbagai jenis bangun datar tanpa perlu membuat percabangan terpisah untuk setiap jenisnya.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1557" height="840" alt="image" src="https://github.com/user-attachments/assets/01d12672-bd05-479a-a991-cb9aef668dfd" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1564" height="877" alt="image" src="https://github.com/user-attachments/assets/c935e6b8-474d-425c-b845-c7d076fddef2" />


### Output
**Output Program:**
<img width="986" height="266" alt="image" src="https://github.com/user-attachments/assets/93ffe876-a8af-4633-a6ad-d8ce8378bf70" />
---

## 2. Implementasi PHP

### 2.1. File: `BangunDatar.php`
**Penjelasan Kode:**
> Program BangunDatar.php berisi beberapa class untuk menghitung luas dan keliling bangun datar menggunakan konsep OOP dalam PHP. Class abstrak BangunDatar menjadi class induk yang menyediakan method luas() dan keliling() untuk diimplementasikan oleh class turunannya.
Di dalam file ini terdapat class Lingkaran, Persegi, Segitiga, dan Trapesium. Masing-masing memiliki rumus perhitungan yang berbeda serta validasi untuk memastikan ukuran yang dimasukkan sesuai ketentuan.
Pada class Segitiga, luas dihitung menggunakan rumus Heron, sedangkan keliling trapesium dihitung dengan asumsi trapesium sama kaki.
Program ini menerapkan konsep abstraction, inheritance, encapsulation, dan polymorphism, sehingga setiap bangun datar dapat menggunakan method yang sama dengan perhitungan sesuai jenisnya.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
<img width="1557" height="928" alt="image" src="https://github.com/user-attachments/assets/b442d15a-0d80-4906-9b2a-f9d8180f5f12" />
<img width="1552" height="152" alt="image" src="https://github.com/user-attachments/assets/2719b870-5a6a-492e-a103-1ff01a7a4054" />



* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1560" height="930" alt="image" src="https://github.com/user-attachments/assets/a852519e-5a44-4691-9624-ac728a80e4f7" />
<img width="1553" height="854" alt="image" src="https://github.com/user-attachments/assets/3e3ad529-b20e-460e-9032-c424c66a4a34" />
<img width="1549" height="706" alt="image" src="https://github.com/user-attachments/assets/43e5b2a9-5780-49d7-b116-55a3d4fe90b0" />


### 2.2. File: `notifikasi.php`
**Penjelasan Kode:**
> Program notifikasi.php digunakan untuk menerapkan konsep OOP dalam sistem pengiriman notifikasi menggunakan PHP. Class abstrak Notifikasi menyimpan tujuan pengiriman dan menyediakan method kirim() yang harus diimplementasikan oleh class turunannya.
Terdapat tiga class turunan, yaitu Email, SMS, dan WhatsApp, yang masing-masing memiliki format pengiriman pesan berbeda. Function kirimSemua() menggunakan perulangan foreach untuk mengirim pesan ke seluruh daftar notifikasi tanpa memeriksa jenis objek satu per satu.
Program ini menerapkan konsep abstraction, inheritance, dan polymorphism, sehingga berbagai jenis notifikasi dapat menggunakan method kirim() yang sama dengan cara kerja masing-masing.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
<img width="1557" height="841" alt="image" src="https://github.com/user-attachments/assets/e4cd220c-9aca-4cc4-b757-61b0d57a3529" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1560" height="926" alt="image" src="https://github.com/user-attachments/assets/2e966a93-80a2-4b39-95ec-cc4a8e92d5ae" />
<img width="1559" height="779" alt="image" src="https://github.com/user-attachments/assets/2603cdc8-09b4-4c54-9fb7-745e361a9b5a" />



### 2.3. File: `main.php`
**Penjelasan Kode:**
> Program main.php berfungsi sebagai program utama untuk menguji perhitungan luas dan keliling berbagai bangun datar menggunakan PHP. Program memanggil file BangunDatar.php, kemudian membuat objek Lingkaran, Persegi, Segitiga, dan Trapesium dalam satu array.
Perulangan foreach digunakan untuk menampilkan informasi setiap bangun datar, sedangkan array_map() dan array_sum() digunakan untuk menghitung total luas seluruh bangun.
Program ini menerapkan konsep polimorfisme, karena setiap objek dapat memanggil method luas() yang sama sesuai dengan perhitungan masing-masing bangun datar.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
<img width="1559" height="649" alt="image" src="https://github.com/user-attachments/assets/d0173d2b-46b2-4f0d-8523-c18c4334b8b2" />



* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1565" height="648" alt="image" src="https://github.com/user-attachments/assets/0309a782-0839-4a8e-837f-663b6a0030df" />



### Output    
**Output Program:**




---

## 3. Kesimpulan
> Pada program AntiPattern.java, perhitungan luas bangun datar masih menggunakan percabangan if-else untuk menentukan jenis objek. Cara ini membuat program perlu diubah setiap kali ada jenis bangun datar baru. Setelah menggunakan konsep polimorfisme melalui class abstrak BangunDatar, setiap bangun datar dapat memiliki implementasi method luas() dan keliling() masing-masing tanpa harus mengubah perulangan utama pada program.
Implementasi menggunakan Java menerapkan konsep abstraksi, inheritance, dan polimorfisme melalui class Lingkaran, Persegi, Segitiga, dan Trapesium. Sementara itu, versi PHP menerapkan konsep serupa dengan memanfaatkan class abstrak, method yang diimplementasikan oleh class turunan, serta pemanggilan method melalui kumpulan objek.
Kedua versi tersebut menunjukkan bahwa satu method dapat digunakan untuk berbagai jenis objek dengan hasil yang menyesuaikan implementasi setiap class.
Secara keseluruhan, latihan ini memberikan pemahaman mengenai perbedaan program yang masih bergantung pada banyak percabangan dengan program yang menerapkan polimorfisme. Dengan memahami konsep-konsep OOP tersebut, program menjadi lebih fleksibel, lebih mudah dirawat, dan lebih praktis untuk dikembangkan ketika terdapat jenis objek baru.
