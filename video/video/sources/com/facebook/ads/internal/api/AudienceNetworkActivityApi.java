package com.facebook.ads.internal.api;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import com.facebook.proguard.annotations.DoNotStripAny;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;
import o.InterfaceC6184ey2;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
@InterfaceC6184ey2
@Keep
@DoNotStripAny
/* loaded from: classes2.dex */
public interface AudienceNetworkActivityApi {
    public static final int EXTERNAL_FINISH_REASON = 0;

    void dump(String str, @InterfaceC11300zs1 FileDescriptor fileDescriptor, PrintWriter printWriter, @InterfaceC11300zs1 String[] strArr);

    void finish(int i);

    void onActivityResult(int i, int i2, Intent intent);

    void onBackPressed();

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    boolean onTouchEvent(MotionEvent motionEvent);
}
