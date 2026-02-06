package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzgj {
    @InterfaceC11300zs1
    public Uri a;
    public Map b;
    public long c;
    public final long d;
    public int e;

    public /* synthetic */ zzgj(zzgl zzglVar, zzgk zzgkVar) {
        this.a = zzglVar.a;
        this.b = zzglVar.d;
        this.c = zzglVar.e;
        this.d = zzglVar.f;
        this.e = zzglVar.g;
    }

    public final zzgj a(int i) {
        this.e = 6;
        return this;
    }

    public final zzgj b(Map map) {
        this.b = map;
        return this;
    }

    public final zzgj c(long j) {
        this.c = j;
        return this;
    }

    public final zzgj d(Uri uri) {
        this.a = uri;
        return this;
    }

    public final zzgl e() {
        if (this.a != null) {
            return new zzgl(this.a, this.b, this.c, this.d, this.e);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public zzgj() {
        this.b = Collections.EMPTY_MAP;
        this.d = -1L;
    }
}
