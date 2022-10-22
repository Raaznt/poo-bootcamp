package dio.ifood;

import java.time.LocalDate;

public class Curso extends Conteudo{
    /*private String titulo;
    private String descricao;*/
    private int cargaHoraria;

    Curso() {
        
    }

    @Override
    public double calcularXP() {
        return 20d * cargaHoraria;
    }

    /*public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }*/

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='"+ getTitulo() + "\'" +
                ", descricao='"+ getDescricao() + '\'' +
                ", cargaHoraria=" + this.cargaHoraria + "}"; 
    }
    
}
