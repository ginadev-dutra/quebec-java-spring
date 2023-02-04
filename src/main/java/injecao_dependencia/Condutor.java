package injecao_dependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Moto());
        condutor.automovel();
    }

    @Autowired // diz para o spring que se trata de uma injeção de dependência
    private Veiculo veiculo;

    public Condutor(Veiculo obj){
        this.veiculo = obj;
    }

    public void automovel(){
        veiculo.acao();
    }
}
