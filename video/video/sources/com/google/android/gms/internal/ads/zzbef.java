package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzbef {
    public final String a;
    public final Object b;
    public final int c;

    public zzbef(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static zzbef a(String str, double d) {
        return new zzbef(str, Double.valueOf(d), 3);
    }

    public static zzbef b(String str, long j) {
        return new zzbef(str, Long.valueOf(j), 2);
    }

    public static zzbef c(String str, String str2) {
        return new zzbef("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbef d(String str, boolean z) {
        return new zzbef(str, Boolean.valueOf(z), 1);
    }

    public final Object e() {
        zzbfk a = zzbfm.a();
        if (a == null) {
            if (zzbfm.b() != null) {
                zzbfm.b().a();
            }
            return this.b;
        }
        int i = this.c - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return a.a(this.a, (String) this.b);
                }
                return a.b(this.a, ((Double) this.b).doubleValue());
            }
            return a.c(this.a, ((Long) this.b).longValue());
        }
        return a.d(this.a, ((Boolean) this.b).booleanValue());
    }
}
