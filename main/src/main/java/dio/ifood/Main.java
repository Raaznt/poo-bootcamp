package dio.ifood;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev dev1 = new Dev();
        dev1.setNome("Joao");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Dev1 Conteudos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Dev1 Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Dev1 Conteudos concluidos: "+ dev1.getConteudosConcluidos());
        System.out.println("Dev1 XP: " + dev1.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Paulo");
        System.out.println("Dev2 Conteudos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Dev1 Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Dev2 Conteudos concluidos: "+ dev2.getConteudosConcluidos());
        System.out.println("Dev2 XP: " + dev2.calcularTotalXP());


    }
}
