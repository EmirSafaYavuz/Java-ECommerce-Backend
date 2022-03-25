package com.emirsafayavuz.northwind.business.concretes;

import com.emirsafayavuz.northwind.business.abstracts.UserService;
import com.emirsafayavuz.northwind.core.dataAccess.UserDao;
import com.emirsafayavuz.northwind.core.entities.User;
import com.emirsafayavuz.northwind.core.utilities.results.DataResult;
import com.emirsafayavuz.northwind.core.utilities.results.Result;
import com.emirsafayavuz.northwind.core.utilities.results.SuccessDataResult;
import com.emirsafayavuz.northwind.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı Eklendi");
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.getByEmail(email));
    }
}
