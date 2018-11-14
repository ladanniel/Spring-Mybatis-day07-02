package cn.tedu.dao;
import java.util.List;

import cn.tedu.bean.Address;


public interface AddressDao {
	public Integer insertAddress(Address address);
	public Integer updateAddress(Address address);
	public Integer deleteAddress(Address address);
	public Address selectById(Integer id);
	public List<Address> selectAll();
	
	

}
