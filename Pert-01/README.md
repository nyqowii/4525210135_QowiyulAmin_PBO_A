# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

| Informasi Praktikan | Keterangan |
| :--- | :--- |
| **Nama** | Qowiyul Amin |
| **NPM** | 4525210135 |
| **Kelas** | A |
| **Mata Kuliah** | Pemrograman Berbasis Objek (PBO) |
| **Pertemuan** | 1 - Paradigma OOP dan Lingkungan Pengembangan |
| **Tanggal** | Khamis, 10 September 2026 |

---

## 1. Implementasi Java

### 1.1. File: HaloObjek.java
*Penjelasan Kode:*
> Program HaloObjek.java merupakan program sederhana untuk memahami konsep dasar Object-Oriented Programming (OOP) dalam Java. Class ini memiliki dua atribut, yaitu nama dan nim, yang menggunakan access modifier private agar data tidak dapat diakses secara langsung dari luar class.
Constructor HaloObjek() digunakan untuk mengisi data nama dan NIM ketika objek dibuat. Kata kunci this digunakan untuk membedakan atribut milik objek dengan parameter constructor. Method sapa() mengembalikan teks sapaan berdasarkan data yang tersimpan pada objek.
Pada method main(), dibuat dua objek, yaitu saya dan temanSekelas, dengan data yang berbeda. Keduanya kemudian menampilkan sapaan masing-masing. Program ini menunjukkan bahwa satu class dapat digunakan untuk membuat beberapa objek yang memiliki data berbeda.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1561" height="934" alt="image" src="https://github.com/user-attachments/assets/e048e67f-bf61-44de-bf8e-29e6aba7f5b0" />
<img width="1557" height="203" alt="image" src="https://github.com/user-attachments/assets/1d32901e-54d8-4431-8fa2-4217beefdcc4" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1558" height="939" alt="image" src="https://github.com/user-attachments/assets/82c760a6-9f81-4f05-9bb0-7fb9d05fe6a9" />
<img width="1547" height="248" alt="image" src="https://github.com/user-attachments/assets/cd0d40cf-f841-4267-b32f-d79f5fadd580" />

### Output
*Output Program:*

<img width="862" height="183" alt="image" src="https://github.com/user-attachments/assets/60700a58-f460-4693-af9a-6d9751de1e42" />


## 2. Implementasi PHP

### 2.1. File: halo_objek.php
*Penjelasan Kode:*
> Program halo_objek.php merupakan program sederhana untuk mempelajari konsep dasar OOP menggunakan PHP. Class HaloObjek memiliki dua properti, yaitu $nama dan $nim, yang menggunakan access modifier private agar hanya dapat diakses secara langsung dari dalam class.
Method __construct() digunakan untuk mengisi nama dan NIM saat objek dibuat. Kata kunci $this digunakan untuk mengakses properti milik objek, sedangkan operator -> digunakan untuk mengakses properti dan method dalam PHP. Method sapa() mengembalikan teks sapaan berdasarkan data yang tersimpan.
Pada bagian akhir, program membuat dua objek, yaitu $saya dan $temanSekelas, kemudian menampilkan sapaan masing-masing. Program ini menunjukkan bahwa satu class dapat digunakan untuk membuat beberapa objek dengan data yang berbeda.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Galat logika):
<img width="1555" height="933" alt="image" src="https://github.com/user-attachments/assets/010729e1-bb91-4e4d-bfae-a3c1c97c9448" />
<img width="1542" height="94" alt="image" src="https://github.com/user-attachments/assets/b0eac49d-d1a8-4d95-bcc9-bb95480e4678" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1561" height="938" alt="image" src="https://github.com/user-attachments/assets/875a47ba-7d73-4ae9-8fe1-5b07ca99cc34" />
<img width="1547" height="127" alt="image" src="https://github.com/user-attachments/assets/1dfb3270-68ef-49f9-952a-d77ee86fd8a5" />


### Output
*Output Program:*

<img width="905" height="189" alt="image" src="https://github.com/user-attachments/assets/48a93780-6c87-4fc1-9278-244f8182863a" />


## 3. Kesimpulan
> Berdasarkan program HaloObjek.java dan halo_objek.php, dapat disimpulkan bahwa konsep dasar Object-Oriented Programming (OOP) dapat diterapkan baik menggunakan Java maupun PHP. Kedua program menggunakan class sebagai cetakan untuk membuat objek, atribut untuk menyimpan nama dan NIM, serta constructor untuk mengisi data saat objek dibuat.
Kedua program juga menerapkan encapsulation melalui access modifier private, sehingga data tidak dapat diakses secara langsung dari luar class. Method sapa() digunakan untuk menampilkan sapaan sesuai data yang dimiliki setiap objek. Walaupun memiliki sintaks yang berbeda, Java menggunakan this dan PHP menggunakan $this dengan operator ->, keduanya memiliki tujuan yang sama, yaitu mengakses data milik objek.
Melalui latihan ini, dapat dipahami bahwa satu class dapat digunakan untuk membuat beberapa objek dengan data yang berbeda, tanpa perlu menulis ulang method untuk setiap objek. Dengan demikian, pemahaman dasar tentang class, object, constructor, encapsulation, dan method menjadi bekal penting untuk mempelajari pemrograman berorientasi objek lebih lanjut.
