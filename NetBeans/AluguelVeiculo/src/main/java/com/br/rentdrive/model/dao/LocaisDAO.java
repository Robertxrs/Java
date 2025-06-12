/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.rentdrive.model.dao;

import com.br.rentdrive.model.entities.JPAUtil;
import com.br.rentdrive.model.entities.contract.Aluguel;
import com.br.rentdrive.model.entities.contract.Locais;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class LocaisDAO {

    public void cadastrar(Locais l) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(l);
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
            Locais l = em.find(Locais.class, id);
            if (l != null) {
                em.getTransaction().begin();
                em.persist(l);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Locais> listar(Integer filtroId,String filtroNome, String filtroEndereco,
            String filtroCidade, String filtroEstado) {

        EntityManager em = JPAUtil.getEntityManager();
        List<Locais> local = null;
        try {
            String textoQuery = "SELECT l FROM Locais l "
                    + " WHERE (:idFiltro = -1 OR l.id >= :idFiltro) "
                    + " AND (:nomeFiltro IS NULL OR l.nome LIKE :nomeFiltro) "
                    + " AND (:enderecoFiltro IS NULL OR l.endereco LIKE :enderecoFiltro) "
                    + " AND (:cidadeFiltro IS NULL OR l.cidade LIKE :cidadeFiltro) "
                    + " AND (:estadoFiltro IS NULL OR l.estado LIKE :estadoFiltro) ";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("idFiltro", filtroId);
            consulta.setParameter("nomeFiltro", filtroNome.isEmpty() ? null : "%" + filtroNome + "%");
            consulta.setParameter("enderecoFiltro", filtroEndereco.isEmpty() ? null : "%" + filtroEndereco + "%");
            consulta.setParameter("cidadeFiltro", filtroCidade.isEmpty() ? null : "%" + filtroCidade + "%");
            consulta.setParameter("estadoFiltro", filtroEstado.isEmpty() ? null : "%" + filtroEstado + "%");

            local = consulta.getResultList();
        } finally {
            JPAUtil.closeEntityManager();
        }
        return local;
    }

    public void atualizar(Locais l) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(l);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Locais obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Locais.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Locais> obterNome(String filtroNome) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query query = em.createQuery("SELECT l FROM Locais l WHERE l.nome = :filtroNome", Locais.class);
            query.setParameter("filtroNome", filtroNome);
            return query.getResultList();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

}
