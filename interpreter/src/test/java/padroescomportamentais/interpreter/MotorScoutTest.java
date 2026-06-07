package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class MotorScoutTest {

    @Test
    void deveAvaliarExpressoesComplexasDinamicamente() {
        Jogador brunoHenrique = new Jogador("Bruno Henrique", Arrays.asList("Rapido", "Cabaceador"));
        Jogador gabigol = new Jogador("Gabigol", Arrays.asList("Finalizador", "Forte"));

        // 1. Criamos as regras base (Folhas)
        Expressao rapido = new HabilidadeExpressao("Rapido");
        Expressao finalizador = new HabilidadeExpressao("Finalizador");
        Expressao forte = new HabilidadeExpressao("Forte");

        // 2. MONTAMOS A FRASE: (Rapido OU Forte)
        Expressao rapidoOuForte = new ExpressaoOu(rapido, forte);

        // 3. MONTAMOS A FRASE COMPLEXA: (Rapido OU Forte) E Finalizador
        Expressao perfilDesejado = new ExpressaoE(rapidoOuForte, finalizador);

        // AVALIAÇÃO DINÂMICA:
        // O Bruno Henrique atende? Ele é rápido, mas não é "Finalizador" nesta lista. Então: Falso!
        assertFalse(perfilDesejado.interpretar(brunoHenrique));

        // O Gabigol atende? Ele não é "Rapido", mas é "Forte" (Passou no OU) e é "Finalizador" (Passou no E). Então: Verdadeiro!
        assertTrue(perfilDesejado.interpretar(gabigol));
    }
}