public class Autenticador
{

    public void tentaLogin(Autenticavel autenticavel, String senha)
    {
        if (!autenticavel.funcionarioPodeAutenticar(senha)) {

            throw new IllegalArgumentException("Ops. Senha incorreta!");
        }
        autenticavel.funcionarioPodeAutenticar(senha);
    }
}
