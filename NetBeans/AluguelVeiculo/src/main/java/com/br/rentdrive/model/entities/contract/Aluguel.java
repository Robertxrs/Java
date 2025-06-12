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
@Table(name = "Aluguel")
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes clienteId;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculos veiculoId;

    @Column(name = "data_aluguel")
    private Date dataAluguel;
    @Column(name = "valor")
    private double valor;
    @Column(name = "data_devolucao")
    private Date dataDevolucao;

    public Aluguel(Clientes clienteId, Veiculos veiculoId, Date dataAluguel, double valor, Date dataDevolucao) {
        this.clienteId = clienteId;
        this.veiculoId = veiculoId;
        this.dataAluguel = dataAluguel;
        this.valor = valor;
        this.dataDevolucao = dataDevolucao;

    }

    public Aluguel(Date dataAluguel, Date dataDevolucao) {
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
    }

    public Aluguel() {
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

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
