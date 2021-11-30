package com.company;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailMessage> {


    @Override
    public void accept(MailMessage mailMessage) {

    }

    @Override
    public Consumer<MailMessage> andThen(Consumer<? super MailMessage> after) {
        return Consumer.super.andThen(after);
    }

    public Map<String, List<T>> getMailBox() {
        return null;
    }
}
