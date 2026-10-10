# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

| Informasi Praktikan | Keterangan |
| :--- | :--- |
| **Nama** | Qowiyul Amin |
| **NPM** | 4525210135 |
| **Kelas** | A |
| **Mata Kuliah** | Pemrograman Berbasis Objek (PBO) |
| **Pertemuan** | 3 - Class, Object and Encapsulation |
| **Tanggal** | Khamis. 17 September 2026 |

---

## 1. Implementasi Java

### 1.1. File: `RekeningBank.java`
**Penjelasan Kode:**
> Program RekeningBank.java digunakan untuk mengelola rekening bank dengan menerapkan konsep constructor, konstanta, dan anggota statis. Program menyediakan fitur setoran, penarikan, pemotongan biaya administrasi, serta perhitungan bunga tahunan.
Setiap transaksi memiliki validasi untuk menjaga saldo agar tidak negatif dan memastikan jumlah setoran maupun penarikan sesuai ketentuan. Selain itu, penggunaan static memungkinkan program menghitung jumlah rekening yang dibuat tanpa bergantung pada satu objek tertentu.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1566" height="929" alt="image" src="https://github.com/user-attachments/assets/304ff26e-9891-4777-86ea-5f4248f7d2fb" />
<img width="1557" height="815" alt="image" src="https://github.com/user-attachments/assets/e1de6c0d-0eea-47e7-91c1-0d34f5edd008" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1556" height="931" alt="image" src="https://github.com/user-attachments/assets/8af5df52-6e9e-46df-87d2-6df7b32c3c92" />
<img width="1545" height="773" alt="image" src="https://github.com/user-attachments/assets/53730f9a-7f0a-4c5f-993f-e4baa8239066" />


### 1.3. File: `Main.java`
**Penjelasan Kode:**
> Program Main.java digunakan untuk menguji fitur yang terdapat pada class RekeningBank. Program membuat tiga rekening dengan data pemilik dan saldo yang berbeda, kemudian menampilkan informasi setiap rekening serta jumlah rekening yang telah dibuat.
Selanjutnya, program mencoba melakukan setoran, menguji penarikan yang melebihi batas, memotong biaya administrasi, dan menghitung bunga tahunan dari saldo rekening Ani. Hasil pengujian ini menunjukkan bagaimana fitur rekening bank bekerja sesuai aturan yang telah ditentukan.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1564" height="814" alt="image" src="https://github.com/user-attachments/assets/3c4fea98-fd84-4e14-abcc-f51acb35c919" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1564" height="814" alt="image" src="https://github.com/user-attachments/assets/03346a8a-9809-4686-afd9-09d5928974c5" />


### Output
**Output Program:**
<img width="903" height="231" alt="image" src="https://github.com/user-attachments/assets/4fdb1c2f-4856-4b16-805d-d2925fbeee36" />



## 2. Implementasi PHP

### 2.1. File: `RekeningBank.php`
**Penjelasan Kode:**
> Program RekeningBank.php digunakan untuk merepresentasikan rekening bank dengan fitur pengelolaan saldo. Di dalamnya terdapat proses setoran, penarikan uang, pemotongan biaya administrasi, serta perhitungan bunga tahunan.
Program juga menerapkan validasi transaksi agar saldo tidak negatif, nomor rekening tetap, dan jumlah uang yang diproses sesuai ketentuan. Selain itu, penggunaan properti dan method statis membantu menyimpan konstanta serta menghitung jumlah rekening yang telah dibuat.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
<img width="1558" height="931" alt="image" src="https://github.com/user-attachments/assets/518497db-a5f2-4bd6-b905-ec8054eb5001" />
<img width="1564" height="616" alt="image" src="https://github.com/user-attachments/assets/029bac4f-e245-4189-860a-54f7ee24acc4" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1564" height="932" alt="image" src="https://github.com/user-attachments/assets/f03955f1-8d59-4846-baca-041431698d98" />
<img width="1558" height="856" alt="image" src="https://github.com/user-attachments/assets/04221596-61cf-4c8d-93d7-aa74310dbf97" />
<img width="1554" height="311" alt="image" src="https://github.com/user-attachments/assets/a7e93940-7e1c-4842-a224-9f8e6acf23bb" />


### 2.3. File: `main.php`
**Penjelasan Kode:**
> Program main.php berfungsi untuk menjalankan dan menguji fitur-fitur pada class RekeningBank.php. Program membuat beberapa objek rekening, menampilkan data saldo, serta mencoba operasi setoran dan penarikan.
Selain itu, program menguji penolakan penarikan yang melebihi batas, pemotongan biaya administrasi, dan perhitungan bunga tahunan. Melalui pengujian ini, fungsi-fungsi pada class rekening bank dapat diperiksa untuk memastikan berjalan sesuai aturan yang ditetapkan.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
<img width="1559" height="695" alt="image" src="https://github.com/user-attachments/assets/3ba8b822-e116-42ea-8bb3-ba6fc480cdde" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1559" height="695" alt="image" src="https://github.com/user-attachments/assets/7c8024cd-4a52-48a4-b578-b220e7aab20b" />


### Output
**Output Program:**
<img width="867" height="239" alt="image" src="https://github.com/user-attachments/assets/f498af5c-8b08-4303-8d7e-e4459bbdf445" />


## 3. Kesimpulan
> Berdasarkan praktikum yang telah dilakukan, saya memahami penerapan konsep Pemrograman Berorientasi Objek dalam pembuatan program rekening bank menggunakan bahasa Java dan PHP. Program ini memanfaatkan constructor untuk menginisialisasi data rekening, konstanta untuk menyimpan nilai tetap, serta method statis untuk menghitung jumlah rekening dan bunga tahunan.
Selain itu, program memiliki fitur setoran, penarikan uang, dan pemotongan biaya administrasi yang dilengkapi dengan validasi agar transaksi berjalan sesuai aturan. Melalui praktikum ini, saya belajar bahwa validasi sangat penting untuk mencegah kesalahan, seperti penarikan melebihi saldo atau batas yang ditentukan. Saya juga memahami bahwa penggunaan class dan method dapat membuat kode lebih terstruktur, mudah dipahami, dan lebih mudah dikembangkan.
Secara keseluruhan, praktikum ini menambah pemahaman saya mengenai pengelolaan data rekening serta penggunaan constructor, konstanta, dan anggota statis dalam Pemrograman Berorientasi Objek.
