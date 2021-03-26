package com.knishe.supplier;

import org.springframework.context.ApplicationEvent;

public class SupplierCreateEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public SupplierCreateEvent(Object source) {
        super(source);
    }
}
