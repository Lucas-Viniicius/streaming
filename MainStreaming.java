package projeto_streaming;

import projeto_streaming.modelos.Filmes;
import projeto_streaming.modelos.Series;

public class MainStreaming {
    public static void main(String[]args){

        Filmes filme1 = new Filmes();
        filme1.setNome("Guerra Infinita");
        filme1.setAnoDeLancamento(2018);
        filme1.setNomeDoAutor("Christopher Markus");
        filme1.setTempoEmMinutos(150);
        filme1.setAvaliacao(10);
        filme1.setAvaliacao(9);

        filme1.exibirDadosDoTitulo();

        Series serie1 = new Series();
        serie1.setNome("Teen Wolf");
        serie1.setAnoDeLancamento(2011);
        serie1.setQuantidadeDeTemporadas(7);
        serie1.setMinutosPorEpisodio(45);
        serie1.setAvaliacao(9.5);
        serie1.setAvaliacao(9.2);
        serie1.setQuantidadeDeEpisodio(20);
        
        System.out.println(" ");
        serie1.exibirDadosDoTitulo();


    }
}
