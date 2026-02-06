package com.google.android.gms.ads.nativead;

import android.view.View;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface NativeCustomFormatAd {
    @InterfaceC5670cr1
    public static final String a = "_videoMediaView";

    /* loaded from: classes2.dex */
    public interface DisplayOpenMeasurement {
        void a(@InterfaceC5670cr1 View view);

        boolean start();
    }

    /* loaded from: classes2.dex */
    public interface OnCustomClickListener {
        void a(@InterfaceC5670cr1 NativeCustomFormatAd nativeCustomFormatAd, @InterfaceC5670cr1 String str);
    }

    /* loaded from: classes2.dex */
    public interface OnCustomFormatAdLoadedListener {
        void a(@InterfaceC5670cr1 NativeCustomFormatAd nativeCustomFormatAd);
    }

    @InterfaceC11300zs1
    String a();

    @InterfaceC11300zs1
    List<String> b();

    void c();

    @InterfaceC11300zs1
    CharSequence d(@InterfaceC5670cr1 String str);

    void destroy();

    @InterfaceC11300zs1
    NativeAd.Image e(@InterfaceC5670cr1 String str);

    void f(@InterfaceC5670cr1 String str);

    @InterfaceC5670cr1
    DisplayOpenMeasurement g();

    @InterfaceC11300zs1
    MediaContent h();
}
