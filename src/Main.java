import javaOop.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso = new Curso();
        curso.setTitulo("curso de java");
        curso.setDescricao("Aprenda orientação a objetos com java");
        curso.setCargaHoraria(3);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso de Spring");
        curso2.setDescricao("Aprenda Spring ");
        curso2.setCargaHoraria(9);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso de Angular");
        curso3.setDescricao("Aprenda a usar Angular com Spring ");
        curso3.setCargaHoraria(5);

        Conteudo conteudo = new Curso();

       /* System.out.println(curso);
        System.out.println(curso2);
        System.out.println(curso3);*/


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

        /*System.out.println(mentoria);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
*/
        BootCamp bootCamp =new BootCamp();
        bootCamp.setNome("Java Developer");
        bootCamp.setDescricao("Aprenda java de forma simples");
        bootCamp.getCenteudos().add(curso);
        bootCamp.getCenteudos().add(curso2);
        bootCamp.getCenteudos().add(mentoria);

        Dev devThiago =new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootCamp);
        devThiago.progredir();
        System.out.println("-");
        System.out.println("conteudos Incritos: " +devThiago.getConteudosInscritos());
        System.out.println("conteudos Concluidos: " +devThiago.getConteudoConcluidos());
        System.out.println("XP: "+devThiago.calcularTotalXp());

        System.out.println("------");

        Dev devBaruck = new Dev();
        devBaruck.setNome("barugo");
        devBaruck.inscreverBootcamp(bootCamp);
        devBaruck.progredir();
        devBaruck.progredir();
        devBaruck.progredir();
        System.out.println("-");
        System.out.println("conteudos Inscritos: " +devBaruck.getConteudosInscritos());
        System.out.println("conteudos Concluidos: " +devBaruck.getConteudoConcluidos());
        System.out.println("XP: "+devBaruck.calcularTotalXp());






    }
}
