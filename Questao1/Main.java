public class Main {

 public static void main(String[] args) {
System.out.println("                         ");

 Paciente paciente = new Paciente("038953815","Maria Eduarda Barboza Santos", "14/06/2004","Feminino", "Planserv", "Nenhuma", "O positivo");

System.out.println("Código:"+ paciente.getCodigo());
System.out.println("Nome:"+paciente.getNome());
System.out.println("Data de Nascimento:"+ paciente.getDataNascimento());
System.out.println("Sexo:"+ paciente.getSexo());
System.out.println("Plano de Saúde: "+ paciente.getPlanoSaude());
System.out.println("Alergia: "+ paciente.getAlergia());
System.out.println("Tipo Sanguíneo: "+ paciente.getTipoSanguineo());

System.out.println("                         ");
System.out.println("Modificações:");

 paciente.setCodigo("039875375");
 paciente.setNome("Karla Mônica Alcântara Barboza");
 paciente.setDataNascimento("11/12/1973");
 paciente.setSexo("Feminino");
 paciente.setPlanoSaude("Planserv");
 paciente.setAlergia("Nenhuma");
 paciente.setTipoSanguineo("O negativo");

 
System.out.println("Código:"+ paciente.getCodigo());
System.out.println("Nome:"+paciente.getNome());
System.out.println("Data de Nascimento:"+ paciente.getDataNascimento());
System.out.println("Sexo:"+ paciente.getSexo());
System.out.println("Plano de Saúde:"+ paciente.getPlanoSaude());
System.out.println("Alergia:"+ paciente.getAlergia());
System.out.println("Tipo Sanguíneo:"+ paciente.getTipoSanguineo());

 }
}
