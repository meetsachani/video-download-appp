package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbrx extends zzbrj {
    public final RtbAdapter X;
    public MediationInterstitialAd Y;
    public MediationAppOpenAd Y0;
    public MediationRewardedAd Z;
    public String Z0 = "";

    public zzbrx(RtbAdapter rtbAdapter) {
        this.X = rtbAdapter;
    }

    public static final Bundle b8(String str) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            throw new RemoteException();
        }
    }

    public static final boolean c8(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (!zzmVar.a1) {
            com.google.android.gms.ads.internal.client.zzbb.b();
            if (!com.google.android.gms.ads.internal.util.client.zzf.x()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @InterfaceC11300zs1
    public static final String d8(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzmVar.p1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean F0(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.Y;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.a((Context) ObjectWrapper.o1(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
                zzbpi.a(iObjectWrapper, th, "adapter.showRtbInterstitialAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void H7(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqy zzbqyVar, zzbpr zzbprVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        try {
            zzbrq zzbrqVar = new zzbrq(this, zzbqyVar, zzbprVar);
            RtbAdapter rtbAdapter = this.X;
            Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
            b8(str2);
            a8(zzmVar);
            c8(zzmVar);
            Location location = zzmVar.f1;
            d8(str2, zzmVar);
            com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X);
            zzbrqVar.r0(new AdError(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.a));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Adapter failed to render interscroller ad.", th);
            zzbpi.a(iObjectWrapper, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void K6(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqy zzbqyVar, zzbpr zzbprVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        try {
            this.X.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), str, b8(str2), a8(zzmVar), c8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, d8(str2, zzmVar), com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X), this.Z0), new zzbrp(this, zzbqyVar, zzbprVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Adapter failed to render banner ad.", th);
            zzbpi.a(iObjectWrapper, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void M0(String str) {
        this.Z0 = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void N2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpr zzbprVar) throws RemoteException {
        try {
            this.X.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), str, b8(str2), a8(zzmVar), c8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, d8(str2, zzmVar), this.Z0), new zzbrw(this, zzbrhVar, zzbprVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Adapter failed to render rewarded interstitial ad.", th);
            zzbpi.a(iObjectWrapper, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean O(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationAppOpenAd mediationAppOpenAd = this.Y0;
        if (mediationAppOpenAd != null) {
            try {
                mediationAppOpenAd.a((Context) ObjectWrapper.o1(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
                zzbpi.a(iObjectWrapper, th, "adapter.showRtbAppOpenAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void P5(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbre zzbreVar, zzbpr zzbprVar) throws RemoteException {
        w2(str, str2, zzmVar, iObjectWrapper, zzbreVar, zzbprVar, null);
    }

    public final Bundle a8(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.h1;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.X.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzea d() {
        RtbAdapter rtbAdapter = this.X;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final zzbrz e() throws RemoteException {
        return zzbrz.m0(this.X.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final zzbrz g() throws RemoteException {
        return zzbrz.m0(this.X.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean m4(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.Z;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.a((Context) ObjectWrapper.o1(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
                zzbpi.a(iObjectWrapper, th, "adapter.showRtbRewardedAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void q2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrb zzbrbVar, zzbpr zzbprVar) throws RemoteException {
        try {
            this.X.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), str, b8(str2), a8(zzmVar), c8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, d8(str2, zzmVar), this.Z0), new zzbrr(this, zzbrbVar, zzbprVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Adapter failed to render interstitial ad.", th);
            zzbpi.a(iObjectWrapper, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void t4(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqv zzbqvVar, zzbpr zzbprVar) throws RemoteException {
        try {
            this.X.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), str, b8(str2), a8(zzmVar), c8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, d8(str2, zzmVar), this.Z0), new zzbru(this, zzbqvVar, zzbprVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Adapter failed to render app open ad.", th);
            zzbpi.a(iObjectWrapper, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void w2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbre zzbreVar, zzbpr zzbprVar, zzbfv zzbfvVar) throws RemoteException {
        try {
            this.X.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), str, b8(str2), a8(zzmVar), c8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, d8(str2, zzmVar), this.Z0, zzbfvVar), new zzbrs(this, zzbreVar, zzbprVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Adapter failed to render native ad.", th);
            zzbpi.a(iObjectWrapper, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                try {
                    this.X.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), str, b8(str2), a8(zzmVar), c8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, d8(str2, zzmVar), this.Z0, zzbfvVar), new zzbrt(this, zzbreVar, zzbprVar));
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzo.e("Adapter failed to render native ad.", th2);
                    zzbpi.a(iObjectWrapper, th2, "adapter.loadRtbNativeAd");
                    throw new RemoteException();
                }
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void w6(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpr zzbprVar) throws RemoteException {
        try {
            this.X.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), str, b8(str2), a8(zzmVar), c8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, d8(str2, zzmVar), this.Z0), new zzbrw(this, zzbrhVar, zzbprVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Adapter failed to render rewarded ad.", th);
            zzbpi.a(iObjectWrapper, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void x5(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbrn zzbrnVar) throws RemoteException {
        char c;
        AdFormat adFormat;
        try {
            zzbrv zzbrvVar = new zzbrv(this, zzbrnVar);
            RtbAdapter rtbAdapter = this.X;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1167692200:
                    if (str.equals(FirebaseAnalytics.Event.e)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    adFormat = AdFormat.BANNER;
                    MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(mediationConfiguration);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.o1(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X)), zzbrvVar);
                    return;
                case 1:
                    adFormat = AdFormat.INTERSTITIAL;
                    MediationConfiguration mediationConfiguration2 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(mediationConfiguration2);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.o1(iObjectWrapper), arrayList2, bundle, com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X)), zzbrvVar);
                    return;
                case 2:
                    adFormat = AdFormat.REWARDED;
                    MediationConfiguration mediationConfiguration22 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList22 = new ArrayList();
                    arrayList22.add(mediationConfiguration22);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.o1(iObjectWrapper), arrayList22, bundle, com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X)), zzbrvVar);
                    return;
                case 3:
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    MediationConfiguration mediationConfiguration222 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList222 = new ArrayList();
                    arrayList222.add(mediationConfiguration222);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.o1(iObjectWrapper), arrayList222, bundle, com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X)), zzbrvVar);
                    return;
                case 4:
                    adFormat = AdFormat.NATIVE;
                    MediationConfiguration mediationConfiguration2222 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList2222 = new ArrayList();
                    arrayList2222.add(mediationConfiguration2222);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.o1(iObjectWrapper), arrayList2222, bundle, com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X)), zzbrvVar);
                    return;
                case 5:
                    adFormat = AdFormat.APP_OPEN_AD;
                    MediationConfiguration mediationConfiguration22222 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList22222 = new ArrayList();
                    arrayList22222.add(mediationConfiguration22222);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.o1(iObjectWrapper), arrayList22222, bundle, com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X)), zzbrvVar);
                    return;
                case 6:
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.fc)).booleanValue()) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        MediationConfiguration mediationConfiguration222222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList222222 = new ArrayList();
                        arrayList222222.add(mediationConfiguration222222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.o1(iObjectWrapper), arrayList222222, bundle, com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X)), zzbrvVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Error generating signals for RTB", th);
            zzbpi.a(iObjectWrapper, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }
}
