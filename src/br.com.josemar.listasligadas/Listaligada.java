package br.com.josemar.listasligadas;

public class Listaligada <T> {
    private No<T> primeiNo;
    private No<T> ultimonNo; 
    private int tamanho;


    public Listaligada() {
        this.primeiNo = null;
        this.ultimonNo = null;
        this.tamanho = 0;
    }

    public void inserir(T elemento) {
        No<T> novono = new No<>(elemento);
        
        if (eVazia()) {
            this.primeiNo = novono;
            this.ultimonNo = novono;
        } else {
            this.ultimonNo.setProximo(novono);
            this.ultimonNo = novono;
        }

        this.tamanho ++;

    }

    private boolean eVazia() {
        return this.tamanho == 0;
    }

    @Override
    public String toString() {
        if (eVazia()) {
            return "Lista vazia.";
        } else {
            No<T> noatual = this.primeiNo;
            StringBuilder stringBulider = new StringBuilder();
            stringBulider.append("Lista [");
            stringBulider.append(noatual.getElemento() != null ? noatual.getElemento().toString() : "nulo");
            stringBulider.append(", ");

            while (noatual.getProximo() != null) {
                stringBulider.append(noatual.getProximo() != null ? noatual.getProximo().toString() : "<nulo>");
                stringBulider.append(", ");
                noatual = noatual.getProximo();
                stringBulider.append("]");
                
            }
            return stringBulider.toString();
            
        }
       
    }
    
}