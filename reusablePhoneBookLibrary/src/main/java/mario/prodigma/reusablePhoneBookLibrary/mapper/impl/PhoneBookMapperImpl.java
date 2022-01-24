package mario.prodigma.reusablePhoneBookLibrary.mapper.impl;

import mario.prodigma.reusablePhoneBookLibrary.dto.PhoneBookUserDto;
import mario.prodigma.reusablePhoneBookLibrary.mapper.PhoneBookMapper;
import mario.prodigma.reusablePhoneBookLibrary.model.PhoneBookUser;

public class PhoneBookMapperImpl implements PhoneBookMapper {

	@Override
	public PhoneBookUser PhoneBookUserDtoToPhoneBookUser(PhoneBookUserDto phoneBookDto) {
		PhoneBookUser phoneBookUser = new PhoneBookUser();
		
		
			phoneBookUser.setId(phoneBookDto.getId());
		
		if (phoneBookDto.getName()!= null) {
			phoneBookUser.setName(phoneBookDto.getName());
		}
		if (phoneBookDto.getNumber() != null) {
			phoneBookUser.setNumber(phoneBookDto.getNumber());
		}
		if (phoneBookDto.getType() != null) {
			phoneBookUser.setType(phoneBookDto.getType());
		}
		return phoneBookUser;
	}

	@Override
	public PhoneBookUserDto PhoneBookUserToPhoneBookUserDto(PhoneBookUser phoneBook) {
		
		PhoneBookUserDto phoneBookUserDto = new PhoneBookUserDto();
		
			phoneBookUserDto.setId(phoneBook.getId());
		
		if (phoneBook.getName()!= null) {
			phoneBookUserDto.setName(phoneBook.getName());
		}
		if (phoneBook.getNumber() != null) {
			phoneBookUserDto.setNumber(phoneBook.getNumber());
		}
		if (phoneBook.getType() != null) {
			phoneBookUserDto.setType(phoneBook.getType());
		}
		
		return phoneBookUserDto;
	}

}
