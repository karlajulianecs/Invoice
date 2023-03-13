package Invoice;

import java.io.InputStream;

public class Invoice {
    //class attributes
    private int numItemFaturado = 0;
    private String decricaoItem;
    private int quantComprado = 0;
    private double precoUnitItem;

    public Invoice(int i, String produto, int i1, double v) {
    }

    //constructor
    public void Invoice(int numItemFaturado, String decricaoItem, int quantComprado, double precoUnitItem) {
        this.numItemFaturado = numItemFaturado;
        this.decricaoItem = decricaoItem;
        this.quantComprado = quantComprado;
            if (quantComprado < 0){
                 this.quantComprado = 0;
            }
        this.precoUnitItem = precoUnitItem;
            if (precoUnitItem < 0){
                this.numItemFaturado = 0;
            }
    }
    public int getNumItemFaturado() {
        int numItemFaturado1 = numItemFaturado;
        return numItemFaturado;
    }
    public void setNumItemFaturado (int numItemFaturado){
        this.numItemFaturado = numItemFaturado;
    }

    public String getDecricaoItem(){
        return decricaoItem;
    }

    public void setDecricaoItem (String decricaoItem){
        this.decricaoItem = decricaoItem;
    }

    public int getQuantComprado(){
        return quantComprado;
    }

    public void setQuantComprado(int quantComprado) {
        this.quantComprado = Math.max(quantComprado, 0);
    }

    public double getPrecoUnitItem(){
        return precoUnitItem;
    }

    public void setPrecoUnitItem(double precoUnitItem) {
        this.precoUnitItem = precoUnitItem;
            if (precoUnitItem < 0){
                this.precoUnitItem = 0;
            }
    }

    //Método getInvoiceAmount calcula o valor da fatura

    public double getInvoiceAmount(){
        double resultado = this.quantComprado * this.precoUnitItem;
        return resultado;
    }

}
