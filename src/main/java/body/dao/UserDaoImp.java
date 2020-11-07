package body.dao;



import body.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> allUsers() {
        List<User> user = entityManager.createQuery("from User", User.class).setMaxResults(Integer.MAX_VALUE).getResultList();
        return user;
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {
        entityManager.createQuery("delete from User where id=:id").setParameter("id", user.getId()).executeUpdate();
        // entityManager.remove(user); // error 500
    }

    @Override
    public void edit(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getById(int id) {
        User user = entityManager.find(User.class, id);
        //entityManager.detach(user); //зачем ты здесь
        return user;
    }
    

}
