package com.example.Listas.controller;

import java.util.List;

public class ListasRequest {

    private List<Integer> listadonuneros;

    public ListasRequest() {
    }

    public ListasRequest(List<Integer> listadonuneros) {
        this.listadonuneros = listadonuneros;
    }


    public List<Integer> getListadonuneros() {
         return listadonuneros;
    }

    public void setListadonuneros(List<Integer> listadonuneros) {
        this.listadonuneros = listadonuneros;
    }
}


