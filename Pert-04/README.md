# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

| Informasi Praktikan | Keterangan |
| :--- | :--- |
| **Nama** | Qowiyul Amin |
| **NPM** | 4525210135 |
| **Kelas** | A |
| **Mata Kuliah** | Pemrograman Berbasis Objek (PBO) |
| **Pertemuan** | 4 - Pewarisan (Inheritance) |
| **Tanggal** | Khamis, 24 September 2026 |

---

## 1. Implementasi Java

### 1.1. File: `Dosen.java`
**Penjelasan Kode:**
> Program Dosen.java merupakan turunan dari class PegawaiTetap yang menerapkan konsep inheritance (pewarisan) dan polymorphism dalam Java.
  Class ini memiliki atribut tambahan berupa tunjanganFungsional yang digunakan untuk menambahkan tunjangan pada gaji dosen.
  Constructor Dosen menggunakan super() untuk memanggil constructor dari class induk. Method hitungGaji() ditimpa menggunakan @Override agar perhitungan gaji mencakup gaji dari class induk dan tunjangan fungsional.
  Sementara itu, method jenis() mengembalikan teks "Dosen" sebagai identitas jenis pegawai.


**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1556" height="563" alt="image" src="https://github.com/user-attachments/assets/45eb9eb9-43e1-4a76-a2fd-fb10e45bc43f" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1556" height="563" alt="image" src="https://github.com/user-attachments/assets/e010ac26-a7d4-430b-9ec5-ceb66ab2279a" />


### 1.2. File: `Pegawai.java`
**Penjelasan Kode:**
> Program Pegawai.java merupakan class induk abstrak yang menyimpan data umum pegawai, seperti NIP, nama, dan gaji pokok. Class ini menggunakan atribut protected agar dapat diakses oleh class turunannya serta melakukan validasi untuk mencegah gaji pokok bernilai negatif.
Method hitungGaji() digunakan untuk mengembalikan gaji pokok, sedangkan method abstrak jenis() wajib diimplementasikan oleh class turunannya. 
Selain itu, method getter berfungsi mengambil data pegawai dan toString() digunakan untuk menampilkan informasi pegawai dalam format yang terstruktur.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1559" height="917" alt="image" src="https://github.com/user-attachments/assets/bbd29a1b-15b5-45fa-9629-10b83c523274" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1551" height="926" alt="image" src="https://github.com/user-attachments/assets/62dd56f7-7433-407a-9d7e-5b07543823e1" />

### 1.3. File: PegawaiKontrak.java
*Penjelasan Kode:*
> Program PegawaiKontrak.java merupakan class turunan dari Pegawai yang digunakan untuk menyimpan data pegawai kontrak. Class ini memiliki atribut tambahan bulanKontrak untuk mencatat lama masa kontrak pegawai.
Constructor menggunakan super() untuk mengambil data dasar dari class induk, seperti NIP, nama, dan gaji pokok. Method jenis() mengembalikan keterangan "KONTRAK", sedangkan getBulanKontrak() digunakan untuk memperoleh informasi lama kontrak.
Pegawai kontrak menggunakan perhitungan gaji pokok tanpa tambahan tunjangan masa kerja.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1556" height="498" alt="image" src="https://github.com/user-attachments/assets/bc671a9c-24f3-4309-b252-624128449b76" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1559" height="536" alt="image" src="https://github.com/user-attachments/assets/8b87dfad-907f-47f1-900e-30688da42b7e" />

### 1.4. File: PegawaiTetap.java
*Penjelasan Kode:*
> Program PegawaiTetap.java merupakan class turunan dari Pegawai yang digunakan untuk mengelola data pegawai tetap. Class ini memiliki atribut tambahan masaKerjaTahun untuk menyimpan lama bekerja pegawai.
Constructor menggunakan super() untuk mengambil data dasar dari class induk. Method hitungGaji() menghitung total gaji dengan menambahkan tunjangan masa kerja sebesar 2% per tahun, dengan batas maksimal 40% dari gaji pokok.
Sementara itu, method jenis() mengembalikan keterangan "TETAP" sebagai penanda jenis pegawai.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1564" height="734" alt="image" src="https://github.com/user-attachments/assets/ea018731-5d11-4052-a438-2f39689a36b3" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1564" height="714" alt="image" src="https://github.com/user-attachments/assets/796f0e83-c3c9-423d-9468-17edb6c28329" />


### 1.5. File: `Main.java`
**Penjelasan Kode:**
> Program Main.java digunakan untuk menjalankan dan menguji sistem penggajian pegawai. Program membuat beberapa objek pegawai dengan jenis berbeda, yaitu pegawai tetap, pegawai kontrak, dosen, dan pegawai harian, lalu menyimpan semuanya dalam array bertipe Pegawai.
Setiap data pegawai ditampilkan menggunakan perulangan. Program kemudian menghitung total seluruh gaji melalui method hitungGaji().
Di bagian akhir, terdapat pemeriksaan perhitungan gaji Ani untuk memastikan tunjangan masa kerja sebesar 30% menghasilkan gaji Rp7.800.000,00.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1556" height="649" alt="image" src="https://github.com/user-attachments/assets/136f111d-20ed-40a0-b3dd-5065239ff981" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1566" height="625" alt="image" src="https://github.com/user-attachments/assets/4d153d94-e8e3-4d1f-a2dc-abfbd2016861" />


### Output
**Output Program:**
<img width="923" height="208" alt="image" src="https://github.com/user-attachments/assets/921e1080-04c2-401d-908f-388616348a69" />


---

## 2. Implementasi PHP

### 2.1. File: `Pegawai.php`
**Penjelasan Kode:**
> Program Pegawai.php berisi class untuk mengatur data dan perhitungan gaji beberapa jenis pegawai menggunakan konsep OOP di PHP. Class Pegawai menjadi class induk abstrak yang menyimpan NIP, nama, dan gaji pokok, serta melakukan validasi agar gaji tidak bernilai negatif.
Di dalam file ini juga terdapat class turunan, yaitu PegawaiTetap, PegawaiKontrak, Dosen, dan PegawaiHarian. Masing-masing memiliki jenis dan cara perhitungan gaji yang berbeda.
Program menerapkan konsep inheritance, method overriding, dan encapsulation agar pengelolaan data serta perhitungan gaji lebih terstruktur.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
<img width="1556" height="933" alt="image" src="https://github.com/user-attachments/assets/159718f6-8017-4b8a-b51a-858cb495e4ca" />
<img width="1558" height="698" alt="image" src="https://github.com/user-attachments/assets/728a2056-3ee1-4e30-a56e-5edd1b6e3e0b" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1558" height="933" alt="image" src="https://github.com/user-attachments/assets/97082e86-db69-43cb-877c-a19f95617ae0" />
<img width="1564" height="842" alt="image" src="https://github.com/user-attachments/assets/0864dfb0-57fe-4e00-be2e-986ed56fcdcd" />
<img width="1558" height="798" alt="image" src="https://github.com/user-attachments/assets/b68132d6-7de7-4199-acae-52a44f24cb3d" />


### 2.3. File: `main.php`
**Penjelasan Kode:**
> Program main.php berfungsi sebagai program utama untuk menjalankan sistem penggajian pegawai menggunakan PHP. Program memanggil file Pegawai.php, kemudian membuat beberapa objek pegawai tetap, pegawai kontrak, dosen, dan pegawai harian.
Data pegawai ditampilkan menggunakan perulangan foreach, lalu total seluruh gaji dihitung dengan array_sum() dan array_map().
Program juga menampilkan bagian pemeriksaan perhitungan gaji untuk setiap pegawai agar hasilnya dapat dibandingkan dengan perhitungan yang diharapkan.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
<img width="1559" height="574" alt="image" src="https://github.com/user-attachments/assets/1d4ebd00-59de-4d70-b63b-2277c8e93a6b" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1558" height="686" alt="image" src="https://github.com/user-attachments/assets/4c85ef5e-7147-40f2-9849-6511308a92cb" />


### Output
**Output Program:**
<img width="980" height="377" alt="image" src="https://github.com/user-attachments/assets/e2bbe551-29a8-4fe3-9309-1198ffb73ae1" />


---

## 3. Kesimpulan
> Berdasarkan program yang telah dibuat, dapat disimpulkan bahwa konsep Object-Oriented Programming (OOP) dapat digunakan untuk membangun sistem penggajian pegawai yang terstruktur. Melalui class, object, inheritance, encapsulation, dan polymorphism, setiap jenis pegawai dapat memiliki data serta perhitungan gaji yang berbeda sesuai dengan ketentuannya.
Program ini juga menerapkan validasi data untuk mencegah gaji pokok bernilai negatif, serta menggunakan method hitungGaji() untuk menghitung gaji berdasarkan jenis pegawai.
Dengan menggunakan PHP, pengelolaan data dan perhitungan gaji menjadi lebih terorganisir serta lebih mudah dikembangkan apabila terdapat jenis pegawai atau aturan penggajian baru.
