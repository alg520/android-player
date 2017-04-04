package com.cube.lush.player.mobile.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.cube.lush.player.api.model.MediaContent;

import java.util.List;

/**
 * Created by Jamie Cruwys of 3 SIDED CUBE on 04/04/2017.
 */
public interface ListDataRetrieval
{
	void onListDataRetrieved(@NonNull List<MediaContent> items);

	void onListDataRetrievalError(@Nullable Throwable throwable);
}