<?php
declare(strict_types=1);

namespace Perpustakaan\Model;

use Carbon\CarbonImmutable;
use LogicException;

final class Anggota
{
    private ?Mahasiswa $anggotaPerpustakaan = null;
    private ?CarbonImmutable $anggotaSejak = null;

    public function __construct(
        private readonly Jurusan $jurusan,
        private readonly string $kodeAnggota,
    ) {
    }

    public function daftarkan(Mahasiswa $mahasiswa, CarbonImmutable $sejak): void
    {
        $this->anggotaPerpustakaan = $mahasiswa;
        $this->anggotaSejak = $sejak;
    }

    public function checkMasaKeanggotaan(): string
    {
        if ($this->anggotaSejak === null) {
            throw new LogicException('Anggota belum didaftarkan ke perpustakaan');
        }

        return CarbonImmutable::now()->greaterThan($this->anggotaSejak->addYears(3))
            ? 'Keanggotaan tidak valid (lebih dari 3 tahun)'
            : 'Keanggotaan valid';
    }

    public function getKeanggotaan(): string
    {
        if ($this->anggotaPerpustakaan === null || $this->anggotaSejak === null) {
            throw new LogicException('Anggota belum didaftarkan ke perpustakaan');
        }

        return implode(PHP_EOL, [
            'Nama Anggota: ' . $this->anggotaPerpustakaan->getNama(),
            'Jurusan: ' . $this->jurusan->getNama(),
            'Kode Anggota: ' . $this->kodeAnggota,
            'Anggota Perpustakaan Sejak: ' . $this->anggotaSejak->format('d-m-Y'),
        ]);
    }
}
