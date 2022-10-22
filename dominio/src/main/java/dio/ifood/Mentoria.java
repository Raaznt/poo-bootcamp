package dio.ifood;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    Mentoria() {

    }

    @Override
    public double calcularXP() {
        return 20d * XP_PADRAO;
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
                "titulo='"+ getTitulo() + "\'" +
                ", descricao='"+ getDescricao() + '\'' +
                ", data=" + this.data + "}"; 
    }
}
