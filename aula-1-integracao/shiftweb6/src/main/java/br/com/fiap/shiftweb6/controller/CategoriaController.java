package br.com.fiap.shiftweb6.controller;

import br.com.fiap.shiftweb6.model.CategoriaModel;
import br.com.fiap.shiftweb6.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaModel> findById(@PathVariable("id") Long id){
        CategoriaModel categoriaModel = categoriaRepository.findById(id).orElse(null);

        if (null == categoriaModel){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(categoriaModel);
        }
    }

    public ResponseEntity<List<CategoriaModel>> findAll(){

        return ResponseEntity.ok(categoriaRepository.findAll());
    }
    @GetMapping("/total")
    public ResponseEntity<Long> getTotalCategorias() {
        return ResponseEntity.ok(categoriaRepository.getTotalCategorias());
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<CategoriaModel>> findByName(@PathVariable("nome") String nome){

        return ResponseEntity.ok(categoriaRepository.findByNomeCategoriaContains(nome));
    }
}
