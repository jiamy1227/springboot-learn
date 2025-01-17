package org.jiamy.service;

import org.jiamy.entity.User;

/**
 * @author: jiamy
 * @create: 2025/1/13 9:19
 **/
public interface MyUserService {
    User getById(String id);

    User getByName(String name);
}
