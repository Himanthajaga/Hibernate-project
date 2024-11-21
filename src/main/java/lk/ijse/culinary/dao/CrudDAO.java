package lk.ijse.culinary.dao;


import java.util.List;

public interface CrudDAO <T> extends SuperDAO{

    List<T> getAll() ;
    boolean save(T entity)  ;
    boolean update(T entity)  ;
    boolean delete(T entity)  ;
    T search(String id) ;

}
