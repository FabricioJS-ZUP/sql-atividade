package br.com.catalisa.zup.Tax.Calculator.Controllers;

import br.com.catalisa.zup.Tax.Calculator.Services.DeleteImposto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/impostos/deleteImposto")
public class DeleteImpostosController {
    private final DeleteImposto deleteImposto;

    public DeleteImpostosController(DeleteImposto deleteImposto) {
        this.deleteImposto = deleteImposto;
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<String> deletando(@PathVariable long id) {
        try {
            deleteImposto.deletando(id);
            return ResponseEntity.ok("Imposto deletado");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}