package com.example.Springboot_MariaDB_DTO_sample2;



import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer>
{
	PersonInterface getByCity(String city);
	PersonDTO getByLname(String lname);
	PersonInterface getDetailsById(int id);
	
//	@Query("select new com.example.Springboot_MariaDB_DTO_sample2.PersonDTO2(p.id,p.city,p.pin,p.email)from Person p where p.id=?1")
//	List<PersonDTO2> getById(int id);

}
