package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzfye {
    public Object[] a;
    public int b;
    public zzfyd c;

    public zzfye() {
        this(4);
    }

    public final zzfye a(Object obj, Object obj2) {
        d(this.b + 1);
        zzfwz.b(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }

    public final zzfye b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfyf c() {
        zzfyd zzfydVar = this.c;
        if (zzfydVar == null) {
            zzfzt k = zzfzt.k(this.b, this.a, this);
            zzfyd zzfydVar2 = this.c;
            if (zzfydVar2 == null) {
                return k;
            }
            throw zzfydVar2.a();
        }
        throw zzfydVar.a();
    }

    public final void d(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, zzfxw.b(length, i2));
        }
    }

    public zzfye(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
