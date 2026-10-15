# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

| Informasi Praktikan | Keterangan |
| :--- | :--- |
| **Nama** | Qowiyul Amin |
| **NPM** | 4525210135 |
| **Kelas** | A |
| **Mata Kuliah** | Pemrograman Berbasis Objek (PBO) |
| **Pertemuan** | 2 - Class, Object and Encapsulation |
| **Tanggal** | Khamis, 10 September 2026 |

---

## 1. Implementasi Java

### 1.1. File: Mahasiswa.java
*Penjelasan Kode:*
> Program Mahasiswa.java menerapkan konsep enkapsulasi dalam Java untuk mengelola data mahasiswa dan nilai akademik. Program menggunakan atribut private untuk membatasi akses data, serta melakukan validasi agar NIM tidak   kosong dan nilai berada pada rentang 0–100.

Nilai akhir dihitung berdasarkan bobot tugas 30%, UTS 30%, dan UAS 40%. Selanjutnya, method hurufMutu() menentukan nilai A sampai E berdasarkan hasil perhitungan. Getter digunakan untuk mengambil data, sedangkan toString() membantu menampilkan informasi mahasiswa dalam format teks.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Kesalahan kompilasi):
<img width="1527" height="931" alt="image" src="https://github.com/user-attachments/assets/b9480b5c-5541-47b4-8c0d-d5bb7206ee6a" />
<img width="1560" height="856" alt="image" src="https://github.com/user-attachments/assets/98ad5cb1-1f63-4265-959d-a0e5e6831b6f" />

* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1560" height="933" alt="image" src="https://github.com/user-attachments/assets/5f6ac41c-bf79-44e4-987d-1e987ef2c15a" />
<img width="1519" height="860" alt="image" src="https://github.com/user-attachments/assets/37b956f2-cd9b-4c4c-9668-baa04bd689c2" />
<img width="1539" height="544" alt="image" src="https://github.com/user-attachments/assets/9fe5fe02-f3db-418a-918b-39a19152816e" />

### 1.2. File: `Main.java`
**Penjelasan Kode:**
> Program Main.java berfungsi sebagai program utama untuk menguji class Mahasiswa. Program membuat beberapa objek mahasiswa dengan data NIM, nama, serta nilai tugas, UTS, dan UAS, kemudian menampilkan rekap nilai setiap mahasiswa menggunakan perulangan for-each.
Selain itu, program menggunakan try-catch untuk menguji validasi data. Nilai di luar rentang 0–100 dan NIM kosong akan ditolak dengan menampilkan pesan kesalahan. Dengan demikian, program ini memastikan aturan validasi pada class Mahasiswa berjalan sesuai ketentuan.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
<img width="1551" height="935" alt="image" src="https://github.com/user-attachments/assets/94e5131e-6421-4e93-af86-99468f5b3c6b" />


* **After** *(Kondisi akhir / Eksekusi berhasil)*:
<img width="1551" height="935" alt="image" src="https://github.com/user-attachments/assets/94e5131e-6421-4e93-af86-99468f5b3c6b" />


### Output
*Output Program:*

<img width="820" height="178" alt="Screenshot 2026-10-10 222814" src="https://github.com/user-attachments/assets/90c8f010-77bc-48cc-addc-90e66031a016" />

## 2. Implementasi PHP

### 2.1. File: Mahasiswa.php
*Penjelasan Kode:*
> File Mahasiswa.php berisi implementasi pengelolaan data mahasiswa menggunakan bahasa PHP. Di dalamnya terdapat proses pemeriksaan NIM dan nilai agar data yang disimpan sesuai dengan aturan yang berlaku.
Program menghitung nilai akhir berdasarkan persentase tugas, UTS, dan UAS, lalu menentukan huruf mutu dari hasil perhitungan tersebut. Konsep enkapsulasi diterapkan untuk menjaga data, sedangkan fungsi atau method digunakan agar proses pengolahan nilai lebih terstruktur dan mudah dipahami.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Galat logika):
<img width="1546" height="930" alt="image" src="https://github.com/user-attachments/assets/7658cf06-5153-4f42-8e5b-432160b94e6c" />
<img width="1532" height="477" alt="image" src="https://github.com/user-attachments/assets/dd454e18-2879-4cb7-a356-529b1dfaa611" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1561" height="938" alt="image" src="https://github.com/user-attachments/assets/f2dc5297-9a86-4970-92c0-b754ded84fbd" />
<img width="1561" height="595" alt="image" src="https://github.com/user-attachments/assets/69e5d94f-756e-4c16-a4f9-03e1210f9802" />



### 2.2. File: main.php
*Penjelasan Kode:*
> Program main.php berperan sebagai bagian utama untuk menjalankan dan menguji class Mahasiswa. Program membuat beberapa objek mahasiswa, kemudian menampilkan informasi nilai akhir dan huruf mutu masing-masing.
Selain menampilkan data, program juga menguji validasi dengan memasukkan nilai yang melebihi batas serta NIM kosong. Jika data tidak memenuhi ketentuan, program akan menangani kesalahan dan menampilkan pesan penolakan. Dengan pengujian ini, fungsi validasi pada Mahasiswa.php dapat diperiksa.

*Bukti Eksekusi (Screenshot):*
* *Before* (Kondisi awal / Galat logika):
<img width="1537" height="799" alt="image" src="https://github.com/user-attachments/assets/5e91d365-05ee-4f7d-8e03-50eea6cbb7fb" />


* *After* (Kondisi akhir / Eksekusi berhasil):
<img width="1537" height="799" alt="image" src="https://github.com/user-attachments/assets/caf57d98-beae-43fb-b8c2-5bf798c7d0d9" />


### Output
*Output Program:*

<img width="840" height="180" alt="image" src="https://github.com/user-attachments/assets/0703eaa4-7ab0-4a60-8bd6-39ac8173fc3a" />



## 3. Kesimpulan
> Berdasarkan kode program tersebut, class Mahasiswa menerapkan konsep enkapsulasi dengan membatasi akses langsung ke atribut serta melakukan validasi sebelum data disimpan. Program juga menggunakan konstanta untuk          mengatur bobot nilai, method untuk menghitung nilai akhir, dan percabangan untuk menentukan huruf mutu.
  Melalui program ini, saya memahami bahwa enkapsulasi tidak hanya berkaitan dengan penggunaan atribut private, tetapi juga dengan menjaga agar data tetap memenuhi aturan yang sudah ditentukan selama program digunakan.
