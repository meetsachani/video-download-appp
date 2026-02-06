package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;
import o.ES1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzpc {
    public final String a;
    @InterfaceC11300zs1
    public final zzpb b;
    @InterfaceC11300zs1
    public final Object c;

    static {
        new zzpc("");
    }

    public zzpc(String str) {
        zzpb zzpbVar;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            zzpbVar = new zzpb();
        } else {
            zzpbVar = null;
        }
        this.b = zzpbVar;
        this.c = new Object();
    }

    @ES1(31)
    public final synchronized LogSessionId a() {
        zzpb zzpbVar;
        zzpbVar = this.b;
        if (zzpbVar != null) {
        } else {
            throw null;
        }
        return zzpbVar.a;
    }

    @ES1(31)
    public final synchronized void b(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        boolean equals;
        zzpb zzpbVar = this.b;
        if (zzpbVar != null) {
            LogSessionId logSessionId3 = zzpbVar.a;
            logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId3.equals(logSessionId2);
            zzdc.f(equals);
            zzpbVar.a = logSessionId;
        } else {
            throw null;
        }
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpc)) {
            return false;
        }
        zzpc zzpcVar = (zzpc) obj;
        if (Objects.equals(this.a, zzpcVar.a) && Objects.equals(this.b, zzpcVar.b) && Objects.equals(this.c, zzpcVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
