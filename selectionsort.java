public class selectionsort {
    public static void main(String[] args) {
        // Inisialisasi data
        String[] kelas = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "C1", "C2", "C3"};
        int[] poin = {20, 25, 21, 19, 27, 15, 30, 17, 18, 23};

        int n = poin.length;

        // Proses Selection Sort
        for (int i = 0; i < n - 1; i++) {
            // Cari indeks dengan nilai poin terkecil di sisa array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (poin[j] < poin[minIndex]) {
                    minIndex = j;
                }
            }

            // Tukar poin terkecil yang ditemukan dengan elemen di posisi i
            int tempPoin = poin[minIndex];
            poin[minIndex] = poin[i];
            poin[i] = tempPoin;

            // Tukar label kelas agar tetap sinkron
            String tempKelas = kelas[minIndex];
            kelas[minIndex] = kelas[i];
            kelas[i] = tempKelas;
        }

        // Menampilkan hasil
        System.out.println("Hasil Pengurutan dengan Selection Sort:");
        System.out.println("---------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Kelas " + kelas[i] + " : " + poin[i] + " poin");
        }
    }
}