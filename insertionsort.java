public class insertionsort {
    public static void main(String[] args) {
        // Inisialisasi data
        String[] kelas = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "C1", "C2", "C3"};
        int[] poin = {20, 25, 21, 19, 27, 15, 30, 17, 18, 23};

        int n = poin.length;

        // Proses Insertion Sort
        for (int i = 1; i < n; ++i) {
            int keyPoin = poin[i];
            String keyKelas = kelas[i];
            int j = i - 1;

            /* Geser elemen yang lebih besar dari keyPoin ke 
               satu posisi di depan posisi mereka saat ini */
            while (j >= 0 && poin[j] > keyPoin) {
                poin[j + 1] = poin[j];
                kelas[j + 1] = kelas[j];
                j = j - 1;
            }
            
            // Tempatkan key pada posisi yang benar
            poin[j + 1] = keyPoin;
            kelas[j + 1] = keyKelas;
        }

        // Menampilkan hasil
        System.out.println("Hasil Pengurutan dengan Insertion Sort:");
        System.out.println("---------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Kelas " + kelas[i] + " : " + poin[i] + " poin");
        }
    }
}