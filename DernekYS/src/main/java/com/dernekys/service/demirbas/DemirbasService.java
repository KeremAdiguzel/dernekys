package com.dernekys.service.demirbas;

import java.util.List;

import com.dernekys.base.BaseService;
import com.dernekys.base.DbException;
import com.dernekys.base.IBaseService;
import com.dernekys.entity.demirbas.Demirbas;
import com.dernekys.entity.kullanici.Kullanici;

public class DemirbasService implements IBaseService<Demirbas> {

	@Override
	public List<Demirbas> getAll() {
		BaseService baseService = new BaseService();
		return (List<Demirbas>) baseService.getAll(Demirbas.class);
	}

	@Override
	public Demirbas getById(Long id) {
		return null;
	}

	@Override
	public Demirbas save(Demirbas obj) throws DbException {
		
	        
	        return (Demirbas) new BaseService().save(obj);
	}

	@Override
	public Boolean delete(Demirbas obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Demirbas update(Demirbas obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

}
