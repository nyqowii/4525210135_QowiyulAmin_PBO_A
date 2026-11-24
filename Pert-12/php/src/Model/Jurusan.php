<?php
declare(strict_types=1);

namespace Perpustakaan\Model;

use InvalidArgumentException;

final class Jurusan
{
    /** @var Mahasiswa[] */
    private array $mahasiswa = [];

    public function __construct(
        private readonly string $kode,
        private readonly string $nama,
    ) {
        if (trim($kode) === '' || trim($nama) === '') {
            throw new InvalidArgumentException('Kode dan nama jurusan tidak boleh kosong');
        }
    }

    public function daftarkan(Mahasiswa $mahasiswa): void
    {
        if (!in_array($mahasiswa, $this->mahasiswa, true)) {
            $this->mahasiswa[] = $mahasiswa;
        }
    }

    public function keluarkan(Mahasiswa $mahasiswa): void
    {
        $this->mahasiswa = array_values(array_filter(
            $this->mahasiswa,
            static fn (Mahasiswa $terdaftar): bool => $terdaftar !== $mahasiswa,
        ));
    }

    /** @return Mahasiswa[] */
    public function getMahasiswa(): array
    {
        return $this->mahasiswa;
    }

    public function getNama(): string
    {
        return $this->nama;
    }

    public function __toString(): string
    {
        return sprintf('%s - %s (%d mahasiswa)', $this->kode, $this->nama, count($this->mahasiswa));
    }
}
