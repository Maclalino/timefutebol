package src;
public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar um objeto do tipo Jogador...
        Jogador allejo = new Jogador((short) 7, "Allejo", "atacante");
        System.out.println(allejo);

        System.out.println("Nome do Jogador: "+allejo.getNome());

        Time brasil= new Time("Brasil");

        System.out.println(brasil);

        brasil.addJogador(allejo);
        System.out.println(brasil);

        Jogador maycon= new Jogador((short)9, "Maycon", "Goleiro");
        brasil.addJogador(maycon);
        System.out.println(brasil);

        brasil.remJogador(allejo);
        System.out.println(brasil);
    }
}