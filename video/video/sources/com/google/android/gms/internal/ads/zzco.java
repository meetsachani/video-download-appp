package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.InterfaceC2591Bt;

/* loaded from: classes2.dex */
public abstract class zzco implements zzcn {
    public zzcl b;
    public zzcl c;
    public zzcl d;
    public zzcl e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public zzco() {
        ByteBuffer byteBuffer = zzcn.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        zzcl zzclVar = zzcl.e;
        this.d = zzclVar;
        this.e = zzclVar;
        this.b = zzclVar;
        this.c = zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcl a(zzcl zzclVar) throws zzcm {
        this.d = zzclVar;
        this.e = i(zzclVar);
        if (g()) {
            return this.e;
        }
        return zzcl.e;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    @InterfaceC2591Bt
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = zzcn.a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void c() {
        this.g = zzcn.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        k();
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void e() {
        c();
        this.f = zzcn.a;
        zzcl zzclVar = zzcl.e;
        this.d = zzclVar;
        this.e = zzclVar;
        this.b = zzclVar;
        this.c = zzclVar;
        m();
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void f() {
        this.h = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    @InterfaceC2591Bt
    public boolean g() {
        if (this.e != zzcl.e) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    @InterfaceC2591Bt
    public boolean h() {
        return this.h && this.g == zzcn.a;
    }

    public zzcl i(zzcl zzclVar) throws zzcm {
        throw null;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public final boolean n() {
        return this.g.hasRemaining();
    }
}
