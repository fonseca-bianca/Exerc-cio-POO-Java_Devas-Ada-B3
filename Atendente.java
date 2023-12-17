public final class Atendente extends Funcionario {
    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    // Método final
    public final void atenderCliente() {
        System.out.println("Atendendo o cliente x");
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Atendente: " + getNome() + ", Salário: " + getSalario());
    }
}
