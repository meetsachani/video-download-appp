package com.google.android.gms.ads.initialization;

import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface AdapterStatus {

    /* loaded from: classes2.dex */
    public enum State {
        NOT_READY,
        READY
    }

    int a();

    @InterfaceC5670cr1
    State b();

    @InterfaceC5670cr1
    String getDescription();
}
