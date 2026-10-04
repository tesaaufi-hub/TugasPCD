public class EBook extends Koleksi {

    int ukuranFile;

    public EBook(String judul, String pengarang, int tahunTerbit, int ukuranFile) {
        super(judul, pengarang, tahunTerbit);
        this.ukuranFile = ukuranFile;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf(
            "Judul: %-20s | Pengarang: %-15s | Tahun: %d | Ukuran File: %d MB%n",
            judul,
            pengarang,
            tahunTerbit,
            ukuranFile
        );
    }

    @Override
    public void caraPinjam() {
        System.out.println("Ebook bisa didownload di aplikasi atau di web.");
    }
}
