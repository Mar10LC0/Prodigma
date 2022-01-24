package mario.prodigma.reusablePhoneBookLibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mario.prodigma.reusablePhoneBookLibrary.dto.PhoneBookUserDto;
import mario.prodigma.reusablePhoneBookLibrary.model.PhoneBookUser;
import mario.prodigma.reusablePhoneBookLibrary.service.PhoneBookService;

@RestController
@CrossOrigin(origins = "*")
public class PhoneBookController {
	@Autowired
	PhoneBookService service;
	
	@GetMapping("/getAllPhoneBooks")
	public List<PhoneBookUser> getAllHistory(){
		return service.getAll();
	}
	
	@GetMapping("/getByIdPhoneBook")
	public PhoneBookUser getByIdPhoneBook(@RequestParam Integer id) {
		return service.findById(id);
	}
	
	@PostMapping("/addPhoneBook")
	public PhoneBookUser addPhoneBook(@RequestBody PhoneBookUserDto phone) {
		return service.save(phone);
	}
	
	@PutMapping("/updateHistory")
	public PhoneBookUser updatePhoneBook(@RequestBody PhoneBookUserDto phone) {
		return service.update(phone);
	}
	
	@DeleteMapping("/deletePhoneBook")
	public void deleteHistory(@RequestParam Integer id) {
		service.delete(id);
	}
	
	@GetMapping("/getByName")
	public List<PhoneBookUser> getByIdPhoneBook(@RequestParam String name) {
		return service.findByName(name);
	}

}
