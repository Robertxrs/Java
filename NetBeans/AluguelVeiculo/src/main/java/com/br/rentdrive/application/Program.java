package com.br.rentdrive.application;

import com.br.rentdrive.model.dao.AluguelDAO;
import com.br.rentdrive.model.dao.ClienteDAO;
import com.br.rentdrive.model.dao.CompraDAO;
import com.br.rentdrive.model.dao.FuncionarioDAO;
import com.br.rentdrive.model.dao.PagamentoDAO;
import com.br.rentdrive.model.dao.VeiculoDAO;
import com.br.rentdrive.model.entities.Clientes;
import com.br.rentdrive.model.entities.Funcionarios;
import com.br.rentdrive.model.entities.Veiculos;
import com.br.rentdrive.model.entities.contract.Aluguel;
import com.br.rentdrive.model.entities.contract.Compras;
import com.br.rentdrive.model.entities.contract.Pagamentos;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Objects;

public class Program {

    public static void main(String[] args) throws ParseException {
        
        
        //Cadastrando os objetos nas tabelas do banco de dados
        /*

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ClienteDAO clienteDAO = new ClienteDAO();
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        PagamentoDAO pagamentoDAO = new PagamentoDAO();
        AluguelDAO aluguelDAO = new AluguelDAO();
        CompraDAO  compraDAO = new CompraDAO();
        
        Clientes novoCliente = new Clientes("nomeT", "loginT", "senhaT", "cpfT", "telefoneT", "enderecoT", "habilitacaoT");
        clienteDAO.cadastrar(novoCliente);

        Veiculos novoVeiculo = new Veiculos("marcaT", "modeloT", "placaT", sdf.parse("01/01/2024"), "estadoT");
        veiculoDAO.cadastrar(novoVeiculo);

        Clientes cliente = clienteDAO.findById(1);
        Veiculos veiculo = veiculoDAO.findById(1);
        
        java.util.Date dataPagamentoUtil = sdf.parse("01/01/2024");
        java.sql.Date dataPagamento = new java.sql.Date(dataPagamentoUtil.getTime());
        Pagamentos novoPagamento = new Pagamentos(cliente, "tipoT", 20000.00, "parcelaT", "statusT", dataPagamento);
        pagamentoDAO.cadastrar(novoPagamento);
        
        Pagamentos pagamento = pagamentoDAO.findById(1);
        
        
        java.util.Date dataAluguelUtil = sdf.parse("01/01/2024");
        java.sql.Date dataAluguel = new java.sql.Date(dataAluguelUtil.getTime());
        java.util.Date dataDevolucaoUtil = sdf.parse("01/02/2024");
        java.sql.Date dataDevolucao = new java.sql.Date(dataDevolucaoUtil.getTime());
        Aluguel novoAluguel = new Aluguel(cliente, veiculo, dataAluguel, 3000.00, dataDevolucao, pagamento);
        aluguelDAO.cadastrar(novoAluguel);

        java.util.Date anoUtil = sdf.parse("31/02/2024");
        java.sql.Date ano = new java.sql.Date(anoUtil.getTime());
        Compras novoCompra = new Compras(cliente, veiculo, ano, 30000.00, pagamento, "Pago");
        compraDAO.cadastrar(novoCompra);
        
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SR");
        Funcionarios novoFuncionario = new Funcionarios("funcionarioT","loginT","senhaT","cpfT","telefoneT","enderecoT");
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.cadastrar(novoFuncionario);
        
        
        System.out.println("Sucesso!");
        emf.close();
        */
    }
}
