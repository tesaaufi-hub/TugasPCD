public class BukuCetak extends Koleksi {
    int jumlahHalaman;
    
    public BukuCetak(String judul, String pengarang, int tahunTerbit, int jumlahHalaman){
        super(judul,pengarang,tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.printf("Judul: %-20s | Pengarang: %-15s | Tahun: %d%n | Halaman: %d Hal%n", judul, pengarang, tahunTerbit, jumlahHalaman);
    }
    
    @Override
    public void caraPinjam(){
        System.out.println("Buku cetak wajib diambil fisik dimeja administrasi");
    }
}