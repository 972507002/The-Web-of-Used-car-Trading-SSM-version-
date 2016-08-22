package cn.com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.dao.*;
import cn.com.pojo.*;
import cn.com.service.*;
import cn.com.service.impl.*;

import cn.com.util.*;


@Controller
public class MgorderController {
	@Resource
	private IPerSonCarService perSonCarService=null;
	@Resource(name="personCarServiceImpl")
	private IPageDao perSonCarPage=null;
	@Resource
	private	CarInfoServiceImpl carInfoServiceImpl=null;
	@Resource
	private	PersonNeedServiceImpl personNeedServiceImpl=null;
	public IPerSonCarService getPerSonCarService() {
		return perSonCarService;
	}
	public void setPerSonCarService(IPerSonCarService perSonCarService) {
		this.perSonCarService = perSonCarService;
	}
	public IPageDao getPerSonCarPage() {
		return perSonCarPage;
	}
	public void setPerSonCarPage(IPageDao perSonCarPage) {
		this.perSonCarPage = perSonCarPage;
	}
	public CarInfoServiceImpl getCarInfoServiceImpl() {
		return carInfoServiceImpl;
	}
	public void setCarInfoServiceImpl(CarInfoServiceImpl carInfoServiceImpl) {
		this.carInfoServiceImpl = carInfoServiceImpl;
	}
	public PersonNeedServiceImpl getPersonNeedServiceImpl() {
		return personNeedServiceImpl;
	}
	public void setPersonNeedServiceImpl(PersonNeedServiceImpl personNeedServiceImpl) {
		this.personNeedServiceImpl = personNeedServiceImpl;
	}
	@RequestMapping("/Mgord_showzzjy.action")
	public String showzzjy(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Personcar perSonCar=new Personcar();
		perSonCar.setpState("��ͣ����");
		this.fenye(request, perSonCar);
		
		return  "admin/zzjy";
	}
	@RequestMapping("/Mgord_showjyz.action")
	public String showjyz(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Personcar perSonCar=new Personcar();
		perSonCar.setpState("�Ѷ�");
		this.fenye(request,  perSonCar);
		
		return "admin/jyz";
	}
	@RequestMapping("/Mgord_showjywc.action")
	public String showjywc(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Personcar perSonCar=new Personcar();
		perSonCar.setpState("�������");
		this.fenye(request, perSonCar);
		
		return "admin/jywc";
	}
	@RequestMapping("/Mgord_showallord.action")
	public String showallord(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Personcar perSonCar=new Personcar();
		
		this.fenye(request, perSonCar);
		
		return "admin/allorder";
	}
	@RequestMapping("/Mgord_tgzz.action")
	public void tgzz(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String uid=request.getParameter("uid");
		String cuid=request.getParameter("cuid");
		String cid=request.getParameter("cid");
		Personcar perSonCar=new Personcar();
		perSonCar.setuId(Long.parseLong(uid));
		perSonCar.setcId(Long.parseLong(cid));
		perSonCar.setcUid(Long.parseLong(cuid));
		perSonCar.setpState("��ͣ����");
		Carinfo carInfo=new Carinfo();
		carInfo.setcId(Long.parseLong(cid));
		carInfo.setcState("����");
		Personcar _PerSonCar=new Personcar();
		_PerSonCar.setuId(Long.parseLong(cuid));
		_PerSonCar.setcId(Long.parseLong(cid));
		_PerSonCar.setcUid(Long.parseLong(cuid));
		_PerSonCar.setpState("��ͣ����");
		
		if(perSonCarService.updatePerSoncar(_PerSonCar, "����")&&perSonCarService.deletePersonByAll(perSonCar)&&carInfoServiceImpl.updateCarInfo(carInfo)){
			 response.setContentType("text/html;charset=utf-8");
				response.getWriter().print(1);
				 response.getWriter().flush();//��ջ���,ˢ��
				   response.getWriter().close();
		}
		
	}
	@RequestMapping("/Mgord_qzzz.action")
	public void qzzz(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String uid=request.getParameter("uid");
		String cuid=request.getParameter("cuid");
		String cid=request.getParameter("cid");
		Personcar perSonCar=new Personcar();
		perSonCar.setuId(Long.parseLong(uid));
		perSonCar.setcId(Long.parseLong(cid));
		perSonCar.setcUid(Long.parseLong(cuid));
		perSonCar.setpState("�Ѷ�");
		Carinfo carInfo=new Carinfo();
		carInfo.setcId(Long.parseLong(cid));
		carInfo.setcState("����");
		Personcar _PerSonCar=new Personcar();
		_PerSonCar.setuId(Long.parseLong(cuid));
		_PerSonCar.setcId(Long.parseLong(cid));
		_PerSonCar.setcUid(Long.parseLong(cuid));
		_PerSonCar.setpState("����");
		
		if(perSonCarService.updatePerSoncar(_PerSonCar, "����")&&perSonCarService.deletePersonByAll(perSonCar)&&carInfoServiceImpl.updateCarInfo(carInfo)){
			 response.setContentType("text/html;charset=utf-8");
				response.getWriter().print(1);
				 response.getWriter().flush();//��ջ���,ˢ��
				   response.getWriter().close();
		}
		
	}
	@RequestMapping("/Mgord_jjzz.action")
	public void jjzz(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String uid=request.getParameter("uid");
		String cuid=request.getParameter("cuid");
		String cid=request.getParameter("cid");
		
		Personcar perSonCar=new Personcar();
		perSonCar.setuId(Long.parseLong(uid));
		perSonCar.setcId(Long.parseLong(cid));
		perSonCar.setcUid(Long.parseLong(cuid));
		perSonCar.setpState("��ͣ����");
		Personcar _PerSonCar=new Personcar();
		_PerSonCar.setuId(Long.parseLong(cuid));
		_PerSonCar.setcId(Long.parseLong(cid));
		_PerSonCar.setcUid(Long.parseLong(cuid));
		_PerSonCar.setpState("��ͣ����");
		try{
		if(perSonCarService.updatePerSoncar(_PerSonCar, "����")&&perSonCarService.updatePerSoncar(perSonCar, "�Ѷ�")){
			 response.setContentType("text/html;charset=utf-8");
				response.getWriter().print(1);
				 response.getWriter().flush();//��ջ���,ˢ��
				   response.getWriter().close();
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	@RequestMapping("/Mgord_yclsrdz.action")
	public void yclsrdz(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String id=request.getParameter("pid");
		Personneed personNeed=new Personneed();
		personNeed.setpId(Long.parseLong(id));
		personNeed.setpState("�Ѵ���");
	
		if(personNeedServiceImpl.updatePersonNeed(personNeed)){
			 response.setContentType("text/html;charset=utf-8");
				response.getWriter().print(1);
				 response.getWriter().flush();//��ջ���,ˢ��
				   response.getWriter().close();
		}
		
	}
	@RequestMapping("/Mgord_delsrdz.action")
	public void delsrdz(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String id=request.getParameter("pid");
		Personneed personNeed=new Personneed();
		personNeed.setpId(Long.parseLong(id));
	
		
		if(personNeedServiceImpl.deletePersonNeed(personNeed) ){
			 response.setContentType("text/html;charset=utf-8");
				response.getWriter().print(1);
				 response.getWriter().flush();//��ջ���,ˢ��
				   response.getWriter().close();
		}
		
	}
private void fenye(HttpServletRequest req, Personcar perSonCar){
		
		
		try {
		int curPage=0;
		if(req.getParameter("jumpPage")!=null){
		 curPage =Integer.parseInt(req.getParameter("jumpPage"));
	 }
		
		
   
	 Long maxRowsCount=perSonCarPage.queryPersonCarCount(perSonCar);
		//�����ҳ�߼�<=>����
		PageUtil pageUtil=new PageUtil(9, maxRowsCount);
		// ����ҳ���߼�
		if (curPage <= 1) {

			pageUtil.setCurPage(1);
		} else if (curPage >= pageUtil.getMaxPage()) {

			pageUtil.setCurPage(pageUtil.getMaxPage());
		} else {
			pageUtil.setCurPage(curPage);
		}
		
		
		Map<Long, Personcar> perMap=perSonCarService.getPersonList(pageUtil.getCurPage(),pageUtil.getRowsPrePage(), perSonCar);
		
		Map<Long, Carinfo> carMap=new HashMap<Long, Carinfo>();
		
		for(Long key :perMap.keySet()){
			if(!perMap.get(key).getcUid().equals(perMap.get(key).getuId())){
				Carinfo carInfo=new Carinfo();
				carInfo.setcId(perMap.get(key).getcId());
			
			carInfo=	carInfoServiceImpl.getCarByWhere(carInfo).get(carInfo.getcId());
			
				carMap.put(carInfo.getcId(), carInfo);
			}
			
		}
		
		DbUtil.closeAll();
		
		req.setAttribute("szCar", perMap);
		req.setAttribute("car", carMap);
		req.setAttribute("rowsPrePage", pageUtil.getRowsPrePage());
		req.setAttribute("maxRowCount", pageUtil.getMaxRowsCount());
		req.setAttribute("maxPage", pageUtil.getMaxPage());
		req.setAttribute("jumpPage", curPage);
		req.setAttribute("curPage", pageUtil.getCurPage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	 }
}
