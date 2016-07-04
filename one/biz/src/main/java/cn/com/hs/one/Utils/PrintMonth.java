package cn.com.fero.mgr.action;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 输出当前年的每一个月
 * @author hesheng
 *
 */
public class PrintMonth {

	public static void main(String[] args) {
		String[] str = new DateFormatSymbols().getShortWeekdays();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.MONTH, 0);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
		int newmonth=month;
		int year=calendar.get(Calendar.YEAR);
		int newyear=year;
		int wekkday = calendar.get(Calendar.DAY_OF_WEEK);
		int weekmonth=calendar.get(Calendar.WEEK_OF_MONTH);
		while(year==newyear){
			
		System.out.printf("%20s",(month+1)+"月");
		System.out.println();
		for (String s : str) {
			
			if (!"".equals(s)) {
				s=s.substring(2);
				System.out.printf("%7s",s);
			}
		}
		System.out.println();
		List<String[]> list=new ArrayList<String[]>();
		String[] week = new String[7];
		while(weekmonth==calendar.get(Calendar.WEEK_OF_MONTH)&& month==newmonth){
			 day = calendar.get(Calendar.DAY_OF_MONTH);
			 wekkday = calendar.get(Calendar.DAY_OF_WEEK);
			 week[wekkday-1]=toString(day);
			 calendar.add(Calendar.DAY_OF_MONTH, 1);
			 int newweekmonth=calendar.get(Calendar.WEEK_OF_MONTH);
			 newmonth=calendar.get(Calendar.MONTH);
			 newyear=calendar.get(Calendar.YEAR);
			 if(newweekmonth!=weekmonth){
				 list.add(week);
				 week = new String[7];
				 weekmonth=newweekmonth;
			 }
			 if(month!=newmonth){
				 month=newmonth;
				 break;
			 }
		}
		for(String[] arr:list){
			for(String a:arr){
				if(a==null){
					a="";
				}
//				else{
//					a="    "+a;
//					a=a.substring(a.length()-4);
//				}
//				System.out.print(a);
				System.out.printf("%4s",a);
			}
			System.out.println();
		}
		}
	}
	
	static String toString(int i){
		return String.valueOf(i);
	}
}
