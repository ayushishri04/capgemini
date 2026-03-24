package com.gal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.gal.dao.AnorderRepository;
import com.gal.model.Anorder;

import jakarta.transaction.Transactional;

@Service
@Primary
public class AnorderServiceImple2 implements AnorderService {

    @Autowired
    AnorderRepository repo;

    @Override
    
    public Anorder find(int paymentid) {
        return repo.findById(paymentid).orElse(null);
    }
    @Override
    public List<Anorder> findAll(){
    	return repo.findAll();
    }
	@Override
	@Transactional
	public void add(Anorder anorder) {
		repo.save(anorder);
	}
	@Override
	@Transactional
	public void delete(int paymentid) {
		repo.deleteById(paymentid);
	}
	@Override
	@Transactional
	public void update(Anorder anorder) {
		repo.save(anorder);
	}
    
}