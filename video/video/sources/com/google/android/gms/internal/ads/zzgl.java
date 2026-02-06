package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C4500Ve2;
import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzgl {
    public static final /* synthetic */ int h = 0;
    public final Uri a;
    public final int b;
    @InterfaceC11300zs1
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final int g;

    static {
        zzaq.b("media3.datasource");
    }

    public final zzgj a() {
        return new zzgj(this, null);
    }

    public final boolean b(int i) {
        return (this.g & i) == i;
    }

    public final String toString() {
        String obj = this.a.toString();
        return "DataSpec[GET" + C4500Ve2.b + obj + C6566gU0.h + this.e + C6566gU0.h + this.f + ", null, " + this.g + C6566gU0.g;
    }

    public zzgl(Uri uri, long j, int i, @InterfaceC11300zs1 byte[] bArr, Map map, long j2, long j3, @InterfaceC11300zs1 String str, int i2, @InterfaceC11300zs1 Object obj) {
        boolean z = false;
        boolean z2 = j2 >= 0;
        zzdc.d(z2);
        zzdc.d(z2);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1L : j3;
            zzdc.d(z);
            uri.getClass();
            this.a = uri;
            this.b = 1;
            this.c = null;
            this.d = Collections.unmodifiableMap(new HashMap(map));
            this.e = j2;
            this.f = j3;
            this.g = i2;
        }
        z = true;
        zzdc.d(z);
        uri.getClass();
        this.a = uri;
        this.b = 1;
        this.c = null;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j2;
        this.f = j3;
        this.g = i2;
    }

    @Deprecated
    public zzgl(Uri uri, long j, long j2, @InterfaceC11300zs1 String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }
}
