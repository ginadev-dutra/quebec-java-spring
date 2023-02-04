package injecao_dependencia;

import org.springframework.web.bind.annotation.GetMapping;

public class Carro implements Veiculo{


    @Override
    public void acao() {
        System.out.println("É um carro.");
    }

}
