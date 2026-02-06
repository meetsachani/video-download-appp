package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcco extends zzcbc implements TextureView.SurfaceTextureListener, zzcbm {
    public final zzcbw a1;
    public final zzcbx b1;
    public final zzcbv c1;
    @InterfaceC11300zs1
    public final zzdsd d1;
    public zzcbb e1;
    public Surface f1;
    public zzcbn g1;
    public String h1;
    public String[] i1;
    public boolean j1;
    public int k1;
    public zzcbu l1;
    public final boolean m1;
    public boolean n1;
    public boolean o1;
    public int p1;
    public int q1;
    public float r1;

    public zzcco(Context context, zzcbx zzcbxVar, zzcbw zzcbwVar, boolean z, boolean z2, zzcbv zzcbvVar, @InterfaceC11300zs1 zzdsd zzdsdVar) {
        super(context);
        this.k1 = 1;
        this.a1 = zzcbwVar;
        this.b1 = zzcbxVar;
        this.m1 = z;
        this.c1 = zzcbvVar;
        zzcbxVar.a(this);
        this.d1 = zzdsdVar;
    }

    public static /* synthetic */ void G(zzcco zzccoVar) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.i();
        }
    }

    public static /* synthetic */ void H(zzcco zzccoVar, int i) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.onWindowVisibilityChanged(i);
        }
    }

    public static /* synthetic */ void I(zzcco zzccoVar, String str) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.u("ExoPlayerAdapter error", str);
        }
    }

    public static /* synthetic */ void J(zzcco zzccoVar) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.d();
        }
    }

    public static /* synthetic */ void K(zzcco zzccoVar) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.a();
        }
    }

    public static /* synthetic */ void L(zzcco zzccoVar) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.h();
        }
    }

    public static /* synthetic */ void M(zzcco zzccoVar) {
        float a = zzccoVar.Z0.a();
        zzcbn zzcbnVar = zzccoVar.g1;
        if (zzcbnVar != null) {
            try {
                zzcbnVar.K(a, false);
                return;
            } catch (IOException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("", e);
                return;
            }
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Trying to set volume before player is initialized.");
    }

    public static /* synthetic */ void N(zzcco zzccoVar) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.f();
        }
    }

    public static /* synthetic */ void O(zzcco zzccoVar, int i, int i2) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.b(i, i2);
        }
    }

    public static /* synthetic */ void P(zzcco zzccoVar) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.e();
        }
    }

    public static /* synthetic */ void Q(zzcco zzccoVar, String str) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.n1("ExoPlayerAdapter exception", str);
        }
    }

    public static /* synthetic */ void S(zzcco zzccoVar) {
        zzcbb zzcbbVar = zzccoVar.e1;
        if (zzcbbVar != null) {
            zzcbbVar.g();
        }
    }

    public static String T(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + RemoteSettings.i + canonicalName + ":" + message;
    }

    private final void U() {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            zzcbnVar.H(true);
        }
    }

    private final boolean d0() {
        zzcbn zzcbnVar = this.g1;
        return (zzcbnVar == null || !zzcbnVar.M() || this.j1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    @InterfaceC11300zs1
    public final Integer A() {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            return zzcbnVar.t();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void B(int i) {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            zzcbnVar.A(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void C(int i) {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            zzcbnVar.B(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void D(int i) {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            zzcbnVar.D(i);
        }
    }

    public final zzcbn E(@InterfaceC11300zs1 Integer num) {
        zzcbv zzcbvVar = this.c1;
        zzcbw zzcbwVar = this.a1;
        zzcej zzcejVar = new zzcej(zzcbwVar.getContext(), zzcbvVar, zzcbwVar, num);
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("ExoPlayerAdapter initialized.");
        return zzcejVar;
    }

    public final String F() {
        zzcbw zzcbwVar = this.a1;
        return com.google.android.gms.ads.internal.zzv.v().I(zzcbwVar.getContext(), zzcbwVar.m().X);
    }

    public final void V() {
        if (!this.n1) {
            this.n1 = true;
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccn
                @Override // java.lang.Runnable
                public final void run() {
                    zzcco.P(zzcco.this);
                }
            });
            n();
            this.b1.b();
            if (this.o1) {
                u();
            }
        }
    }

    public final void W(boolean z, @InterfaceC11300zs1 Integer num) {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null && !z) {
            zzcbnVar.G(num);
        } else if (this.h1 != null && this.f1 != null) {
            if (z) {
                if (d0()) {
                    zzcbnVar.L();
                    Y();
                } else {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.h1.startsWith("cache:")) {
                zzcdi p0 = this.a1.p0(this.h1);
                if (p0 instanceof zzcdr) {
                    zzcbn z2 = ((zzcdr) p0).z();
                    this.g1 = z2;
                    z2.G(num);
                    if (!this.g1.M()) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Precached video player has been released.");
                        return;
                    }
                } else if (p0 instanceof zzcdo) {
                    zzcdo zzcdoVar = (zzcdo) p0;
                    String F = F();
                    ByteBuffer B = zzcdoVar.B();
                    boolean C = zzcdoVar.C();
                    String A = zzcdoVar.A();
                    if (A == null) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Stream cache URL is null.");
                        return;
                    }
                    zzcbn E = E(num);
                    this.g1 = E;
                    E.x(new Uri[]{Uri.parse(A)}, F, B, C);
                } else {
                    String valueOf = String.valueOf(this.h1);
                    int i4 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Stream cache miss: ".concat(valueOf));
                    return;
                }
            } else {
                this.g1 = E(num);
                String F2 = F();
                Uri[] uriArr = new Uri[this.i1.length];
                int i5 = 0;
                while (true) {
                    String[] strArr = this.i1;
                    if (i5 >= strArr.length) {
                        break;
                    }
                    uriArr[i5] = Uri.parse(strArr[i5]);
                    i5++;
                }
                this.g1.w(uriArr, F2);
            }
            this.g1.C(this);
            Z(this.f1, false);
            if (this.g1.M()) {
                int P = this.g1.P();
                this.k1 = P;
                if (P == 3) {
                    V();
                }
            }
        }
    }

    public final void X() {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            zzcbnVar.H(false);
        }
    }

    public final void Y() {
        if (this.g1 != null) {
            Z(null, true);
            zzcbn zzcbnVar = this.g1;
            if (zzcbnVar != null) {
                zzcbnVar.C(null);
                this.g1.y();
                this.g1 = null;
            }
            this.k1 = 1;
            this.j1 = false;
            this.n1 = false;
            this.o1 = false;
        }
    }

    public final void Z(Surface surface, boolean z) {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            try {
                zzcbnVar.J(surface, z);
                return;
            } catch (IOException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("", e);
                return;
            }
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Trying to set surface before player is initialized.");
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void a(int i, int i2) {
        this.p1 = i;
        this.q1 = i2;
        a0();
    }

    public final void a0() {
        b0(this.p1, this.q1);
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void b(int i) {
        if (this.k1 != i) {
            this.k1 = i;
            if (i != 3) {
                if (i == 4) {
                    if (this.c1.a) {
                        X();
                    }
                    this.b1.e();
                    this.Z0.c();
                    com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcco.K(zzcco.this);
                        }
                    });
                    return;
                }
                return;
            }
            V();
        }
    }

    public final void b0(int i, int i2) {
        float f;
        if (i2 > 0) {
            f = i / i2;
        } else {
            f = 1.0f;
        }
        if (this.r1 != f) {
            this.r1 = f;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void c(String str, Exception exc) {
        final String T = T("onLoadException", exc);
        String concat = "ExoPlayerAdapter exception: ".concat(T);
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g(concat);
        com.google.android.gms.ads.internal.zzv.t().w(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcci
            @Override // java.lang.Runnable
            public final void run() {
                zzcco.Q(zzcco.this, T);
            }
        });
    }

    public final boolean c0() {
        return d0() && this.k1 != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void d(final boolean z, final long j) {
        if (this.a1 != null) {
            zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcch
                @Override // java.lang.Runnable
                public final void run() {
                    zzcco.this.a1.D0(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void e(String str, Exception exc) {
        final String T = T(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(T);
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g(concat);
        this.j1 = true;
        if (this.c1.a) {
            X();
        }
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccl
            @Override // java.lang.Runnable
            public final void run() {
                zzcco.I(zzcco.this, T);
            }
        });
        com.google.android.gms.ads.internal.zzv.t().w(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void f(int i) {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            zzcbnVar.E(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void g(int i) {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            zzcbnVar.I(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void h(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String[] strArr, @InterfaceC11300zs1 Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.i1 = new String[]{str};
        } else {
            this.i1 = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.h1;
        boolean z = false;
        if (this.c1.k && str2 != null && !str.equals(str2) && this.k1 == 4) {
            z = true;
        }
        this.h1 = str;
        W(z, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int i() {
        if (c0()) {
            return (int) this.g1.U();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int j() {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            return zzcbnVar.N();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int k() {
        if (c0()) {
            return (int) this.g1.V();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int l() {
        return this.q1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int m() {
        return this.p1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc, com.google.android.gms.internal.ads.zzcbz
    public final void n() {
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccd
            @Override // java.lang.Runnable
            public final void run() {
                zzcco.M(zzcco.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final long o() {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            return zzcbnVar.T();
        }
        return -1L;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.r1;
        if (f != 0.0f && this.l1 == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbu zzcbuVar = this.l1;
        if (zzcbuVar != null) {
            zzcbuVar.c(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzdsd zzdsdVar;
        if (this.m1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xd)).booleanValue() && (zzdsdVar = this.d1) != null) {
                zzdsc a = zzdsdVar.a();
                a.b("action", "svp_aepv");
                a.j();
            }
            zzcbu zzcbuVar = new zzcbu(getContext());
            this.l1 = zzcbuVar;
            zzcbuVar.d(surfaceTexture, i, i2);
            zzcbu zzcbuVar2 = this.l1;
            zzcbuVar2.start();
            SurfaceTexture b = zzcbuVar2.b();
            if (b != null) {
                surfaceTexture = b;
            } else {
                this.l1.e();
                this.l1 = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f1 = surface;
        if (this.g1 == null) {
            W(false, null);
        } else {
            Z(surface, true);
            if (!this.c1.a) {
                U();
            }
        }
        if (this.p1 != 0 && this.q1 != 0) {
            a0();
        } else {
            b0(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcck
            @Override // java.lang.Runnable
            public final void run() {
                zzcco.L(zzcco.this);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t();
        zzcbu zzcbuVar = this.l1;
        if (zzcbuVar != null) {
            zzcbuVar.e();
            this.l1 = null;
        }
        if (this.g1 != null) {
            X();
            Surface surface = this.f1;
            if (surface != null) {
                surface.release();
            }
            this.f1 = null;
            Z(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccg
            @Override // java.lang.Runnable
            public final void run() {
                zzcco.G(zzcco.this);
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcbu zzcbuVar = this.l1;
        if (zzcbuVar != null) {
            zzcbuVar.c(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccf
            @Override // java.lang.Runnable
            public final void run() {
                zzcco.O(zzcco.this, i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.b1.f(this);
        this.Y0.a(surfaceTexture, this.e1);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.k("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcce
            @Override // java.lang.Runnable
            public final void run() {
                zzcco.H(zzcco.this, i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final long p() {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            return zzcbnVar.a();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void q() {
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccb
            @Override // java.lang.Runnable
            public final void run() {
                zzcco.S(zzcco.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final long r() {
        zzcbn zzcbnVar = this.g1;
        if (zzcbnVar != null) {
            return zzcbnVar.s();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final String s() {
        return "ExoPlayer/2".concat(true != this.m1 ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void t() {
        if (c0()) {
            if (this.c1.a) {
                X();
            }
            this.g1.F(false);
            this.b1.e();
            this.Z0.c();
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccj
                @Override // java.lang.Runnable
                public final void run() {
                    zzcco.N(zzcco.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void u() {
        if (c0()) {
            if (this.c1.a) {
                U();
            }
            this.g1.F(true);
            this.b1.c();
            this.Z0.b();
            this.Y0.b();
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcco.J(zzcco.this);
                }
            });
            return;
        }
        this.o1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void v(int i) {
        if (c0()) {
            this.g1.z(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void w(zzcbb zzcbbVar) {
        this.e1 = zzcbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void x(@InterfaceC11300zs1 String str) {
        if (str != null) {
            h(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void y() {
        if (d0()) {
            this.g1.L();
            Y();
        }
        zzcbx zzcbxVar = this.b1;
        zzcbxVar.e();
        this.Z0.c();
        zzcbxVar.d();
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void z(float f, float f2) {
        zzcbu zzcbuVar = this.l1;
        if (zzcbuVar != null) {
            zzcbuVar.f(f, f2);
        }
    }
}
