package training_projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		//Scanner scanner=
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i <10; i++) {
			myList.add(i);

		}

		System.out.println("Number from 1 to 10 is");
		for (int i = 0; i < myList.size(); i++) 
		{
			System.out.println("List"+(myList.get(i)+1));	
		}

	}

}
