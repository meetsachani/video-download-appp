package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DataHolderNotifier<L> implements ListenerHolder.Notifier<L> {
    public final DataHolder a;

    @KeepForSdk
    public DataHolderNotifier(@InterfaceC5670cr1 DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @KeepForSdk
    public final void a(@InterfaceC5670cr1 L l) {
        c(l, this.a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @KeepForSdk
    public void b() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @KeepForSdk
    public abstract void c(@InterfaceC5670cr1 L l, @InterfaceC5670cr1 DataHolder dataHolder);
}
