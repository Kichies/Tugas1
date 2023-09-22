public class Main {
  public static void main(String[] args) {
    String nama = "M.Fathurrohman Al-Hanif";
int nim = 1237050083;
int tgs = 60;
int uts = 70;
int uas = 80;
int pstgs = tgs * 30 / 100;
int psuts = uts * 30 / 100;
int psuas = uas * 40 / 100;
int na = pstgs + psuts + psuas; 


    System.out.println("=== DATA NILAI MAHASISWA ===");
    System.out.println("NAMA        : " + nama);
     System.out.println("NIM         : " + nim);
      System.out.println("Nilai Tugas : " + tgs);
       System.out.println("Nilai UTS   : " + uts);
        System.out.println("Nilai UAS   : " + uas);
         System.out.println("Nilai Akhir : " + na);
    
  }
}