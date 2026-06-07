package padroescomportamentais.interpreter;

public class HabilidadeExpressao implements Expressao {
    private String habilidadeBuscada;

    public HabilidadeExpressao(String habilidadeBuscada) {
        this.habilidadeBuscada = habilidadeBuscada;
    }

    @Override
    public boolean interpretar(Jogador contexto) {
        return contexto.temHabilidade(habilidadeBuscada);
    }
}