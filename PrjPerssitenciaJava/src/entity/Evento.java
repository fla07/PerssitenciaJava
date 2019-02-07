package entity;

import java.lang.Object;
import java.sql.Date;
import java.text.Format;
import java.text.ParseException;
import java.text.DateFormat; 
import java.text.SimpleDateFormat;


public class Evento{
	String descricao;
	String responsavel;
	
	public  Date StringParaData(String s){

	    Date result = null;
	    try{
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        result  = (Date) dateFormat.parse(s);
	    }

	    catch(ParseException e){
	        e.printStackTrace();

	    }
	    return result ;
	}
	
	

}
