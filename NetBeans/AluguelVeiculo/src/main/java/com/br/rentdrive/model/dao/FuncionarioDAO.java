
package com.br.rentdrive.model.dao;

import com.br.rentdrive.model.entities.Funcionarios;
import com.br.rentdrive.model.entities.JPAUtil;
import static com.br.rentdrive.model.entities.JPAUtil.getEntityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

public class FuncionarioDAO {
    public void cadastrar(Funcionarios f) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(f);
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
            Funcionarios f = em.find(Funcionarios.class, id);
            if (f != null) {
                em.getTransaction().begin();
                em.persist(f);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public Funcionarios findById(int id){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            return em.find(Funcionarios.class, id);
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
    
    public Funcionarios obter(String login) {
        EntityManager em = getEntityManager();
        Funcionarios funcionario = null;
        try {
            funcionario = em.createQuery("SELECT f FROM Funcionarios f "
                    + "WHERE f.login = :login", Funcionarios.class)
                    .setParameter("login", login)
                    .getSingleResult();
        } catch (NoResultException e) {
        } finally {
            em.close();
        }
        return funcionario;
    }
    
}
