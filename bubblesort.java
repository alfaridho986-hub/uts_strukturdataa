public class bubblesort {
    public static void main(String[] args) {
        // Inisialisasi data dari tabel
        String[] kelas = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "C1", "C2", "C3"};
        int[] poin = {20, 25, 21, 19, 27, 15, 30, 17, 18, 23};

        int n = poin.length;

        // Proses Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Bandingkan poin ke-j dengan poin ke-j+1
                if (poin[j] > poin[j + 1]) {
                    
                    // Tukar poin
                    int tempPoin = poin[j];
                    poin[j] = poin[j + 1];
                    poin[j + 1] = tempPoin;

                    // Tukar label kelas agar tetap sesuai dengan poinnya
                    String tempKelas = kelas[j];
                    kelas[j] = kelas[j + 1];
                    kelas[j + 1] = tempKelas;
                }
            }
        }

        // Menampilkan hasil pengurutan
        System.out.println("Hasil Pengurutan Poin (Terkecil ke Terbesar):");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Kelas " + kelas[i] + ": " + poin[i] + " poin");
        }
    }
}