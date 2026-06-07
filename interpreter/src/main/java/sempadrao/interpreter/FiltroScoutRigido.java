package sempadrao.interpreter;

public class FiltroScoutRigido {

    // O PROBLEMA: Para cada nova combinação que o treinador pedir,
    // temos que vir aqui, abrir o código e criar um novo método com IFs!

    public boolean buscarAtacanteRapidoEForte(Jogador jogador) {
        return jogador.temHabilidade("Rapido") && jogador.temHabilidade("Forte");
    }

    public boolean buscarZagueiroAltoOuForte(Jogador jogador) {
        return jogador.temHabilidade("Alto") || jogador.temHabilidade("Forte");
    }
}