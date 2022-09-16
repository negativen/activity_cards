package com.example;

import javax.naming.OperationNotSupportedException;

public interface Deck {

    void shuffle();
    void cut(int index);
    Card deal;
    Card turnover;
    int search(Card card);
    int size();

    default int newSize() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }


}
