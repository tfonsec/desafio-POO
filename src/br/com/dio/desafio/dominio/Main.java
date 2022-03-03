package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição do curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago =  new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thiago" + devThiago.getConteudosInscritos());
        devThiago.pogredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Thiago" + devThiago.getConteudosInscritos());
        System.out.println("XP:" + devThiago.calcularTotalXp());

        System.out.println("---------");

        Dev devBernardo = new Dev();
        devBernardo.setNome("Bernardo");
        devBernardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Bernardo" + devBernardo.getConteudosInscritos());
        devBernardo.pogredir();
        devBernardo.pogredir();
        devBernardo.pogredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Bernardo" + devThiago.getConteudosInscritos());
        System.out.println("XP:" + devBernardo.calcularTotalXp());



    }


}
