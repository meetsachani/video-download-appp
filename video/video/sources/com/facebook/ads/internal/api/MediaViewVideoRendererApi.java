package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;
import o.BR0;
import o.InterfaceC2501Av0;

@Keep
/* loaded from: classes2.dex */
public interface MediaViewVideoRendererApi extends AdComponentViewApiProvider {
    void destroy();

    void disengageSeek(VideoStartReason videoStartReason);

    void engageSeek();

    @BR0(from = 0)
    int getCurrentTimeMs();

    @BR0(from = 0)
    int getDuration();

    View getVideoView();

    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
    float getVolume();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer);

    void pause(boolean z);

    void play(VideoStartReason videoStartReason);

    void seekTo(@BR0(from = 0) int i);

    void setVolume(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f);

    boolean shouldAutoplay();
}
