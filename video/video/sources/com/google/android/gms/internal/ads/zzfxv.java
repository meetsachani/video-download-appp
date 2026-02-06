package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes2.dex */
class zzfxv extends zzfxw {
    public Object[] a;
    public int b;
    public boolean c;

    public zzfxv(int i) {
        zzfwz.a(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxw
    public /* bridge */ /* synthetic */ zzfxw a(Object obj) {
        throw null;
    }

    public final zzfxv c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    public final zzfxw d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof zzfxx) {
                this.b = ((zzfxx) collection).d(this.a, this.b);
                return this;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
        return this;
    }

    public final void e(Object[] objArr, int i) {
        zzfzm.b(objArr, 2);
        f(2);
        System.arraycopy(objArr, 0, this.a, this.b, 2);
        this.b += 2;
    }

    public final void f(int i) {
        int length = this.a.length;
        int b = zzfxw.b(length, this.b + i);
        if (b <= length && !this.c) {
            return;
        }
        this.a = Arrays.copyOf(this.a, b);
        this.c = false;
    }
}
