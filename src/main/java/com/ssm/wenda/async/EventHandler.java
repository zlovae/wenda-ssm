package com.ssm.wenda.async;

import java.util.List;

/**
 * Created by zlovae on 2019/3/20.
 */
public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
