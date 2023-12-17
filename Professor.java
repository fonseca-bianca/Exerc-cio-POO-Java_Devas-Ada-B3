public class Professor extends Funcionario {
    public Professor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Professor: " + getNome() + ", Salário: " + getSalario());
    }
}