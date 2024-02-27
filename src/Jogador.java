package src;
public class Jogador {
    // Vamos criar os atributos
    private short numero;
    private String nome;
    private String posicao;

    //Construtores
    public Jogador(short numero, String nome, String posicao) {
        this.numero = numero;
        this.nome = nome;
        this.posicao = posicao;
    }

    //Getters and Setters
    public short getNumero() {
        return this.numero;
    }
    public void setNumero(short numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPosicao() {
        return this.posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return (this.nome + "-"+this.numero+"-"+ this.posicao);
    }  
}