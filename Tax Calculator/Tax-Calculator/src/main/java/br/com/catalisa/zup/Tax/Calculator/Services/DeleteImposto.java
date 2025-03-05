package br.com.catalisa.zup.Tax.Calculator.Services;

import br.com.catalisa.zup.Tax.Calculator.Repository.TaxReposirtory;
import org.springframework.stereotype.Service;
@Service
public class DeleteImposto {
    TaxReposirtory taxReposirtory;

    public DeleteImposto(TaxReposirtory taxReposirtory) {
        this.taxReposirtory = taxReposirtory;
    }

    // Deletar produto
    public void deletando(long id){
        taxReposirtory.deleteById(id);
    }
}
