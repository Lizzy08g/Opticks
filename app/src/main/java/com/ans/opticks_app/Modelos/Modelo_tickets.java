package com.ans.opticks_app.Modelos;

import java.util.Date;

public class Modelo_tickets {
    Integer id_ticket;
    String nombre_cliente;

    public Modelo_tickets() {
    }

    public Modelo_tickets(Integer id_ticket, String nombre_cliente) {
        this.id_ticket = id_ticket;
        this.nombre_cliente = nombre_cliente;
    }

    public Integer getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(Integer id_ticket) {
        this.id_ticket = id_ticket;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
}
