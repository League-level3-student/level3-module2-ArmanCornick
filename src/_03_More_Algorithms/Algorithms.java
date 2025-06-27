package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for(int i=0; i<eggs.size();i++) {
        	if(eggs.get(i).equals("cracked")) {
        		return i;
        	}
        }
		return -1;
    }
    
    public static int countPearls(List<Boolean> oysters) {
    	int z=0;
        for(int i=0; i<oysters.size();i++) {
        	if(oysters.get(i)) {
        		z += 1;
        	}
        }
		return z;
    }
    
    public static double findTallest(List<Double> peeps) {
    	double z=0;
        for(int i=0; i<peeps.size();i++) {
        	if(peeps.get(i)>z) {
        		z = peeps.get(i);
        	}
        }
		return z;
    }
    
    public static String findLongestWord(List<String> words) {
    	String z= "";
        for(int i=0; i<words.size();i++) {
        	if(words.get(i).length()>z.length()) {
        		z = words.get(i);
        	}
        }
		return z;
    }
    
    public static Boolean containsSOS(List<String> morse) {
        for(int i=0; i<morse.size();i++) {
        	if(morse.get(i).equals("... --- ...")) {
        		return true;
        	}
        }
		return false;
    }
    
    public static List<Double> sortScores(List<Double> scores) {
        for(int i=0; i<scores.size();i++) {
        	for(int z=0; z<scores.size();z++) {
            	if(scores.get(z)>scores.get(z-1)) {
            		
            	}
            }
        }
		return null;
    
}}
