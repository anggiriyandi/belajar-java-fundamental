package aplikasi.pendaftaran;

public class Peserta {
    int umur;
    public static int jumlah;
    private String nama;
    private String alamat;
    protected boolean active;

    public Peserta() {
    }

    public Peserta(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
