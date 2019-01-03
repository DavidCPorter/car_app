package edu.uic.dporte7.carapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Dporter1 on 10/9/17.
 */

public class CarClass {
    public ArrayList<Integer> mCarPicsArray = new ArrayList<Integer>(
            Arrays.asList(R.drawable.bmw,
                    R.drawable.benz, R.drawable.bugatti, R.drawable.lambo,
                    R.drawable.porsche, R.drawable.tesla, R.drawable.bentley));
    public ArrayList<Integer> mThumbPicsArray = new ArrayList<Integer>(
            Arrays.asList(R.drawable.bmw,
                    R.drawable.benz_thumb, R.drawable.bugatti_thumb, R.drawable.lambo_thumb,
                    R.drawable.porsche_thumb, R.drawable.tesla_thumb, R.drawable.bentley_thumb));
    public final String[] mCarText = {"bmw", "benz", "bugatti", "lambo", "porsche", "tesla", "bentley"};
    public final String[] mCarWebsite = {
            "https://www.bmw.com/en/index.html",
            "https://www.mercedes-benz.com/en/",
            "https://www.bugatti.com/home/",
            "https://www.lamborghini.com/en-en/",
            "https://www.porsche.com/usa/",
            "https://www.tesla.com/",
            "https://www.bentleymotors.com/en.html"
    };
    public final String[][] mDealers = {
            {
                    "\nBavarian Motors:\n 27 N May St, Chicago, IL 60607\n",
                    "Perillo BMW:\n 1035 N Clark St, Chicago, IL 60610\n",
                    "Parick BMW:\n 700 E Golf Rd, Schaumburg, IL 60173\n"
            },
            {
                    "\nMercedez-Benz of Chicago:\n 1520 W North Ave, Chicago, IL 60642\n",
                    "Greater Chicago Motors:\n" + "1850 N Elston Ave, Chicago, IL 60642\n",
                    "Loeber Motors:\n " + "4255 Touhy Ave, Lincolnwood, IL 60712\n"
            },
            {
                    "\nBraman Bugatti Miami:\n 2060 Biscayne Blvd, Miami, FL 33137\n",
                    "Gold Coast Exotic Motors Two:\n 834 N Rush St, Chicago, IL 60611\n",
                    "Bugatti Beverly Hills:\n 8833 W Olympic Blvd, Beverly Hills, CA 90211\n"
            },
            {
                    "\nLamborghini Gold Coast Showroom:  \n" + "834 N Rush St, Chicago, IL 60611\n",
                    "Global Luxury Imports:\n" + "101 Tower Dr, Burr Ridge, IL 60527\n",
                    "Perillo Downers Grove:  \n" +"330 Ogden Ave, Downers Grove, IL 60515\n"
            },
            {
                    "\nNapleton Porsche:\n 311 E Ogden Ave, Westmont, IL 60559\n",
                    "Loeber Porsche:\n 7101 Lincoln Ave, Lincolnwood, IL 60712\n",
                    "Porsche Exchange: \n 2300 Skokie Valley Rd, Highland Park, IL 60035"
            },
            {
                    "\nTesla:\n" + "1053 W Grand Ave, Chicago, IL 60642\n",
                    "Tesla:\n" + "50 Ogden Ave, Westmont, IL 60559\n",
                    "Tesla Motors Old Orchard:\n" + "4999 Old Orchard Shop Center East Ring Rd, Skokie, IL 60077"
            },
            {
                    "\nBentley Gold Coast: \n 834 N Rush St, Chicago, IL 60611\n",
                    "Bentley Northbrook: \n 100 Skokie Blvd, Northbrook, IL 60062\n",
                    "Bentley Motors Inc: \n 1508 S Main St, Bloomington, IL 61701"
            }
    };

}
