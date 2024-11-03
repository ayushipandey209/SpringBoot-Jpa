package com.LearningJpa12;

import com.LearningJpa12.dao.UserRepo;
import com.LearningJpa12.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.Optional;
import java.util.Scanner;

public class JpaLearningMainClass
{

    public static void main(String[] args) throws IOException
    {
        String ans;
        Scanner sc = new Scanner(System.in);


        ApplicationContext context =	SpringApplication.run(JpaLearningApplication.class, args);
        UserRepo ur = context.getBean(UserRepo.class);

        System.out.println("Select Among the options !!");
       do
        {
            try {
                System.out.println("1 ->Insert    2->Update   3->Fetch   4->Delete  ");
                int op = sc.nextInt();
                  sc.nextLine();
                switch (op) {
                    case 1:
                        User user = new User();
                        System.out.println("Enter name ");
                        String name = sc.nextLine();
                        System.out.println("Enter city");
                        String city = sc.nextLine();
                        System.out.println("Enter status");
                        String st = sc.nextLine();

                        user.setName(name);

                        user.setCity(city);
                        user.setStatus(st);

                        ur.save(user);
                        System.out.println("Saved");

                        break;

                    case 2:
                        System.out.println("Enter the id you want to Update");
                        int id = sc.nextInt();
                        sc.nextLine();
                        Optional<User> opt = ur.findById(id);
                        User user1 = opt.get();
                        System.out.println(user1);
                        System.out.print("Enter the updated name : ");
                        String n = sc.nextLine();
                        user1.setName(n);
                        System.out.print("Enter the updated city : ");
                        String c = sc.nextLine();
                        user1.setCity(c);
                        System.out.print("Enter the updated Status : ");
                        String s1 = sc.nextLine();
                        user1.setStatus(s1);
                        System.out.println("here is the Updated");
                        System.out.println(user1);
                        ur.save(user1);
                        break;
                    case 3:
                        System.out.print("Enter the id whos data you want to fetch :");
                        int fid = sc.nextInt();
                        opt = ur.findById(fid);
                        User user2 = opt.get();
                        System.out.println(user2);
                        System.out.println("Data Fetched ");
                        break;
                    case 4:
                        System.out.print("Enter the id whos data you want to delete :");
                        int did = sc.nextInt();
                        opt = ur.findById(did);
                        User user3 = opt.get();
                        System.out.println(user3);
                        ur.deleteById(did);
                        System.out.println("Data Deleted ");
                        break;

                    case 5: Iterable<User> user4 = ur.findAll();
                        User userr = new User();
                        user4.forEach(userr1->{
                            System.out.println(userr);
                        });
                        break;
                    default :
                        System.out.println("Choose Correct option "); break;

                }

            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }

            System.out.print("Do you want to continue(y/n) : ");
            ans = sc.nextLine();
        }while(ans!="n");

        System.out.println("Thankyou - Ayushi Pandey");
    }
}
