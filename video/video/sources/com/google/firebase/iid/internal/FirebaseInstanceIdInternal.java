package com.google.firebase.iid.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes3.dex */
public interface FirebaseInstanceIdInternal {

    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface NewTokenListener {
        @KeepForSdk
        void a(String str);
    }

    @InterfaceC11300zs1
    @KeepForSdk
    String a();

    @KeepForSdk
    void b(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) throws IOException;

    @InterfaceC5670cr1
    @KeepForSdk
    Task<String> c();

    @KeepForSdk
    void d(NewTokenListener newTokenListener);

    @KeepForSdk
    String getId();
}
