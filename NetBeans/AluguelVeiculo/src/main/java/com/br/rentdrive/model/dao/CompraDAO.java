package com.br.rentdrive.model.dao;

import com.br.rentdrive.model.entities.JPAUtil;
import com.br.rentdrive.model.entities.contract.Compras;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class CompraDAO {

    public void cadastrar(Compras c) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
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
            Compras c = em.find(Compras.class, id);
            if (c != null) {
                em.getTransaction().begin();
                em.persist(c);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Compras> listar(Integer filtroId, Integer filtroClienteId, Integer filtroVeiculoId,
             String filtroDataRetirada,Double filtroValor) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Compras> compras = null;
        try {
            String textoQuery = "SELECT c FROM Compras c "
                    + "WHERE (:idFiltro = -1 OR c.id >= :idFiltro) "
                    + "AND (:clienteIdFiltro = -1 OR c.clienteId.id = :clienteIdFiltro) "
                    + "AND (:veiculoIdFiltro = -1 OR c.veiculoId.id = :veiculoIdFiltro) "
                    
                    + "AND (:dataRetiradaFiltro IS NULL OR c.dataRetirada >= :dataRetiradaFiltro) "
                    + "AND (:valorFiltro IS NULL OR c.valor >= :valorFiltro) ";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("idFiltro", filtroId);
            consulta.setParameter("clienteIdFiltro", filtroClienteId);
            consulta.setParameter("veiculoIdFiltro", filtroVeiculoId);
           
            consulta.setParameter("valorFiltro", filtroValor);
            

            compras = consulta.getResultList();
        } catch (Exception ex) {
            System.err.println("Erro: " + ex.getMessage());
        } finally {
            JPAUtil.closeEntityManager();
        }
        return compras;
    }

    public void atualizar(Compras c) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Compras findById(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Compras.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

     public List<Compras> obterId(Integer filtroId) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        Query query = em.createQuery("SELECT c FROM Aluguel c WHERE c.id = :filtroId", Compras.class);
        query.setParameter("filtroId", filtroId);
        return query.getResultList();
    } finally {
        JPAUtil.closeEntityManager();
    }
}
    
}
