package dio.ifood;

import java.time.LocalDate;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    Curso() {
        
    }

    public String getTitulo() {
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
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='"+ this.titulo + "\'" +
                ", descricao='"+ this.descricao + '\'' +
                ", cargaHoraria=" + this.cargaHoraria + "}"; 
    }
    
}
