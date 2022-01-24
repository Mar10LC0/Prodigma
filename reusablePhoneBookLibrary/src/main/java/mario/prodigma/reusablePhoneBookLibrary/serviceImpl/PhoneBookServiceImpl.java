package mario.prodigma.reusablePhoneBookLibrary.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mario.prodigma.reusablePhoneBookLibrary.dto.PhoneBookUserDto;
import mario.prodigma.reusablePhoneBookLibrary.mapper.PhoneBookMapper;
import mario.prodigma.reusablePhoneBookLibrary.model.PhoneBookUser;
import mario.prodigma.reusablePhoneBookLibrary.repository.PhoneBookRepository;
import mario.prodigma.reusablePhoneBookLibrary.service.PhoneBookService;

/**
 * Created on 18.01.2022
 *
 * @author Mario Çoku
 */

@Service
public class PhoneBookServiceImpl implements PhoneBookService
{
	@Autowired
	PhoneBookRepository repo;
	
//	@Autowired
//	PhoneBookMapper mapper;

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<PhoneBookUser> getAll() {
		return repo.findAll();
	}


	@Override
	public PhoneBookUser save(PhoneBookUserDto phoneBookDto) {
		PhoneBookUser pBUser = new PhoneBookUser();
		pBUser.setId(phoneBookDto.getId());
		pBUser.setName(phoneBookDto.getName());
		//pBUser.setLastName(phoneBookDto.getLastName());
		pBUser.setNumber(phoneBookDto.getNumber());
		pBUser.setType(phoneBookDto.getType());
		return repo.save(pBUser);
	}

	@Override
	public PhoneBookUser findById(Integer id) {
		return repo.findById(id).get();
	}


	@Override
	public PhoneBookUser update(PhoneBookUserDto phoneBookDto) {
		PhoneBookUser pBUser = new PhoneBookUser();
		pBUser.setId(phoneBookDto.getId());
		pBUser.setName(phoneBookDto.getName());
		//pBUser.setLastName(phoneBookDto.getLastName());
		pBUser.setNumber(phoneBookDto.getNumber());
		pBUser.setType(phoneBookDto.getType());
		return repo.save(pBUser);
	}

	@Override
	public List<PhoneBookUser> findByName(String name) {
		return (List<PhoneBookUser>) repo.getAllPhoneBookUsersByName(name);
	}

	@Override
	public PhoneBookUser findByLastName(String lastName) {
		return null;
	}	

}