package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzi {
    public int a;
    public int b;
    public int c;
    @InterfaceC11300zs1
    public byte[] d;
    public int e;
    public int f;

    public zzi() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.e = -1;
        this.f = -1;
    }

    public final zzi a(int i) {
        this.f = i;
        return this;
    }

    public final zzi b(int i) {
        this.b = i;
        return this;
    }

    public final zzi c(int i) {
        this.a = i;
        return this;
    }

    public final zzi d(int i) {
        this.c = i;
        return this;
    }

    public final zzi e(@InterfaceC11300zs1 byte[] bArr) {
        this.d = bArr;
        return this;
    }

    public final zzi f(int i) {
        this.e = i;
        return this;
    }

    public final zzk g() {
        return new zzk(this.a, this.b, this.c, this.d, this.e, this.f, null);
    }

    public /* synthetic */ zzi(zzk zzkVar, zzj zzjVar) {
        this.a = zzkVar.a;
        this.b = zzkVar.b;
        this.c = zzkVar.c;
        this.d = zzkVar.d;
        this.e = zzkVar.e;
        this.f = zzkVar.f;
    }
}
