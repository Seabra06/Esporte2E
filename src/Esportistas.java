public class Esportistas extends Pessoa{
//Atributos
    private int idFederacao;
//Construtores

    public Esportistas(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportistas() {
    }
    public String sacar()
    { return  "Sacar pro jogo";}
}
