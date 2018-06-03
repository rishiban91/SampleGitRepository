package com.firstprogram.program;


enum Season {
	Winter, Spring, Summer, Fall 
}
public class EnumProgram {
	Season s;
	public EnumProgram(Season s) {
		this.s=s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Fall";
		EnumProgram ep = new EnumProgram(Season.valueOf(str));
		ep.yearSeason();
		Season[] season = Season.values();
		for(Season s: season) {
			System.out.println(s+" "+s.ordinal());
		}
			
	}
	
	public void yearSeason()
	{	
		switch(s) {
		case Winter: System.out.println("winter");
		break;
		case Spring: System.out.println("winter");
		break;
		case Summer: System.out.println("winter");
		break;
		case Fall: System.out.println("winter");
		break;
		}

	}

}
