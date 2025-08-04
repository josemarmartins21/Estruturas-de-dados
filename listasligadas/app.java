
public class app {
    public static void main(String[] args) {
        
        ListaLigada lista = new ListaLigada();

        lista.add("Acre");
        lista.add("Bahia");
        lista.add("Luanda");
        lista.add("Cazenga");

        System.out.println(lista.getTamanho());
        System.out.println("Primeiro " + lista.getPrimeiro().getValor());
        System.out.println("Primeiro " + lista.getUltimo().getValor());
        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());

    }
}
