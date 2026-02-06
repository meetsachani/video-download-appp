package com.google.firebase.installations;

import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public interface FirebaseInstallationsApi {
    @InterfaceC5670cr1
    Task<Void> a();

    @DeferredApi
    FidListenerHandle b(@InterfaceC5670cr1 FidListener fidListener);

    @InterfaceC5670cr1
    Task<InstallationTokenResult> c(boolean z);

    @InterfaceC5670cr1
    Task<String> getId();
}
