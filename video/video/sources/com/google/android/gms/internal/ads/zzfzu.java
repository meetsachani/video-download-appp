package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfzu extends zzfyh {
    public static final Object[] c1;
    public static final zzfzu d1;
    public final transient int Y0;
    public final transient Object[] Z;
    public final transient Object[] Z0;
    public final transient int a1;
    public final transient int b1;

    static {
        Object[] objArr = new Object[0];
        c1 = objArr;
        d1 = new zzfzu(objArr, 0, objArr, 0, 0);
    }

    public zzfzu(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.Z = objArr;
        this.Y0 = i;
        this.Z0 = objArr2;
        this.a1 = i2;
        this.b1 = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final boolean Q() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.Z0;
            if (objArr.length != 0) {
                int b = zzfxu.b(obj);
                while (true) {
                    int i = b & this.a1;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int d(Object[] objArr, int i) {
        Object[] objArr2 = this.Z;
        int i2 = this.b1;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int e() {
        return this.b1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.Y0;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx
    public final zzgai i() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final Object[] k() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final zzfyc p() {
        return zzfyc.r(this.Z, this.b1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b1;
    }
}
