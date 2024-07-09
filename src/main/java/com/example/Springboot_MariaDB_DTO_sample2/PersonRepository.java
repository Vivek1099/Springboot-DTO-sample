package com.example.Springboot_MariaDB_DTO_sample2;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person,Integer>
{
	PersonInterface getByCity(String city);
	PersonDTO getByLname(String lname);
	PersonInterface getDetailsById(int id);
	
	@Query("select new com.example.Springboot_MariaDB_DTO_sample2.PersonDTO2(p.id,p.city,p.pin,p.email)from persondata p where p.id=?1")
	PersonDTO2 getInfoById(int id);
	
	@Query("select new com.example.Springboot_MariaDB_DTO_sample2.PersonDTO(p.id,p.fname,p.lname,p.age) from persondata p where p.fname=?1 and p.lname=?2")
	PersonDTO getByName(String fname,String lname);

}
