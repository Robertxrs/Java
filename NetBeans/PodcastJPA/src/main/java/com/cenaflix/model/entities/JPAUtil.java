package com.cenaflix.model.entities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static final String PERSISTENCE_UNIT = "Pod";
    private static EntityManager em;
    private static EntityManagerFactory fabrica;

    public static EntityManager getEntityManager() {
        if (fabrica == null || !fabrica.isOpen()) {
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
       }if (em == null || !em.isOpen()) {
            em = fabrica.createEntityManager();
        }return em;
    }
    public static void closeEntityManager() {
        if (em != null && em.isOpen()) {
            em.close();
        }if (fabrica != null && fabrica.isOpen()) {
            fabrica.close();
        }
    }
}
