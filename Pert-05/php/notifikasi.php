<?php
declare(strict_types=1);

/**
 * Langkah 6 — latihan mandiri.
 *
 * Buat hierarki Notifikasi dengan tiga turunan: Email, SMS, WhatsApp.
 * Lalu lengkapi kirimSemua() TANPA satu pun pemeriksaan tipe.
 */

// TODO 1: buat kelas abstrak Notifikasi dengan:
//         - properti readonly $tujuan
//         - method abstract kirim(string $pesan): void
//         - method saluran(): string yang menyebut nama salurannya
class Notifikasi
{
    public function __construct(protected readonly string $tujuan) {}

    abstract public function kirim(string $pesan): void;

    public function saluran(): string
    {
        return static::class;
    }
}


// TODO 2: buat tiga turunan: Email, SMS, WhatsApp.
//         Masing-masing mencetak format pesan yang berbeda.
class Email extends Notifikasi
{
    public function kirim(string $pesan): void
    {
        printf("Kirim email ke %s: %s%s", $this->tujuan, $pesan, PHP_EOL);
    }
}

class SMS extends Notifikasi
{
    public function kirim(string $pesan): void
    {
        printf("Kirim SMS ke %s: %s%s", $this->tujuan, $pesan, PHP_EOL);
    }
}

class WhatsApp extends Notifikasi
{
    public function kirim(string $pesan): void
    {
        printf("Kirim WhatsApp ke %s: %s%s", $this->tujuan, $pesan, PHP_EOL);
    }
}


/**
 * TODO 3: kirim pesan ke seluruh notifikasi dalam daftar.
 *
 * ATURAN: tidak boleh ada instanceof, tidak boleh ada match/switch
 *         atas jenis notifikasi. Kalau Anda merasa membutuhkannya,
 *         berarti hierarki Anda belum benar.
 *
 * @param Notifikasi[] $daftar
 */
function kirimSemua(array $daftar, string $pesan): void
{
    // TODO 3
}

// Uji setelah TODO 1-3 selesai:
// kirimSemua([
//     new Email('ani@univpancasila.ac.id'),
//     new SMS('081234567890'),
//     new WhatsApp('081234567890'),
// ], 'Buku yang Anda pesan sudah tersedia.');
