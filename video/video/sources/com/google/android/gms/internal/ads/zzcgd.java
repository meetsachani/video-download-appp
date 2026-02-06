package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcgd extends com.google.android.gms.ads.internal.client.zzdz {
    public final zzcbw X;
    public final boolean Y0;
    public final boolean Z;
    public int Z0;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zzed a1;
    public boolean b1;
    public float d1;
    public float e1;
    public float f1;
    public boolean g1;
    public boolean h1;
    public zzbho i1;
    public final Object Y = new Object();
    public boolean c1 = true;

    public zzcgd(zzcbw zzcbwVar, float f, boolean z, boolean z2) {
        this.X = zzcbwVar;
        this.d1 = f;
        this.Z = z;
        this.Y0 = z2;
    }

    public static /* synthetic */ void Y7(zzcgd zzcgdVar, int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        com.google.android.gms.ads.internal.client.zzed zzedVar2;
        com.google.android.gms.ads.internal.client.zzed zzedVar3;
        synchronized (zzcgdVar.Y) {
            try {
                boolean z8 = zzcgdVar.b1;
                boolean z9 = false;
                if (!z8 && i2 == 1) {
                    i2 = 1;
                    i3 = 1;
                    z3 = true;
                } else {
                    i3 = i2;
                    z3 = false;
                }
                if (i != i2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && i3 == 1) {
                    z5 = true;
                    i3 = 1;
                } else {
                    z5 = false;
                }
                if (z4 && i3 == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z4 && i3 == 3) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z8 || z3) {
                    z9 = true;
                }
                zzcgdVar.b1 = z9;
                if (z3) {
                    try {
                        com.google.android.gms.ads.internal.client.zzed zzedVar4 = zzcgdVar.a1;
                        if (zzedVar4 != null) {
                            zzedVar4.i();
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                    }
                }
                if (z5 && (zzedVar3 = zzcgdVar.a1) != null) {
                    zzedVar3.h();
                }
                if (z6 && (zzedVar2 = zzcgdVar.a1) != null) {
                    zzedVar2.g();
                }
                if (z7) {
                    com.google.android.gms.ads.internal.client.zzed zzedVar5 = zzcgdVar.a1;
                    if (zzedVar5 != null) {
                        zzedVar5.d();
                    }
                    zzcgdVar.X.B();
                }
                if (z != z2 && (zzedVar = zzcgdVar.a1) != null) {
                    zzedVar.U3(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Z7(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.Y) {
            try {
                z2 = true;
                if (f2 == this.d1 && f3 == this.f1) {
                    z2 = false;
                }
                this.d1 = f2;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ad)).booleanValue()) {
                    this.e1 = f;
                }
                z3 = this.c1;
                this.c1 = z;
                i2 = this.Z0;
                this.Z0 = i;
                float f4 = this.f1;
                this.f1 = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.X.U().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                zzbho zzbhoVar = this.i1;
                if (zzbhoVar != null) {
                    zzbhoVar.d();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
        }
        d8(i2, i, z3, z);
    }

    public final void a8(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        String str;
        String str2;
        String str3;
        Object obj = this.Y;
        boolean z = zzfwVar.Y;
        boolean z2 = zzfwVar.Z;
        synchronized (obj) {
            this.g1 = z;
            this.h1 = z2;
        }
        boolean z3 = zzfwVar.X;
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        String str4 = str;
        if (true != z2) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        String str5 = str2;
        if (true != z3) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        e8("initialState", CollectionUtils.e("muteStart", str3, "customControlsRequested", str4, "clickToExpandRequested", str5));
    }

    public final void b8(float f) {
        synchronized (this.Y) {
            this.e1 = f;
        }
    }

    public final void c8(zzbho zzbhoVar) {
        synchronized (this.Y) {
            this.i1 = zzbhoVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float d() {
        float f;
        synchronized (this.Y) {
            f = this.f1;
        }
        return f;
    }

    public final void d8(final int i, final int i2, final boolean z, final boolean z2) {
        zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgc
            @Override // java.lang.Runnable
            public final void run() {
                zzcgd.Y7(zzcgd.this, i, i2, z, z2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float e() {
        float f;
        synchronized (this.Y) {
            f = this.e1;
        }
        return f;
    }

    public final void e8(String str, @InterfaceC11300zs1 Map map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgb
            @Override // java.lang.Runnable
            public final void run() {
                zzcgd.this.X.q("pubVideoCmd", hashMap);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float g() {
        float f;
        synchronized (this.Y) {
            f = this.d1;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int h() {
        int i;
        synchronized (this.Y) {
            i = this.Z0;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzed i() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        synchronized (this.Y) {
            zzedVar = this.a1;
        }
        return zzedVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void k() {
        e8("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void l() {
        e8("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void n() {
        e8("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void n0(boolean z) {
        String str;
        if (true != z) {
            str = "unmute";
        } else {
            str = "mute";
        }
        e8(str, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void n2(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzed zzedVar) {
        synchronized (this.Y) {
            this.a1 = zzedVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean o() {
        boolean z;
        synchronized (this.Y) {
            try {
                z = false;
                if (this.Z && this.g1) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean p() {
        boolean z;
        Object obj = this.Y;
        boolean o2 = o();
        synchronized (obj) {
            z = false;
            if (!o2) {
                try {
                    if (this.h1 && this.Y0) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean r() {
        boolean z;
        synchronized (this.Y) {
            z = this.c1;
        }
        return z;
    }

    public final void t() {
        boolean z;
        int i;
        synchronized (this.Y) {
            z = this.c1;
            i = this.Z0;
            this.Z0 = 3;
        }
        d8(i, 3, z, z);
    }
}
