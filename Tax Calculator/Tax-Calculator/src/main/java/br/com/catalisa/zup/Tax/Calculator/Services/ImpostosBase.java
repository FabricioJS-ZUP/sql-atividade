package br.com.catalisa.zup.Tax.Calculator.Services;

import br.com.catalisa.zup.Tax.Calculator.DTOs.TaxDTO;
import br.com.catalisa.zup.Tax.Calculator.Repository.TaxReposirtory;
import lombok.AllArgsConstructor;
import lombok.Setter;


import java.util.Optional;
public class ImpostosBase {
    private TaxReposirtory taxReposirtory;

    public ImpostosBase(TaxReposirtory taxReposirtory) {
        this.taxReposirtory = taxReposirtory;
    }

//    public ImpostosDTO impostosDTO(long id) {
//        Optional<Impostos> optional = impostosReposirtoy.findById(id);
//        if (optional.isEmpty()) {
//            throw new IllegalArgumentException("Imposto com o ID " + id + " não encontrado.");
//        }
//        Impostos impostos = optional.get();
//        switch (id) {
//            case 1:
//                impostos.setName("ICMS");
//                impostos.setRate(18);
//                break;
//            case 2:
//                impostos.setName("ISS");
//                impostos.setRate(3.5);  //Como o valor do ISS é de 2% e o máximo de 5% vou pegar a media deles
//                break;
//            case 3:
//                impostos.setName("IPI");
//                impostos.setRate(21.75); //Como o valor varia de 18.5 á 25 vou pegar a media
//                break;
//            default:
//        }
//        impostos.setValorbase
//        impostos.getName();
//        impostos.getRate();
//        impostos.set
//        impostos.getInputValue();
//        impostos.setTotalValue((impostos.getInputValue() * (impostos.getRate() / 100)));
//        return new ImpostosDTO(impostos.getId(), impostos.getName(), impostos.getInputValue(), impostos.getRate(), impostos.getTotalValue());
//    }
}
