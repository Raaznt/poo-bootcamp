package dio.ifood;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    Mentoria() {

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

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='"+ this.titulo + "\'" +
                ", descricao='"+ this.descricao + '\'' +
                ", data=" + this.data + "}"; 
    }
}
