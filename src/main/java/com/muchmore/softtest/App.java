package com.muchmore.softtest;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.*;


public class App 
{
	private int[] areas;
	private int[] prices;
	//private Reader in;
	
	public void readFile(String path) throws IOException{
		//System.out.println("In ReadFile:");
		Reader in = new FileReader(path);
		//Reader in = new FileReader("data0.csv");
		//Reader in = new FileReader("C://Users//ty//Desktop//data0.csv");
		areas = new int[0];
		prices = new int[0];
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader("Area", "Price").parse(in);
		for (CSVRecord record : records) {
		    String area = record.get("Area");
		    String price = record.get("Price");
		    //System.out.println( area+" "+price );
		    int iarea = Integer.parseInt(area);
		    int iprice = Integer.parseInt(price);
		    
		    // arrayAppend(prices, iprice);
		    int[] tempArray2 = new int[prices.length+1];
			for(int i=0; i<prices.length; i++)
			{
				tempArray2[i]=prices[i];
			}
			tempArray2[prices.length] = iprice;
			prices = tempArray2;
		}
	}	
	
	public int getPrice(int i){
		if(i < 0 
				|| i >= prices.length) 
			return 0;
		else 
			return prices[i];
	}

	public void sortPrice(){
		bubbleSort(prices);
	}
	
	public int[] arrayMinMax(int[] array){
		int max = 0;
		int min = Integer.MAX_VALUE;
		int result[] = new int[2];
		for(int i=0; i<array.length; i++)
		{
			if(max < array[i]){
				max = array[i];
			}
			if(min > array[i]){
				min = array[i];
			}
		}
		result[0] = min;
		result[1] = max;
		return result;
	}
	
	public void bubbleSort(int[] array){
        int i,j;
        for(i=0;i<array.length;i++) {
            for(j=0;j<array.length-1-i;j++) {
                if(array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        //System.out.println("Sorted: ");
        //for(i=0;i<array.length;i++)
        //    System.out.print(array[i]+" ");
	}
	
	public static void main(String[] args){
        System.out.println("Main");
	}

}
