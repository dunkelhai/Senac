import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;
import org.joda.time.format.DateTimeFormat;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    private static String caminho = "/Users/Alysson/Downloads/Importações/Importação 1 Teste/Planilha Pacientes/"; //Origem da pasta
    private static String arquivo = "pacientes.csv"; //Origem arquivo CSV
    private static Map<Long, String[]> mapPacientes = new HashMap<>(); //Lista Map

    public static void main(String[] args){

    //leitor e lista
        try {
            leitor();
            criaListaPacientes();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void leitor()  throws IOException {
        CSVReader reader = new CSVReader(new FileReader(caminho + arquivo), ';', '"', 0);
        List<String[]> listaArquivo;
        listaArquivo = new ArrayList<String[]>(reader.readAll());


//for que roda para cada linha do arquivo ate completar a lista
for(String[] linhaArquivo:listaArquivo){

    String id = linhaArquivo[0];

    //filtra para nao trazer os cabecalhos do arquivo
    if (!id.equals("COD")){
    mapPacientes.put(Long.valueOf(id), linhaArquivo);
    System.out.println("Adicionando informações à listagem, por favor aguarde ...");

}else{
        System.out.println("Deu ruim!");
    }
}
        }

    public static void criaListaPacientes(){

        System.out.println("----------------------");

        List<Paciente> listaPronta;
        listaPronta = new ArrayList<Paciente>();


        for (Map.Entry<Long, String[]> entry:mapPacientes.entrySet()){

            Paciente pac = new Paciente();
            String[] linha = entry.getValue();

            pac.setCodigo(linha[0]);
            System.out.println("Código: " + linha[0]);

            pac.setNome(linha[1]);
            System.out.println("Nome: " + linha[1]);

            pac.setCpf(linha[4]);
            System.out.println("CPF: " + linha[4]);

            pac.setBairro(linha[8]);
            System.out.println("Bairro: " + linha[8]);

            pac.setRua(linha[7]);
            System.out.println("Endereço:" + linha[7]);

            pac.setCep(linha[9]);
            System.out.println("CEP: " + linha[9]);

            pac.setCidade(linha[12]);
            System.out.println("Cidade: " + linha[12]);

            pac.setSiglaUf(linha[13]);
            System.out.println("Estado: " + linha[13]);

            pac.setComplemento(linha[11]);
            System.out.println("Complemento: " + linha[11]);

            pac.setNumeroRua(linha[10]);
            System.out.println("Número: " + linha[10]);

            pac.setDataNascimento(linha[5]);
            System.out.println("Data de Nascimento: " + linha[5]);

            pac.setEmail(linha[2]);
            System.out.println("E-mail: " + linha[2]);

            pac.setTelefoneComercial(linha[3]);
            System.out.println("Telefone Comercial: " + linha[3]);

            pac.setTelefoneResidencial(linha[6]);
            System.out.println("Telefone Residencial: " + linha[6]);

            listaPronta.add(pac);

    }
        Gson gson = new GsonBuilder().create();

        System.out.println("Convertendo para Json...");
        String json = gson.toJson(listaPronta);


        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println(json);
        try {
            createFile(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /*public static String ajustaData(String dataNascimento) {

        String dataNascimento = "2021-10-10 00:01:00";
        String dataFormatoNovo = LocalDate.parse(dataNascimento, DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").toString("dd/MM/yyyy"));
       return dataFormatoNovo;
       System.out.println(dataFormatoNovo);
    }*/

    public static void createFile(String json) throws IOException {
        System.out.println("Aguarde e prepare-se....");
        System.out.println("Escrevendo e ajustando o arquivo...");
        FileWriter writer = new FileWriter(caminho + "importaçãoteste.json");
        writer.write(json);
        writer.close();
        System.out.println(">>>>> Prontinho, aproveite o seu Json para importar para uma Clínica :D <<<<<");
        System.out.println(">>>>> Copyright: Vitor e Lucas CNN® <<<<<");

    }}
