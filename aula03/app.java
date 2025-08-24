

public class app {

public static void main(String[] args) {
    ListaLigada lista  = new ListaLigada();
    lista.add("AC");
    lista.add("BA");
    lista.add("CE");
    lista.add("DF");

    System.out.println(lista.getTamanho());

    System.out.println("Primeiro " + lista.getPrimeiro().getValor());
    System.out.println("Ultimo " + lista.getUltimo().getValor());
    System.out.println(lista.get(0).getValor());
    System.out.println(lista.get(1).getValor());
    System.out.println(lista.get(2).getValor());


}   
    
}
