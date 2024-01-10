public class TampilPerangkatSekolah {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        Handphone h = new Handphone();

        System.out.println("===LAPTOP===");
        l.SpesifikasiLaptop();
        l.JenisLaptop();
        l.UkuranLaptop();
        l.WarnaLaptop();

        System.out.println("===HANDPHONE===");
        h.SpesifikasiHandphone();
        h.JenisHandphone();
        h.UkuranHandphone();
        h.WarnaHandphone();
    }
    public void SpesifikasiLaptop(){
        String Spesifikasi ="\n-Intel Qore i5, \n-30/50RTX, \n-Resolusi 144Hz, \n-11800H";
        System.out.println("Spesifikasi: " + Spesifikasi);
    }
        public void JenisLaptop(){
        String Jenis ="Laptop Gaming";
        System.out.println("Jenis: " + Jenis);
    }
    public void UkuranLaptop(){
        String Ukuran ="Panjang 30cm, Lebar 30cm, tinggi 30cm";
        System.out.println("Ukuran: " + Ukuran);
    }
    public void WarnaLaptop(){
        String Warna ="Hitam mix Putih";
        System.out.println("Warna: " + Warna);
    }
    public void SpesifikasiHandphone(){
        String Spesifikasi ="\n-12/512, \n-32mp, \n-Processor Snapdragon, \n-Resolusi 4k";
        System.out.println("Spesifikasi: " + Spesifikasi);
    }
    public void JenisHandphone(){
        String Jenis ="Handphone Slim";
        System.out.println("Jenis: " + Jenis);
    }
    public void UkuranHandphone(){
        String Ukuran ="Panjang 15cm, Lebar 5cm, tinggi 1cm";
        System.out.println("Ukuran: " + Ukuran);
    }
    public void WarnaHandphone(){
        String Warna ="Merah Merona";
        System.out.println("Warna: " + Warna);
    }
}
