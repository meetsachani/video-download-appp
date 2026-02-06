package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import o.InterfaceC11300zs1;
import o.JK1;

/* loaded from: classes2.dex */
public final class zzcs {
    @InterfaceC11300zs1
    public CharSequence a;
    @InterfaceC11300zs1
    public Bitmap b;
    @InterfaceC11300zs1
    public Layout.Alignment c;
    @InterfaceC11300zs1
    public Layout.Alignment d;
    public float e;
    public int f;
    public int g;
    public float h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public float f257o;

    public zzcs() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = -3.4028235E38f;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = -3.4028235E38f;
        this.i = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        this.k = -3.4028235E38f;
        this.l = -3.4028235E38f;
        this.m = -3.4028235E38f;
        this.n = Integer.MIN_VALUE;
    }

    @JK1
    public final int a() {
        return this.g;
    }

    @JK1
    public final int b() {
        return this.i;
    }

    public final zzcs c(Bitmap bitmap) {
        this.b = bitmap;
        return this;
    }

    public final zzcs d(float f) {
        this.m = f;
        return this;
    }

    public final zzcs e(float f, int i) {
        this.e = f;
        this.f = i;
        return this;
    }

    public final zzcs f(int i) {
        this.g = i;
        return this;
    }

    public final zzcs g(@InterfaceC11300zs1 Layout.Alignment alignment) {
        this.d = alignment;
        return this;
    }

    public final zzcs h(float f) {
        this.h = f;
        return this;
    }

    public final zzcs i(int i) {
        this.i = i;
        return this;
    }

    public final zzcs j(float f) {
        this.f257o = f;
        return this;
    }

    public final zzcs k(float f) {
        this.l = f;
        return this;
    }

    public final zzcs l(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final zzcs m(@InterfaceC11300zs1 Layout.Alignment alignment) {
        this.c = alignment;
        return this;
    }

    public final zzcs n(float f, int i) {
        this.k = f;
        this.j = i;
        return this;
    }

    public final zzcs o(int i) {
        this.n = i;
        return this;
    }

    public final zzcu p() {
        return new zzcu(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, false, -16777216, this.n, this.f257o, null);
    }

    @InterfaceC11300zs1
    @JK1
    public final CharSequence q() {
        return this.a;
    }

    public /* synthetic */ zzcs(zzcu zzcuVar, zzct zzctVar) {
        this.a = zzcuVar.a;
        this.b = zzcuVar.d;
        this.c = zzcuVar.b;
        this.d = zzcuVar.c;
        this.e = zzcuVar.e;
        this.f = zzcuVar.f;
        this.g = zzcuVar.g;
        this.h = zzcuVar.h;
        this.i = zzcuVar.i;
        this.j = zzcuVar.l;
        this.k = zzcuVar.m;
        this.l = zzcuVar.j;
        this.m = zzcuVar.k;
        this.n = zzcuVar.n;
        this.f257o = zzcuVar.f258o;
    }
}
