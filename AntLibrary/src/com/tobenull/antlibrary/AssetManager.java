package com.tobenull.antlibrary;

import android.content.Context;

public class AssetManager {

	private static AssetManager mInstance = new AssetManager();
	
	private AssetManager() {
		
	}
	
	public static AssetManager getInstance() {
		return mInstance;
	}
	
	public void init(Context context) {
		Config.getInstance().init(context);
	}
	
	public String getName() {
		return Config.getInstance().getName();
	}
	
	public String getTime() {
		return Config.getInstance().getTime();
	}
}
