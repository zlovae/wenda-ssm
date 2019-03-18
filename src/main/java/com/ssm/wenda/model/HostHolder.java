package com.ssm.wenda.model;

import org.springframework.stereotype.Component;

/**
 * Created by zlvae on 2019/3/18.
 */
@Component
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal<User>();

    public User getUser() {
        return users.get();
    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();;
    }
}
