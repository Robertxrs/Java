package com.br.rentdrive.model.dao;

import com.br.rentdrive.model.entities.JPAUtil;
import com.br.rentdrive.model.entities.contract.Pagamentos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class PagamentoDAO {

    public void cadastrar(Pagamentos p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void excluir(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Pagamentos p = em.find(Pagamentos.class, id);
            if (p != null) {
                em.getTransaction().begin();
                em.remove(p);  // Corrigido para remove
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Pagamentos findById(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Pagamentos.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Pagamentos> listar(Integer filtroId, Integer filtroClienteId, String filtroTipo, String filtroStatus, String filtroDataPagamento,
            Integer filtroVeiculoId) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Pagamentos> pagamentos = null;
        try {
            String textoQuery = "SELECT p FROM Pagamentos p "
                    + "WHERE (:idFiltro < 0 OR p.id >= :idFiltro) "
                    + "AND (:clienteIdFiltro < 0 OR p.cliente_id.id = :clienteIdFiltro) "
                    + "AND (:tipoFiltro IS NULL OR p.tipo LIKE :tipoFiltro) "
                    + "AND (:statusFiltro IS NULL OR p.status LIKE :statusFiltro) "
                    + "AND (:dataPagamentoFiltro IS NULL OR p.data_pagamento >= :dataPagamentoFiltro) "
                    + "AND (:veiculoIdFiltro < 0 OR p.veiculo_id.id = :veiculoIdFiltro)";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("idFiltro", filtroId);
            consulta.setParameter("clienteIdFiltro", filtroClienteId);
            consulta.setParameter("tipoFiltro", filtroTipo.isEmpty() ? null : "%" + filtroTipo + "%");
            consulta.setParameter("statusFiltro", filtroStatus.isEmpty() ? null : "%" + filtroStatus + "%");
            consulta.setParameter("dataPagamentoFiltro", filtroDataPagamento.isEmpty() ? null
                    : new SimpleDateFormat("dd/MM/yyyy").parse(filtroDataPagamento));
            consulta.setParameter("veiculoIdFiltro", filtroVeiculoId);

            pagamentos = consulta.getResultList();
        } catch (ParseException ex) {
            System.err.println("Erro ao converter data: " + ex.getMessage());
        } finally {
            JPAUtil.closeEntityManager();
        }
        return pagamentos;
    }

    public Pagamentos obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Pagamentos.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Pagamentos> obterId(Integer filtroId) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query query = em.createQuery("SELECT p FROM Pagamentos p WHERE p.id = :filtroId", Pagamentos.class);
            query.setParameter("filtroId", filtroId);
            return query.getResultList();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
