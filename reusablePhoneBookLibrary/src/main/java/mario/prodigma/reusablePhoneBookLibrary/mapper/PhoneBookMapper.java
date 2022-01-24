package mario.prodigma.reusablePhoneBookLibrary.mapper;

import mario.prodigma.reusablePhoneBookLibrary.dto.PhoneBookUserDto;
import mario.prodigma.reusablePhoneBookLibrary.model.PhoneBookUser;

public interface PhoneBookMapper {

	PhoneBookUser PhoneBookUserDtoToPhoneBookUser(PhoneBookUserDto phoneBookDto);

	PhoneBookUserDto PhoneBookUserToPhoneBookUserDto(PhoneBookUser phoneBook);

}
