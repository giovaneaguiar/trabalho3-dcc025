import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditorDeVideoTest {

    @Test
    void deveRetornarEditorDeVideo()
    {
        EditorDeVideo editorDeVideo = new EditorDeVideo
                ("Giovane Aguiar",
                        "123.456.789-10",
                        "EditorDeVideo",
                        1500
        );
        assertEquals("Giovane Aguiar", editorDeVideo.getNome());
    }

    @Test
    void deveRetornarEditorDeVideoSemNome(){
        try {
            EditorDeVideo editorDeVideo = new EditorDeVideo
                    (null,
                            "123.456.789-10",
                            "EditorDeVideo",
                            1500
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome nulo!", e.getMessage());
        }
    }
    @Test
    void deveRetornarEditorDeVideoSemCpf(){
        try {
            EditorDeVideo editorDeVideo = new EditorDeVideo
                    ("Giovane Aguiar",
                            null,
                            "EditorDeVideo",
                            1500
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("CPF nulo!", e.getMessage());
        }
    }
    @Test
    void deveRetornarEditorDeVideoSemCargo(){
        try {
            EditorDeVideo editorDeVideo = new EditorDeVideo
                    ("Giovane Aguiar",
                            "123.456.789-10",
                            null,
                            1500
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cargo nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarEditorDeVideoSemSalario(){
        try {
            EditorDeVideo editorDeVideo = new EditorDeVideo
                    ("Giovane Aguiar",
                            "123.456.789-10",
                            "EditorDeVideo",
                            0
                    );
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Salário nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarBonificacaoDeUmEditorDeVideo()
    {
        EditorDeVideo editorDeVideo = new EditorDeVideo
                ("Giovane Aguiar",
                        "123.456.789-10",
                        "EditorDeVideo",
                        1500
                );
        ControladorDeBonificacoes controladorDeBonificacoes = new ControladorDeBonificacoes();

        assertEquals(600, controladorDeBonificacoes.adicionaBonificacaoDe(editorDeVideo));
    }

}