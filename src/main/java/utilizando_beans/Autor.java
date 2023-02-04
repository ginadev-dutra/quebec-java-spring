package utilizando_beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autor implements AutorLivro{

    private String nome;

    public void exibirNomeAutor(){
        System.out.println(this.nome);
    }

}
