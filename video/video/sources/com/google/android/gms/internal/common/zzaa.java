package com.google.android.gms.internal.common;

import java.util.Arrays;
import o.InterfaceC6181ey;

/* loaded from: classes2.dex */
class zzaa extends zzab {
    public Object[] a = new Object[4];
    public int b = 0;
    public boolean c;

    public zzaa(int i) {
    }

    @InterfaceC6181ey
    public final zzaa a(Object obj) {
        obj.getClass();
        int i = this.b;
        int i2 = i + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr, i3);
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        objArr2[i4] = obj;
        return this;
    }
}
