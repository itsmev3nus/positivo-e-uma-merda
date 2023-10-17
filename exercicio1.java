public class exercicio1 {
private String nome;
        private int idade;
        private String cpf;

        public exercicio1(String nome, int idade, String cpf){
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
        }
        public exercicio1(){ }

        
        public void setValores(String nome, int idade, String cpf){
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
        }
        public String mostrarDados(){
            return "Nome: " + this.nome +
            "\nCpf: " + this.cpf +
            "\nidade: " + this.idade;
        }
}
