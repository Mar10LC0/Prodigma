package mario.prodigma.reusablePhoneBookLibrary.repository;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mario.prodigma.reusablePhoneBookLibrary.model.PhoneBookUser;

/**
 * Created on 18.01.2022
 *
 * @author Mario Çoku
 */

@ComponentScan(basePackages = "mario.prodigma.reusablePhoneBookLibrary.repository")
public interface PhoneBookRepository extends JpaRepository<PhoneBookUser, Integer>{
	
	@Query("select t from PhoneBookUser t  where id = :id")
	public List<PhoneBookUser> getAllPhoneBookUserById();
	
	@Query("select t from PhoneBookUser t  where name = :name")
	public List<PhoneBookUser>getAllPhoneBookUsersByName(String name);

}
