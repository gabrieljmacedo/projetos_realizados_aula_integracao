package br.com.fiap.shiftweb6.model.mixin;

import br.com.fiap.shiftweb6.model.LojaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public interface LojasMixin {

    @JsonIgnore
    List<LojaModel> getLojas();
}
