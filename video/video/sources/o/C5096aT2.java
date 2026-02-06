package o;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbhb;

@InterfaceC5056aJ2
/* renamed from: o.aT2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5096aT2 extends AdListener implements zzi, zzg, zzf {
    @InterfaceC5056aJ2
    public final AbstractAdViewAdapter X;
    @InterfaceC5056aJ2
    public final MediationNativeListener Y;

    public C5096aT2(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.X = abstractAdViewAdapter;
        this.Y = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void a(zzbhb zzbhbVar) {
        this.Y.w(this.X, zzbhbVar);
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void b(zzbhb zzbhbVar, String str) {
        this.Y.k(this.X, zzbhbVar, str);
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void c(UnifiedNativeAd unifiedNativeAd) {
        this.Y.y(this.X, new KS2(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void e() {
        this.Y.g(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void g(LoadAdError loadAdError) {
        this.Y.b(this.X, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void h() {
        this.Y.m(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void n() {
        this.Y.a(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void y() {
        this.Y.s(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void k() {
    }
}
