package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzak {
    public final Uri a;
    @InterfaceC11300zs1
    public final String b;
    @InterfaceC11300zs1
    public final zzah c;
    @InterfaceC11300zs1
    public final zzac d;
    public final List e;
    @InterfaceC11300zs1
    public final String f;
    public final zzfyc g;
    @InterfaceC11300zs1
    public final Object h;
    public final long i;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzak(Uri uri, String str, zzah zzahVar, zzac zzacVar, List list, String str2, zzfyc zzfycVar, Object obj, long j, zzao zzaoVar) {
        this.a = uri;
        int i = zzay.c;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = list;
        this.f = null;
        this.g = zzfycVar;
        int i2 = zzfyc.Z;
        zzfxz zzfxzVar = new zzfxz();
        if (zzfycVar.size() <= 0) {
            zzfxzVar.j();
            this.h = null;
            this.i = C10323vs.b;
            return;
        }
        zzan zzanVar = (zzan) zzfycVar.get(0);
        throw null;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzakVar = (zzak) obj;
        if (this.a.equals(zzakVar.a) && this.e.equals(zzakVar.e) && this.g.equals(zzakVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((((this.a.hashCode() * 923521) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31 * 31) + C10323vs.b);
    }
}
