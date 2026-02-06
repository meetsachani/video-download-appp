package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzad {
    @InterfaceC11300zs1
    public String a;
    @InterfaceC11300zs1
    public Uri b;
    public final zzae c = new zzae();
    public final List d;
    public final zzfyc e;
    public final zzai f;
    public final zzam g;

    public zzad() {
        zzfyc.F();
        this.d = Collections.EMPTY_LIST;
        this.e = zzfyc.F();
        this.f = new zzai();
        this.g = zzam.d;
    }

    public final zzad a(String str) {
        this.a = str;
        return this;
    }

    public final zzad b(@InterfaceC11300zs1 Uri uri) {
        this.b = uri;
        return this;
    }

    public final zzap c() {
        zzak zzakVar;
        Uri uri = this.b;
        if (uri != null) {
            zzakVar = new zzak(uri, null, null, null, this.d, null, this.e, null, C10323vs.b, null);
        } else {
            zzakVar = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return new zzap(str, new zzag(this.c, null), zzakVar, new zzaj(this.f, null), zzat.B, this.g, null);
    }
}
