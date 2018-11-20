package com.onkar.servicesupp;

import java.io.ObjectInputStream.GetField;

import com.onkar.record.MyTestRecord;
import com.onkar.service.DateDifferenceProvider;

public class TestDateDifferenceProvider {

	public static void main(String[] args){
		DateDifferenceProvider provider = new DateDifferenceProvider();
		MyTestRecord[] myTestRecords= new MyTestRecord[5];
		myTestRecords[0]= new MyTestRecord(new MyDate(20,12,2018), new MyDate(20,12,2018), 0 );
		myTestRecords[1] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(27, 11, 2018), 7);
		
		
		for (int index=0; index < myTestRecords.length; index++) {
			int calculatedDiff = provider.getDateDifference(myTestRecords[index].getStartDate(),
					myTestRecords[index].getEndDate());
			if (calculatedDiff == myTestRecords[index].getActualDifference()) {
				System.out.println("Test Case passed");
			} else {
				System.err.println("Test Case failed"+" Actual =" + myTestRecords[index].getActualDifference()+ " calculated ="+ calculatedDiff);
			}
		}
		
		
	}

	
}
