package projeto_streaming.modelos;

public class Titulo {
    private String nome;
    private int tempoEmMinutos;
    private boolean ativa = true;
    private int anoDeLancamento;
    private double avaliacao;
    private int quantidadeDeAvaliacoes;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTempoEmMinutos(int tempoEmMinutos){
        this.tempoEmMinutos = tempoEmMinutos;
    }
    public int getTempoEmMinutos(){
        return this.tempoEmMinutos;
    }

    // método para exibir "ativa" ou "inativa"
    public String exibirStatus(){
        return this.ativa ? "Ativo" : "inativo";
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public int getAnoDeLancamento(){
        return this.anoDeLancamento;
    }

    public void setAvaliacao(double avaliacao){
        this.avaliacao += avaliacao;
        this.quantidadeDeAvaliacoes++;
    }
    public double getAvaliacao(){
        return this.avaliacao;
    }

    public void exibirDadosDoTitulo(){
        System.out.println("\nTitulo: "+this.nome);
        System.out.println("Duração do titulo: "+this.tempoEmMinutos);
        System.out.println("Status do titulo: "+exibirStatus());
    }

    public String mediaDeAvaliacoes(){
        if(this.quantidadeDeAvaliacoes == 0){
            return "Não existe nenhuma avaliaçao no momento";
        }else{
            double mediaDeAvaliacoes = this.avaliacao/this.quantidadeDeAvaliacoes;
            return String.format("A média de avaliações é de: %.2f", mediaDeAvaliacoes);
        }
    }
}
