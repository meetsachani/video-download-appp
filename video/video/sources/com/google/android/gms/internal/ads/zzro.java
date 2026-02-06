package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import o.AD1;
import o.C10323vs;
import o.C2936Fe1;
import o.C4128Rj1;
import o.I3;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.Xu2;

/* loaded from: classes2.dex */
public final class zzro extends zztj implements zzkw {
    public int A2;
    public boolean B2;
    public boolean C2;
    @InterfaceC11300zs1
    public zzz D2;
    @InterfaceC11300zs1
    public zzz E2;
    public long F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public int J2;
    public final Context w2;
    public final zzqa x2;
    public final zzqi y2;
    @InterfaceC11300zs1
    public final zzsv z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzro(Context context, zzsx zzsxVar, zztl zztlVar, boolean z, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 zzqb zzqbVar, zzqi zzqiVar) {
        super(1, zzsxVar, zztlVar, false, 44100.0f);
        zzsv zzsvVar;
        if (Build.VERSION.SDK_INT >= 35) {
            zzsvVar = new zzsv(zzsu.a);
        } else {
            zzsvVar = null;
        }
        this.w2 = context.getApplicationContext();
        this.y2 = zzqiVar;
        this.z2 = zzsvVar;
        this.J2 = -1000;
        this.x2 = new zzqa(handler, zzqbVar);
        zzqiVar.u(new zzrm(this, null));
    }

    public static List h1(zztl zztlVar, zzz zzzVar, boolean z, zzqi zzqiVar) throws zztq {
        zztc a;
        if (zzzVar.f301o == null) {
            return zzfyc.F();
        }
        if (zzqiVar.T(zzzVar) && (a = zztw.a()) != null) {
            return zzfyc.G(a);
        }
        return zztw.e(zztlVar, zzzVar, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz
    public final void C() {
        this.I2 = false;
        try {
            super.C();
            if (this.H2) {
                this.H2 = false;
                this.y2.l();
            }
        } catch (Throwable th) {
            if (this.H2) {
                this.H2 = false;
                this.y2.l();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void E() {
        this.y2.i();
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void F() {
        z0();
        this.y2.h();
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final int G0(zztl zztlVar, zzz zzzVar) throws zztq {
        int i;
        boolean z;
        int i2;
        int i3;
        String str = zzzVar.f301o;
        int i4 = 128;
        if (!zzay.h(str)) {
            return 128;
        }
        int i5 = zzzVar.L;
        boolean v0 = zztj.v0(zzzVar);
        int i6 = 1;
        if (!v0 || (i5 != 0 && zztw.a() == null)) {
            i = 0;
        } else {
            zzqi zzqiVar = this.y2;
            zzpn o2 = zzqiVar.o(zzzVar);
            if (!o2.a) {
                i = 0;
            } else {
                if (true != o2.b) {
                    i = 512;
                } else {
                    i = I3.g;
                }
                if (o2.c) {
                    i |= 2048;
                }
            }
            if (zzqiVar.T(zzzVar)) {
                return i | Xu2.K;
            }
        }
        if (!C4128Rj1.N.equals(str) || this.y2.T(zzzVar)) {
            zzqi zzqiVar2 = this.y2;
            if (zzqiVar2.T(zzeu.a(2, zzzVar.E, zzzVar.F))) {
                List h1 = h1(zztlVar, zzzVar, false, zzqiVar2);
                if (!h1.isEmpty()) {
                    if (!v0) {
                        i6 = 2;
                    } else {
                        zztc zztcVar = (zztc) h1.get(0);
                        boolean e = zztcVar.e(zzzVar);
                        if (!e) {
                            for (int i7 = 1; i7 < h1.size(); i7++) {
                                zztc zztcVar2 = (zztc) h1.get(i7);
                                if (zztcVar2.e(zzzVar)) {
                                    z = false;
                                    e = true;
                                    zztcVar = zztcVar2;
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (true != e) {
                            i2 = 3;
                        } else {
                            i2 = 4;
                        }
                        int i8 = 8;
                        if (e && zztcVar.f(zzzVar)) {
                            i8 = 16;
                        }
                        if (true != zztcVar.g) {
                            i3 = 0;
                        } else {
                            i3 = 64;
                        }
                        if (true != z) {
                            i4 = 0;
                        }
                        return i2 | i8 | 32 | i3 | i4 | i;
                    }
                }
            }
        }
        return i6 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final zzib H0(zztc zztcVar, zzz zzzVar, zzz zzzVar2) {
        int i;
        int i2;
        zzib b = zztcVar.b(zzzVar, zzzVar2);
        int i3 = b.e;
        if (r0(zzzVar2)) {
            i3 |= 32768;
        }
        if (g1(zztcVar, zzzVar2) > this.A2) {
            i3 |= 64;
        }
        String str = zztcVar.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = b.d;
        }
        return new zzib(str, zzzVar, zzzVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    @InterfaceC11300zs1
    public final zzib I0(zzkq zzkqVar) throws zzik {
        zzz zzzVar = zzkqVar.a;
        zzzVar.getClass();
        this.D2 = zzzVar;
        zzib I0 = super.I0(zzkqVar);
        this.x2.u(zzzVar, I0);
        return I0;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final zzsw L0(zztc zztcVar, zzz zzzVar, @InterfaceC11300zs1 MediaCrypto mediaCrypto, float f) {
        boolean z;
        zzz zzzVar2;
        zzz[] L = L();
        int length = L.length;
        int g1 = g1(zztcVar, zzzVar);
        if (length != 1) {
            for (zzz zzzVar3 : L) {
                if (zztcVar.b(zzzVar, zzzVar3).d != 0) {
                    g1 = Math.max(g1, g1(zztcVar, zzzVar3));
                }
            }
        }
        this.A2 = g1;
        String str = zztcVar.a;
        int i = Build.VERSION.SDK_INT;
        this.B2 = false;
        if (str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder")) {
            z = true;
        } else {
            z = false;
        }
        this.C2 = z;
        String str2 = zztcVar.c;
        int i2 = this.A2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i3 = zzzVar.E;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = zzzVar.F;
        mediaFormat.setInteger("sample-rate", i4);
        zzea.b(mediaFormat, zzzVar.r);
        zzea.a(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzzVar.f301o;
        if (C4128Rj1.T.equals(str3)) {
            Pair a = zzdh.a(zzzVar);
            if (a != null) {
                zzea.a(mediaFormat, Scopes.a, ((Integer) a.first).intValue());
                zzea.a(mediaFormat, FirebaseAnalytics.Param.t, ((Integer) a.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.y2.a(zzeu.a(4, i3, i4)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.J2));
        }
        if (C4128Rj1.N.equals(zztcVar.b) && !C4128Rj1.N.equals(str3)) {
            zzzVar2 = zzzVar;
        } else {
            zzzVar2 = null;
        }
        this.E2 = zzzVar2;
        return zzsw.a(zztcVar, mediaFormat, zzzVar, null, this.z2);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final List M0(zztl zztlVar, zzz zzzVar, boolean z) throws zztq {
        return zztw.f(h1(zztlVar, zzzVar, false, this.y2), zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void P0(zzhp zzhpVar) {
        zzz zzzVar;
        if (Build.VERSION.SDK_INT >= 29 && (zzzVar = zzhpVar.b) != null && Objects.equals(zzzVar.f301o, C4128Rj1.a0) && q0()) {
            ByteBuffer byteBuffer = zzhpVar.g;
            byteBuffer.getClass();
            zzz zzzVar2 = zzhpVar.b;
            zzzVar2.getClass();
            int i = zzzVar2.H;
            if (byteBuffer.remaining() == 8) {
                this.y2.d(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C10323vs.k));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void Q0(Exception exc) {
        zzdx.d(C2936Fe1.f3, "Audio codec error", exc);
        this.x2.m(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void R0(String str, zzsw zzswVar, long j, long j2) {
        this.x2.q(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void S0(String str) {
        this.x2.r(str);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void T0(zzz zzzVar, @InterfaceC11300zs1 MediaFormat mediaFormat) throws zzik {
        int i;
        int i2;
        zzz zzzVar2 = this.E2;
        int[] iArr = null;
        boolean z = true;
        if (zzzVar2 != null) {
            zzzVar = zzzVar2;
        } else if (f1() != null) {
            mediaFormat.getClass();
            if (C4128Rj1.N.equals(zzzVar.f301o)) {
                i = zzzVar.G;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey(C2936Fe1.g3)) {
                i = zzeu.I(mediaFormat.getInteger(C2936Fe1.g3));
            } else {
                i = 2;
            }
            zzx zzxVar = new zzx();
            zzxVar.E(C4128Rj1.N);
            zzxVar.x(i);
            zzxVar.i(zzzVar.H);
            zzxVar.j(zzzVar.I);
            zzxVar.w(zzzVar.l);
            zzxVar.o(zzzVar.a);
            zzxVar.q(zzzVar.b);
            zzxVar.r(zzzVar.c);
            zzxVar.s(zzzVar.d);
            zzxVar.G(zzzVar.e);
            zzxVar.C(zzzVar.f);
            zzxVar.b(mediaFormat.getInteger("channel-count"));
            zzxVar.F(mediaFormat.getInteger("sample-rate"));
            zzz K = zzxVar.K();
            if (this.B2 && K.E == 6 && (i2 = zzzVar.E) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.C2) {
                int i4 = K.E;
                if (i4 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i4 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i4 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i4 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i4 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzzVar = K;
        }
        try {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 29) {
                if (q0()) {
                    Y();
                }
                if (i5 < 29) {
                    z = false;
                }
                zzdc.f(z);
            }
            this.y2.n(zzzVar, 0, iArr);
        } catch (zzqd e) {
            throw P(e, e.X, false, AD1.u1);
        }
    }

    @InterfaceC2591Bt
    public final void U0() {
        this.G2 = true;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzlv
    public final boolean V() {
        if (!this.y2.w() && !super.V()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void V0() {
        this.y2.g();
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void W0() throws zzik {
        int i;
        try {
            this.y2.j();
        } catch (zzqh e) {
            if (true != q0()) {
                i = AD1.v1;
            } else {
                i = 5003;
            }
            throw P(e, e.Z, e.Y, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv, com.google.android.gms.internal.ads.zzly
    public final String X() {
        return C2936Fe1.f3;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final boolean X0(long j, long j2, @InterfaceC11300zs1 zzsz zzszVar, @InterfaceC11300zs1 ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzz zzzVar) throws zzik {
        byteBuffer.getClass();
        if (this.E2 != null && (i2 & 2) != 0) {
            zzszVar.getClass();
            zzszVar.k(i, false);
            return true;
        } else if (z) {
            if (zzszVar != null) {
                zzszVar.k(i, false);
            }
            this.o2.f += i3;
            this.y2.g();
            return true;
        } else {
            try {
                if (!this.y2.p(byteBuffer, j3, i3)) {
                    return false;
                }
                if (zzszVar != null) {
                    zzszVar.k(i, false);
                }
                this.o2.e += i3;
                return true;
            } catch (zzqe e) {
                zzz zzzVar2 = this.D2;
                if (q0()) {
                    Y();
                }
                throw P(e, zzzVar2, e.Y, AD1.u1);
            } catch (zzqh e2) {
                if (q0()) {
                    Y();
                }
                throw P(e2, zzzVar, e2.Y, AD1.v1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final boolean Y0(zzz zzzVar) {
        Y();
        return this.y2.T(zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final long a() {
        if (n() == 2) {
            z0();
        }
        return this.F2;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz
    public final void a0() {
        this.H2 = true;
        this.D2 = null;
        try {
            this.y2.e();
            super.a0();
        } finally {
            this.x2.s(this.o2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz
    public final void b0(boolean z, boolean z2) throws zzik {
        super.b0(z, z2);
        this.x2.t(this.o2);
        Y();
        zzqi zzqiVar = this.y2;
        zzqiVar.x(Z());
        zzqiVar.r(U());
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final zzbb c() {
        return this.y2.c();
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz
    public final void c0(long j, boolean z) throws zzik {
        super.c0(j, z);
        this.y2.e();
        this.F2 = j;
        this.I2 = false;
        this.G2 = true;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final float e0(float f, zzz zzzVar, zzz[] zzzVarArr) {
        int i = -1;
        for (zzz zzzVar2 : zzzVarArr) {
            int i2 = zzzVar2.F;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void g(zzbb zzbbVar) {
        this.y2.q(zzbbVar);
    }

    public final int g1(zztc zztcVar, zzz zzzVar) {
        "OMX.google.raw.decoder".equals(zztcVar.a);
        return zzzVar.p;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final boolean j() {
        boolean z = this.I2;
        this.I2 = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlv
    @InterfaceC11300zs1
    public final zzkw l() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlq
    public final void w(int i, @InterfaceC11300zs1 Object obj) throws zzik {
        zzsv zzsvVar;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 12) {
                        if (i != 16) {
                            if (i != 9) {
                                if (i != 10) {
                                    super.w(i, obj);
                                    return;
                                }
                                obj.getClass();
                                int intValue = ((Integer) obj).intValue();
                                this.y2.b(intValue);
                                if (Build.VERSION.SDK_INT >= 35 && (zzsvVar = this.z2) != null) {
                                    zzsvVar.d(intValue);
                                    return;
                                }
                                return;
                            }
                            zzqi zzqiVar = this.y2;
                            obj.getClass();
                            zzqiVar.N(((Boolean) obj).booleanValue());
                            return;
                        }
                        obj.getClass();
                        this.J2 = ((Integer) obj).intValue();
                        zzsz f1 = f1();
                        if (f1 != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.J2));
                            f1.Z(bundle);
                            return;
                        }
                        return;
                    }
                    this.y2.s((AudioDeviceInfo) obj);
                    return;
                }
                zzf zzfVar = (zzf) obj;
                zzqi zzqiVar2 = this.y2;
                zzfVar.getClass();
                zzqiVar2.t(zzfVar);
                return;
            }
            zze zzeVar = (zze) obj;
            zzqi zzqiVar3 = this.y2;
            zzeVar.getClass();
            zzqiVar3.v(zzeVar);
            return;
        }
        zzqi zzqiVar4 = this.y2;
        obj.getClass();
        zzqiVar4.f(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzlv
    public final boolean x0() {
        if (super.x0() && this.y2.C()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void z() {
        zzsv zzsvVar;
        this.y2.k();
        if (Build.VERSION.SDK_INT >= 35 && (zzsvVar = this.z2) != null) {
            zzsvVar.b();
        }
    }

    public final void z0() {
        long m = this.y2.m(x0());
        if (m != Long.MIN_VALUE) {
            if (!this.G2) {
                m = Math.max(this.F2, m);
            }
            this.F2 = m;
            this.G2 = false;
        }
    }
}
