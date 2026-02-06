package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public interface CrashlyticsNativeComponent {
    @InterfaceC5670cr1
    NativeSessionFileProvider a(@InterfaceC5670cr1 String str);

    boolean b();

    void c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, long j, @InterfaceC5670cr1 StaticSessionData staticSessionData);

    boolean d(@InterfaceC5670cr1 String str);
}
