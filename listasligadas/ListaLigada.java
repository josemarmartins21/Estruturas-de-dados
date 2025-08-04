

public class ListaLigada {
    private Elemento ultimo;
    private Elemento primeiro;
    private int tamanho;
    
    /*
     * Adiciona um novo elemento e cria um novo valor dentro do elemento
     *  @author: Josimar Martins
     */
    public void add(String novoValor) {

        Elemento novoElemento = new Elemento(novoValor);
        
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;

        } else { 
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
            
        }

        tamanho ++;
    }

    public void remove(String novoValor) {

    }

    public Elemento get(int posicao) {

        Elemento atual = this.primeiro;

        for (int i=0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    } 

    public ListaLigada() {
        this.tamanho = 0;
    }
    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public Elemento getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }




    

    
}