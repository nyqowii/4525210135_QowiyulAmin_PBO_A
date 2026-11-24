package id.ac.univpancasila.perpustakaan.exception;

/** Induk seluruh exception pada domain perpustakaan. */
public abstract class PerpustakaanException extends RuntimeException {
    protected PerpustakaanException(String pesan) {
        super(pesan);
    }

    protected PerpustakaanException(String pesan, Throwable penyebab) {
        super(pesan, penyebab);
    }
}
