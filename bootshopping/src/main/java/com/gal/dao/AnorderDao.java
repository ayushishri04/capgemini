package com.gal.dao;
import java.util.List;
import com.gal.model.Anorder;

public interface AnorderDao {

    Anorder find(int orderid);

    List<Anorder> findAll();

    void add(Anorder anorder);

    void delete(int orderid);

    void update(Anorder anorder);
}