package com.ssm.wenda.async;

/**
 * Created by zlovae on 2019/3/20.
 */
public enum EventType {
    LIKE(0),
    COMMENT(1),
    LOGIN(2),
    MAIL(3),
    FOLLOW(4),
    UNFOLLOW(5),
    ADD_QUESTION(6);

    private int value;
    EventType(int value) { this.value = value; }
    public int getValue() { return value; }
}
