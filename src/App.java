public class App {
    public static void main(String[] args) throws Exception {
       int nota1 = 5;
       int nota2 = 8;
       int nota3 = 8;
       int media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("O aluno foi aprovado com uma média de " + media );
        }
        else {
            System.out.println("O aluno não foi aprovado com uma média de " + media);
        }

    }
}
