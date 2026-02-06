package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzet;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbyv;
import java.util.List;
import o.C9500sT;
import o.C9743tT;
import o.CT;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.KS1;

/* loaded from: classes2.dex */
public class MobileAds {
    @InterfaceC5670cr1
    public static final String a = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void a(@InterfaceC5670cr1 Context context) {
        zzet.j().t(context);
    }

    @InterfaceC11300zs1
    public static InitializationStatus b() {
        return zzet.j().i();
    }

    @KeepForSdk
    public static String c() {
        return zzet.j().n();
    }

    @InterfaceC5670cr1
    public static RequestConfiguration d() {
        return zzet.j().g();
    }

    @InterfaceC5670cr1
    public static VersionInfo e() {
        zzet.j();
        String[] split = TextUtils.split("24.3.0", "\\.");
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @KS1("android.permission.INTERNET")
    public static void f(@InterfaceC5670cr1 Context context) {
        zzet.j().u(context, null, null);
    }

    public static void g(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 OnInitializationCompleteListener onInitializationCompleteListener) {
        zzet.j().u(context, null, onInitializationCompleteListener);
    }

    public static void h(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzet.j().v(context, onAdInspectorClosedListener);
    }

    public static void i(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        zzet.j().w(context, str);
    }

    public static boolean j(boolean z) {
        return zzet.j().D(z);
    }

    @InterfaceC11300zs1
    public static CT k(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C9743tT c9743tT, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 C9500sT c9500sT) {
        zzet.j();
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzbyv a2 = zzbuc.a(context);
        if (a2 == null) {
            zzo.d("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (CT) ObjectWrapper.o1(a2.V2(ObjectWrapper.V3(context), ObjectWrapper.V3(c9743tT), str, ObjectWrapper.V3(c9500sT)));
        } catch (RemoteException | IllegalArgumentException e) {
            zzo.e("Unable to register custom tabs session. Error: ", e);
            return null;
        }
    }

    @KeepForSdk
    public static void l(@InterfaceC5670cr1 Class<? extends RtbAdapter> cls) {
        zzet.j().x(cls);
    }

    public static void m(@InterfaceC5670cr1 WebView webView) {
        zzet.j();
        Preconditions.k("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzo.d("The webview to be registered cannot be null.");
            return;
        }
        zzbyv a2 = zzbuc.a(webView.getContext());
        if (a2 == null) {
            zzo.d("Internal error, query info generator is null.");
            return;
        }
        try {
            a2.s0(ObjectWrapper.V3(webView));
        } catch (RemoteException e) {
            zzo.e("", e);
        }
    }

    public static void n(boolean z) {
        zzet.j().y(z);
    }

    public static void o(float f) {
        zzet.j().z(f);
    }

    public static void p(@InterfaceC5670cr1 RequestConfiguration requestConfiguration) {
        zzet.j().B(requestConfiguration);
    }

    public static void q(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 List<PreloadConfiguration> list, @InterfaceC5670cr1 PreloadCallback preloadCallback) {
        zzet.j().l(context, list, preloadCallback);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzet.j().A(str);
    }
}
