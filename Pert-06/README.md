# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

| Informasi Praktikan | Keterangan |
| :--- | :--- |
| **Nama** | Qowiyul Amin |
| **NPM** | 4525210135 |
| **Kelas** | A |
| **Mata Kuliah** | Pemrograman Berbasis Objek (PBO) |
| **Pertemuan** | 6 - Abstract Class, Interface, Enum, dan Trait |
| **Tanggal** | Khamis, 8 Oktober 2026 |

---

## 1. Implementasi Java

### 1.1. File: `Fuelable.java`
**Penjelasan Kode:**
> Program Fuelable.java merupakan sebuah interface yang digunakan sebagai kontrak bagi objek yang dapat diisi bahan bakar. Interface ini memiliki tiga method, yaitu isiBahanBakar() untuk mengisi bahan bakar dalam jumlah tertentu, kapasitasTangki() untuk mengetahui kapasitas tangki, dan tipeBahanBakar() untuk mengetahui jenis bahan bakar yang digunakan.        
Interface Fuelable dipisahkan dari interface Movable karena tidak semua objek yang bergerak membutuhkan bahan bakar, seperti sepeda. Sebaliknya, generator membutuhkan bahan bakar tetapi tidak bergerak. Pemisahan ini menerapkan konsep Interface Segregation Principle (ISP), yaitu memisahkan interface sesuai kebutuhan dan fungsi objek.


**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1564" height="345" alt="image" src="https://github.com/user-attachments/assets/a3916c60-b8e7-4255-b953-29f1bf2e5cb9" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1564" height="345" alt="image" src="https://github.com/user-attachments/assets/b7a5a22b-2d21-4dba-922c-b56b576568b1" />


### 1.2. File: `Kendaraan.java`
**Penjelasan Kode:**
> Program Kendaraan.java merupakan class abstrak yang menjadi dasar bagi berbagai jenis kendaraan. Class ini memiliki atribut merek dan tahun untuk menyimpan informasi kendaraan, serta constructor Kendaraan() untuk menginisialisasi data tersebut.
Method umur() digunakan untuk menghitung umur kendaraan berdasarkan tahun sekarang, dengan memastikan hasilnya tidak negatif. Method abstrak jumlahRoda() wajib diimplementasikan oleh class turunannya sesuai jumlah roda kendaraan.
Sementara itu, method toString() digunakan untuk menampilkan merek, tahun, dan jumlah roda kendaraan.
Program ini menerapkan konsep abstraction dan inheritance, sehingga data dan fungsi umum kendaraan dapat digunakan kembali oleh class turunannya.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1565" height="574" alt="image" src="https://github.com/user-attachments/assets/32ff9493-765c-457e-b839-54b529eb5d7a" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1565" height="573" alt="image" src="https://github.com/user-attachments/assets/3ea24495-b650-484d-8f2c-0ca3032924c4" />



### 1.3. File: Mobil.java
*Penjelasan Kode:*
> Program Mobil.java merupakan class turunan dari Kendaraan yang juga mengimplementasikan interface Movable dan Fuelable. Class ini menyimpan informasi kapasitas tangki dan jumlah bahan bakar yang tersedia.
Method bergerak() menampilkan informasi bahwa mobil sedang melaju, sedangkan kecepatanMaksimum() mengembalikan kecepatan maksimum sebesar 180. Method isiBahanBakar() digunakan untuk mengisi bahan bakar dengan validasi agar jumlah pengisian lebih dari nol dan tidak melebihi kapasitas tangki.
Program juga menyediakan informasi kapasitas tangki, jenis bahan bakar, dan jumlah bahan bakar saat ini.
Kode ini menerapkan konsep inheritance dan interface, sehingga class Mobil dapat mewarisi fungsi umum kendaraan sekaligus memenuhi kontrak dari dua interface yang berbeda.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1569" height="764" alt="image" src="https://github.com/user-attachments/assets/612999e3-56e0-40c1-bb25-ff052df35cc7" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1558" height="217" alt="image" src="https://github.com/user-attachments/assets/72c35350-8ace-4266-ab60-8d3c54cd6e7d" />



### 1.4. File: Movable.java
*Penjelasan Kode:*
> Program Movable.java merupakan interface yang digunakan sebagai kontrak bagi objek yang dapat bergerak. Interface ini memiliki method bergerak() untuk menjalankan aksi gerak dan kecepatanMaksimum() untuk mengetahui batas kecepatan maksimum objek.
Selain itu, terdapat method ringkasanGerak() yang menggunakan default method untuk memberikan informasi kecepatan maksimum dalam bentuk teks. Nilai kecepatan diambil melalui method kecepatanMaksimum(), sehingga ringkasan dapat menyesuaikan implementasi dari class yang menggunakan interface ini.
Program ini menerapkan konsep interface untuk menentukan kemampuan suatu objek tanpa harus menjelaskan detail cara objek tersebut bergerak.


*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1567" height="550" alt="image" src="https://github.com/user-attachments/assets/94c57f9c-0648-47f2-8675-4ba8e321646e" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1566" height="498" alt="image" src="https://github.com/user-attachments/assets/cc9237a8-1e44-45e6-bafb-7bb220d6ab74" />


### 1.5. File: TipeBahanBakar.java
*Penjelasan Kode:*
> Program TipeBahanBakar.java membahas penggunaan enum dalam Java untuk menentukan jenis bahan bakar, yaitu bensin, solar, dan listrik. Setiap jenis bahan bakar memiliki nama dan harga per satuan yang berbeda. Program ini juga memiliki method getLabel() untuk menampilkan nama bahan bakar dan biayaPengisian() untuk menghitung total biaya berdasarkan jumlah bahan bakar yang digunakan. Selain itu, method ramahLingkungan() digunakan untuk memeriksa apakah bahan bakar tersebut termasuk listrik.
> Dengan menggunakan enum, pilihan jenis bahan bakar menjadi lebih teratur karena hanya menggunakan nilai yang sudah ditentukan di dalam program.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1564" height="751" alt="image" src="https://github.com/user-attachments/assets/98616564-9a4e-4f02-8d31-e5bd779eda8e" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1562" height="759" alt="image" src="https://github.com/user-attachments/assets/0738902e-9f01-466a-821c-8a0eeb5c83c4" />


### 1.6. File: Sepeda.java
*Penjelasan Kode:*
> Program Sepeda.java membahas penerapan interface dalam Java. Class Sepeda menggunakan implements Movable, yang berarti class tersebut menerapkan method yang sudah ditentukan dalam interface Movable. Method bergerak() digunakan untuk menampilkan pesan bahwa sepeda melaju di jalan raya, sedangkan method kecepatanMaksimum() mengembalikan nilai kecepatan maksimum sebesar 30.
> Dengan menggunakan interface, class Sepeda dapat memiliki perilaku yang sesuai dengan aturan yang telah ditentukan dalam interface tersebut.


*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1563" height="249" alt="image" src="https://github.com/user-attachments/assets/4daf29e3-463a-4f86-8047-bca9f5187adb" />



* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1563" height="249" alt="image" src="https://github.com/user-attachments/assets/5afeb16a-88f6-4676-aaca-5636ffedc991" />


### 1.7. File: `Main.java`
**Penjelasan Kode:**
> Program Main.java digunakan sebagai program utama untuk menggabungkan konsep interface, enum, dan polymorphism dalam Java. Method isiPenuh() menerima parameter bertipe Fuelable untuk mengisi bahan bakar kendaraan sampai penuh dan menghitung total biayanya berdasarkan jenis bahan bakar. Pada method main(), program membuat objek mobil, menampilkan cara kendaraan bergerak, menghitung biaya pengisian bahan bakar, dan menampilkan informasi dari setiap jenis bahan bakar yang tersedia.
> Program ini juga menunjukkan bahwa tidak semua kendaraan bisa digunakan dalam method isiPenuh(), karena kendaraan tersebut harus memenuhi aturan interface Fuelable

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1560" height="932" alt="image" src="https://github.com/user-attachments/assets/7d8163ca-e9d1-4fa5-87cc-9bf72d96a161" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1558" height="882" alt="image" src="https://github.com/user-attachments/assets/043be856-45bb-449c-aaec-33f5c151fdef" />



### Output
**Output Program:**
<img width="1063" height="244" alt="image" src="https://github.com/user-attachments/assets/61bb12fb-6ed6-4e68-8770-4d85c3e362a6" />

---

## 2. Implementasi PHP

### 2.1. File: `Abstraksi.php`
**Penjelasan Kode:**
> File abstraksi.php membahas konsep OOP (Object-Oriented Programming) dalam PHP, seperti interface, enum, trait, abstract class, dan inheritance. Interface Movable dan Fuelable digunakan untuk menentukan kemampuan kendaraan, sedangkan enum TipeBahanBakar mengatur jenis bahan bakar dan perhitungan biayanya. Trait Loggable digunakan untuk mencatat aktivitas agar bisa digunakan oleh beberapa class. Abstract class Kendaraan menjadi dasar bagi class Mobil dan Sepeda, yang memiliki karakteristik serta perilaku berbeda.
> Program ini menunjukkan bagaimana konsep OOP membuat kode lebih terstruktur, dapat digunakan kembali, dan mudah dikembangkan.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
<img width="1567" height="928" alt="image" src="https://github.com/user-attachments/assets/939cbc70-2497-4795-b0b6-f22066eaef95" />
<img width="1557" height="851" alt="image" src="https://github.com/user-attachments/assets/198df465-ff19-4249-adec-2db813c5bed8" />
<img width="1559" height="623" alt="image" src="https://github.com/user-attachments/assets/f66b8a83-52e0-4b6e-8a81-2ae02b929a23" />

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1560" height="927" alt="image" src="https://github.com/user-attachments/assets/8921e983-8a94-46c3-8bfe-08652ccdb9eb" />
<img width="1565" height="849" alt="image" src="https://github.com/user-attachments/assets/e111bb4b-f8dd-494a-acff-5b17ec53ebb3" />
<img width="1554" height="856" alt="image" src="https://github.com/user-attachments/assets/a99bd680-0e63-4a3c-b5a0-b3db244e2e61" />
<img width="1560" height="801" alt="image" src="https://github.com/user-attachments/assets/ef9c594e-decc-476d-8b1f-de11d920120a" />


### 2.2. File: `main.php`
**Penjelasan Kode:**
> Program main.php berfungsi sebagai program utama untuk menjalankan dan menguji konsep OOP dalam PHP, seperti interface, enum, dan trait. Program ini membuat objek mobil dan sepeda, kemudian menampilkan cara bergerak serta kecepatan maksimum masing-masing kendaraan. Method isiPenuh() digunakan untuk mengisi bahan bakar mobil dan menghitung biaya pengisiannya. Program juga menunjukkan bahwa sepeda tidak bisa menggunakan method tersebut karena tidak menerapkan interface Fuelable.
> Selain itu, program menampilkan informasi jenis bahan bakar beserta biayanya dan menggunakan trait Loggable untuk mencatat aktivitas mobil serta pesanan.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
<img width="1562" height="853" alt="image" src="https://github.com/user-attachments/assets/8b9db4f2-7931-43b4-bf05-ccc3eeaac9c7" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1554" height="935" alt="image" src="https://github.com/user-attachments/assets/ef5fc562-e61e-4a2c-b02a-92295948c5f4" />

### Output    
**Output Program:**

<img width="1408" height="383" alt="image" src="https://github.com/user-attachments/assets/2f8c3aa3-f3d8-4539-a4f4-f1ff7e1ce507" />
---

## 3. Kesimpulan
> Berdasarkan latihan pada pertemuan 6, dapat disimpulkan bahwa konsep Object-Oriented Programming (OOP) dapat diterapkan menggunakan abstract class dan interface untuk mengatur struktur serta kemampuan suatu objek. Class Kendaraan digunakan sebagai class abstrak yang menyimpan data umum kendaraan, seperti merek dan tahun, sedangkan interface Movable dan Fuelable berfungsi sebagai kontrak yang menentukan kemampuan objek untuk bergerak dan menggunakan bahan bakar.
Pada class Mobil, diterapkan konsep inheritance dengan mewarisi class Kendaraan, serta mengimplementasikan dua interface sekaligus. Hal ini menunjukkan bahwa Java hanya mengizinkan sebuah class mewarisi satu class induk, tetapi dapat mengimplementasikan beberapa interface. Selain itu, interface Movable menggunakan default method untuk menyediakan implementasi bawaan tanpa harus menuliskannya kembali pada setiap class.     
