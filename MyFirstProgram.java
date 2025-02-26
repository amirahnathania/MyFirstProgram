import java.util.Scanner;
import java.util.Random;

public class MyFirstProgram {
    // ANSI Escape Codes untuk Latar Belakang
    public static final String RESET = "\u001B[0m";  // Reset ke default
    public static final String RED_BG = "\u001B[41m";
    public static final String GREEN_BG = "\u001B[42m";
    public static final String YELLOW_BG = "\u001B[43m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
    public static final String CYAN_BG = "\u001B[46m";

    public static void main(String[] args) {
        // Array warna latar belakang 
        String[] bgColors = {RED_BG, GREEN_BG, YELLOW_BG, BLUE_BG, PURPLE_BG, CYAN_BG};

        // Memilih warna latar belakang secara acak
        Random random = new Random();
        String randomBg = bgColors[random.nextInt(bgColors.length)];

        // Menampilkan teks dengan latar belakang acak
        System.out.println(randomBg + "🔥 Selamat datang didunia java 🔥" + RESET);
        System.out.println(randomBg + "💻 Bersiaplah untuk petualangan seru dan menarik bersama java 💻" + RESET);

        // Meminta nama pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.println(randomBg + "Masukkan nama kamu: " + RESET);
        String nama = scanner.nextLine();
        System.out.println(randomBg + "🚀 Hallo, " + nama + "!!, Apakah kamu siap untuk kejutan menarik? 🚀" + RESET);

        // Meminta persetujuan pengguna untuk menampilkan fakta
        System.out.println(randomBg + "Apakah kamu ingin melihat fakta menarik tentang java? (y/n)" + RESET);
        String jawaban = scanner.nextLine().trim().toLowerCase();

        if (jawaban.equals("y")) {
            // Kata-kata pengantar sebelum menampilkan fakta
            String[] kataPengantar = {
                "🤔 Pernahkah kamu berfikir...",
                "💡 Fakta menarik ini mungkin akan mengejutkanmu!", 
                "🎉 WOW!! Tahukah kamu bahwa....",
                "🔎 Mari kita lihat satu fakta unik tentang java",
                "🌟 Ini dia fakta keren yang mungkin belum kamu tahu!"
            };

            // Fakta menarik tentang java 
            String[] faktaJava = {
                "Java awalnya bernama Oak sebelum diubah menjadi Java.",
                "Java pertama kali dirilis oleh Sun Microsystems pada tahun 1995.",
                "Slogan Java adalah 'Write Once, Run Anywhere' (WORA).",
                "Java digunakan oleh lebih dari 3 miliar perangkat diseluruh dunia.",
                "Android menggunakan Java sebagai bahasa utama dalam pengembangan.",
                "Java diambil dari nama kopi Java, bukan hanya sekedar nama acak.",
                "Java memiliki maskot bernama 'Duke'.",
                "Oracle Corpuration saat ini mengelola pengembangan Java setelah mengakuisisi Sun Microsystems.",
                "Java tidak memiliki pointer eksplisit seperti C++ untuk meningkatkan keamanan.",
                "Java Virtual Machine (JVM) membuat java bisa berjalan diberbagai platform tanpa perlu dikompilasi ulang.",
                "Java adalah salah satu bahasa pemrograman yang paling populer di dunia.",
                "Hampir semua perusahaan besar menggunakan java dalam sistem backend mereka.",
                "Java banyak digunakan dalam pengembangan aplikasi perbankan karena keamanannya yang tinggi.",
                "Minecraft, salah satu game terpopuler di dunia, dibuat dengan Java",
                "Java memiliki fitur Garbage Collection untuk mengelola memori secara otomatis.",
                "Java adalah bahasa pemrograman berorientasi objek (OOP).",
                "Java memiliki pustaka standar yang sangat kaya, seperti Java Collections Framework.",
                "Setiap versi memiliki peningkatan performa dan fitur baru misalnya Java 8 dengan Lambda Expressions.",
                "Java memiliki framework Spring yang populer untuk pengembangan aplikasi web dan enterprise.",
                "banyak perusahaan teknologi besar seperti Google, Amazon, dan Facebook menggunakan Java dalam sistem mereka."
            };

            // Memilih kata pengantar dan fakta secara acak
            String introFakta = kataPengantar[random.nextInt(kataPengantar.length)];
            String faktaTerpilih = faktaJava[random.nextInt(faktaJava.length)];

            // Menampilkan fakta dengan efek lebih menarik
            System.out.println("\n" + randomBg + introFakta + RESET);
            System.out.println(randomBg + faktaTerpilih + RESET);

        } else {
            // Jika pengguna tidak ingin melihat fakta, tampilkan pesan menarik lainnya
            String[] pesanMenarik = {
                "🎭 Tidak apa-apa, Java tetap keren meskipun tanpa fakta!",
                "🚀 Baiklah, tapi tetap ingat: Java adalah bahasa yang luar biasa!",
                "🌟 Mungkin lain kali kita bisa membahas tentang pemrograman lebih dalam",
                "💻 Oke, tapi jangan lupa untuk terus belajar dan bereksperimen!",
                "🔥 Tidak masalah, tapi tahukah kamu? Kamu adalah programmer yang hebat!"
            };

            // Memilih pesan acak untuk ditampilkan 
            String pesanTerpilih = pesanMenarik[random.nextInt(pesanMenarik.length)];
            System.out.println(randomBg + "\n" + pesanTerpilih + RESET);
        }
        
        // Menampilkan versi Java dengan latar belakang acak
        String versiJava = System.getProperty("java.version");
        System.out.println(randomBg + "⚙️ Anda saat ini menggunakan Java versi: " + versiJava + " ⚙️" + RESET);

        // Menutup scanner
        scanner.close();
    }
}