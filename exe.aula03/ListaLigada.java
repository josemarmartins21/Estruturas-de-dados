public class ListaLigada {
    private Elemento ultimo;
    private Elemento primeiro;
    private int tamanho; /*Tamanho da lista */


    /* Construtor da classe */
    public ListaLigada() {
        this.tamanho = 0;
    }

    /*
     * Metódo para adicionar um elemnto a lista
     * @author Josimar Martins
     * @return void
     */

     public void add(String valor) {
        Elemento novoElemento = new Elemento(valor);

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;

        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }

        this.tamanho ++;
     }

     /*
      * Metódo para pegar um elemento da Lista
      */

      public Elemento get(int posicao) {
        Elemento atual = this.primeiro;
        for (int i = 0; i < (posicao - 1); i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;

      }

    /*
     * Metodos getters e setters
     * @author: Josemar Martins
     */
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
