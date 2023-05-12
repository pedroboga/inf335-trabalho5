import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnuncioBeanTest {

    @Test
    void getValorIgualACinco() {
        AnuncioBean anuncioBean = new AnuncioBean();
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setValor(10.00);
        anuncioBean.setProduto(produtoBean1);
        anuncioBean.setDesconto(0.5); //50%

        assertEquals(anuncioBean.getValor(), 5);
    }

    @Test
    void getValorIgualADez() {
        AnuncioBean anuncioBean = new AnuncioBean();
        ProdutoBean produtoBean1 = new ProdutoBean();
        produtoBean1.setValor(100.00);
        anuncioBean.setProduto(produtoBean1);
        anuncioBean.setDesconto(0.9); //90%

        assertEquals(anuncioBean.getValor(), 10);
    }
}