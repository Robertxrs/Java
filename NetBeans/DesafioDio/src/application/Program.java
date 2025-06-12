package application;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;
import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("CURSO JAVA");
        curso1.setDescricao("CURSO FOCADO EM JAVA(POO)");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("CURSO C#");
        curso2.setDescricao("CURSO FOCADO EM C#");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("MENTORIA DE JAVA");
        mentoria.setDescricao("MENTORIA FOCADA EM JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BOOTCAMP JAVA DEVOLOPER");
        bootcamp.setDescricao("CURSO-BOOTCAMP FOCADO EM JAVA(DEVOLOPER)");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
         devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

        System.out.println("--------------------------------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: "+ devMaria.calcularTotalXp());

    }

}
