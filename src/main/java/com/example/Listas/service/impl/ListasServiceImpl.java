package com.example.Listas.service.impl;

import com.example.Listas.controller.ListasRequest;
import com.example.Listas.service.ListasService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListasServiceImpl implements ListasService {

    @Override
    public List<String> hallarNumeros(ListasRequest entrada) {

        List<Integer> numeros = entrada.getListadonuneros();
        List<String> devuelveLista = new ArrayList<>();

        Integer num, max = 0, min = 9999999, suma=0, sumapos = 0, sumaneg = 0;

        for (int i = 0; i < numeros.size(); i++) {

            Integer numero = (numeros.get(i));

            suma = numero + suma;

            if (numero > max) {
                max = numero;
            } else if (numero < min)
                    {
                       min = numero;
                     }

            if (numero >= 0) {
                sumapos = numero + sumapos;
            } else {
                sumaneg = numero + sumaneg;
            }

        }
        devuelveLista.add(String.valueOf("Numero Mayor: " + max));
        devuelveLista.add(String.valueOf("Numero Menor: " + min));
        devuelveLista.add(String.valueOf("Suma Total: " + suma));
        devuelveLista.add(String.valueOf("Suma Positivos: " + sumapos));
        devuelveLista.add(String.valueOf("Suma Negativos: " + sumaneg));
        return devuelveLista;
    }
}
