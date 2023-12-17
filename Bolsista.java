public class Bolsista extends Aluno {
    private double bolsa;

    public Bolsista(String nome, int matricula, double bolsa) {
        super(nome, matricula);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Bolsista: " + getNome() + ", Matrícula: " + getMatricula() + ", Bolsa: " + getBolsa());
    }
}