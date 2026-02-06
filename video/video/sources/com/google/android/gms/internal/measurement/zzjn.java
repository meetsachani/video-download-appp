package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public class zzjn {
    public static final zzik d = zzik.e;
    public zzhm a;
    public volatile zzkj b;
    public volatile zzhm c;

    public final zzkj a(zzkj zzkjVar) {
        zzkj zzkjVar2 = this.b;
        this.a = null;
        this.c = null;
        this.b = zzkjVar;
        return zzkjVar2;
    }

    public final int b() {
        if (this.c != null) {
            return this.c.B();
        }
        if (this.b != null) {
            return this.b.D0();
        }
        return 0;
    }

    public final zzkj c(zzkj zzkjVar) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = zzkjVar;
                        this.c = zzhm.Y;
                    } catch (zzji unused) {
                        this.b = zzkjVar;
                        this.c = zzhm.Y;
                    }
                }
            }
        }
        return this.b;
    }

    public final zzhm d() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c != null) {
                    return this.c;
                }
                if (this.b == null) {
                    this.c = zzhm.Y;
                } else {
                    this.c = this.b.g();
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjn)) {
            return false;
        }
        zzjn zzjnVar = (zzjn) obj;
        zzkj zzkjVar = this.b;
        zzkj zzkjVar2 = zzjnVar.b;
        if (zzkjVar == null && zzkjVar2 == null) {
            return d().equals(zzjnVar.d());
        }
        if (zzkjVar != null && zzkjVar2 != null) {
            return zzkjVar.equals(zzkjVar2);
        }
        if (zzkjVar != null) {
            return zzkjVar.equals(zzjnVar.c(zzkjVar.d()));
        }
        return c(zzkjVar2.d()).equals(zzkjVar2);
    }

    public int hashCode() {
        return 1;
    }
}
