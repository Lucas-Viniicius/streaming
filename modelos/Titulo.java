package projeto_streaming.modelos;

public class Titulo {
    private String nome;
    private int tempoEmMinutos;
    private boolean ativa = true;
    private int anoDeLancamento;
    private double avaliacao;

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

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }
    public boolean getAtiva(){
        return this.ativa;
    }

    // método para exibir "ativa" ou "inativa"
    public String exibirStatus(){
        return this.ativa ? "Ativa" : "inativa";
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public int getAnoDeLancamento(){
        return this.anoDeLancamento;
    }

    public void setAvaliacao(double avaliacao){
        this.avaliacao = avaliacao;
    }
    public double getAvaliacao(){
        return this.avaliacao;
    }

    public void exibirDados(){
        System.out.println("Titulo: "+this.nome);
        System.out.println("Duração do titulo: "+this.tempoEmMinutos);
        System.out.println("Status do titulo: "+exibirStatus());
    }
}
