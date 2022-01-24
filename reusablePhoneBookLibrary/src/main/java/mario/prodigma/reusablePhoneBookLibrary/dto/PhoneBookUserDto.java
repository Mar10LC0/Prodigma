package mario.prodigma.reusablePhoneBookLibrary.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created on 18.01.2022
 *
 * @author Mario Çoku
 */

@Getter
@Setter
@NoArgsConstructor
public class PhoneBookUserDto {
	
	private int id;
	
    private String name;
    
    private String lastName;

    private String type;

    private String number;

}
