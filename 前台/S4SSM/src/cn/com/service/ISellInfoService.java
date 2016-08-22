package cn.com.service;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.pojo.*;
@Repository
public interface ISellInfoService {
	/**
	 * ��ȡ����������Ϣҵ��
	 */
	public Map<Long, Sellinfo> getAllSellInfo();
	/**
	 * ���ݳ���Ż�ȡ�������ҵ��
	 */
	public Sellinfo getSellInfoById(Carinfo carInfo);
	/**
	 * �����������ҵ��
	 */
	public boolean addSellInfo(Sellinfo sellInfo);
	/**
	 * ɾ���������ҵ��
	 */
	public int deleteSellInfo(Sellinfo sellInfo);
	public boolean updateSellInfo(Sellinfo sellInfo);
}
