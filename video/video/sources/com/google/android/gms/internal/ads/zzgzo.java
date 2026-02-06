package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzgzo {
    public volatile zzhad a;
    public volatile zzgxk b;
    public volatile boolean c;

    public final int a() {
        if (this.b != null) {
            return ((zzgxh) this.b).Z.length;
        }
        if (this.a != null) {
            return this.a.O0();
        }
        return 0;
    }

    public final zzgxk b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = zzgxk.Y;
                } else {
                    this.b = this.a.Q0();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzhad c(zzhad zzhadVar) {
        zzhad zzhadVar2 = this.a;
        this.b = null;
        this.a = zzhadVar;
        return zzhadVar2;
    }

    public final void d(zzhad zzhadVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a != null) {
                    return;
                }
                try {
                    this.a = zzhadVar;
                    this.b = zzgxk.Y;
                } catch (zzgzh unused) {
                    this.c = true;
                    this.a = zzhadVar;
                    this.b = zzgxk.Y;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgzo)) {
            return false;
        }
        zzgzo zzgzoVar = (zzgzo) obj;
        zzhad zzhadVar = this.a;
        zzhad zzhadVar2 = zzgzoVar.a;
        if (zzhadVar == null && zzhadVar2 == null) {
            return b().equals(zzgzoVar.b());
        }
        if (zzhadVar != null && zzhadVar2 != null) {
            return zzhadVar.equals(zzhadVar2);
        }
        if (zzhadVar != null) {
            zzgzoVar.d(zzhadVar.R0());
            return zzhadVar.equals(zzgzoVar.a);
        }
        d(zzhadVar2.R0());
        return this.a.equals(zzhadVar2);
    }

    public int hashCode() {
        return 1;
    }
}
