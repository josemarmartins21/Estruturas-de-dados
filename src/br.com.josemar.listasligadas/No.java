package br.com.josemar.listasligadas;

public class No <T> {
    private T elemento;
    private No<T> proximo;

    

    public No() {
        this.proximo = null;
    }

    public No(T elemento) {
        this.elemento = elemento;
    }

    public No(No<T> proximo) {
        this.proximo = proximo;
    }



    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }



    public No<T> getProximo() {
        return proximo;
    }



    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    
}
