package sempadrao.interpreter;

import java.util.List;

public class Jogador {
    private String nome;
    private List<String> habilidades;

    public Jogador(String nome, List<String> habilidades) {
        this.nome = nome;
        this.habilidades = habilidades;
    }

    public String getNome() { return nome; }
    public boolean temHabilidade(String habilidade) {
        return habilidades.contains(habilidade);
    }
}