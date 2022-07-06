package JovemProgramador;

public class ForEach {

    public static void main(String[] args) {

        //Sintaxe opcional e simplificada para percorrer coleções
//        for(Tipo apelido : colecao){
//            <comando1>
//            <comando2>
//        }

        String[] vetor = new String[]{"João", "Maria", "Claudio"};

        for (String item : vetor){
            System.out.println(item);
        }

    }
}
