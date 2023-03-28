public class Sensei implements Cloneable {

    private int matricula;
    private String nome;
    private Aldeia aldeia;
    private String localNascimento;

    public Sensei(int matricula, String nome, Aldeia aldeia, String localNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.aldeia = aldeia;
        this.localNascimento = localNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aldeia getAldeia() {
        return aldeia;
    }

    public void setAldeia(Aldeia aldeia) {
        this.aldeia = aldeia;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override
    public Sensei clone() throws CloneNotSupportedException {
        Sensei senseiClone = (Sensei) super.clone();
        senseiClone.aldeia = (Aldeia) senseiClone.aldeia.clone();
        return senseiClone;
    }

    @Override
    public String toString() {
        return "Sensei{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", aldeia=" + aldeia +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }
}
