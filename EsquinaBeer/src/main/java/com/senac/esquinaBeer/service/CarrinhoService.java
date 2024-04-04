package com.senac.esquinaBeer.service;
 
import com.senac.esquinaBeer.model.CarrinhoEntity;
import com.senac.esquinaBeer.model.ProdutoEntity;
import com.senac.esquinaBeer.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService {

    private CarrinhoEntity carrinho = new CarrinhoEntity();
    
    @Autowired
    CarrinhoRepository carrinhoRepository;
    
    @Autowired
    private ProdutoService produtoService;
    
    public CarrinhoEntity getCarrinho() {
        return carrinho;
    }
    
    public void adicionarProdutoAoCarrinho(Integer produtoId) {
        ProdutoEntity produto = produtoService.buscarPorId(produtoId);
        carrinho = getCarrinho();
        
        System.out.println(carrinho);
        
        // Verificar se o produto já está no carrinho
        boolean produtoJaNoCarrinho = false;
        for (ProdutoEntity produtoNoCarrinho : carrinho.getProdutos()) {
            if (produtoNoCarrinho.getId().equals(produtoId)) {
                produtoJaNoCarrinho = true;
                // Atualizar a quantidade e o valor total
                produtoNoCarrinho.setQuantidade(produtoNoCarrinho.getQuantidade() + 1);
                carrinho.setQuantidadeTotal(carrinho.getQuantidadeTotal() + 1);
                carrinho.setValorTotal(carrinho.getValorTotal() + produto.getPreco());
                break;
            }
        }

        if (!produtoJaNoCarrinho) {
            // Se o produto não estiver no carrinho, adicionar ao carrinho com quantidade 1
            produto.setQuantidade(1);
            carrinho.getProdutos().add(produto);
            carrinho.setQuantidadeTotal(carrinho.getQuantidadeTotal() + 1);
            carrinho.setValorTotal(carrinho.getValorTotal() + produto.getPreco());
        }
    }


    public void removerProdutoDoCarrinho(Integer produtoId) {
        ProdutoEntity produto = produtoService.buscarPorId(produtoId);
        carrinho = getCarrinho();
    
        // Procurar o produto no carrinho
        for (ProdutoEntity produtoNoCarrinho : carrinho.getProdutos()) {
            if (produtoNoCarrinho.getId().equals(produtoId)) {
                // Se a quantidade do produto for maior que 1, diminuir a quantidade e atualizar o valor total
                if (produtoNoCarrinho.getQuantidade() > 1) {
                    produtoNoCarrinho.setQuantidade(produtoNoCarrinho.getQuantidade() - 1);
                    carrinho.setQuantidadeTotal(carrinho.getQuantidadeTotal() - 1);
                    carrinho.setValorTotal(carrinho.getValorTotal() - produto.getPreco());
                } else {
                    // Se a quantidade for 1 ou menos, remover o produto completamente do carrinho
                    carrinho.getProdutos().remove(produtoNoCarrinho);
                    carrinho.setQuantidadeTotal(carrinho.getQuantidadeTotal() - 1);
                    carrinho.setValorTotal(carrinho.getValorTotal() - produto.getPreco());
                }
                break;
            }
        }
    }

    public void finalizarCompra() {
        carrinhoRepository.save(carrinho);
        carrinho.limparCarrinho();
    }
}



