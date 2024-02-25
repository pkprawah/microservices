package corejava;

import java.sql.Time;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {
	
	Date createdOn;

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	
	public void  sendDate(Date d) {
		
		try {
			NumberFormat nf = NumberFormat.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD");
			sdf.parse("2022/12/2212");
			
			//new Date('foo-bar 2014');
			new Date("foo-bar 2014").toString();
		}
		catch(ParseException p) {
			System.out.println(p.getMessage());
		}
		
		
	}
	
	

}
