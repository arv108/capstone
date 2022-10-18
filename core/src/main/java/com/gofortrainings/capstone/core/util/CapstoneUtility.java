package com.gofortrainings.capstone.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CapstoneUtility {
   
    
    private CapstoneUtility() {
      }

    public static String getFormattedDate(Date date) {
        if(date != null)
        {
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, d MMMM yyyy");
            return formatter.format(date);
        }
        return null;
    }
}
