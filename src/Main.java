public class Main {
    public static void main(String[] args) {

        Pessoa qualquer = new Pessoa();
        // Encapsulamento
        qualquer.setNome("Raissa Leal");
        System.out.println(qualquer.getNome());//saída de dados


        Esportistas jogadora = new Esportistas();
        Esportistas surfista = new Esportistas(345);
        jogadora.setNome("Taissa do Volei");
        //Polimorfismo
        qualquer = new Esportistas();
        String resultado = qualquer.sacar();
        System.out.println(resultado);
        qualquer = new Pessoa();
        resultado = qualquer.sacar();
        System.out.println(resultado);



    }
}