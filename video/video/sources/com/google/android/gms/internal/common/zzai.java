package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

/* JADX INFO: Access modifiers changed from: package-private */
@NullMarked
/* loaded from: classes2.dex */
public final class zzai extends zzag {
    public static final zzag Z0 = new zzai(new Object[0], 0);
    public final transient int Y0;
    public final transient Object[] Z;

    public zzai(Object[] objArr, int i) {
        this.Z = objArr;
        this.Y0 = i;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    public final int d(Object[] objArr, int i) {
        System.arraycopy(this.Z, 0, objArr, 0, this.Y0);
        return this.Y0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return this.Y0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzs.a(i, this.Y0, "index");
        Object obj = this.Z[i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] k() {
        return this.Z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Y0;
    }
}
