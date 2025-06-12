package com.br.rentdrive.model.dao;

import com.br.rentdrive.model.entities.Clientes;
import com.br.rentdrive.model.entities.JPAUtil;
import static com.br.rentdrive.model.entities.JPAUtil.getEntityManager;
import com.br.rentdrive.model.entities.contract.Compras;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class ClienteDAO {

    public void cadastrar(Clientes c) {
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
            Clientes c = em.find(Clientes.class, id);
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

   

    public void atualizar(Clientes c) {
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
     public Clientes findById(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Clientes.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public Clientes obterLogin(String login) {
        EntityManager em = getEntityManager();
        Clientes cliente = null;
        try {
            cliente = em.createQuery("SELECT c FROM Clientes c "
                    + "WHERE c.login = :login", Clientes.class)
                    .setParameter("login", login)
                    .getSingleResult();
        } catch (NoResultException e) {
        } finally {
            em.close();
        }
        return cliente;
    }
    
    
}
