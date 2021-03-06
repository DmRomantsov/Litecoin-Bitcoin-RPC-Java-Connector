package com.nitinsurana.bitcoinlitecoin.rpcconnector;

import com.google.gson.JsonArray;
import com.nitinsurana.bitcoinlitecoin.rpcconnector.exception.CryptoCurrencyRpcException;
import com.nitinsurana.bitcoinlitecoin.rpcconnector.pojo.Transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by d.romantsov on 20.03.2017.
 */
public class MockCryptoCurrencyRpc extends CryptoCurrencyRPC {
    private Random random = new Random();

    public MockCryptoCurrencyRpc() {
        super(null, null, "localhost", "1245", null, 0, "MOCK");
    }

    private Transaction getMockTransaction() {
        Transaction tx = new Transaction();
        tx.setAccount("mockAccount");
        tx.setAddress("n1v1XpeNaC124r9DXcBAka2XgJpcMpUBMB");
        tx.setCategory(random.nextBoolean() ? Transaction.Category.RECEIVE: Transaction.Category.SEND);
        tx.setAmount(new BigDecimal(random.nextDouble()));
        tx.setFee(new BigDecimal(random.nextDouble()/10));
        tx.setTimereceived(new Date().getTime() - random.nextInt(10000));
        return tx;
    }

    @Override
    public List<Transaction> listTransactions(String account, int count, int from) throws CryptoCurrencyRpcException {
        ArrayList<Transaction> txs= new ArrayList<Transaction>();
        txs.add(getMockTransaction());
        txs.add(getMockTransaction());
        txs.add(getMockTransaction());
        txs.add(getMockTransaction());
        txs.add(getMockTransaction());
        txs.add(getMockTransaction());
        return txs;
    }

    @Override
    public boolean backupWallet(String destination) throws CryptoCurrencyRpcException {
        return true;
    }

    @Override
    public String dumpPrivateKey(String address) throws CryptoCurrencyRpcException {
        return address;
    }

    @Override
    public String encryptWallet(String passphrase) throws CryptoCurrencyRpcException {
        return passphrase;
    }

    @Override
    public String getAccount(String address) throws CryptoCurrencyRpcException {
        return "mockAccount";
    }

    @Override
    public String getAccountAddress(String account) throws CryptoCurrencyRpcException {
        return "n1v1XpeNaC124r9DXcBAka2XgJpcMpUBMB";
    }

    @Override
    public JsonArray getAddressesByAccount(String account) throws CryptoCurrencyRpcException {
        return new JsonArray();
    }

    @Override
    public BigDecimal getBalance(String account) throws CryptoCurrencyRpcException {
        return BigDecimal.TEN;
    }

    @Override
    public BigDecimal getBalance() throws CryptoCurrencyRpcException {
        return BigDecimal.TEN;
    }

    @Override
    public BigDecimal getReceivedByAccount(String account) throws CryptoCurrencyRpcException {
        return BigDecimal.TEN;
    }

    @Override
    public String getNewAddress() throws CryptoCurrencyRpcException {
        return "n1v1XpeNaC124r9DXcBAka2XgJpcMpUBMB";
    }

    @Override
    public String getInfo() throws CryptoCurrencyRpcException {
        return "MockInfo";
    }

    @Override
    public String getNewAddress(String account) throws CryptoCurrencyRpcException {
        return "n1v1XpeNaC124r9DXcBAka2XgJpcMpUBMB";
    }

    @Override
    public BigDecimal getReceivedByAddress(String address) throws CryptoCurrencyRpcException {
        return BigDecimal.TEN;
    }

    @Override
    public Transaction getTransaction(String txid) throws CryptoCurrencyRpcException {
        return getMockTransaction();
    }

    @Override
    public String sendFrom(String fromAccount, String toAddress, BigDecimal amount) throws CryptoCurrencyRpcException {
        return "asdasdasdasdasd";
    }

    @Override
    public boolean move(String fromAccount, String toAccount, BigDecimal amount, String comment) throws CryptoCurrencyRpcException {
        return true;
    }

    @Override
    public String sendToAddress(String toAddress, BigDecimal amount) throws CryptoCurrencyRpcException {
        return "asdasdasdasdasd";
    }

    @Override
    public boolean validateAddress(String address) throws CryptoCurrencyRpcException {
        return true;
    }


    @Override
    public boolean wallePassphrase(String passphrase, int timeout) throws CryptoCurrencyRpcException {
        return true;
    }

    @Override
    public void setAccount(String address, String account) throws CryptoCurrencyRpcException {

    }
}
