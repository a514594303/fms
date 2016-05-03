package com.ufc.comm.util;

import java.util.UUID;

public class IDTools {

	public static String getUUID(){
		UUID uuid = UUID.randomUUID();
		String uuids = uuid.toString();
		uuids=uuids.replaceAll("-", "");
		return uuids.trim(); 
	}
	public static String getNumID(){
		
		String timeM = System.currentTimeMillis()+"";
		double random = Math.random()*100000000;
		long randoms = Math.round(random);
		return timeM+randoms; 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println (getUUID());
		  double rr = (Math.random()*10000000);
		 System.out.println (getNumID());
		 System.out.println (Math.round(rr));
		 

	}

}
