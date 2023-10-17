public class exercicio2 {
        public static void main(String[] args) {
            exercicio1 pessoa1 = new exercicio1("Cass", 21 , "123.456.789.00");
            exercicio1 pessoa2 = new exercicio1();


            pessoa2.setValores("Bela", 23 , "123.456.788.01");

            System.out.println(pessoa1.mostrarDados());
            System.out.println(pessoa2.mostrarDados());
        }    
}
