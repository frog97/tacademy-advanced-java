package org.frog.advance.java.chap01;

import java.util.ArrayList;

public class MyShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shape> al = new ArrayList<>();
		for (int i = 0; i < 100; i++)
		{
			double dValue = Math.random();
		    int iValue = (int)(dValue * 4);
		    switch (iValue)
		    {
		    case 0:
		    	al.add(new Triangle());
		    	break;
		    case 1:
		    	al.add(new Rectangle());
		    	break;	
		    case 2:
		    	al.add(new Polygon());
		    	break;	
		    default:
		    	al.add(new Circle());
		    	break;	
		    	
		    }
		}
		int sum = 0;
		for (Shape item : al)
		{
			sum += item.area();
		}
		System.out.println("sum : " + sum);

	}

}
