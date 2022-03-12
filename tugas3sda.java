import java.util.LinkedList;
import java.util.Scanner;

public class tugas3sda {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<>();
        LinkedList <String> no_bp = new LinkedList<>();
        LinkedList <String> alamat = new LinkedList<>();

        Scanner jumlah = new Scanner(System.in);
        Scanner data = new Scanner(System.in);

        int i = 0;

        System.out.println("Selamat datang di Program Data Mahasiswa");
        System.out.println("Silakan masukan jumlah mahasiswa yang akan diinputkan");
        System.out.print("Jumlah mahasiswa: ");
        int input = jumlah.nextInt();
        while(i<input){
            System.out.print("Masukan Nama: ");
            String nama1 = data.nextLine();
            nama.add(nama1);
            System.out.print("Masukan NIM: ");
            String nim = data.nextLine();
            no_bp.add(nim);
            System.out.print("Masukan Alamat: ");
            String lokasi = data.nextLine();
            alamat.add(lokasi);
            System.out.println("");
            i++;
        }
        System.out.println("Data telah tersimpan");
        System.out.println("Daftar Data Sebagai Berikut");
        System.out.println("Daftar Nama: " + nama);
        System.out.println("Daftar NIM: " + no_bp);
        System.out.println("Daftar Alamat: " + alamat);
        System.out.println("1. Pilih Data berdasarkan urutan");
        System.out.println("2. Selesai");
        System.out.print("Masukan pilihan: ");
        int pilih = jumlah.nextInt();
        if(pilih==1){
            System.out.print("Masukan urutan: ");
            int cari = jumlah.nextInt();
            if(cari<=input){
                System.out.println("Nama: "+nama.get(cari-1));
                System.out.println("NIM: "+no_bp.get(cari-1));
                System.out.println("Alamat: "+alamat.get(cari-1));
            }else{
                System.out.println("Nilai tidak sesuai");
            }
        }
    }
}


