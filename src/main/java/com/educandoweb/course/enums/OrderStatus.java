package com.educandoweb.course.enums;

public enum OrderStatus {

		WAITING_PAYMENT(1),
		PAID(2),
		SHIPPED(3),
		DELIVERED(4),
		CANCELED(5);
	//ATRIBUINDO OS VALORES MANUALMENTE.
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	
	public int getCode() {
		return code;
	}
	//METODO PARA ACESSAR O CODE, JA QUE O CONTRUTOR DELE E PRIVADO 
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code){
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code"); 
	}
	//METODO PARA CONVERTER UM CODIGO PARA UM TIPO ENUMERADO
}
