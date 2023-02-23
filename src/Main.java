import javaOop.Curso;
import javaOop.Mentoria;

import java.time.LocalDate;
//teste inserção de classe
public class Main {
    public static void main(String[] args) {


        Curso curso = new Curso();
        curso.setTitulo("curso de java");
        curso.setDescricao("Aprenda orientação a objetos com java");
        curso.setData(LocalDate.now());


        Curso curso2 = new Curso();
        curso2.setTitulo("curso de Spring");
        curso2.setDescricao("Aprenda Spring ");
        curso2.setData(LocalDate.now());

        Curso curso3 = new Curso();
        curso3.setTitulo("curso de Angular");
        curso3.setDescricao("Aprenda a usar Angular com Spring ");
        curso3.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(curso3);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Angular");
        mentoria1.setDescricao("descrição mentoria Angular");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria Spring");
        mentoria2.setDescricao("descrição mentoria Spring");
        mentoria2.setData(LocalDate.now());


    }
}
