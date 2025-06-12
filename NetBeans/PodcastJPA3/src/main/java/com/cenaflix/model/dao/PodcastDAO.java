package com.cenaflix.model.dao;

import com.cenaflix.model.entities.JPAUtil;
import com.cenaflix.model.entities.Podcast;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PodcastDAO {

    public void cadastrar(Podcast p) {
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
            Podcast p = em.find(Podcast.class, id);
            if (p != null) {
                em.getTransaction().begin();
                em.remove(p);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Podcast obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Podcast.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public Podcast obter(String produtor) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Podcast.class, produtor);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void atualizar(Podcast p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Podcast> listar(String filtroProdutor, String duracao, Integer numeroEpisodio,
            String filtroNomeEpisodio, String filtroUrl) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Podcast> podcasts = null;
        try {
            String textoQuery = "SELECT p FROM Podcast p "
                    + "WHERE (:produtorFiltro IS NULL OR p.produtor LIKE :produtorFiltro) "
                    + "AND (:duracaoFiltro IS NULL OR p.duracao >= :duracaoFiltro) "
                    + "AND (:numeroEpisodioFiltro = -1 OR p.numero_episodio >= :numeroEpisodioFiltro) "
                    + "AND (:nomeEpisodioFiltro IS NULL OR p.nomeEpisodio LIKE :nomeEpisodioFiltro) "
                    + "AND (:urlFiltro IS NULL OR p.url LIKE :urlFiltro)";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("produtorFiltro", filtroProdutor.isEmpty() ? null : "%" + filtroProdutor + "%");
            consulta.setParameter("duracaoFiltro", duracao.isEmpty() ? null : LocalTime.parse(duracao, DateTimeFormatter.ofPattern("HH:mm")));
            consulta.setParameter("numeroEpisodioFiltro", numeroEpisodio);
            consulta.setParameter("nomeEpisodioFiltro", filtroNomeEpisodio.isEmpty() ? null : "%" + filtroNomeEpisodio + "%");
            consulta.setParameter("urlFiltro", filtroUrl.isEmpty() ? null : "%" + filtroUrl + "%");

            podcasts = consulta.getResultList();

        } finally {
            JPAUtil.closeEntityManager();
        }
        return podcasts;
    }

    public List<Podcast> obterPorProdutor(String filtroProdutor) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query query = em.createQuery("SELECT p FROM Podcast p WHERE p.produtor = :filtroProdutor", Podcast.class);
            query.setParameter("filtroProdutor", filtroProdutor);
            return query.getResultList();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
