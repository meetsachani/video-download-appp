package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbca;

/* loaded from: classes2.dex */
public final class zzcsn implements zzcxh, com.google.android.gms.ads.internal.client.zza, zzcyv, zzcwn, zzcvt, zzdbh {
    public final Clock X;
    public final zzbzg Y;

    public zzcsn(Clock clock, zzbzg zzbzgVar) {
        this.X = clock;
        this.Y = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void B(zzbca.zzb zzbVar) {
        this.Y.i();
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void Q0(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void S(zzbca.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void a() {
        this.Y.e();
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void a0(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(zzfcg zzfcgVar) {
        this.Y.k(this.X.b());
    }

    public final String g() {
        return this.Y.c();
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void k(zzbvx zzbvxVar, String str, String str2) {
    }

    public final void n(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.Y.j(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void r0(zzbca.zzb zzbVar) {
        this.Y.g();
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void s() {
        this.Y.f();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        this.Y.h(true);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void y() {
        this.Y.d();
    }
}
