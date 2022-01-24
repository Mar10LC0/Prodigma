package mario.prodigma.reusablePhoneBookLibrary.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import javax.persistence.Id;


import lombok.Data;

/**
 * Created on 18.01.2022
 *
 * @author Mario Çoku
 */


@Data
@Table(name="phonebookuser", schema = "prodigma")
@Embeddable
@Entity
public class PhoneBookUser
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
    @Column(name = "name", nullable = false)
    private String name;
    

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "number", nullable = false)
    @Pattern(regexp = "^((\\+355)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")
    private String number;
    
//    @Column(name = "lastName", nullable = false)
//    private String lastName;
}
