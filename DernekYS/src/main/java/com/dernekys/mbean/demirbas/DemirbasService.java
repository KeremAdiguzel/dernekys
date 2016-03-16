package com.dernekys.mbean.demirbas;

import java.io.Serializable;
import java.util.List;

import com.dernekys.base.BaseService;
import com.dernekys.base.DbException;
import com.dernekys.base.IBaseService;

public class DemirbasService implements IBaseService<Demirbaslar> {

	@Override
	public List<Demirbaslar> getAll() {
		BaseService baseService = new BaseService();
		return (List<Demirbaslar>) baseService.getAll(Demirbaslar.class);
	}

	@Override
	public Demirbaslar getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Demirbaslar save(Demirbaslar obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Demirbaslar obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Demirbaslar update(Demirbaslar obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

}
