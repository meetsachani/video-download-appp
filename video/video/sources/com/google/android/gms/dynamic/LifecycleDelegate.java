package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public interface LifecycleDelegate {
    @KeepForSdk
    void a();

    @KeepForSdk
    void b(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 Bundle bundle, @InterfaceC11300zs1 Bundle bundle2);

    @InterfaceC5670cr1
    @KeepForSdk
    View c(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle);

    @KeepForSdk
    void onCreate(@InterfaceC11300zs1 Bundle bundle);

    @KeepForSdk
    void onDestroy();

    @KeepForSdk
    void onLowMemory();

    @KeepForSdk
    void onPause();

    @KeepForSdk
    void onResume();

    @KeepForSdk
    void onSaveInstanceState(@InterfaceC5670cr1 Bundle bundle);

    @KeepForSdk
    void onStart();

    @KeepForSdk
    void onStop();
}
