package com.proj.servlet;

public class Calcular {
       public int val1;
       public int val2;
	
	public Calcular(int v1, int v2) {
		this.val1 = v1;
		this.val2 = v2;
	}

	public int somar () {
		return this.val1 + this.val2;
	}
	
	public int diminuir () {
		return this.val1 - this.val2;
	}
	
	public int multiplicar () {
		return this.val1 * this.val2;
	}
	
	public int dividir () {
		return this.val1 / this.val2;
	}
		
}
	