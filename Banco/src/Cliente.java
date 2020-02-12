public class Cliente {

    private String nome;
    private int documento;
    public Object conta;


    public Cliente(String nome, int documento) {
        this.nome = nome;
        this.documento = documento;
    }





    public String getNome () {
        return nome;
    }


    public int getDocumento () {
        return documento;
    }


    public void imprimir () {

        System.out.println("Nome: " + nome);
        System.out.println("Documento: " + documento);

    }
}
