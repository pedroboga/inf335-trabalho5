//import org.junit.Test;
import org.junit.jupiter.api.Test;
//import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoBeanTest {
    @Test
    void produtoSetCodigo() {
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setCodigo("AAA");

        assertEquals(produtoBean1.getCodigo(), "AAA");
    }

    @Test
    void produtoSetNome() {
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setNome("Nome Teste");

        assertEquals(produtoBean1.getNome(), "Nome Teste");
    }

    @Test
    void produtoSetDescricao() {
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setDescricao("Descricao Teste");

        assertEquals(produtoBean1.getDescricao(), "Descricao Teste");
    }

    @Test
    void produtoSetValor() {
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setValor(1.99);

        assertEquals(produtoBean1.getValor(), 1.99);
    }

    @Test
    void produtoSetEstado() {
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setEstado("PR");

        assertEquals(produtoBean1.getEstado(), "PR");
    }

    @Test
    void produtoComparaMaior() {
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setValor(12.34);

        ProdutoBean produtoBean2 = new ProdutoBean();
        produtoBean2.setValor(1.99);

        assertEquals(produtoBean1.compareTo(produtoBean2), 1);
    }

    @Test
    void produtoComparaMenor() {
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setValor(1.99);

        ProdutoBean produtoBean2 = new ProdutoBean();
        produtoBean2.setValor(12.34);

        assertEquals(produtoBean1.compareTo(produtoBean2), -1);
    }

    @Test
    void produtoComparaIgual() {
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setValor(12.34);

        ProdutoBean produtoBean2 = new ProdutoBean();
        produtoBean2.setValor(12.34);

        assertEquals(produtoBean1.compareTo(produtoBean2), 0);
    }
}