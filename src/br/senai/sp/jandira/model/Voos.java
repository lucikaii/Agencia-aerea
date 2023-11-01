package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Voos {

    private int numeroVoo;
    private String origem, destino;
    private LocalDate dataVoo;

    public Voos (int numeroVoo, String origem, String destino, LocalDate dataVoo){

        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;


    }


}
