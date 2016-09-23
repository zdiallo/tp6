package com.diallo.zakaria.formation.tp6;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;

public class UtileTest extends TestCase {
 public void testToInt() throws ParseException {
    Date d = getTestDate();
    int i = Utile.toInt(d);
    assertEquals(20131221, i);
 }
  private Date getTestDate() {
    try {
      return DateFormat.getDateInstance(
				DateFormat.SHORT, Locale.FRENCH).parse("21/12/2013");
  } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }	
  }
}