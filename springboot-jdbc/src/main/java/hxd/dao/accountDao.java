package hxd.dao;

import hxd.pojo.Account;

import java.util.List;

public interface accountDao {
    int add(Account account);

    int update(Account account);

    Account findById(int id);

    List<Account> findAllAccount();
}
