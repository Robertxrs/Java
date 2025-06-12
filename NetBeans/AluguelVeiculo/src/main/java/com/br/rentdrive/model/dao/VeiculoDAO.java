package com.br.rentdrive.model.dao;

import com.br.rentdrive.model.entities.Clientes;
import com.br.rentdrive.model.entities.JPAUtil;
import com.br.rentdrive.model.entities.Veiculos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class VeiculoDAO {

    public void cadastrar(Veiculos v) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(v);
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
            Veiculos v = em.find(Veiculos.class, id);
            if (v != null) {
                em.getTransaction().begin();
                em.persist(v);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Veiculos findById(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Veiculos.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Veiculos> listar(Integer filtroId, String filtroMarca, String filtroModelo, String filtroPlaca,
            String filtroAno, String filtroEstado, Double filtroValorAluguel, Double filtroValor) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Veiculos> veiculos = null;
        try {
            String textoQuery = "SELECT v FROM Veiculos v "
                    + "WHERE (:idFiltro = -1 OR v.id >= :idFiltro) "
                    + "AND (:marcaFiltro IS NULL OR v.marca LIKE :marcaFiltro) "
                    + "AND (:modeloFiltro IS NULL OR v.marca LIKE :modeloFiltro) "
                    + "AND (:placaFiltro IS NULL OR v.placa LIKE :placaFiltro) "
                    + "AND (:anoFiltro IS NULL OR v.ano >= :anoFiltro) "
                    + "AND (:estadoFiltro IS NULL OR v.estado LIKE :estadoFiltro) "
                    + "AND (:valorAluguelFiltro IS NULL OR v.valorAluguel >= :valorAluguelFiltro) "
                    + "AND (:valorFiltro IS NULL OR v.valor >= :valorFiltro) ";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("idFiltro", filtroId);
            consulta.setParameter("marcaFiltro", filtroMarca.isEmpty() ? null : "%" + filtroMarca + "%");
            consulta.setParameter("modeloFiltro", filtroModelo.isEmpty() ? null : "%" + filtroModelo + "%");
            consulta.setParameter("placaFiltro", filtroPlaca.isEmpty() ? null : "%" + filtroPlaca + "%");
            consulta.setParameter("anoFiltro", filtroAno.isEmpty() ? null
                    : new SimpleDateFormat("dd/MM/yyyy").parse(filtroAno));
            consulta.setParameter("estadoFiltro", filtroEstado.isEmpty() ? null : "%" + filtroEstado + "%");
            consulta.setParameter("valorAluguelFiltro", filtroValorAluguel);
            consulta.setParameter("valorFiltro", filtroValor);

            veiculos = consulta.getResultList();
        } catch (ParseException ex) {
            System.err.println("Erro ao converter data: " + ex.getMessage());
        } finally {
            JPAUtil.closeEntityManager();
        }
        return veiculos;
    }

    public Veiculos obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Veiculos.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
     public List<Veiculos> obterMarca(String filtroMarca) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query query = em.createQuery("SELECT v FROM Veiculos v WHERE v.marca = :filtroMarca", Veiculos.class);
            query.setParameter("filtroMarca", filtroMarca);
            return query.getResultList();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    
}
