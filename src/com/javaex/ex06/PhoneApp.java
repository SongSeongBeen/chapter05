package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

		public static void main(String[] args) throws IOException {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("데이터를 입력하세요");
			
			//메모리 올리기
			List<Person> pList = new ArrayList<Person>();
			//파일에 접속
			Reader fr = new FileReader("F:\\javaStudy\\file\\PhoneDB.txt");
			BufferedReader br = new BufferedReader(fr);
			
			
			for(int i=0; i<3; i++) {
				String put = sc.nextLine();
				String[] sArray = put.split(" ");

				Person f = new Person(sArray[0], sArray[1], sArray[2]);
				String name = sArray[0];
				String  hp = sArray[1];
				String  company = sArray[2];
				Person p01 = new Person(name, hp, company);
				pList.add(p01);
			}
			for(Person f:pList) {
	    		f.showInfo();
			}
			
			
			
			
			
			
			sc.close();
			
			br.close();
		
		}
}