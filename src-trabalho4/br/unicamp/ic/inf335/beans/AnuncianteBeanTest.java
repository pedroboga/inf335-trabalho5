package br.unicamp.ic.inf335.beans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnuncianteBeanTest {

    @Test
    void addUmAnuncio() {
        AnuncianteBean anuncianteBean = new AnuncianteBean();
        AnuncioBean anuncioBean = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean);

        assertEquals(anuncianteBean.getAnuncios().size(), 1);
    }

    @Test
    void addCincoAnuncios() {
        AnuncianteBean anuncianteBean = new AnuncianteBean();
        AnuncioBean anuncioBean = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean);
        AnuncioBean anuncioBean2 = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean2);
        AnuncioBean anuncioBean3 = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean3);
        AnuncioBean anuncioBean4 = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean4);
        AnuncioBean anuncioBean5 = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean5);

        assertEquals(anuncianteBean.getAnuncios().size(), 5);
    }

    @Test
    void removeUltimoAnuncio() {
        AnuncianteBean anuncianteBean = new AnuncianteBean();
        AnuncioBean anuncioBean = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean);
        AnuncioBean anuncioBean2 = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean2);

        anuncianteBean.removeAnuncio(1); //Index 1

        assertFalse(anuncianteBean.getAnuncios().contains(anuncioBean2));
    }

    @Test
    void removeForaDoIndex() {
        AnuncianteBean anuncianteBean = new AnuncianteBean();
        AnuncioBean anuncioBean = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean);
        AnuncioBean anuncioBean2 = new AnuncioBean();
        anuncianteBean.addAnuncio(anuncioBean2);

        anuncianteBean.removeAnuncio(2); //Index 1

        assertTrue(anuncianteBean.getAnuncios().contains(anuncioBean2));
    }

    @Test
    void valorMedioDoisAnunciosIgual8() {
        AnuncianteBean anuncianteBean = new AnuncianteBean();
        AnuncioBean anuncioBean = new AnuncioBean();
        ProdutoBean produtoBean = new ProdutoBean();
        produtoBean.setValor(10.0);
        anuncioBean.setProduto(produtoBean);
        anuncianteBean.addAnuncio(anuncioBean);

        AnuncioBean anuncioBean2 = new AnuncioBean();
        ProdutoBean produtoBean2 = new ProdutoBean();
        produtoBean2.setValor(6.00);
        anuncioBean2.setProduto(produtoBean2);
        anuncianteBean.addAnuncio(anuncioBean2);

        assertEquals(anuncianteBean.valorMedioAnuncios(), 8);
    }

    @Test
    void valorMedioQuatroAnunciosIgual14() {
        AnuncianteBean anuncianteBean = new AnuncianteBean();
        AnuncioBean anuncioBean = new AnuncioBean();
        ProdutoBean produtoBean = new ProdutoBean();
        produtoBean.setValor(10.0);
        anuncioBean.setProduto(produtoBean);
        anuncianteBean.addAnuncio(anuncioBean);

        AnuncioBean anuncioBean2 = new AnuncioBean();
        ProdutoBean produtoBean2 = new ProdutoBean();
        produtoBean2.setValor(12.00);
        anuncioBean2.setProduto(produtoBean2);
        anuncianteBean.addAnuncio(anuncioBean2);

        AnuncioBean anuncioBean3 = new AnuncioBean();
        ProdutoBean produtoBean3 = new ProdutoBean();
        produtoBean3.setValor(31.45);
        anuncioBean3.setProduto(produtoBean3);
        anuncianteBean.addAnuncio(anuncioBean3);

        AnuncioBean anuncioBean4 = new AnuncioBean();
        ProdutoBean produtoBean4 = new ProdutoBean();
        produtoBean4.setValor(2.55);
        anuncioBean4.setProduto(produtoBean4);
        anuncianteBean.addAnuncio(anuncioBean4);

        assertEquals(anuncianteBean.valorMedioAnuncios(), 14);
    }
}