package com.emirsafayavuz.northwind.business.abstracts;

import com.emirsafayavuz.northwind.core.entities.User;
import com.emirsafayavuz.northwind.core.utilities.results.DataResult;
import com.emirsafayavuz.northwind.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResult<User> getByEmail(String email);
}
