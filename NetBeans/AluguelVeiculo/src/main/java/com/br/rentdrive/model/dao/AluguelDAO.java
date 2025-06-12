package com.br.rentdrive.model.dao;

import com.br.rentdrive.model.entities.JPAUtil;
import com.br.rentdrive.model.entities.contract.Aluguel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class AluguelDAO {

    public void cadastrar(Aluguel a) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(a);
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
            Aluguel a = em.find(Aluguel.class, id);
            if (a != null) {
                em.getTransaction().begin();
                em.remove(a); 
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Aluguel> listar(Integer filtroId, Integer filtroClienteId, Integer filtroVeiculoId,
            String filtroDataAluguel, Double filtroValor, String filtroDataDevolucao) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Aluguel> alugueis = null;
        try {
            String textoQuery = "SELECT a FROM Aluguel a "
                    + "WHERE (:idFiltro = -1 OR a.id >= :idFiltro) "
                    + "AND (:clienteIdFiltro = -1 OR a.clienteId.id = :clienteIdFiltro) "
                    + "AND (:veiculoIdFiltro = -1 OR a.veiculoId.id = :veiculoIdFiltro) "
                    + "AND (:dataAluguelFiltro IS NULL OR a.dataAluguel >= :dataAluguelFiltro) "
                    + "AND (:valorFiltro IS NULL OR a.valor >= :valorFiltro) "
                    + "AND (:dataDevolucaoFiltro IS NULL OR a.dataDevolucao >= :dataDevolucaoFiltro) ";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("idFiltro", filtroId);
            consulta.setParameter("clienteIdFiltro", filtroClienteId);
            consulta.setParameter("veiculoIdFiltro", filtroVeiculoId);
            consulta.setParameter("dataAluguelFiltro", (filtroDataAluguel == null || filtroDataAluguel.isEmpty()) ? null
                    : new SimpleDateFormat("dd/MM/yyyy").parse(filtroDataAluguel));
            consulta.setParameter("valorFiltro", filtroValor);
            consulta.setParameter("dataDevolucaoFiltro", (filtroDataDevolucao == null || filtroDataDevolucao.isEmpty()) ? null
                    : new SimpleDateFormat("dd/MM/yyyy").parse(filtroDataDevolucao));

            alugueis = consulta.getResultList();
        } catch (ParseException ex) {
            System.err.println("Erro ao converter data: " + ex.getMessage());
        } finally {
            JPAUtil.closeEntityManager();
        }
        return alugueis;
    }

    public void atualizar(Aluguel a) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
   public List<Aluguel> obterId(Integer filtroId) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        Query query = em.createQuery("SELECT a FROM Aluguel a WHERE a.id = :filtroId", Aluguel.class);
        query.setParameter("filtroId", filtroId);
        return query.getResultList();
    } finally {
        JPAUtil.closeEntityManager();
    }
}
}
