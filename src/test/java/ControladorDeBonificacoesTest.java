import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorDeBonificacoesTest {

    @Test
    void deveRetornarTotalDeBonificacoes() {

        Diretor diretor = new Diretor
                ("Thomás",
                        "123.456.789-09",
                        "Diretor",
                        10000
                );

        Gerente gerente = new Gerente
                ("Giovane Aguiar",
                        "123.456.789.12",
                        "Gerente",
                        5000
                );

        EditorDeVideo editorDeVideo = new EditorDeVideo
                ("João",
                        "123.456.789-11",
                        "EditorDeVideo",
                        1500
                );
        ControladorDeBonificacoes controladorDeBonificacoes = new ControladorDeBonificacoes();
        controladorDeBonificacoes.adicionaBonificacaoDe(diretor);
        controladorDeBonificacoes.adicionaBonificacaoDe(gerente);
        controladorDeBonificacoes.adicionaBonificacaoDe(editorDeVideo);

        assertEquals(26600.0, controladorDeBonificacoes.recuperaTotalDeBonificacoes());
    }
}