import java.util.Scanner;

public class Ex1_NomeEIdade{
    private static Object idade;

    public static void main(String[] args) throws Exception {
    try (var scan = new Scanner(System.in)) {

        String  nome;
        int idade;

        System.out.println("Nome: ");
        nome = scan.next();
    }

        System.out.println("idade: " );
        idade = scan.nextInt();
    }
}
