public abstract class Pessoas {


    private String nome;
    private String CPF;
    private String dataNasc;
    
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }



    public Pessoas(String nome, String cPF, String dataNasc) {
        this.nome = nome;
        CPF = cPF;
        this.dataNasc = dataNasc;
    }
    
    public void status(){

        System.out.println("nome:"+ this.getNome());
        System.out.println("CPF: "+ this.getCPF());
        System.out.println("Data de nascimento:"+ this.getDataNasc());

    }

}
