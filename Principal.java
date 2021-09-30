public class Principal {
    
    public static void main(String[] args){
       Funcionario f=new Funcionario();

            f.setNome("RAFAEL");
            f.setCpf("987.654.321-00");
            f.setSalario(5500);
            f.setDepartamento("FINANCEIRO");

        System.out.println("FUNCIONARIO -> " +f.getNome());
        System.out.println("CPF -> " +f.getCpf());
        System.out.println("SAlÁRIO -> " +f.getSalario());
        System.out.println("BONIFICAÇÃO MENSAL -> " +f.bonificacao());
        System.out.println("SETOR -> " +f.getDepartamento());

    }
}
