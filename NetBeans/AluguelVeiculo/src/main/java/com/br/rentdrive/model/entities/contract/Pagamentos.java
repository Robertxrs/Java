package com.br.rentdrive.model.entities.contract;

import com.br.rentdrive.model.entities.Clientes;
import com.br.rentdrive.model.entities.Veiculos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pagamentos")
public class Pagamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes cliente_id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "status")
    private String status;

    @Column(name = "data_pagamento")
    private Date data_pagamento;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculos veiculo_id;

    public Pagamentos(Clientes cliente_id, String tipo, String status, Date data_pagamento, Veiculos veiculo_id) {
        this.cliente_id = cliente_id;
        this.tipo = tipo;
        this.status = status;
        this.data_pagamento = data_pagamento;
        this.veiculo_id = veiculo_id;
    }

    public Pagamentos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Clientes getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Clientes cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Veiculos getVeiculo_id() {
        return veiculo_id;
    }

    public void setVeiculo_id(Veiculos veiculo_id) {
        this.veiculo_id = veiculo_id;
    }
}
