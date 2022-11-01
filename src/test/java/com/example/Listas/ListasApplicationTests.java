package com.example.Listas;

import com.example.Listas.controller.ListasRequest;
import com.example.Listas.service.ListasService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ListasApplicationTests {
	@Autowired
	private ListasService ls;
	@Test
	void testVerificarSiEsNumeroMayor() {
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ListasRequest lq = new ListasRequest(li);
		List<String> numeros = ls.hallarNumeros(lq);
		assertEquals("Numero Mayor: 50",numeros.get(0));
	}
	@Test
	void testVerificarSiEsNumeroMenor() {
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ListasRequest lq = new ListasRequest(li);
		List<String> numeros = ls.hallarNumeros(lq);
		assertEquals("Numero Menor: -1",numeros.get(1));
	}
	@Test
	void testVerificarSumaTotal() {
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ListasRequest lq = new ListasRequest(li);
		List<String> numeros = ls.hallarNumeros(lq);
		assertEquals("Suma Total: 52",numeros.get(2));
	}
	@Test
	void testVerificarSumaPositivos() {
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ListasRequest lq = new ListasRequest(li);
		List<String> numeros = ls.hallarNumeros(lq);
		assertEquals("Suma Positivos: 53",numeros.get(3));
	}
	@Test
	void testVerificarSumaNegativos() {
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ListasRequest lq = new ListasRequest(li);
		List<String> numeros = ls.hallarNumeros(lq);
		assertEquals("Suma Negativos: -1",numeros.get(4));
	}
}
