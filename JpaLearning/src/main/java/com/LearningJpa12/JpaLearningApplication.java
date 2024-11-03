package com.LearningJpa12;

import com.LearningJpa12.dao.UserRepo;
import com.LearningJpa12.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaLearningApplication {

	public static void main(String[] args)
	{
	ApplicationContext context =	SpringApplication.run(JpaLearningApplication.class, args);

	UserRepo ur = context.getBean(UserRepo.class);

	//User user = new User();

	//user.setName("Ayushi Pandey");
	//user.setCity("kalyan");
	//user.setStatus(" I am java Programmer");

   // User user1 =  ur.save(user);
	//	System.out.println(user);

    //create object of user
		//User user1 = new User();
/*
		user1.setName("Jogindar");
		user1.setCity("Delhi");
		user1.setStatus("Cma Aspirant");

		User user2 = new User();

		user2.setName("Priyanka");
		user2.setCity("Thanekar");
		user2.setStatus("UPSC Aspirant");

        List <User> users = List.of(user1,user2);
		Iterable<User> resultit = ur.saveAll(users);

		resultit.forEach(user->
		{
			System.out.println(user);
		});




		//System.out.println("saved user "+ res);
		//System.out.println("Done");*/


		// update the value of id = 54

	//	Optional<User> op = ur.findById(53);
	//User user = 	op.get();
	////	System.out.println(user);

	//	user.setName("ankit tiwari");
	//	ur.save(user);
	}

}
