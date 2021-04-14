
package set.and.get; //package pengisian data

public class data { // class data
    
    //deklarasi variabel private
    private String nama;
    private String jenis;
    private char kelas;
    private int jumlah;
    private int harga;
    
    // method setter untuk parameter
    public void setNamaJenis(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    public void setKelas(char kelas) {
        this.kelas = kelas;
    }
    public void setJumlahHarga(int jumlah, int harga) {
        this.jumlah = jumlah;
        this.harga = harga;
    }
    // method getter untuk menampilkan data
    public String getNama(){
        return this.nama;
    }
    public String getJenis(){
        return this.jenis;
    }
    public char getKelas(){
        return this.kelas;
    }
    public int getJumlah(){
        return this.jumlah;
    }
    public int getHarga(){
        return this.harga;
    }
}
