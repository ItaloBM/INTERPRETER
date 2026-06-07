package sempadrao.interpreter;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class FiltroRigidoTest {

    @Test
    void deveFiltrarComMetodosEngessados() {
        Jogador pedro = new Jogador("Pedro", Arrays.asList("Alto", "Finalizador", "Forte"));
        FiltroScoutRigido filtro = new FiltroScoutRigido();

        // Funciona, mas e se o treinador pedir "Alto E Finalizador OU Rapido"?
        // O código vai quebrar, porque não temos esse método criado!
        assertTrue(filtro.buscarZagueiroAltoOuForte(pedro));
        assertFalse(filtro.buscarAtacanteRapidoEForte(pedro));
    }
}