import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Contrato contrato = new Contrato("Apolice","pdf");
        Foto foto = new Foto("Perfil","png");
        Documento documento = new Documento("CPF", "png");
        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(documento);

        impressora.imprimirTudo();











    }
}
