package logica_de_programacao.outros;

public class Formatacao {
    public static void main(String[] args) {
        //Original
        String original = "abcde FGHIJ ABC abc DEFG    ";
        System.out.println("Original: ." + original + "."); //Pontos para identificação de início e fim

        //Formatações
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 12);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "KKK");
        int i = original.indexOf("EFG");
        int j = original.lastIndexOf("abc");

        //Output
        System.out.println("toLowerCase: ." + s01 + "."); //minúsculo
        System.out.println("toUpperCase: ." + s02 + "."); //maiúsculo
        System.out.println("trim: ." + s03 + "."); //remover espaços
        System.out.println("substring(2): ." + s04 + "."); //recortar a partir da posição do argumento
        System.out.println("substring(2, 6): ." + s05 + "."); //recortar como argumento inicio e fim
        System.out.println("replace char('a'', 'x'): ." + s06 + "."); //substituir char
        System.out.println("replace String(abc, KKK): ." + s07 + "."); //substituir String
        System.out.println("index of(EFG): " + i); //primeira posição
        System.out.println("last Index of(abc): " + j); //última posição

    }
}
