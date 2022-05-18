package Exercicio37;

public class Funcionario {
	private String nome, departamento,banco,rg;
    private double salario;
    private boolean statusFun=true;

    public Funcionario(String nome, String departamento, String banco, String rg, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.banco = banco;
        this.rg = rg;
        this.salario = salario;
        
        
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public String getBanco() {
            return banco;
        }

        public void setBanco(String banco) {
            this.banco = banco;
        }

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public boolean isStatusFun() {
            return statusFun;
        }

        public void setStatusFun(boolean statusFun) {
            this.statusFun = statusFun;
        }

        public void bonificar(double valBonificacao){
            salario+=valBonificacao;
        }
        public void demitir(){
            statusFun=false;
        }
        public String mostrarDados(){
            String statusFun;
            if (isStatusFun() == true){
                statusFun = "Ativo";
            }else {
                statusFun = "Desligado";
            }
            return " Nome: "+getNome()+"\n Banco: "+getBanco()+"\n Departamento: "+getDepartamento()+
                    "\n RG: "+getRg()+"\n Salario: "+getSalario()+"\n Situação do Funcionario: "
                    +statusFun;
    }
    
}
