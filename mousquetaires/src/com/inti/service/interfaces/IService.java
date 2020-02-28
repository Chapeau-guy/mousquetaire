package com.inti.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface IService<T> {
	void save(T obj);
	void update(T obj);
	void remove(T obj);
	List<T> findAll(Class<?> c);
	T findOne(Class<?> c, Long id);
}
