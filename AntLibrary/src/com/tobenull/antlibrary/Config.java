package com.tobenull.antlibrary;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import android.content.Context;

public class Config {

	private static Config mInstance = new Config();

	private Config() {

	}

	public static Config getInstance() {
		return mInstance;
	}

	public void init(Context context) {
		Properties properties = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = context.getAssets().open("antlibrary.properties");
			properties.load(inputStream);
			setName(properties.getProperty("name"));
			setTime(properties.getProperty("time"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null)
					inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String name;
	private String time;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
