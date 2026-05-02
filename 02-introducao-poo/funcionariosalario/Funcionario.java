package introducao_poo_02.funcionariosalario;

public class Funcionario {
    public String name;
    public double horas;
    public double valor;

    public double totalValor() {
        return horas * valor;
    }

}
