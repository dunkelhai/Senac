import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.util.CellReference;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class Main {

    private static String caminho = "/Users/Alysson/Downloads/Importações/Importação 1/ArquivoPacientes/"; //Origem da pasta
    private static String arquivo = "pacientesGustavoAtualizado.csv"; //Origem arquivo CSV
    private static Map<Long, String[]> mapPacientes = new HashMap<>(); //Lista Map
    public static List<String> listCpf = new ArrayList<>();
    private static final String TEMPLATE_TELEFONE = "(%s) %s-%s";



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
        CSVReader reader = new CSVReader(new FileReader(caminho + arquivo), ',', '"', 0);
        List<String[]> listaArquivo;
        listaArquivo = new ArrayList<String[]>(reader.readAll());


//for que roda para cada linha do arquivo ate completar a lista
for(String[] linhaArquivo:listaArquivo){

    String id = linhaArquivo[0];

    //filtra para nao trazer os cabecalhos do arquivo
    if (!id.equals("Codigo")){
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

            pac.setCodigo(ajustaQuandoVazio(linha[indexFromExcelColum("A")]));
            System.out.println("Código: " + ajustaQuandoVazio(linha[indexFromExcelColum("A")]));

            pac.setNome(ajustaQuandoVazio(linha[indexFromExcelColum("B")]));
            System.out.println("Nome: " + ajustaQuandoVazio(linha[indexFromExcelColum("B")]));

            pac.setEmail(extraiEmail(linha[2]));
            System.out.println("E-mail: " + extraiEmail(linha[2]));

            pac.setcelular(extraiTelefone(linha[12],"00"));
            System.out.println("Telefone Celular: " + extraiTelefone(linha[12],"00"));

            pac.setCpf(ajustaCpfDuplicado(linha[5]));
            System.out.println("CPF: " + ajustaCpfDuplicado(linha[5]));

            pac.setDataNascimento(ajustaQuandoVazio(linha[4]));
            System.out.println("Data de Nascimento: " + ajustaQuandoVazio(linha[4]));

            pac.setTelefoneResidencial(extraiTelefone(linha[13],"00"));
            System.out.println("Telefone Residencial: " + extraiTelefone(linha[13],"00"));

            pac.setRua(ajustaQuandoVazio(linha[6]));
            System.out.println("Rua:" + ajustaQuandoVazio(linha[6]));

            pac.setBairro(ajustaQuandoVazio(linha[7]));
            System.out.println("Bairro: " + ajustaQuandoVazio(linha[7]));

            pac.setCep(extraiCEP(linha[8]));
            System.out.println("CEP: " + extraiCEP(linha[8]));

            pac.setSexo(ajustaQuandoVazio(linha[3]));
            System.out.println("Sexo: " + ajustaQuandoVazio(linha[3]));

            pac.setIndicacao(ajustaQuandoVazio(linha[14]));
            System.out.println("Indicação: " + ajustaQuandoVazio(linha[14]));

            pac.setCidade(ajustaQuandoVazio(linha[9]));
            System.out.println("Cidade: " + ajustaQuandoVazio(linha[9]));

            pac.setSiglaUf(ajustaSilgaUf(linha[10]));
            System.out.println("Estado: " + ajustaSilgaUf(linha[10]));

            pac.setRg(extraiRg(linha[11]));
            System.out.println("Rg: " + extraiRg(linha[11]));


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


    public static String extrairCpf(String param) {
        if (StringUtils.isEmpty(param)) {
            return null;
        }

        String cpfLimpo = param.replaceAll("\\D", EMPTY); // Tira tudo que não for número.
        if (cpfLimpo.isEmpty()) {
            return null;
        }

        return StringUtils.leftPad(cpfLimpo, 11, '0');
    }

    public static String ajustaCpfDuplicado(String string) {

        String cpf = extrairCpf(string);
        if (!listCpf.contains(cpf)){
            listCpf.add(cpf);
            return cpf;
        }else{
            return null;
        }

    }

    public static String ajustaQuandoVazio(String string) {

        if(!StringUtils.isEmpty(string)){
            return StringUtils.normalizeSpace(string);

        }else{
            return null;
        }

    }

    public static String ajustaSilgaUf(String string) {

        if(!StringUtils.isEmpty(string)){
            switch (string){
                case "SP":
                    return string;
                default:
                    return "SP";
            }

        }else{
            return null;
        }

    }

    public static String ajustaData(String dataNascimentoNova) {

        if(!StringUtils.isEmpty(dataNascimentoNova)){
            String dataFormatoNovo = LocalDate.parse(dataNascimentoNova, DateTimeFormat.forPattern("yyyy-MM-dd")).toString("dd/MM/yyyy");
            return dataFormatoNovo;
        }else{
            return null;
        }

   }

    public static String extraiCEP(String cepAjustado){

        if (StringUtils.isBlank(cepAjustado)){
            return null;
        }

        String cepLimpo = cepAjustado.replaceAll("\\D",EMPTY);

        if (cepLimpo.length()==7){

            return cepLimpo = "0" + cepLimpo;

        }

        return cepAjustado;
    }

    public static String extraiRg(String string) {

        if (StringUtils.isEmpty(string)){
            return null;
        }

        string = string.replace("-",EMPTY);
        string = string.replace(".",EMPTY);

        return StringUtils.abbreviate(string,15);

    }

    public static String format(String format, Object... args){

        return new Formatter().format(format,args).toString();

    }

    public static String extraiTelefone(String telefone, String ddd) {

        if (StringUtils.isEmpty(telefone)){
            return null;
        }

        try{

            String tele = telefone.replaceAll("\\D",EMPTY);

            switch (tele.length()){
                case 8:
                    return format(TEMPLATE_TELEFONE,ddd,tele.substring(0,4),tele.substring(4));
                case 9:
                    return format(TEMPLATE_TELEFONE,ddd,tele.substring(0,5),tele.substring(5));
                case 10:
                    return format(TEMPLATE_TELEFONE,tele.substring(0,2),tele.substring(2,6),tele.substring(6));
                case 11:
                    return format(TEMPLATE_TELEFONE,tele.substring(0,2),tele.substring(2,7),tele.substring(7));
                default:
                    return null;
            }


        }catch (Exception e){
            e.printStackTrace();
            return null;
        }


    }

    public static String extraiEmail(String email) {

        if(StringUtils.isNotEmpty(email) && !email.equals("NULL")){
            return email.toLowerCase();
        }

        return null;
    }

    public static int indexFromExcelColum(String coluna){
        return CellReference.convertColStringToIndex(coluna);

    }




    public static void createFile(String json) throws IOException {
        System.out.println("Aguarde e prepare-se....");
        System.out.println("Escrevendo e ajustando o arquivo...");
        FileWriter writer = new FileWriter(caminho + "importaçãoGustavoNovo.json");
        writer.write(json);
        writer.close();
        System.out.println(">>>>> Prontinho, aproveite o seu Json para importar para uma Clínica :D <<<<<");
        System.out.println(">>>>> Copyright: Alysson CNN® <<<<<");

    }}
