package br.com.fiap.shiftweb6.model.mixin;

import br.com.fiap.shiftweb6.model.ProdutoModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public interface ProdutosMixin {

    @JsonIgnore
    List<ProdutoModel> getProdutos();
}
