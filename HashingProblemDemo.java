package com.bridgelabz.testexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashingProblemDemo {

	public static void main(String args[])
	{
		HashingProblemDemo demo = new HashingProblemDemo();
		
		Integer numberArray[]= {4,34,8,2,99,7,3,5,33,25,44,1,66,36,69,60};
		
		int noOfSlotes = 5;
		
		Object listOfObj[] = new Object[noOfSlotes];
		
		
		for(int i=0;i<noOfSlotes;i++)
		{
			listOfObj[i]=new ArrayList<Integer>();
		}
		
		System.out.println(Arrays.toString(numberArray));
		
		
		for(int i=0;i<numberArray.length;i++)
		{
			int key=numberArray[i]%noOfSlotes;
			demo.slotData(numberArray[i],key,listOfObj[key]);
		}
		
		
		for(int i=0;i<listOfObj.length;i++)
		{
			demo.showSlotedData(listOfObj[i],i);
		}
		
	}
	
	public void searchKey(Object obj,int searchKey, int key)
	{
		@SuppressWarnings("unchecked")
		List<Integer> qobj = (List<Integer>) obj;
		if(qobj.contains(searchKey)) {
			System.out.println("Data is Present at "+key+" no");
		}else {
			System.out.println("Data is not present");
		}
	}
	
	public void slotData(int data,int key,Object listObj)
	{
		@SuppressWarnings("unchecked")
		List<Integer> qobj = (List<Integer>) listObj;
		qobj.add(data);
	}
	
	public void showSlotedData(Object o,int key)
	{
		@SuppressWarnings("unchecked")
		List<Integer> obj = (List<Integer>) o;
		System.out.print("Key no "+key+" => "); 
		obj.forEach(x->System.out.print(x+"->"));
		System.out.println();
	}
}
