package com.gal.service;

import java.util.List;
import com.gal.model.Anorder;

public interface AnorderService {

    Anorder find(int orderid);
    List<Anorder> findAll();
    void add(Anorder anorder);
    void delete(int paymentid);
    void update(Anorder anorder);
   
}