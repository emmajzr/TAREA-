import java.util.Scanner;
public class InformacionArtista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String art;

        System.out.println("Dime tu artista fav <3:");
        System.out.println("Opciones: Cristiano Ronaldo (cr7), kylian mbappe (mbappe), stephen curry (curry), kim ji-soo (jisoo), slash");
        art = scanner.nextLine().trim();
        scanner.close();
        switch (art) {
            case "cristiano ronaldo":
            case "cr7":
                System.out.println("Cristiano Ronaldo, conocido como CR7, es un futbolista portugués que juega como delantero en el Al Nassr FC. Es considerado el mejor jugador de fútbol de todos los tiempos.");
                break;
            case "mbappe":
                System.out.println("Kylian Mbappe es un futbolista francés que juega como delantero en el Paris Saint-Germain y en la selección nacional de Francia. Es conocido por su velocidad y habilidades excepcionales en el campo.");
                break;
            case "curry":
                System.out.println("Stephen Curry es un jugador de baloncesto estadounidense que juega como base en los Golden State Warriors de la NBA. Es ampliamente considerado como uno de los mejores tiradores de la historia del baloncesto.");
                break;
            case "jisoo":
                System.out.println("Kim Ji-soo (mi novia), conocida como Jisoo, es una cantante y actriz surcoreana, miembro del grupo de K-pop BLACKPINK. Ha ganado reconocimiento tanto en la música como en la actuación.");
                break;
            case "slash":
                System.out.println("Slash, cuyo nombre real es Saul Hudson, es un guitarrista británico-estadounidense, conocido por ser el guitarrista principal de la banda de rock Guns N' Roses. Es famoso por su estilo distintivo y solos de guitarra.");
                break;
            default:
                System.out.println("Srry ese artista no lo topo ;(");
                break;
        }
    }
}
