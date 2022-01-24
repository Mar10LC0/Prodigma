package mario.prodigma.reusablePhoneBookLibrary.service;

import java.util.List;

import mario.prodigma.reusablePhoneBookLibrary.dto.PhoneBookUserDto;
import mario.prodigma.reusablePhoneBookLibrary.model.PhoneBookUser;

/**
 * Created on 18.01.2022
 *
 * @author Mario Çoku
 */

public interface PhoneBookService {
	
	List<PhoneBookUser> getAll();
		
	PhoneBookUser save(PhoneBookUserDto phoneBookDto);
		
	PhoneBookUser findById(Integer id);
		
	PhoneBookUser update(PhoneBookUserDto phoneBookDto);
	
	public void delete(Integer id);
	
	List<PhoneBookUser> findByName(String name);
	
	PhoneBookUser findByLastName(String lastName);

}
