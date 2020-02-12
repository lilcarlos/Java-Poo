public class Cachorro extends Mamifero {

    private String raca;





    public String getRaca () {
        return this.raca;
    }

    public void setRaca (String novaRaca) {
        this.raca = novaRaca;
    }





    public Cachorro (String nome, int idade, String raca) {
        this.setNome(nome);
        this.setIdade(idade);
        this.raca = raca;

    }
}
