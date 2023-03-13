package Invoice;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

public class main {
    @Test
    @DisplayName("Validando a classe Invoice")

    public static void main (String[] args){
      Invoice inv = new Invoice (1,"Computador", 5, 1_000.00);

      double amount = inv.getInvoiceAmount();
      System.out.println("Total:" + amount);

      Invoice inv1 = new Invoice(2, "Impressora", -10, -100);
      System.out.println( "Quantidade impressora:" + inv1.getQuantComprado());
      System.out.println("Preco impressora:" + inv1.getPrecoUnitItem());

        Invoice inv2 = new Invoice(3, "Cabo HDMI", -10, -100);
        System.out.println( "Quantidade Cabo HDMI:" + inv2.getQuantComprado());
        System.out.println("Preco Cabo HDMI:" + inv2.getPrecoUnitItem());

    }
}
