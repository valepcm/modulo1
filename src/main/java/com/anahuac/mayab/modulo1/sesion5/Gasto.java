package com.anahuac.mayab.modulo1.sesion5;

public abstract class Gasto {
	private double monto;
	private String categoria;
	private String fecha;
	private String tipoPago;
	
	public Gasto(double monto, String categoria, String fecha, String tipoPago) {
		super();
		this.monto = monto;
		this.categoria = categoria;
		this.fecha = fecha;
		this.tipoPago = tipoPago;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

}
