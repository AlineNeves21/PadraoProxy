import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Colaborador> colaboradores = new HashMap<>();

    public static Colaborador getColaborador(Integer matricula) {
        return colaboradores.get(matricula);
    }

    public static void addColaborador(Colaborador colaborador) {
        colaboradores.put(colaborador.getMatricula(), colaborador);
    }
}
