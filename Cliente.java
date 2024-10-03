public class Cliente extends Pessoas {

    private String email;
    private int numeroCartao;
    private int telefone;

    public Cliente(String nome, String cPF, String dataNasc) {
        super(nome, cPF, dataNasc);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }



    public Cliente(String nome, String cPF, String dataNasc, String email, int numeroCartao, int telefone) {
        super(nome, cPF, dataNasc);
        this.email = email;
        this.numeroCartao = numeroCartao;
        this.telefone = telefone;
    }



    @Override
    public void status(){

        System.out.println("nome:"+ this.getNome());
        System.out.println("CPF: "+ this.getCPF());
        System.out.println("Data de nascimento:"+ this.getDataNasc());
        System.out.println("email: "+ this.getEmail());
        System.out.println("Numero do cartao de fidelidade: "+ this.getNumeroCartao());
        System.out.println("Telefone:"+ this.getTelefone());

    }



}
