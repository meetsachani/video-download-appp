package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;

/* loaded from: classes2.dex */
public final class zzcq implements zzcn {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public zzcl e;
    public zzcl f;
    public zzcl g;
    public zzcl h;
    public boolean i;
    @InterfaceC11300zs1
    public zzcp j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f256o;
    public boolean p;

    public zzcq() {
        zzcl zzclVar = zzcl.e;
        this.e = zzclVar;
        this.f = zzclVar;
        this.g = zzclVar;
        this.h = zzclVar;
        ByteBuffer byteBuffer = zzcn.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcl a(zzcl zzclVar) throws zzcm {
        if (zzclVar.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = zzclVar.a;
            }
            this.e = zzclVar;
            zzcl zzclVar2 = new zzcl(i, zzclVar.b, 2);
            this.f = zzclVar2;
            this.i = true;
            return zzclVar2;
        }
        throw new zzcm("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final ByteBuffer b() {
        int a;
        zzcp zzcpVar = this.j;
        if (zzcpVar != null && (a = zzcpVar.a()) > 0) {
            if (this.k.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            zzcpVar.d(this.l);
            this.f256o += a;
            this.k.limit(a);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = zzcn.a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void c() {
        if (g()) {
            zzcl zzclVar = this.e;
            this.g = zzclVar;
            zzcl zzclVar2 = this.f;
            this.h = zzclVar2;
            if (this.i) {
                this.j = new zzcp(zzclVar.a, zzclVar.b, this.c, this.d, zzclVar2.a);
            } else {
                zzcp zzcpVar = this.j;
                if (zzcpVar != null) {
                    zzcpVar.c();
                }
            }
        }
        this.m = zzcn.a;
        this.n = 0L;
        this.f256o = 0L;
        this.p = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        zzcp zzcpVar = this.j;
        zzcpVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.n += remaining;
        zzcpVar.f(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void e() {
        this.c = 1.0f;
        this.d = 1.0f;
        zzcl zzclVar = zzcl.e;
        this.e = zzclVar;
        this.f = zzclVar;
        this.g = zzclVar;
        this.h = zzclVar;
        ByteBuffer byteBuffer = zzcn.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.f256o = 0L;
        this.p = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void f() {
        zzcp zzcpVar = this.j;
        if (zzcpVar != null) {
            zzcpVar.e();
        }
        this.p = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final boolean g() {
        if (this.f.a != -1) {
            if (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final boolean h() {
        if (!this.p) {
            return false;
        }
        zzcp zzcpVar = this.j;
        if (zzcpVar != null && zzcpVar.a() != 0) {
            return false;
        }
        return true;
    }

    public final long i(long j) {
        long j2 = this.f256o;
        if (j2 >= 1024) {
            long j3 = this.n;
            zzcp zzcpVar = this.j;
            zzcpVar.getClass();
            long b = j3 - zzcpVar.b();
            int i = this.h.a;
            int i2 = this.g.a;
            if (i == i2) {
                return zzeu.P(j, b, j2, RoundingMode.DOWN);
            }
            return zzeu.P(j, b * i, j2 * i2, RoundingMode.DOWN);
        }
        return (long) (this.c * j);
    }

    public final void j(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public final void k(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }
}
