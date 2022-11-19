package pr.senac.br.aula08API.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pr.senac.br.aula08API.models.Operacao;

@RestController
@RequestMapping(value="/api")
public class OperacaoResource {

    @PostMapping("/operacao")
    public double realizaOperacao(@RequestBody Operacao operacao){
        if(operacao.getOperador() == '+'){
            return operacao.soma();
        } else if (operacao.getOperador() == '-'){
            return operacao.subtracao();
        } else if (operacao.getOperador() == '*'){
            return operacao.multiplicacao();
        } else if (operacao.getOperador() == '/'){
            return operacao.divisao();
        }
    return 0;
    }
}
