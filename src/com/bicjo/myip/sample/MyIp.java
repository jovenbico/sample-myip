package com.bicjo.myip.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MyIp {

	public static void main(String[] args) {

		try {
			URL urlWhatIsMyIPAddress = new URL("http://bot.whatismyipaddress.com");

			String myIpAddress = getIpAddress(urlWhatIsMyIPAddress);
			
			System.out.println("myIP: " + myIpAddress);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static String getIpAddress(URL urlWhatIsMyIPAddress) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(urlWhatIsMyIPAddress.openStream()));
		return bufferedReader.readLine().trim();
	}

}
