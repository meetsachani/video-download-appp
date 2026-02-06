package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import o.InterfaceC11300zs1;
import o.InterfaceC8800pd0;

/* loaded from: classes2.dex */
public final class zzceq extends zzcbc {
    public final zzcbx a1;
    @InterfaceC11300zs1
    public zzcer b1;
    public Uri c1;
    public zzcbb d1;
    public boolean e1;
    public int f1;

    public zzceq(Context context, zzcbx zzcbxVar) {
        super(context);
        this.f1 = 1;
        this.e1 = false;
        this.a1 = zzcbxVar;
        zzcbxVar.a(this);
    }

    public static /* synthetic */ void E(zzceq zzceqVar) {
        zzcbb zzcbbVar = zzceqVar.d1;
        if (zzcbbVar != null) {
            if (!zzceqVar.e1) {
                zzcbbVar.g();
                zzceqVar.e1 = true;
            }
            zzceqVar.d1.d();
        }
    }

    public static /* synthetic */ void F(zzceq zzceqVar) {
        zzcbb zzcbbVar = zzceqVar.d1;
        if (zzcbbVar != null) {
            zzcbbVar.f();
        }
    }

    public static /* synthetic */ void G(zzceq zzceqVar) {
        zzcbb zzcbbVar = zzceqVar.d1;
        if (zzcbbVar != null) {
            zzcbbVar.e();
        }
    }

    @InterfaceC8800pd0(expression = {"immersiveAdPlayer"}, result = true)
    private final boolean H() {
        int i = this.f1;
        return (i == 1 || i == 2 || this.b1 == null) ? false : true;
    }

    public final void I(int i) {
        if (i == 4) {
            this.a1.c();
            this.Z0.b();
        } else if (this.f1 == 4) {
            this.a1.e();
            this.Z0.c();
        }
        this.f1 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int i() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int j() {
        return H() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int k() {
        return H() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc, com.google.android.gms.internal.ads.zzcbz
    public final void n() {
        if (this.b1 != null) {
            this.Z0.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final long o() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final long p() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final long r() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final String s() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void t() {
        com.google.android.gms.ads.internal.util.zze.k("AdImmersivePlayerView pause");
        if (H() && this.b1.d()) {
            this.b1.a();
            I(5);
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcep
                @Override // java.lang.Runnable
                public final void run() {
                    zzceq.F(zzceq.this);
                }
            });
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzceq.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void u() {
        com.google.android.gms.ads.internal.util.zze.k("AdImmersivePlayerView play");
        if (H()) {
            this.b1.b();
            I(4);
            this.Y0.b();
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                @Override // java.lang.Runnable
                public final void run() {
                    zzceq.E(zzceq.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void v(int i) {
        com.google.android.gms.ads.internal.util.zze.k("AdImmersivePlayerView seek " + i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void w(zzcbb zzcbbVar) {
        this.d1 = zzcbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void x(@InterfaceC11300zs1 String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.c1 = parse;
            this.b1 = new zzcer(parse.toString());
            I(3);
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                @Override // java.lang.Runnable
                public final void run() {
                    zzceq.G(zzceq.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void y() {
        com.google.android.gms.ads.internal.util.zze.k("AdImmersivePlayerView stop");
        zzcer zzcerVar = this.b1;
        if (zzcerVar != null) {
            zzcerVar.c();
            this.b1 = null;
            I(1);
        }
        this.a1.d();
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void z(float f, float f2) {
    }
}
