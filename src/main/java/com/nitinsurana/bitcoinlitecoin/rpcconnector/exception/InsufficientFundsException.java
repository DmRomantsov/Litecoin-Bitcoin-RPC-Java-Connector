package com.nitinsurana.bitcoinlitecoin.rpcconnector.exception;

/**
 * Created by d.romantsov on 22.05.2015.
 */
public class InsufficientFundsException extends BitcoindException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}