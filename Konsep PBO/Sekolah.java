import java.util.Scanner;

public class Sekolah {
    Scanner scan = new Scanner(System.in);
    public void tampilNama(String nama){
        System.out.println("Saya Bersekolah di "+nama);

    }
    public void jumlahsiswa (int rombel, int jumlahsiswa){
        int total=rombel*jumlahsiswa;
        System.out.println("Jumlah Siswa: "+total);
    }
}
