package com.cenaflix.model.dao;

import com.cenaflix.model.entities.JPAUtil;
import static com.cenaflix.model.entities.JPAUtil.getEntityManager;
import com.cenaflix.model.entities.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;


public class UsuarioDAO {

    public void cadastrar(Usuarios u) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(u);
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
            Usuarios u = em.find(Usuarios.class, id);
            if (u != null) {
                em.getTransaction().begin();
                em.remove(u);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Usuarios obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Usuarios.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Usuarios obter(String login) {
        EntityManager em = getEntityManager();
        Usuarios usuario = null;
        try {
            usuario = em.createQuery("SELECT u FROM Usuarios u "
                    + "WHERE u.login = :login", Usuarios.class)
                    .setParameter("login", login)
                    .getSingleResult();
        } catch (NoResultException e) {
        } finally {
            em.close();
        }
        return usuario;
    }

    public void atualizar(Usuarios u) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

}
