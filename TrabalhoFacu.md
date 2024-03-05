    public class Aluno {
        //private String nome;
        private String nome;
        int idade;
    
        public void setNome(String nome){
            this.nome = nome;
        }

    }
    
    public class Main {
        public static void main(String[] args) {
           Aluno aluno1 = new Aluno();
    
           //aluno1.nome = "Renan";
    
            aluno1.setNome("Renan");
    
    
    
        }
        public String getNome() {
            return nome;
        }
    }
