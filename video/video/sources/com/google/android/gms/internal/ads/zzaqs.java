package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaqs {
    public final int a;
    public final List b;
    public final int c;
    @InterfaceC11300zs1
    public final InputStream d;

    public zzaqs(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final InputStream c() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List d() {
        return Collections.unmodifiableList(this.b);
    }
}
