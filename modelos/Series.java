package projeto_streaming.modelos;

public class Series extends Titulo {
    private int quantidadeDeTemporadas;
    private int minutosPorEpisodio;
    private int quantidadeDeEpisodio;

    public void setQuantidadeDeTemporadas(int quantidadeDeTemporadas){
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    }    
    public int getQuantidadeDeTemporadas(){
        return this.quantidadeDeTemporadas;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    public int getMinutosPorEpisodio(){
        return this.minutosPorEpisodio;
    }

    public void setQuantidadeDeEpisodio(int quantidadeDeEpisodio){
        this.quantidadeDeEpisodio = quantidadeDeEpisodio;
    }
    public int getQuantidadeDeEpisodio(){
        return this.quantidadeDeEpisodio;
    }

    @Override
    public void exibirDadosDoTitulo(){
        System.out.println("\nSérie: "+getNome());
        System.out.println("Duração do série: "+getTempoEmMinutos()+" minutos");
        System.out.println("Status do série: "+exibirStatus());
        System.out.println("Quantidade de temporadas: "+this.quantidadeDeTemporadas);
        System.out.println("Cada episódio possui "+this.minutosPorEpisodio+" minutos");
        System.out.println("Cada temporada possui "+this.quantidadeDeEpisodio+" episódios");
        System.out.println(mediaDeAvaliacoes());
    }

    @Override
    public int getTempoEmMinutos(){
         return this.quantidadeDeEpisodio * this.minutosPorEpisodio * this.quantidadeDeTemporadas;
    }
}
