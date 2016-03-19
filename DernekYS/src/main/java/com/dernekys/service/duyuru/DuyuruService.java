
package com.dernekys.service.duyuru;

import java.util.List;

import com.dernekys.base.BaseService;
import com.dernekys.base.DbException;
import com.dernekys.base.IBaseService;
import com.dernekys.entity.duyuru.Duyuru;
import com.dernekys.entity.kullanici.Kullanici;

public class DuyuruService implements IBaseService<Duyuru> {

	@Override
	public List<Duyuru> getAll() {
		BaseService baseService =new BaseService();
		return (List<Duyuru>) baseService.getAll(Duyuru.class);
		
	}

	@Override
	public Duyuru getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Duyuru save(Duyuru obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Duyuru obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Duyuru update(Duyuru obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

}
