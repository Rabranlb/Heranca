public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String departamento;

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
    public String getDepartamento(){
        return this.departamento;
    }
    public double bonificacao(){
        return this.salario*0.1;
    }
}