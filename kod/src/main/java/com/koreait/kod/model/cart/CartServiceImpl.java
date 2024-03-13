package com.koreait.kod.model.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService{
	@Autowired 
	CartDAO cartDAO;

	@Override
	public List<CartDTO> selectAll(CartDTO cartDTO) {
		return cartDAO.selectAll(cartDTO);
	}

	@Override
	public CartDTO selectOne(CartDTO cartDTO) {
		return cartDAO.selectOne(cartDTO);
	}

	@Override
	public boolean insert(CartDTO cartDTO) {
		return cartDAO.insert(cartDTO); 
	} 

	@Override
	public boolean update(CartDTO cartDTO) {
		return cartDAO.update(cartDTO);
	}

	@Override
	public boolean delete(CartDTO cartDTO) {
		return cartDAO.delete(cartDTO);
	}
}
