package com.EventManagement.serviceimplementation;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.Menu;
import com.EventManagement.repository.MenuRepository;
import com.EventManagement.service.MenuServices;

@Service
public class MenuServicesImplementation implements MenuServices
{
	@Autowired
	private MenuRepository menuRepo;
	
	@Override
	public Menu addMenu(Menu menu) 
	{
		
		return menuRepo.save(menu);
	}

	@Override
	public List<Menu> getAllMenu() 
	{
		return menuRepo.findAll();
	}

	@Override
	public Menu getMenuById(Long menuId)
	{
		
		return menuRepo.findById(menuId).get();
	}

	@Override
	public Menu updateMenu(Long menuId, Menu menu)
	{
		
		Menu m= menuRepo.findById(menuId).get();
		m.setMenuId(menu.getMenuId());
		m.setCatering(menu.getCatering());
		m.setAloo_Gobi(menu.getAloo_Gobi());
		m.setBaigan_Aloo(menu.getBaigan_Aloo());
		m.setBeetroot_Salad(menu.getBeetroot_Salad());
		m.setBhindi_Masala(menu.getBhindi_Masala());
		m.setBrown_Rice(menu.getBrown_Rice());
		m.setButter_Paneer(menu.getButter_Paneer());
		m.setCake(menu.getCake());
		m.setChawal_Bhakari(menu.getChawal_Bhakari());
		m.setChilli_Paneer(menu.getChilli_Paneer());
		m.setDaal_Fry(menu.getDaal_Fry());
		m.setFried_Rice(menu.getFried_Rice());
		m.setFruit_Salad(menu.getFruit_Salad());
		m.setGhee_Rice(menu.getGhee_Rice());
		m.setIce_cream(menu.getIce_cream());
		m.setIndian_Cucumber_Salad(menu.getIndian_Cucumber_Salad());
		m.setIndian_Onion_Salad(menu.getIndian_Onion_Salad());
		m.setJeera_Rice(menu.getJeera_Rice());
		m.setJowar_Bhakri(menu.getJowar_Bhakri());
		m.setLemon_Rice(menu.getLemon_Rice());
		m.setMaida_Roti(menu.getMaida_Roti());
		m.setMalai_Kofta(menu.getMalai_Kofta());
		m.setMatar_Paneer(menu.getMatar_Paneer());
		m.setMix_Veg(menu.getMix_Veg());
		m.setMoong_Dal_Khichadi(menu.getMoong_Dal_Khichadi());
		m.setMushroom_masala(menu.getMushroom_masala());
		m.setNaan(menu.getNaan());
		m.setPalak_Paneer(menu.getPalak_Paneer());
		m.setPan_Fried_Paneer(menu.getPan_Fried_Paneer());
		m.setPaneer_Makhani(menu.getPaneer_Makhani());
		m.setPaneer_Masala(menu.getPaneer_Masala());
		m.setPaneer_Tikka_Masala(menu.getPaneer_Tikka_Masala());
		m.setPhulka(menu.getPhulka());
		m.setRajama(menu.getRajama());
		m.setSaag_Paneer(menu.getSaag_Paneer());
		m.setShahi_Paneer(menu.getShahi_Paneer());
		m.setSweet_Corn_Salad(menu.getSweet_Corn_Salad());
		m.setTandoor_Roti(menu.getTandoor_Roti());
		m.setVeg_Maratha(menu.getVeg_Maratha());
		m.setVege_Biryani(menu.getVege_Biryani());
		m.setVege_Pulao(menu.getVege_Pulao());
		m.setWheat_Roti(menu.getWheat_Roti());
		m.setWhite_Rice(menu.getWhite_Rice());
		return menuRepo.save(m);
	}

	@Override
	public void deleteMenuById(Long menuId)
	{
		menuRepo.findById(menuId);
	}

	@Override
	public void deleteAllMenu() 
	{
		menuRepo.findAll();
		
	}

	@Override
	public boolean isMenuExists(Long menuId) 
	{
		
		return menuRepo.existsById(menuId);
	}

	@Override
	public int countTrueValues() 
	{
		int trueCount=0;
		Field[] fields=this.getClass().getDeclaredFields();
		
		for(Field field : fields)
		{
			try 
			{
				if(field.getType()==boolean.class)
				{
					field.setAccessible(true);
					
					if((boolean) field.get(this))
					{
						trueCount++;
					}
				}
			}
			catch (IllegalAccessException e) 
			{
				e.printStackTrace();
			}
		}
		return trueCount;
	}

   
	
}
