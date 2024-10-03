public class Vendedor extends Pessoas {

    //
    private String dataContratacao;
    private int salarioBase;
    private float percentualCom;

    public Vendedor(String nome, String cPF, String dataNasc) {
        super(nome, cPF, dataNasc);

    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getPercentualCom() {
        return percentualCom;
    }

    public void setPercentualCom(float percentualCom) {
        this.percentualCom = percentualCom;
    }


    

    public Vendedor(String nome, String cPF, String dataNasc, String dataContratacao, int salarioBase,
            float percentualCom) {
        super(nome, cPF, dataNasc);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualCom = percentualCom;
    }




    @Override
    public void status(){

        System.out.println("nome:"+ this.getNome());
        System.out.println("CPF: "+ this.getCPF());
        System.out.println("Data de nascimento:"+ this.getDataNasc());
        System.out.println("Data de contratacao:"+ this.getDataContratacao());
        System.out.println("Salario base:"+ this.getSalarioBase());
        System.out.println("Percentual de comissao:"+ this.getPercentualCom());

    }
    
}
