package www.nabil.tugaslima;

public class Model {
    private String nama;
    private String alamat;
    private String jenkel;

    public Model(String nama, String alamat, String jenkel) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenkel = jenkel;
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

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }
}
