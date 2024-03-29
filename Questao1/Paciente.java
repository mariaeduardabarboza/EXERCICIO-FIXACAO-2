public class Paciente {

     private String codigo;
     private String nome;
     private String dataNascimento;
     private String sexo;
     private String planoSaude;
     private String alergia;
     private String tipoSanguineo;

     public Paciente(String codigo, String nome, String dataNascimento,String sexo, String planoSaude, String alergia, String tipoSanguineo) {
    this.codigo = codigo;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.sexo = sexo;
    this.planoSaude = planoSaude;
    this.alergia = alergia;
    this.tipoSanguineo = tipoSanguineo;
     }

 public String getCodigo() {
 return this.codigo;
 }

 public void setCodigo(String codigo) {
 this.codigo = codigo;
 }

 public String getNome() {
 return this.nome;
 }

 public void setNome(String nome) {
 this.nome = nome;
 }

 public String getDataNascimento() {
 return this.dataNascimento;
 }

 public void setDataNascimento(String dataNascimento) {
 this.dataNascimento = dataNascimento;
 }
public String getSexo() {
 return this.sexo; 
 }
 public void setSexo(String sexo) {
 this.sexo = sexo;
 }

 public String getPlanoSaude() {
 return this.planoSaude;
 }

 public void setPlanoSaude(String planoSaude) {
 this.planoSaude = planoSaude;
 }

 public String getAlergia() {
 return this.alergia;
 }

 public void setAlergia(String alergia) {
 this.alergia = alergia;
 }
public String getTipoSanguineo() {
 return this.tipoSanguineo;
 }

 public void setTipoSanguineo(String tipoSanguineo) {
 this.tipoSanguineo = tipoSanguineo;
 }     
 }
