package projeto_streaming.modelos;

public class Series {
    private int quantidadeDeTemporadas;
    private int minutosPorEpisodio;
    private int episodioPorTemporada;

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

    public void setEpisodioPorTemporada(int episodioPorTemporada){
        this.episodioPorTemporada = episodioPorTemporada;
    }
    public int getEpisodioPorTemporada(){
        return this.episodioPorTemporada;
    }
}
