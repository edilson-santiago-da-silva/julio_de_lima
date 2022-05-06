package br.com.lojinha;

        import br.com.lojinha.enums.Tamanho;
        import br.com.lojinha.pojo.Produto;
        import br.com.lojinha.pojo.ItemIncluso;
        import br.com.lojinha.pojo.ProdutoInternacional;
        import br.com.lojinha.pojo.ProdutoNacional;

        import java.util.ArrayList;
        import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);  //Criando um novo produto , ele vem vazio.
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(2000.00); // atribuindo um novo (valor);
        meuProduto.setMarca("JL");
//        meuProduto.setTamanho(Tamanho.PEQUENO);
        List<ItemIncluso> itensInclusos = new ArrayList<>(); // criando uma lista em java para o produto

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controles", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogos", 3);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de energia", 2);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);
//      intensInclusos.add("2 Controles");
//      intensInclusos.add("3 Jogos");
//      intensInclusos.add("2 Cabos de energia");
//      meuProduto.setIensInclusos(intensInclusos);
        meuProduto.setPaisFrabricacao("Indonésia");

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
//      System.out.println(meuProduto.getItensInclusos().get(2));
        System.out.println(meuProduto.getPaisFrabricacao());

        System.out.println("Comecando a apresentar os itens c/ laço");

        for (ItemIncluso intemAtual : meuProduto.getItensInclusos()) {
            System.out.println(intemAtual.getNome());
            System.out.println(intemAtual.getQuantidade());
        }
        System.out.println("Acabaram-se os itens c/laço");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.5859);

        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("LeNovo", Tamanho.MEDIO);
        meuProdutoInternacional.setTaxaImportacao(60.58);
        meuProdutoInternacional.setValor(0);

        System.out.println(meuProdutoInternacional.getTaxaImportacao());



    }
}
