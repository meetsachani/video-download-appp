package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdj extends zzdf {
    public final transient Object Z;

    public zzdj(Object obj) {
        obj.getClass();
        this.Z = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.Z.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final int d(Object[] objArr, int i) {
        objArr[0] = this.Z;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdf, com.google.android.gms.internal.consent_sdk.zzdb
    public final zzdk h() {
        return new zzdg(this.Z);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.Z.hashCode();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdf, com.google.android.gms.internal.consent_sdk.zzdb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdg(this.Z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.Z.toString();
        return C6566gU0.f + obj + C6566gU0.g;
    }
}
