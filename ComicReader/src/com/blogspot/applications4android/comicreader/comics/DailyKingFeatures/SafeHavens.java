package com.blogspot.applications4android.comicreader.comics.DailyKingFeatures;

import java.util.Calendar;

import com.blogspot.applications4android.comicreader.comictypes.DailyKingFeaturesComic;


public class SafeHavens extends DailyKingFeaturesComic {

	public SafeHavens() {
		super();
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2019, 8, 8);
	}

	@Override
	public String getComicWebPageUrl() {
		return "http://safehavenscomic.com";
	}
}
