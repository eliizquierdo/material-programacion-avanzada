package paquete1;


	import java.util.Scanner;

	public class Ahorcado {
	    
	    static final int MAX_LONGITUD = 20;

	    public static void LeerSecreto(StringBuilder secreto, boolean[] aciertos) {
	        Scanner scanner = new Scanner(System.in);
	        do {
	            System.out.print("Introduce la palabra a adivinar: ");
	            secreto.replace(0, secreto.length(), scanner.nextLine());
	            if (secreto.length() > MAX_LONGITUD) {
	                System.out.println("No puede tener más de 20 caracteres");
	            }
	        } while (secreto.length() > MAX_LONGITUD);

	        for (int i = 0; i < MAX_LONGITUD; i++) {
	            aciertos[i] = false;
	        }
	        System.out.print("\033[H\033[2J"); // Clear screen (optional)
	    }

	    public static int NumeroAciertos(boolean[] aciertos) {
	        int num = 0;
	        for (int i = 0; i < MAX_LONGITUD; i++) {
	            if (aciertos[i]) {
	                num++;
	            }
	        }
	        return num;
	    }

	    public static void EscribirSecreto(StringBuilder secreto, boolean[] aciertos) {
	        for (int i = 0; i < secreto.length(); i++) {
	            if (aciertos[i]) {
	                System.out.print(secreto.charAt(i));
	            } else {
	                System.out.print("*");
	            }
	        }
	        System.out.println();
	    }

	    public static boolean ComprobarSecreto(char letra, StringBuilder secreto, boolean[] aciertos) {
	        boolean acierto = false;
	        for (int i = 0; i < secreto.length(); i++) {
	            if (secreto.charAt(i) == letra) {
	                aciertos[i] = true;
	                acierto = true;
	            }
	        }
	        return acierto;
	    }

	    public static void LeerLetra(char[] letra, StringBuilder letras) {
	        Scanner scanner = new Scanner(System.in);
	        do {
	            System.out.print("Introduce una letra: ");
	            letra[0] = scanner.nextLine().charAt(0);
	            if (Character.toString(letra[0]).length() != 1) {
	                System.out.println("¡Una sola letra!");
	            }
	        } while (Character.toString(letra[0]).length() != 1);
	        
	        letras.append(letra[0]).append(" ");
	    }

	    public static void MostrarAhorcado(int fallos) {
	        System.out.println("\nLa horca!!!\n");
	        switch (fallos) {
	            case 0: break;
	            case 1: System.out.println("_________"); break;
	            case 2: System.out.println("|\n|\n|\n|\n|\n_________"); break;
	            case 3: System.out.println("------\n|\n|\n|\n|\n_________"); break;
	            case 4: System.out.println("------\n|   |\n|   o\n|  \n|  \n_________"); break;
	            case 5: System.out.println("------\n|   |\n|   o\n|  /|\n|\n_________"); break;
	            case 6: System.out.println("------\n|   |\n|   o\n|  /|\\\n|\n_________"); break;
	            case 7: System.out.println("------\n|   |\n|   o\n|  /|\\\n|  / \n_________"); break;
	            case 8: System.out.println("------\n|   |\n|   o\n|  /|\\\n|  / \\\n_________"); break;
	        }
	    }

	    public static void main(String[] args) {
	        StringBuilder secreto = new StringBuilder();
	        StringBuilder letras = new StringBuilder();
	        char[] letra = new char[1];
	        boolean[] aciertos = new boolean[MAX_LONGITUD];
	        int num_fallos = 0;

	        LeerSecreto(secreto, aciertos);

	        do {
	            System.out.print("\033[H\033[2J"); // Clear screen (optional)
	            EscribirSecreto(secreto, aciertos);
	            MostrarAhorcado(num_fallos);
	            System.out.println("Letras introducidas: " + letras);
	            LeerLetra(letra, letras);

	            if (!ComprobarSecreto(letra[0], secreto, aciertos)) {
	                num_fallos++;
	            }
	        } while (NumeroAciertos(aciertos) < secreto.length() && num_fallos < 8);

	        System.out.print("\033[H\033[2J"); // Clear screen (optional)
	        EscribirSecreto(secreto, aciertos);
	        MostrarAhorcado(num_fallos);

	        if (num_fallos == 8) {
	            System.out.println("¡Has perdido!");
	        } else {
	            System.out.println("¡Has ganado!");
	        }
	    }
	}
