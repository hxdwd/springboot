package hxd.dao.accountDaoimpl;


import hxd.dao.accountDao;
import hxd.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class accountDaoimpl implements accountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into account(name,money) values(?,?)",
                account.getName(),account.getMoney());
    }

    @Override
    public int update(Account account) {
        return 0;
    }

    @Override
    public Account findById(int id) {
        return null;
    }

    @Override
    public List<Account> findAllAccount() {
        return null;
    }
}
