<?php
declare(strict_types=1);

abstract class BangunDatar
{
    public function __construct(private readonly string $nama) {}

    abstract public function luas(): float;
    abstract public function keliling(): float;

    public function getNama(): string { return $this->nama; }

    public function __toString(): string
    {
        return sprintf('%-12s luas=%10.2f  keliling=%10.2f',
            $this->nama, $this->luas(), $this->keliling());
    }
}

class Lingkaran extends BangunDatar
{
    public function __construct(private readonly float $jariJari)
    {
        parent::__construct('Lingkaran');
        // TODO 1: tolak jari-jari <= 0.
    }

    // TODO 2: lengkapi. Gunakan M_PI, bukan 3.14.
    public function luas(): float     { return 0; }
    public function keliling(): float { return 0; }

    public function getJariJari(): float { return $this->jariJari; }
}

class Persegi extends BangunDatar
{
    public function __construct(private readonly float $sisi)
    {
        parent::__construct('Persegi');
        // TODO 1: tolak sisi <= 0.
        if ($sisi <= 0) {
            throw new InvalidArgumentException("Sisi harus > 0: $sisi");
        }
    }

    // TODO 2: lengkapi.
    public function luas(): float     { return 0; }
    public function keliling(): float { return 0; }
}

class Segitiga extends BangunDatar
{
    public function __construct(
        private readonly float $sisiA,
        private readonly float $sisiB,
        private readonly float $sisiC,
    ) {
        parent::__construct('Segitiga');
        // TODO 1: tolak sisi <= 0.
        if ($sisiA <= 0 || $sisiB <= 0 || $sisiC <= 0) {
            throw new InvalidArgumentException("Sisi harus > 0: $sisiA, $sisiB, $sisiC");
        }
        // TODO 2: tolak bila ketiga sisi tidak membentuk segitiga.
        if ($sisiA + $sisiB <= $sisiC || $sisiA + $sisiC <= $sisiB || $sisiB + $sisiC <= $sisiA) {
            throw new InvalidArgumentException("Ketiga sisi tidak membentuk segitiga: $sisiA, $sisiB, $sisiC");
        }
    }

    // TODO 3: lengkapi luas() dan keliling().
    public function luas(): float     { return 0; }
    public function keliling(): float { return 0; }
}
// TODO Langkah 2: buat kelas Segitiga (tiga sisi, rumus Heron).
//                 Tolak konstruksi bila ketiga sisi tidak membentuk segitiga.
// TODO Langkah 4: buat kelas Trapesium.
