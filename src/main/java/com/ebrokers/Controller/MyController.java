package com.ebrokers.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ebrokers.Beans.MerchantBean;
import com.ebrokers.Beans.PropertyBean;
import com.ebrokers.Beans.User;

@Controller
public class MyController {
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);

	public ConcurrentHashMap<String, MerchantBean> merchant = new ConcurrentHashMap<>();
	public ConcurrentHashMap<String, PropertyBean> propert = new ConcurrentHashMap<>();
	public MerchantBean mb = new MerchantBean();
	
	//Index Page
	
	@GetMapping("/index/{id}")
	public String index(@PathVariable String id) {
		logger.info("merchantId : "+ id);
		return "homePage";
	}
	
	//Adding Merchant
	
	@GetMapping("/addMerchant")
	public String addMerDetails(User user) {
		logger.info("merchantId : "+ user.getName());
		return "addMerchant";
	}

	@PostMapping("/addMerchantInDb")
	public String getMerDetails(User user) {
		logger.info("merchantId2 : "+ user.getName());
		//Service call to insert User in DB
		return "showMessage";
	}
	
	//Adding Property
	
	@GetMapping("/addProperty")
	public String addProDetails(User user) {
		logger.info("merchantId : "+ user.getName());
		return "addMerchant";
	}

	@PostMapping("/addMerchantInDb")
	public String getProDetails(User user) {
		logger.info("merchantId2 : "+ user.getName());
		//Service call to insert Property in DB
		return "showMessage";
	}
	
	
	// Merchant Details

	@GetMapping("getMerchant/{id}")
	public MerchantBean getMerchant(@PathVariable String id) {
		// Service call to getMerchant Details By Id
		return merchant.get(id);
	}

	@GetMapping("getAllMerchant")
	public List<MerchantBean> getAllMerchant() {
		// Service call to getAllMerchant
		return new ArrayList<MerchantBean>(merchant.values());
	}

	@PostMapping("addMerchant")
	public MerchantBean addMerchant(@RequestBody MerchantBean e) throws Exception {
		merchant.put(String.valueOf(e.getId()), e);
		// Service call to MerchantBean to DB
		return e;
	}

	@GetMapping("delMerchant/{id}")
	public MerchantBean deleteMerchant(@PathVariable String id) {
		// Service call to Delete Merchant by Id
		return merchant.remove(id);
	}

	// PROPERTY DETAILS

	@GetMapping("getProperty/{id}")
	public PropertyBean getProperty(@PathVariable String id) {
		// Service call to getProperty Details By Id
		return propert.get(id);
	}

	@GetMapping("getAllProperty")
	public List<PropertyBean> getAllProperty() {
		// Service call to getAllProperty
		return new ArrayList<PropertyBean>(propert.values());
	}

	@PostMapping("addProperty")
	public PropertyBean addProperty(@RequestBody PropertyBean e) {
		propert.put(String.valueOf(e.getId()), e);
		// Service call to PropertyBean to DB
		return e;
	}

	@GetMapping("delProperty/{id}")
	public PropertyBean deleteProperty(@PathVariable String id) {
		// Service call to Delete Property by Id
		return propert.remove(id);
	}

	/*
	 * @GetMapping("index/{id}") public ModelAndView processIndex(@PathVariable
	 * String Meid) throws Exception{ logger.info(
	 * "Executing IndexController for merchantId : "+Meid);
	 * 
	 * final ModelAndView modelAndView = new ModelAndView();
	 * 
	 * 
	 * modelAndView.setViewName("icicibank");
	 * 
	 * return modelAndView; }
	 */
}