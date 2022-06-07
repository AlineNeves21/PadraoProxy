import java.util.List;

public class ColaboradorProxy implements IColaborador {

    private Colaborador colaborador;

    private Integer matricula;

    public ColaboradorProxy(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.colaborador == null) {
            this.colaborador = new Colaborador(this.matricula);
        }
        return this.colaborador.obterDadosPessoais();
    }

    @Override
    public List<String> obterPerformance(Funcionario funcionario) {
        if (!funcionario.isAdministrador()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.colaborador == null) {
            this.colaborador = new Colaborador(this.matricula);
        }
        return this.colaborador.obterPerformance(funcionario);
    }
}
