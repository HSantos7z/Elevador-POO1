public class MainElevador {
    public static void main(String[] args) {
        Elevador meuElevador = new Elevador(10);

        // Verificando se a lógica esta correta: subindo com a porta aberta
        meuElevador.abrirPorta();
        meuElevador.subir();

        // Funcionamento correto: sobe para o andar 1 e 2 respectivos
        meuElevador.fecharPorta();
        meuElevador.subir();
        meuElevador.subir();

        // Funcionamento correto: desce 1 andar
        meuElevador.descer();

        // desce ao térreo
        meuElevador.descer();

        // Verificando se a lógica esta correta: descendo no abaixo do térreo
        meuElevador.descer();

        // Verificando se a lógica esta correta: Sobe até o limite.
        for(int i = 0; i < 11; i++){
            meuElevador.subir();
        }
    }
}
