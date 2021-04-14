
package set.and.get; //package pengisian data

public class input { // class input
    
    data io = new data(); // object untuk mengambil data dari class data
    
    // method-method setiap data
    public void bayam(){
        
        //pengisian parameter method setter
        io.setNamaJenis("Bayam","Sayur");
        io.setKelas('A');
        io.setJumlahHarga(20, 32000);
        
        //menampilkan output dari method getter
        System.out.println("Nama\t: "+io.getNama());
        System.out.println("Jenis\t: "+io.getJenis());
        System.out.println("Kelas\t: "+io.getKelas());
        System.out.println("Jumlah\t: "+io.getJumlah()+" Kg");
        System.out.println("Harga\t: "+io.getHarga()+"/Kg");
        System.out.println("\n=================\n");
    }
    public void kangkung(){
        
        io.setNamaJenis("Kangkung","Sayur");
        io.setKelas('C');
        io.setJumlahHarga(15, 27000);
        
        System.out.println("Nama\t: "+io.getNama());
        System.out.println("Jenis\t: "+io.getJenis());
        System.out.println("Kelas\t: "+io.getKelas());
        System.out.println("Jumlah\t: "+io.getJumlah()+" Kg");
        System.out.println("Harga\t: "+io.getHarga()+"/Kg");
        System.out.println("\n=================\n");
    }
    public void apel(){
        
        io.setNamaJenis("Apel","Buah");
        io.setKelas('A');
        io.setJumlahHarga(23, 60000);
        
        System.out.println("Nama\t: "+io.getNama());
        System.out.println("Jenis\t: "+io.getJenis());
        System.out.println("Kelas\t: "+io.getKelas());
        System.out.println("Jumlah\t: "+io.getJumlah()+" Kg");
        System.out.println("Harga\t: "+io.getHarga()+"/Kg");
        System.out.println("\n=================\n");
    }
    public void kubis(){
        
        io.setNamaJenis("Kubis","Sayur");
        io.setKelas('A');
        io.setJumlahHarga(9, 28000);
        
        System.out.println("Nama\t: "+io.getNama());
        System.out.println("Jenis\t: "+io.getJenis());
        System.out.println("Kelas\t: "+io.getKelas());
        System.out.println("Jumlah\t: "+io.getJumlah()+" Kg");
        System.out.println("Harga\t: "+io.getHarga()+"/Kg");
        System.out.println("\n=================\n");
    }
    public void wortel(){
        
        io.setNamaJenis("Wortel","Sayur");
        io.setKelas('B');
        io.setJumlahHarga(50, 15000);
        
        System.out.println("Nama\t: "+io.getNama());
        System.out.println("Jenis\t: "+io.getJenis());
        System.out.println("Kelas\t: "+io.getKelas());
        System.out.println("Jumlah\t: "+io.getJumlah()+" Kg");
        System.out.println("Harga\t: "+io.getHarga()+"/Kg");
        System.out.println("\n=================\n");
    }
    public void pisang(){
        
        io.setNamaJenis("Pisang","Buah");
        io.setKelas('B');
        io.setJumlahHarga(12, 16500);
        
        System.out.println("Nama\t: "+io.getNama());
        System.out.println("Jenis\t: "+io.getJenis());
        System.out.println("Kelas\t: "+io.getKelas());
        System.out.println("Jumlah\t: "+io.getJumlah()+" Kg");
        System.out.println("Harga\t: "+io.getHarga()+"/Kg");
        System.out.println("\n=================\n");
    }
}
