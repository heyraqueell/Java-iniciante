package logica_de_programacao.outros;

public class Split {
    public static void main(String[] args) {
        //Criação da String
        String s = "potato tomate lemon";

        //Criação do vetor
        String[] vect = s.split(" "); //o argumento de separação é o espaço

        //Output
        System.out.println("Vetor posição 0: " + vect[0]);
        System.out.println("Vetor posição 1: " + vect[1]);
        System.out.println("Vetor posição 2: " + vect[2]);

    }
}
