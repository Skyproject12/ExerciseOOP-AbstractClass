package abstrack;

public  abstract class tampung {
    private String nama;
    
    public abstract void mData(String nama);

    public tampung(String nama) {
        this.nama = nama;
    }

    public tampung() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
