package project.personal.lhinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.personal.lhinfo.dao.AccountDao;
import project.personal.lhinfo.dto.AccountSigninDto;
import project.personal.lhinfo.dto.AccountSignupDto;
import project.personal.lhinfo.entity.Account;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public int createAccount(AccountSignupDto accountSignupDto) {
        return accountDao.createAccount(accountSignupDto);
    }

    @Override
    public Account readAccount(String id) {
        return accountDao.readAccount(id);
    }

    @Override
    public int checkIdentify(String identify) {
        return accountDao.checkIdentify(identify);
    }

    @Override
    public String checkExistence(AccountSigninDto accountSigninDto) {
        return accountDao.checkExistence(accountSigninDto);
    }
}
