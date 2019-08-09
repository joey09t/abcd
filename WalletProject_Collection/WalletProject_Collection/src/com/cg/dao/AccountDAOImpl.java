package com.cg.dao;

import com.cg.bean.Account;
import java.util.*;

public class AccountDAOImpl implements AccountDAO {
	
	static Map<Long, Account> accmap=new  HashMap<Long, Account>();
	

	@Override
	public boolean addAccount(Account ob) {
		// TODO Auto-generated method stub
		accmap.put(ob.getMobile(), ob);
		return true;
	}

	@Override
	public boolean updateAccount(Account ob) {
		// TODO Auto-generated method stub
		accmap.put(ob.getMobile(), ob);
		return true;
	}

	@Override
	public boolean deleteAccount(Account ob) {
		// TODO Auto-generated method stub
		accmap.remove(ob.getMobile());
		return true;
	}

	@Override
	public Account findAccount(Long mobileno) {
		// TODO Auto-generated method stub
		Account ob=accmap.get(mobileno);
		return ob;
	}

	@Override
	public Map<Long, Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accmap;
	}

	@Override
	public boolean transferMoney(Account from, Account to) {
		// TODO Auto-generated method stub
		accmap.put(from.getMobile(), from);
		accmap.put(to.getMobile(), to);
		return true;
	}

}
