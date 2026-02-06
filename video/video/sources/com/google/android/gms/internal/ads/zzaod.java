package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaod {
    public final int a;
    @InterfaceC11300zs1
    public final String b;
    public final int c;
    public final List d;
    public final byte[] e;

    public zzaod(int i, @InterfaceC11300zs1 String str, int i2, @InterfaceC11300zs1 List list, byte[] bArr) {
        List unmodifiableList;
        this.a = i;
        this.b = str;
        this.c = i2;
        if (list == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.d = unmodifiableList;
        this.e = bArr;
    }

    public final int a() {
        int i = this.c;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }
}
