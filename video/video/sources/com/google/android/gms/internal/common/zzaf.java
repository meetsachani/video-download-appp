package com.google.android.gms.internal.common;

import java.util.List;
import o.MB;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaf extends zzag {
    public final transient int Y0;
    public final transient int Z;
    public final /* synthetic */ zzag Z0;

    public zzaf(zzag zzagVar, int i, int i2) {
        this.Z0 = zzagVar;
        this.Z = i;
        this.Y0 = i2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return this.Z0.f() + this.Z + this.Y0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return this.Z0.f() + this.Z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzs.a(i, this.Y0, "index");
        return this.Z0.get(i + this.Z);
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @MB
    public final Object[] k() {
        return this.Z0.k();
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final zzag l(int i, int i2) {
        zzs.c(i, i2, this.Y0);
        int i3 = this.Z;
        return this.Z0.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Y0;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
