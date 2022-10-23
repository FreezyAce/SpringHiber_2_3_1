package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.DaoUserImpl;
import web.model.User;

import java.util.List;

@Component
@Service
public class UserService {

    private static DaoUserImpl daoUser;

    @Autowired
    public UserService(DaoUserImpl daoUser) {
        this.daoUser = daoUser;
    }

    @Transactional
    public void addUser(User user) {
    }

    @Transactional
    public User userById(long id){
        return daoUser.userById(id);
    }

    @Transactional
    public List<User> getUser() {
        return daoUser.getUser();
    }

    @Transactional
    public void save(User user) {
        daoUser.save(user);
    }
    @Transactional
    public void deleteUser(long id) {
        daoUser.deleteUser(id);
    }

    @Transactional
    public void update(long id, User user) {
        daoUser.update(id, user);
    }

}
