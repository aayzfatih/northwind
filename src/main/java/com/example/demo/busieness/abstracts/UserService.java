package com.example.demo.busieness.abstracts;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entities.concrete.User;

public interface UserService {
    Result add(User user);
    DataResult<User> findByEmail(String email);
}
