public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet{
    @Override
    public void atenderLigacao() {
        System.out.println("Atender Ligacao");
    }
    @Override
    public void recusarLigacao() {
        System.out.println("Recusar Ligacao");
    }
    @Override
    public void fazerLigacao() {
        System.out.println("Fazer Ligacao");
    }
    @Override
    public void verificarConexao() {
        System.out.println("Verificar Conexao");
    }
    @Override
    public void pesquisarURL() {
        System.out.println("Pesquisar URL");
    }
    @Override
    public void favoritarSite() {
        System.out.println("Favoritar Site");
    }
    @Override
    public void play() {
        System.out.println("Dar play na música");
    }
    @Override
    public void pause() {
        System.out.println("Dar pause na música");
    }
    @Override
    public void avancar() {
        System.out.println("Avançar a música");
    }
    @Override
    public void retroceder() {
        System.out.println("Retroceder a música");
    }
}
