package projeto_streaming.modelos;

public class Filmes extends Titulo {
    private String nomeDoAutor;

    public void setNomeDoAutor(String nomeDoAutor){
        this.nomeDoAutor = nomeDoAutor;
    }
    public String getNomeDoAutor(){
        return this.nomeDoAutor;
    }

    @Override
    public void exibirDadosDoTitulo(){
        System.out.println("\nFilme: "+getNome());
        System.out.println("Duração do filme: "+getTempoEmMinutos());
        System.out.println("Status do filme: "+exibirStatus());
        System.out.println("Autor: "+this.nomeDoAutor);
        System.out.println(mediaDeAvaliacoes());
    }
}