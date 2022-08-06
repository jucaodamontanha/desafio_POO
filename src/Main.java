import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setTitulo(" Curso Java");
        curso1.setDescricao(" Descrição curso de Java");


        Curso curso2 = new Curso();
        curso2.setCargaHoraria(4);
        curso2.setTitulo(" Curso Jas");
        curso2.setDescricao(" Descrição curso de Js");




        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
