package com.dernekys.service.kullanici;

import java.util.List;

import com.dernekys.base.BaseService;
import com.dernekys.base.DbException;
import com.dernekys.base.IBaseService;
import com.dernekys.entity.kullanici.Kullanici;

public class KullaniciService implements IBaseService<Kullanici>{

	
	
	@Override
	public List<Kullanici> getAll() {
		BaseService baseService =new BaseService();
		return (List<Kullanici>) baseService.getAll(Kullanici.class);
		
	}

	@Override
	public Kullanici getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kullanici save(Kullanici obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Kullanici obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kullanici update(Kullanici obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

}
