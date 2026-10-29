<?php
declare(strict_types=1);

/**
 * Sesi 7 — komposisi dan agregasi (PHP).
 * Bandingkan dengan versi Java.
 */

final class Bab
{
    /**
     * Bab dibuat oleh Buku; PHP tidak menyediakan nested class atau friend class.
     */
    public function __construct(
        public readonly int $nomor,
        public readonly string $judul,
    ) {
        if ($nomor <= 0 || trim($judul) === '') {
            throw new InvalidArgumentException('Nomor bab harus positif dan judul tidak boleh kosong');
        }
    }

    public function __toString(): string
    {
        return 'Bab ' . $this->nomor . ': ' . $this->judul;
    }
}

final class Buku
{
    /** @var Bab[] */
    private array $bab = [];

    public function __construct(
        private readonly string $nomorInduk,
        private readonly string $judul,
        private readonly string $penulis,
        private int $jumlahEksemplar,
    ) {
        if ($jumlahEksemplar < 0) {
            throw new InvalidArgumentException('Jumlah eksemplar tidak boleh negatif');
        }
    }

    /** Membuat Bab dari nilai-nilainya agar kepemilikan tetap pada Buku. */
    public function tambahBab(int $nomor, string $judulBab): void
    {
        $this->bab[] = new Bab($nomor, $judulBab);
    }

    /**
     * PHP mengembalikan array secara by-value, sehingga pemanggil hanya
     * memperoleh salinan larik-nya. Namun objek DI DALAMNYA tetap berbagi
     * referensi — itulah sebabnya Bab dibuat readonly.
     * Tuliskan penjelasan ini di bukti-relasi.md.
     *
     * @return Bab[]
     */
    public function getBab(): array { return $this->bab; }

    public function tersedia(): bool { return $this->jumlahEksemplar > 0; }

    /** Mengurangi stok satu eksemplar jika tersedia. */
    public function kurangiStok(): void
    {
        if (!$this->tersedia()) {
            throw new LogicException('Stok buku sudah habis');
        }
        $this->jumlahEksemplar--;
    }

    public function tambahStok(): void { $this->jumlahEksemplar++; }

    public function getNomorInduk(): string { return $this->nomorInduk; }
    public function getJudul(): string { return $this->judul; }

    public function __toString(): string
    {
        return sprintf('%-32s %-16s [%d eks, %d bab]',
            $this->judul, $this->penulis, $this->jumlahEksemplar, count($this->bab));
    }
}

final class Mahasiswa
{
    public function __construct(
        private readonly string $nim,
        private readonly string $nama,
    ) {}

    public function getNim(): string { return $this->nim; }
    public function __toString(): string { return $this->nim . ' ' . $this->nama; }
}

final class Jurusan
{
    /** @var Mahasiswa[] */
    private array $mahasiswa = [];

    public function __construct(
        private readonly string $kode,
        private readonly string $nama,
    ) {}

    /** Menerima objek dari luar dan mencegah pendaftaran ganda. */
    public function daftarkan(Mahasiswa $m): void
    {
        if (!in_array($m, $this->mahasiswa, true)) {
            $this->mahasiswa[] = $m;
        }
    }

    /** Melepaskan referensi tanpa mengubah siklus hidup objek mahasiswa. */
    public function keluarkan(Mahasiswa $m): void
    {
        $this->mahasiswa = array_values(array_filter(
            $this->mahasiswa,
            static fn (Mahasiswa $terdaftar): bool => $terdaftar !== $m,
        ));
    }

    /** @return Mahasiswa[] */
    public function getMahasiswa(): array { return $this->mahasiswa; }

    public function __toString(): string
    {
        return sprintf('%s - %s (%d mahasiswa)', $this->kode, $this->nama, count($this->mahasiswa));
    }
}
