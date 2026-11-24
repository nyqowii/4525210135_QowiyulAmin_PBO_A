<?php
declare(strict_types=1);

namespace Perpustakaan\Model;

use InvalidArgumentException;

final class Mahasiswa
{
    public function __construct(
        private readonly string $nim,
        private readonly string $nama,
    ) {
        if (trim($nim) === '' || trim($nama) === '') {
            throw new InvalidArgumentException('NIM dan nama mahasiswa tidak boleh kosong');
        }
    }

    public function getNim(): string
    {
        return $this->nim;
    }

    public function getNama(): string
    {
        return $this->nama;
    }

    public function __toString(): string
    {
        return $this->nim . ' ' . $this->nama;
    }
}
