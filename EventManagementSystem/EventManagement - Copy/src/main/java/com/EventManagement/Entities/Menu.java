package com.EventManagement.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Menu")
public class Menu 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long menuId;
	//Paneer Types 
	@Column
	private Boolean butter_Paneer;
	
	@Column
	private Boolean saag_Paneer;
	
	@Column
	private Boolean palak_Paneer;
	
	@Column
	private Boolean paneer_Masala;
	
	@Column
	private Boolean shahi_Paneer;
	
	@Column
	private Boolean chilli_Paneer;
	
	@Column
	private Boolean matar_Paneer;
	
	@Column
	private Boolean paneer_Tikka_Masala;
	
	@Column
	private Boolean paneer_Makhani;
	
	@Column
	private Boolean pan_Fried_Paneer;
	
	//Rices Types 
	
	@Column
	private Boolean vege_Pulao;
	
	@Column
	private Boolean vege_Biryani;
	
	@Column
	private Boolean jeera_Rice;
	
	@Column
	private Boolean ghee_Rice;
	
	@Column
	private Boolean moong_Dal_Khichadi;
	
	@Column
	private Boolean lemon_Rice;
	
	@Column
	private Boolean white_Rice;
	
	@Column
	private Boolean brown_Rice;
	
	@Column
	private Boolean fried_Rice;
	
	//Other Menus
	@Column
	private Boolean daal_Fry;
	
	@Column
	private Boolean aloo_Gobi;
	
	@Column
	private Boolean bhindi_Masala;
	
	@Column
	private Boolean baigan_Aloo;
	
	@Column
	private Boolean malai_Kofta;
	
	@Column
	private Boolean mix_Veg;
	
	@Column
	private Boolean veg_Maratha;
	
	@Column
	private Boolean mushroom_masala;
	
	@Column
	private Boolean rajama;
	
	//Roti Options 
	
	@Column
	private Boolean wheat_Roti;
		
	@Column
	private Boolean maida_Roti;
		
	@Column
	private Boolean phulka;
		
	@Column
	private Boolean tandoor_Roti;
		
	@Column
	private Boolean naan;
		
	@Column
	private Boolean jowar_Bhakri;
		
	@Column
	private Boolean chawal_Bhakari;
			
	
	//Salad options
	
	@Column
	private Boolean indian_Onion_Salad;
	
	@Column
	private Boolean indian_Cucumber_Salad;
	
	@Column
	private Boolean beetroot_Salad;
	
	@Column
	private Boolean fruit_Salad;
	
	@Column
	private Boolean sweet_Corn_Salad;
	
	//Seets
	
	@Column
	private Boolean cake;
	
	@Column
	private Boolean ice_cream;
	
	

	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "cateringId" , referencedColumnName ="cateringId" )
	 private Catering catering;

	 
	public Menu()
	{
		super();
	
	}

	
	
public Menu(Boolean butter_Paneer, Boolean saag_Paneer, Boolean palak_Paneer, Boolean paneer_Masala,
			Boolean shahi_Paneer, Boolean chilli_Paneer, Boolean matar_Paneer, Boolean paneer_Tikka_Masala,
			Boolean paneer_Makhani, Boolean pan_Fried_Paneer, Boolean vege_Pulao, Boolean vege_Biryani,
			Boolean jeera_Rice, Boolean ghee_Rice, Boolean moong_Dal_Khichadi, Boolean lemon_Rice, Boolean white_Rice,
			Boolean brown_Rice, Boolean fried_Rice, Boolean daal_Fry, Boolean aloo_Gobi, Boolean bhindi_Masala,
			Boolean baigan_Aloo, Boolean malai_Kofta, Boolean mix_Veg, Boolean veg_Maratha, Boolean mushroom_masala,
			Boolean rajama, Boolean wheat_Roti, Boolean maida_Roti, Boolean phulka, Boolean tandoor_Roti, Boolean naan,
			Boolean jowar_Bhakri, Boolean chawal_Bhakari, Boolean indian_Onion_Salad, Boolean indian_Cucumber_Salad,
			Boolean beetroot_Salad, Boolean fruit_Salad, Boolean sweet_Corn_Salad, Boolean cake, Boolean ice_cream,
			Catering catering) {
		super();
		this.butter_Paneer = butter_Paneer;
		this.saag_Paneer = saag_Paneer;
		this.palak_Paneer = palak_Paneer;
		this.paneer_Masala = paneer_Masala;
		this.shahi_Paneer = shahi_Paneer;
		this.chilli_Paneer = chilli_Paneer;
		this.matar_Paneer = matar_Paneer;
		this.paneer_Tikka_Masala = paneer_Tikka_Masala;
		this.paneer_Makhani = paneer_Makhani;
		this.pan_Fried_Paneer = pan_Fried_Paneer;
		this.vege_Pulao = vege_Pulao;
		this.vege_Biryani = vege_Biryani;
		this.jeera_Rice = jeera_Rice;
		this.ghee_Rice = ghee_Rice;
		this.moong_Dal_Khichadi = moong_Dal_Khichadi;
		this.lemon_Rice = lemon_Rice;
		this.white_Rice = white_Rice;
		this.brown_Rice = brown_Rice;
		this.fried_Rice = fried_Rice;
		this.daal_Fry = daal_Fry;
		this.aloo_Gobi = aloo_Gobi;
		this.bhindi_Masala = bhindi_Masala;
		this.baigan_Aloo = baigan_Aloo;
		this.malai_Kofta = malai_Kofta;
		this.mix_Veg = mix_Veg;
		this.veg_Maratha = veg_Maratha;
		this.mushroom_masala = mushroom_masala;
		this.rajama = rajama;
		this.wheat_Roti = wheat_Roti;
		this.maida_Roti = maida_Roti;
		this.phulka = phulka;
		this.tandoor_Roti = tandoor_Roti;
		this.naan = naan;
		this.jowar_Bhakri = jowar_Bhakri;
		this.chawal_Bhakari = chawal_Bhakari;
		this.indian_Onion_Salad = indian_Onion_Salad;
		this.indian_Cucumber_Salad = indian_Cucumber_Salad;
		this.beetroot_Salad = beetroot_Salad;
		this.fruit_Salad = fruit_Salad;
		this.sweet_Corn_Salad = sweet_Corn_Salad;
		this.cake = cake;
		this.ice_cream = ice_cream;
		this.catering = catering;
	}



/*	public int countTrueValues() 
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
	*/
	
	public Long getMenuId() {
		return menuId;
	}


	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}


	public Boolean getButter_Paneer() {
		return butter_Paneer;
	}


	public void setButter_Paneer(Boolean butter_Paneer) {
		this.butter_Paneer = butter_Paneer;
	}


	public Boolean getSaag_Paneer() {
		return saag_Paneer;
	}


	public void setSaag_Paneer(Boolean saag_Paneer) {
		this.saag_Paneer = saag_Paneer;
	}


	public Boolean getPalak_Paneer() {
		return palak_Paneer;
	}


	public void setPalak_Paneer(Boolean palak_Paneer) {
		this.palak_Paneer = palak_Paneer;
	}


	public Boolean getPaneer_Masala() {
		return paneer_Masala;
	}


	public void setPaneer_Masala(Boolean paneer_Masala) {
		this.paneer_Masala = paneer_Masala;
	}


	public Boolean getShahi_Paneer() {
		return shahi_Paneer;
	}


	public void setShahi_Paneer(Boolean shahi_Paneer) {
		this.shahi_Paneer = shahi_Paneer;
	}


	public Boolean getChilli_Paneer() {
		return chilli_Paneer;
	}


	public void setChilli_Paneer(Boolean chilli_Paneer) {
		this.chilli_Paneer = chilli_Paneer;
	}


	public Boolean getMatar_Paneer() {
		return matar_Paneer;
	}


	public void setMatar_Paneer(Boolean matar_Paneer) {
		this.matar_Paneer = matar_Paneer;
	}


	public Boolean getPaneer_Tikka_Masala() {
		return paneer_Tikka_Masala;
	}


	public void setPaneer_Tikka_Masala(Boolean paneer_Tikka_Masala) {
		this.paneer_Tikka_Masala = paneer_Tikka_Masala;
	}


	public Boolean getPaneer_Makhani() {
		return paneer_Makhani;
	}


	public void setPaneer_Makhani(Boolean paneer_Makhani) {
		this.paneer_Makhani = paneer_Makhani;
	}


	public Boolean getPan_Fried_Paneer() {
		return pan_Fried_Paneer;
	}


	public void setPan_Fried_Paneer(Boolean pan_Fried_Paneer) {
		this.pan_Fried_Paneer = pan_Fried_Paneer;
	}


	public Boolean getVege_Pulao() {
		return vege_Pulao;
	}


	public void setVege_Pulao(Boolean vege_Pulao) {
		this.vege_Pulao = vege_Pulao;
	}


	public Boolean getVege_Biryani() {
		return vege_Biryani;
	}


	public void setVege_Biryani(Boolean vege_Biryani) {
		this.vege_Biryani = vege_Biryani;
	}


	public Boolean getJeera_Rice() {
		return jeera_Rice;
	}


	public void setJeera_Rice(Boolean jeera_Rice) {
		this.jeera_Rice = jeera_Rice;
	}


	public Boolean getGhee_Rice() {
		return ghee_Rice;
	}


	public void setGhee_Rice(Boolean ghee_Rice) {
		this.ghee_Rice = ghee_Rice;
	}


	public Boolean getMoong_Dal_Khichadi() {
		return moong_Dal_Khichadi;
	}


	public void setMoong_Dal_Khichadi(Boolean moong_Dal_Khichadi) {
		this.moong_Dal_Khichadi = moong_Dal_Khichadi;
	}


	public Boolean getLemon_Rice() {
		return lemon_Rice;
	}


	public void setLemon_Rice(Boolean lemon_Rice) {
		this.lemon_Rice = lemon_Rice;
	}


	public Boolean getWhite_Rice() {
		return white_Rice;
	}


	public void setWhite_Rice(Boolean white_Rice) {
		this.white_Rice = white_Rice;
	}


	public Boolean getBrown_Rice() {
		return brown_Rice;
	}


	public void setBrown_Rice(Boolean brown_Rice) {
		this.brown_Rice = brown_Rice;
	}


	public Boolean getFried_Rice() {
		return fried_Rice;
	}


	public void setFried_Rice(Boolean fried_Rice) {
		this.fried_Rice = fried_Rice;
	}


	public Boolean getDaal_Fry() {
		return daal_Fry;
	}


	public void setDaal_Fry(Boolean daal_Fry) {
		this.daal_Fry = daal_Fry;
	}


	public Boolean getAloo_Gobi() {
		return aloo_Gobi;
	}


	public void setAloo_Gobi(Boolean aloo_Gobi) {
		this.aloo_Gobi = aloo_Gobi;
	}


	public Boolean getBhindi_Masala() {
		return bhindi_Masala;
	}


	public void setBhindi_Masala(Boolean bhindi_Masala) {
		this.bhindi_Masala = bhindi_Masala;
	}


	public Boolean getBaigan_Aloo() {
		return baigan_Aloo;
	}


	public void setBaigan_Aloo(Boolean baigan_Aloo) {
		this.baigan_Aloo = baigan_Aloo;
	}


	public Boolean getMalai_Kofta() {
		return malai_Kofta;
	}


	public void setMalai_Kofta(Boolean malai_Kofta) {
		this.malai_Kofta = malai_Kofta;
	}


	public Boolean getMix_Veg() {
		return mix_Veg;
	}


	public void setMix_Veg(Boolean mix_Veg) {
		this.mix_Veg = mix_Veg;
	}


	public Boolean getVeg_Maratha() {
		return veg_Maratha;
	}


	public void setVeg_Maratha(Boolean veg_Maratha) {
		this.veg_Maratha = veg_Maratha;
	}


	public Boolean getMushroom_masala() {
		return mushroom_masala;
	}


	public void setMushroom_masala(Boolean mushroom_masala) {
		this.mushroom_masala = mushroom_masala;
	}


	public Boolean getRajama() {
		return rajama;
	}


	public void setRajama(Boolean rajama) {
		this.rajama = rajama;
	}


	public Boolean getWheat_Roti() {
		return wheat_Roti;
	}


	public void setWheat_Roti(Boolean wheat_Roti) {
		this.wheat_Roti = wheat_Roti;
	}


	public Boolean getMaida_Roti() {
		return maida_Roti;
	}


	public void setMaida_Roti(Boolean maida_Roti) {
		this.maida_Roti = maida_Roti;
	}


	public Boolean getPhulka() {
		return phulka;
	}


	public void setPhulka(Boolean phulka) {
		this.phulka = phulka;
	}


	public Boolean getTandoor_Roti() {
		return tandoor_Roti;
	}


	public void setTandoor_Roti(Boolean tandoor_Roti) {
		this.tandoor_Roti = tandoor_Roti;
	}


	public Boolean getNaan() {
		return naan;
	}


	public void setNaan(Boolean naan) {
		this.naan = naan;
	}


	public Boolean getJowar_Bhakri() {
		return jowar_Bhakri;
	}


	public void setJowar_Bhakri(Boolean jowar_Bhakri) {
		this.jowar_Bhakri = jowar_Bhakri;
	}


	public Boolean getChawal_Bhakari() {
		return chawal_Bhakari;
	}


	public void setChawal_Bhakari(Boolean chawal_Bhakari) {
		this.chawal_Bhakari = chawal_Bhakari;
	}


	public Boolean getIndian_Onion_Salad() {
		return indian_Onion_Salad;
	}


	public void setIndian_Onion_Salad(Boolean indian_Onion_Salad) {
		this.indian_Onion_Salad = indian_Onion_Salad;
	}


	public Boolean getIndian_Cucumber_Salad() {
		return indian_Cucumber_Salad;
	}


	public void setIndian_Cucumber_Salad(Boolean indian_Cucumber_Salad) {
		this.indian_Cucumber_Salad = indian_Cucumber_Salad;
	}


	public Boolean getBeetroot_Salad() {
		return beetroot_Salad;
	}


	public void setBeetroot_Salad(Boolean beetroot_Salad) {
		this.beetroot_Salad = beetroot_Salad;
	}


	public Boolean getFruit_Salad() {
		return fruit_Salad;
	}


	public void setFruit_Salad(Boolean fruit_Salad) {
		this.fruit_Salad = fruit_Salad;
	}


	public Boolean getSweet_Corn_Salad() {
		return sweet_Corn_Salad;
	}


	public void setSweet_Corn_Salad(Boolean sweet_Corn_Salad) {
		this.sweet_Corn_Salad = sweet_Corn_Salad;
	}


	public Boolean getCake() {
		return cake;
	}


	public void setCake(Boolean cake) {
		this.cake = cake;
	}


	public Boolean getIce_cream() {
		return ice_cream;
	}


	public void setIce_cream(Boolean ice_cream) {
		this.ice_cream = ice_cream;
	}


	public Catering getCatering() {
		return catering;
	}


	public void setCatering(Catering catering) {
		this.catering = catering;
	}

}
