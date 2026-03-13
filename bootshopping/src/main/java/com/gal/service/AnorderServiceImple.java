package com.gal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gal.dao.AnorderDao;
import com.gal.model.Anorder;

@Service
public class AnorderServiceImple implements AnorderService {

    private AnorderDao anorderDao;

    @Autowired
    public AnorderServiceImple(AnorderDao anorderDao) {
        this.anorderDao = anorderDao;
    }

    @Override
    public Anorder find(int anorderId) {
        return anorderDao.find(anorderId);
    }

    @Override
    public List<Anorder> findAll() {
        return anorderDao.findAll();
    }

    @Override
    public void add(Anorder anorder) {
        anorderDao.add(anorder);
    }

    @Override
    public void delete(int paymentid) {
        anorderDao.delete(paymentid);
    }

    @Override
    public void update(Anorder anorder) {
        anorderDao.update(anorder);
    }
}