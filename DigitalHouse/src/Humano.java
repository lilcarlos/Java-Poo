public class Humano extends Mamifero {

    private int documento;




    public int getDocumento () {
        return this.documento;
    }

    public void setDocumento (int novoDocumento) {
        this.documento = novoDocumento;
    }





    public Humano (String nome, int idade, int documento) {
        this.setNome(nome);
        this.setIdade(idade);
        this.documento = documento;


    }
}
