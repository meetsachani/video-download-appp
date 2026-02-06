package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import o.InterfaceC8557od0;

/* loaded from: classes2.dex */
public class zzbq {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public zzfyc i;
    public zzfyc j;
    public zzfyc k;
    public int l;
    public int m;
    public zzfyc n;

    /* renamed from: o  reason: collision with root package name */
    public zzbp f228o;
    public zzfyc p;
    public boolean q;
    public HashMap r;
    public HashSet s;

    public zzbq() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = true;
        this.h = true;
        this.i = zzfyc.F();
        this.j = zzfyc.F();
        this.k = zzfyc.F();
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = zzfyc.F();
        this.f228o = zzbp.b;
        this.p = zzfyc.F();
        this.q = true;
        this.r = new HashMap();
        this.s = new HashSet();
    }

    public static /* bridge */ /* synthetic */ int a(zzbq zzbqVar) {
        return zzbqVar.m;
    }

    public static /* bridge */ /* synthetic */ int b(zzbq zzbqVar) {
        return zzbqVar.l;
    }

    public static /* bridge */ /* synthetic */ int c(zzbq zzbqVar) {
        return zzbqVar.d;
    }

    public static /* bridge */ /* synthetic */ int d(zzbq zzbqVar) {
        return zzbqVar.c;
    }

    public static /* bridge */ /* synthetic */ int e(zzbq zzbqVar) {
        return zzbqVar.b;
    }

    public static /* bridge */ /* synthetic */ int f(zzbq zzbqVar) {
        return zzbqVar.a;
    }

    public static /* bridge */ /* synthetic */ int g(zzbq zzbqVar) {
        return zzbqVar.f;
    }

    public static /* bridge */ /* synthetic */ int h(zzbq zzbqVar) {
        return zzbqVar.e;
    }

    public static /* bridge */ /* synthetic */ zzbp i(zzbq zzbqVar) {
        return zzbqVar.f228o;
    }

    public static /* bridge */ /* synthetic */ zzfyc k(zzbq zzbqVar) {
        return zzbqVar.k;
    }

    public static /* bridge */ /* synthetic */ zzfyc l(zzbq zzbqVar) {
        return zzbqVar.n;
    }

    public static /* bridge */ /* synthetic */ zzfyc m(zzbq zzbqVar) {
        return zzbqVar.p;
    }

    public static /* bridge */ /* synthetic */ zzfyc n(zzbq zzbqVar) {
        return zzbqVar.j;
    }

    public static /* bridge */ /* synthetic */ zzfyc o(zzbq zzbqVar) {
        return zzbqVar.i;
    }

    public static /* bridge */ /* synthetic */ HashMap p(zzbq zzbqVar) {
        return zzbqVar.r;
    }

    public static /* bridge */ /* synthetic */ HashSet q(zzbq zzbqVar) {
        return zzbqVar.s;
    }

    public static /* bridge */ /* synthetic */ boolean r(zzbq zzbqVar) {
        return zzbqVar.g;
    }

    public static /* bridge */ /* synthetic */ boolean s(zzbq zzbqVar) {
        return zzbqVar.q;
    }

    public static /* bridge */ /* synthetic */ boolean t(zzbq zzbqVar) {
        return zzbqVar.h;
    }

    public final zzbq j(zzbr zzbrVar) {
        u(zzbrVar);
        return this;
    }

    @InterfaceC8557od0({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    public final void u(zzbr zzbrVar) {
        this.a = zzbrVar.a;
        this.b = zzbrVar.b;
        this.c = zzbrVar.c;
        this.d = zzbrVar.d;
        this.e = zzbrVar.i;
        this.f = zzbrVar.j;
        this.g = zzbrVar.k;
        this.h = zzbrVar.l;
        this.i = zzbrVar.m;
        this.j = zzbrVar.n;
        this.k = zzbrVar.p;
        this.l = zzbrVar.r;
        this.m = zzbrVar.s;
        this.n = zzbrVar.t;
        this.f228o = zzbrVar.u;
        this.p = zzbrVar.v;
        this.q = zzbrVar.x;
        this.s = new HashSet(zzbrVar.E);
        this.r = new HashMap(zzbrVar.D);
    }

    public zzbq(zzbr zzbrVar) {
        u(zzbrVar);
    }
}
