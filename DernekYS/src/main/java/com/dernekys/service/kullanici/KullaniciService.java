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
		return (Kullanici) new BaseService().getById(Kullanici.class, id);
	}

	@Override
	public Kullanici save(Kullanici obj) throws DbException {
        if(obj==null)
            throw new DbException("Kullanýcý Adý Boþ Olmamalýdýr");
        if(obj.getUsername()==null || obj.getUsername().equals(""))
            throw new DbException("Kullanýcý Adý Boþ Olmamalýdýr");
        if(obj.getEmail()==null || obj.getEmail().equals(""))
            throw new DbException("Kullanýcý Email Boþ Olmamalýdýr");
        
        return (Kullanici) new BaseService().save(obj);
	}

	@Override
	public Boolean delete(Kullanici obj) throws DbException {
		return  new BaseService().delete(obj);
	}

	@Override
	public Kullanici update(Kullanici obj) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		
		Kullanici silinecekKullanici = getById(id);
		try {
			delete(silinecekKullanici);
		} catch (DbException e) {
			e.printStackTrace();
		}
	}

}
