package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class zzfxy extends zzfww implements Serializable {
    public final Object X;
    public final Object Y;

    public zzfxy(Object obj, Object obj2) {
        this.X = obj;
        this.Y = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzfww, java.util.Map.Entry
    public final Object getKey() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzfww, java.util.Map.Entry
    public final Object getValue() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzfww, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
