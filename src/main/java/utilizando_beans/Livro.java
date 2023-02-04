package utilizando_beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Livro {
    private String nome;
    private String codigo;

    @Autowired
    AutorLivro autorLivro;

    public void exibir(){
        System.out.println(this.nome + " - " + this.codigo);
        autorLivro.exibirNomeAutor();

    }
}
