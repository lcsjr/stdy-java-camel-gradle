package br.com.stdy.camel.model;

import java.util.Calendar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Negociacao {

    private double preco;
    private int quantidade;
    private Calendar data;


//    @Override
//    public String toString() {
//        return "Negociacao [preco=" + preco + ", quantidade=" + quantidade + "]";
//    }
}
