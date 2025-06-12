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
@Table(name = "Compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes clienteId;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculos veiculoId;
    @Column(name = "data_retirada")
    private Date dataRetirada;

    @Column(name = "valor")
    private double valor;

    public Compras(Clientes clienteId, Veiculos veiculoId, Date dataRetirada, double valor) {
        this.clienteId = clienteId;
        this.veiculoId = veiculoId;
        this.dataRetirada = dataRetirada;
        this.valor = valor;
    }

    public Compras(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Compras() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Clientes getClienteId() {
        return clienteId;
    }

    public void setClienteId(Clientes clienteId) {
        this.clienteId = clienteId;
    }

    public Veiculos getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Veiculos veiculoId) {
        this.veiculoId = veiculoId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }
}
