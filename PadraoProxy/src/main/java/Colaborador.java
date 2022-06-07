import java.util.Arrays;
import java.util.List;

public class Colaborador  implements IColaborador {

    private Integer matricula;
    private String nome;
    private String cidade;
    private String performance;

    public Colaborador(int matricula) {
        this.matricula = matricula;
        Colaborador objeto = BD.getColaborador(matricula);
        this.nome = objeto.nome;
        this.cidade = objeto.cidade;
        this.performance = objeto.performance;
    }

    public Colaborador(Integer matricula, String nome, String cidade, String performance) {
        this.matricula = matricula;
        this.nome = nome;
        this.cidade = cidade;
        this.performance = performance;
    }

    public Integer getMatricula() {
        return matricula;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cidade);
    }

    @Override
    public List<String> obterPerformance(Funcionario funcionario) {
        return Arrays.asList(this.performance);
    }
}
