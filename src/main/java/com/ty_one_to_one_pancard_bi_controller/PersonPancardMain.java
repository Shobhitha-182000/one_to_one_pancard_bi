package com.ty_one_to_one_pancard_bi_controller;

import java.util.Scanner;

import com.ty_one_to_one_pancard_bi_dao.PancardDao;
import com.ty_one_to_one_pancard_bi_dao.PersonDao;
import com.ty_one_to_one_pancard_bi_dto.Pancard;
import com.ty_one_to_one_pancard_bi_dto.Person;

 

public class PersonPancardMain {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			Person person =new Person();
			PersonDao personDao=new PersonDao();
			Pancard pancard=new Pancard();
			PancardDao panDao=new PancardDao();
			
			boolean exit=true;
			do {
				System.out.println("do you want 1.save person \n 2.add language \n 3.update person \n 4.remove person \n 5.getone \n 6.get all \n 7.exit");
				System.out.println("choose any of one");
				int choose=scanner.nextInt();
			 
				switch (choose) {
				case 1:{
					System.out.println("enter the id");
					int id=scanner.nextInt();
					
					System.out.println("enter the  name");
					String name=scanner.next();
					
					System.out.println("enter the phone");
					long phone=scanner.nextLong();
					
					System.out.println("enter the address");
					String address=scanner.next();
					
					System.out.println("enter the age");
					int age=scanner.nextInt();
					
					 
					person.setId(id);
					person.setName(name);
					person.setAddress(address);
					person.setPhone(phone);
					person.setAge(age);
				 
					
					System.out.println("enter the pan number");
					String panNo=scanner.next();
					
					System.out.println("enter the holder name");
					String holder_name=scanner.next();
					
					System.out.println("enter the permanent address");
					String addres=scanner.next();
					
					 pancard.setPanNo(panNo);
					pancard.setHolder_name(holder_name);
					pancard.setAddress(addres);
					
					person.setPanCard(pancard);
					pancard.setPerson(person);
					
					personDao.savePerson(person);
						
				}break;
				
				case 2:{
						System.out.println("enter the person id");
						int id=scanner.nextInt();
						
						System.out.println("enter the  name");
						String name=scanner.next();
						
						System.out.println("enter the phone");
						long phone=scanner.nextLong();
						
						System.out.println("enter the address");
						String address=scanner.next();
						
						System.out.println("enter the age");
						int age=scanner.nextInt();
						
						 
						person.setId(id);
						person.setName(name);
						person.setAddress(address);
						person.setPhone(phone);
						person.setAge(age);
						
						System.out.println("do you want to update adhar also");
						int select=scanner.nextInt();
						
					
						
				}break;

				default:
					break;
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}while(exit);
			
		}
}
