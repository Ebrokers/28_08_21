package com.ebrokers.Controller;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ebrokers.Beans.MerchantBean;
import com.ebrokers.Beans.PropertyBean;
import com.ebrokers.Entity.Merchant;
import com.ebrokers.Entity.Property;
import com.ebrokers.Repositries.MerchantRepository;
import com.ebrokers.Repositries.PropertyRepository;

@Controller
public class MyController {
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);

	public ConcurrentHashMap<String, MerchantBean> merchant = new ConcurrentHashMap<>();
	public ConcurrentHashMap<String, PropertyBean> propert = new ConcurrentHashMap<>();
//	public MerchantBean mb = new MerchantBean();
	
	@Autowired
	PropertyRepository propertyRepository;
	
	@Autowired
	MerchantRepository merchantRepository;
	
	//Index Page
	
	@GetMapping("/index/{id}")
	public String index(@PathVariable String id) {
		logger.info("merchantId : "+ id);
		return "homePage";
	}
	
	//Adding Merchant
	
	@GetMapping("/addMerchant")
	public String addMerDetails(Merchant merchant) {
		return "addMerchant";
	}

	@PostMapping("/addMerchant")
	public void getMerDetails(Merchant merchant) {
		logger.info("Merchant Name: " + merchant.getName());
		merchantRepository.save(merchant);
	}

	//Adding Property
	
	@GetMapping("/addProperty")
	public String addProDetails(Property property) {
		return "addProperty";
	}

	@PostMapping("/addProperty")
	public void getProDetails(Property property) {
		logger.info("Property Name: : " + property.getName());
		propertyRepository.save(property);
	}
	
	// Merchant Details

	@GetMapping("getMerchant/{id}")
	@ResponseBody
	public Merchant getMerchant(@PathVariable Integer id) {
		logger.info("In getMerchant : " + id);
		return merchantRepository.getById(id);
	}

	@GetMapping("getAllMerchant")
	@ResponseBody
	public List<Merchant> getAllMerchant() {
		logger.info("In getAllMerchant() : ");
		return merchantRepository.findAll();
	}

	@GetMapping("delMerchant/{id}")
	@ResponseBody
	public String deleteMerchant(@PathVariable Integer id) {
		logger.info("In deleteMerchant() : "+id);
		merchantRepository.deleteById(id);
		return "Merchant Deleted...";
	}

	// PROPERTY DETAILS

	@GetMapping("getProperty/{id}")
	@ResponseBody
	public Property getProperty(@PathVariable Integer id) {
		logger.info("In getProperty : " + id);
		return propertyRepository.getById(id);
	}

	@GetMapping("getAllProperty")
	@ResponseBody
	public List<Property> getAllProperty() {
		logger.info("In getProperty : ");
		return propertyRepository.findAll();
	}
	
	@GetMapping("delProperty/{id}")
	@ResponseBody
	public String delProperty(@PathVariable Integer id) {
		logger.info("In delProperty() : "+id);
		propertyRepository.deleteById(id);
		return "Property Deleted...";
	}
}