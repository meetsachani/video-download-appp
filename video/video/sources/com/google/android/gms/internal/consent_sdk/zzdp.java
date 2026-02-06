package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes3.dex */
public final class zzdp implements zzdo {
    public final Object a;

    public zzdp(Object obj) {
        this.a = obj;
    }

    public static zzdo b(Object obj) {
        if (obj != null) {
            return new zzdp(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object a() {
        return this.a;
    }
}
