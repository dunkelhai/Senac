import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Pacientes {
    String Nome;
    Integer Idade;
    String Cidade;
    String Sexo;

    public String getNome() {

        return Nome;
    }

    public void setNome(String nome) {

        Nome = nome;
    }

    public Integer getIdade() {

        return Idade;
    }

    public void setIdade(Integer idade) {

        Idade = idade;
    }

    public String getCidade() {

        return Cidade;
    }

    public void setCidade(String cidade) {

        Cidade = cidade;
    }

    public String getSexo() {

        return Sexo;
    }

    public void setSexo(String sexo) {

        Sexo = sexo;
    }

    public static class Paciente{

        public <Type, TypeToken> void Main(String[] args){

            ArrayList<Paciente> list = new ArrayList<Paciente>();

            Paciente p1 = new Paciente();
            p1.setNome("Lucas");
            p1.setIdade(22);
            p1.setCidade("São Paulo");
            p1.setSexo("Masculino");

            Paciente p2 = new Paciente();
            p2.setNome("Marcos");
            p2.setIdade(21);
            p2.setCidade("Alta Cruz");
            p2.setSexo("Masculino");

            list.add(p1);
            list.add(p2);

            Gson gson = new GsonBuilder().create();

            System.out.println("Convert to Json...");
            String json = gson.toJson(list);


            System.out.println("----------------------");
            System.out.println(json);


            System.out.println("----------------------");
            System.out.println("Convert to Object...");



            Type pacienteType = new TypeToken<Collection<Paciente>>(){}.getType();
            List<Paciente> pacientes = gson.fromJson(json, pacienteType);


            System.out.println("----------------------");
            for (Paciente paciente : Pacientes) {
                System.out.println("-------------");
                System.out.println("Nome: " + paciente.getNome());
                System.out.println("Idade: " + paciente.getIdade());
                System.out.println("Cidade: " + paciente.getCidade());
                System.out.println("Sexo: " + paciente.getSexo());
            }


            try {
                createFile(json);

            } catch (IOException e) {
                System.out.println("####### OPSSS! Algo deu errado! #######");
                e.printStackTrace();
            }
        }

        public String getNome() {
            return null;
        }
        public String getIdade() {
            return null;

        }
        public String getCidade() {
            return null;
        }
        public String getSexo() {
            return null;
        }

        public void setNome(String nome) {
        }
        public void setIdade(String idade) {
        }
        public void setCidade(String cidade) {
        }
        public void setSexo(String sexo) {
        }


        public static void createFile(String json) throws IOException {
            System.out.println("Prepare-se....");
            System.out.println("Escrevendo arquivo...");
            FileWriter writer = new FileWriter("Macbook-de-Alysson:Downloads:file.json");
            writer.write(json);
            writer.close();
            System.out.println(">>>>> Escrito ;) <<<<<");
        }
    }}
