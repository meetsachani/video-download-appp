package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcby implements Runnable {
    public final zzcbk X;
    public boolean Y = false;

    public zzcby(zzcbk zzcbkVar) {
        this.X = zzcbkVar;
    }

    public final void a() {
        this.Y = true;
        this.X.E();
    }

    public final void b() {
        this.Y = false;
        c();
    }

    public final void c() {
        zzfrl zzfrlVar = com.google.android.gms.ads.internal.util.zzs.l;
        zzfrlVar.removeCallbacks(this);
        zzfrlVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.Y) {
            this.X.E();
            c();
        }
    }
}
