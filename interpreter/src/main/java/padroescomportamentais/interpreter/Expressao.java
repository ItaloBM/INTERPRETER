package padroescomportamentais.interpreter;

public interface Expressao {
    // O método principal que toda a regra gramatical tem que saber responder
    boolean interpretar(Jogador contexto);
}