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

    // ANSI Escape Codes untuk Warna Teks
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        // Array warna latar belakang 
        String[] bgColors = {RED_BG, GREEN_BG, YELLOW_BG, BLUE_BG, PURPLE_BG, CYAN_BG};

        // Array warna teks untuk frame 
        String[] textColors = {RED, GREEN, YELLOW, BLUE, PURPLE, CYAN};

        // Memilih warna latar belakang dan warna teks secara acak
        Random random = new Random();
        String randomBg = bgColors[random.nextInt(bgColors.length)];
        String randomTextColor = textColors [random.nextInt(textColors.length)];

        // Menampilkan teks frammed 
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║" + randomTextColor + "🔥 WELLCOME TO FUNFACTS JAVA! 🔥" + RESET + "║" );
        System.out.println("╚════════════════════════════════╝");

        // Menampilkan teks dengan latar belakang acak
        System.out.println(randomBg + "💻 Get ready for an exciting journey with Java! 💻" + RESET);

        // Meminta nama pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.println(randomBg + "Enter your name: " + RESET);
        String name = scanner.nextLine();
        System.out.println(randomBg + "🚀 Hello, " + name + "!!, Are you ready for an interesting surprise? 🚀" + RESET);

        // Meminta persetujuan pengguna untuk menampilkan fakta
        System.out.println(randomBg + "Do you want to see an interesting fun facts about Java? (y/n): " + RESET);
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("y")) {
            // Kata-kata pengantar sebelum menampilkan fakta
            String[] intros = {
                "🤔 Have you ever thought about this...",
                "💡 This fun fact might surprise you!", 
                "🎉 WOW!! Did you know that....",
                "🔎 Let's check out one unique fact about Java!",
                "🌟 Here's a cool fact you might not know!"
            };

            // Fakta menarik tentang java 
            String[] javaFacts = {
                "Java was originally called Oak before it was changed to Java.",
                "Java was first released by Sun Microsystems in 1995.",
                "Java's slogan is ‘Write Once, Run Anywhere’ (WORA).",
                "Java is used by more than 3 billion devices worldwide.",
                "Android uses Java as the main language for development.",
                "Java is named after Java coffee, not just a random name.",
                "Java has a mascot called ‘Duke’.",
                "Oracle Corpuration currently manages Java development after acquiring Sun Microsystems.",
                "Java does not have explicit pointers like C++ to improve security.",
                "The Java Virtual Machine (JVM) allows java to run on various platforms without the need to recompile.",
                "Java is one of the most popular programming languages in the world.",
                "Almost all large companies use java in their backend systems.",
                "Java is widely used in the development of banking applications due to its high security.",
                "Minecraft, one of the most popular games in the world, is made with Java.",
                "Java has a Garbage Collection feature to manage memory automatically.",
                "Java is an object-oriented programming (OOP) language.",
                "Java has very rich standard libraries, such as the Java Collections Framework.",
                "Each version has performance improvements and new features such as Java 8 with Lambda Expressions.",
                "Java has a popular Spring framework for web and enterprise application development.",
                "Many big tech companies such as Google, Amazon, and Facebook use Java in their systems."
            };

            // Memilih kata pengantar dan fakta secara acak
            String introFact = intros[random.nextInt(intros.length)];
            String selectedFact = javaFacts[random.nextInt(javaFacts.length)];

            // Menampilkan fakta dengan efek lebih menarik
            System.out.println("\n" + randomBg + introFact + RESET);
            System.out.println(randomBg + selectedFact + RESET);

        } else {
            // Jika pengguna tidak ingin melihat fakta, tampilkan pesan menarik lainnya
            String[] funMessages = {
                "🎭 It's okay, Java is cool even without the facts!",
                "🚀 Okay, but keep in mind: Java is a great language!",
                "🌟 Maybe next time we can talk about programming in more depth",
                "💻 Okay, but don't forget to keep learning and experimenting!",
                "🔥 No problem, but you know what? You're a great programmer!"
            };

            // Memilih pesan acak untuk ditampilkan 
            String selecMessange = funMessages[random.nextInt(funMessages.length)];
            System.out.println(randomBg + selecMessange + RESET);
        }
        
        // Menampilkan versi Java dengan latar belakang acak
        String javaVersion = System.getProperty("java.version");
        System.out.println(randomBg + "🤖 You are currently using the Java version: " + javaVersion + " 🤖" + RESET);

        // Menutup scanner
        scanner.close();
    }
}