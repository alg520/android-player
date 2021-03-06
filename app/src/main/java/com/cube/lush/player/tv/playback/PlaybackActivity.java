package com.cube.lush.player.tv.playback;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.cube.lush.player.tv.base.BaseTVActivity;
import com.cube.lush.player.R;

/**
 * Playback Activity
 *
 * @author Jamie Cruwys
 */
public class PlaybackActivity extends BaseTVActivity
{
	@SuppressWarnings("HardCodedStringLiteral")
	public static final String EXTRA_PLAYBACK_METHOD = "playback_method";

	@SuppressWarnings("HardCodedStringLiteral")
	public static final String EXTRA_PLAYBACK_METHOD_VALUE = "playback_method_value";

	@SuppressWarnings("HardCodedStringLiteral")
	public static final String EXTRA_PLAYBACK_BACKGROUND = "playback_background_url";

	public static Intent getIntent(@NonNull Context context,
	                               @Nullable PlaybackMethod playbackMethod,
	                               @Nullable String playbackMethodValue,
	                               @Nullable String playbackBackgroundUrl)
	{
		Intent intent = new Intent(context, PlaybackActivity.class);

		if (playbackMethod != null)
		{
			intent.putExtra(EXTRA_PLAYBACK_METHOD, playbackMethod);
		}

		if (!TextUtils.isEmpty(playbackMethodValue))
		{
			intent.putExtra(EXTRA_PLAYBACK_METHOD_VALUE, playbackMethodValue);
		}

		if (!TextUtils.isEmpty(playbackBackgroundUrl))
		{
			intent.putExtra(EXTRA_PLAYBACK_BACKGROUND, playbackBackgroundUrl);
		}

		return intent;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_playback);
	}
}
