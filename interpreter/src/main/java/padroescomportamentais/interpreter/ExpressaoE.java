package padroescomportamentais.interpreter;

public class ExpressaoE implements Expressao {
    private Expressao expressao1;
    private Expressao expressao2;

    public ExpressaoE(Expressao expressao1, Expressao expressao2) {
        this.expressao1 = expressao1;
        this.expressao2 = expressao2;
    }

    @Override
    public boolean interpretar(Jogador contexto) {
        // Retorna TRUE só se as DUAS expressões forem verdadeiras
        return expressao1.interpretar(contexto) && expressao2.interpretar(contexto);
    }
}