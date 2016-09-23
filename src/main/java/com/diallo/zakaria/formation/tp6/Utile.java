/**
 * 
 */
package com.diallo.zakaria.formation.tp6;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author formation
 *
 */
public class Utile {

	public static int toInt(Date d) {
		return Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(d)); 
		
	}

}
