package cn.tedu.test;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.tedu.bean.Address;
import cn.tedu.dao.AddressDao;
import cn.tedu.util.SqlSessionUtil;
public class TestAddress {
	@Test
	public void testInsertAddress(){
		SqlSession session = SqlSessionUtil.getSession();
		AddressDao dao = session.getMapper(AddressDao.class);
		Address address = new Address();
		address.setProvince("�Ĵ�ʡ");
		address.setCity("�ɶ���");
		address.setArea("��ţ��");
		address.setUseraddress("�츮�㳡");
		Integer n = dao.insertAddress(address);
		System.out.println(n);
		session.commit();
		session.close();
	}
	@Test
	public void testUpdate(){
		SqlSession session = SqlSessionUtil.getSession();
		AddressDao dao = session.getMapper(AddressDao.class);
		Address address = new Address();
		address.setId(2);
		address.setProvince("�㶫ʡ");
		address.setCity("������");
		address.setArea("������");
		address.setUseraddress("��Ϊ����");
		Integer n = dao.updateAddress(address);
		System.out.println("n:"+n);
		session.commit();
		session.close();
	}
	@Test
	public void testDelete(){
		SqlSession session = SqlSessionUtil.getSession();
		AddressDao dao = session.getMapper(AddressDao.class);
		Address address = new Address();
		address.setId(3);
		Integer n = dao.deleteAddress(address);
		System.out.println("n:"+n);
		session.commit();
		session.close();
	}
	@Test
	public void testSelect(){
		SqlSession session = SqlSessionUtil.getSession();
		AddressDao dao = session.getMapper(AddressDao.class);
		Address a = dao.selectById(1);//����������ȥ���������ص�ֵ������
		System.out.println(a);
		session.commit();
		session.close();
	}
	@Test
	public void testSelectAll(){
		SqlSession session = SqlSessionUtil.getSession();//session�ػ�����ϵ
		AddressDao dao = session.getMapper(AddressDao.class);
		List<Address> list = dao.selectAll();
		System.out.print("list"+list+"\t");
		session.commit();
		session.close();    
		
	}

}
