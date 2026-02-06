package com.facebook.ads.internal.bridge.fbsdk;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
@Keep
/* loaded from: classes2.dex */
public class FBLoginASID {
    @InterfaceC11300zs1
    @SuppressLint({"CatchGeneralException"})
    public static String getFBLoginASID() {
        try {
            Object invoke = Class.forName("com.facebook.a").getDeclaredMethod("getCurrentAccessToken", null).invoke(null, null);
            if (invoke != null) {
                return (String) Class.forName("com.facebook.a").getDeclaredMethod("getUserId", null).invoke(invoke, null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
