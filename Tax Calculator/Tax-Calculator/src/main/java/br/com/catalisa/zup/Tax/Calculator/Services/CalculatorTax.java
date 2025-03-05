package br.com.catalisa.zup.Tax.Calculator.Services;

import br.com.catalisa.zup.Tax.Calculator.DTOs.TaxDTO;
import br.com.catalisa.zup.Tax.Calculator.Models.Tax;
import br.com.catalisa.zup.Tax.Calculator.Repository.TaxReposirtory;

import java.util.Optional;

public class CalculatorTax {
    private TaxReposirtory taxReposirtory;

    public CalculatorTax(TaxReposirtory taxReposirtory) {
        this.taxReposirtory = taxReposirtory;
    }
}