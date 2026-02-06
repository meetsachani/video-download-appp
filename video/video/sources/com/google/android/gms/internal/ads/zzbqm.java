package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbqm extends zzbpn {
    public final Object X;
    public zzbqo Y;
    public IObjectWrapper Y0;
    public zzbwi Z;
    public View Z0;
    public MediationInterstitialAd a1;
    public UnifiedNativeAdMapper b1;
    public NativeAdMapper c1;
    public MediationRewardedAd d1;
    public MediationInterscrollerAd e1;
    public MediationAppOpenAd f1;
    public final String g1 = "";

    public zzbqm(@InterfaceC5670cr1 Adapter adapter) {
        this.X = adapter;
    }

    public static final boolean d8(com.google.android.gms.ads.internal.client.zzm zzmVar) {
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
    public static final String e8(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzmVar.p1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void A4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        Object obj = this.X;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).a(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void B6(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        Object obj = this.X;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.b("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), "", c8(str, zzmVar, null), b8(zzmVar), d8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, e8(str, zzmVar), ""), new zzbqk(this, zzbprVar));
                return;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                zzbpi.a(iObjectWrapper, e, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void D() throws RemoteException {
        Object obj = this.X;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void F1(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar) throws RemoteException {
        Object obj = this.X;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.b("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) obj;
                zzbqe zzbqeVar = new zzbqe(this, zzbprVar, adapter);
                Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
                c8(str, zzmVar, str2);
                b8(zzmVar);
                d8(zzmVar);
                Location location = zzmVar.f1;
                e8(str, zzmVar);
                com.google.android.gms.ads.zzc.e(zzrVar.Z0, zzrVar.Y);
                zzbqeVar.r0(new AdError(7, adapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.a));
                return;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                zzbpi.a(iObjectWrapper, e, "adapter.loadInterscrollerAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    @InterfaceC11300zs1
    public final zzbpw H() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void I0(boolean z) throws RemoteException {
        Object obj = this.X;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.b(canonicalName + " #009 Class mismatch: " + canonicalName2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void I5(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        Object obj = this.X;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), "", c8(str, zzmVar, null), b8(zzmVar), d8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, e8(str, zzmVar), ""), new zzbqk(this, zzbprVar));
                return;
            } catch (Exception e) {
                zzbpi.a(iObjectWrapper, e, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void J() throws RemoteException {
        Object obj = this.X;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.d1;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.a((Context) ObjectWrapper.o1(this.Y0));
                    return;
                } catch (RuntimeException e) {
                    zzbpi.a(this.Y0, e, "adapter.showVideo");
                    throw e;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void J6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.X;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.b("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.f1;
            if (mediationAppOpenAd != null) {
                try {
                    mediationAppOpenAd.a((Context) ObjectWrapper.o1(iObjectWrapper));
                    return;
                } catch (RuntimeException e) {
                    zzbpi.a(iObjectWrapper, e, "adapter.appOpen.showAd");
                    throw e;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean K() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean M() throws RemoteException {
        Object obj = this.X;
        if (!(obj instanceof Adapter) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        } else if (this.Z != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void M4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar, zzbfv zzbfvVar, List list) throws RemoteException {
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.X;
        boolean z = obj instanceof MediationNativeAdapter;
        if (!z && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.b("Requesting native ad from adapter.");
        if (z) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = zzmVar.Z0;
                if (list2 != null) {
                    hashSet = new HashSet(list2);
                } else {
                    hashSet = null;
                }
                long j = zzmVar.Y;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                zzbqr zzbqrVar = new zzbqr(date, zzmVar.Y0, hashSet, zzmVar.f1, d8(zzmVar), zzmVar.b1, zzbfvVar, list, zzmVar.m1, zzmVar.o1, e8(str, zzmVar));
                Bundle bundle2 = zzmVar.h1;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                this.Y = new zzbqo(zzbprVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.o1(iObjectWrapper), this.Y, c8(str, zzmVar, str2), zzbqrVar, bundle);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
                zzbpi.a(iObjectWrapper, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.X;
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), "", c8(str, zzmVar, str2), b8(zzmVar), d8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, e8(str, zzmVar), this.g1, zzbfvVar), new zzbqj(this, zzbprVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th2);
                zzbpi.a(iObjectWrapper, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                    try {
                        ((Adapter) this.X).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), "", c8(str, zzmVar, str2), b8(zzmVar), d8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, e8(str, zzmVar), this.g1, zzbfvVar), new zzbqi(this, zzbprVar));
                        return;
                    } catch (Throwable th3) {
                        com.google.android.gms.ads.internal.util.client.zzo.e("", th3);
                        zzbpi.a(iObjectWrapper, th3, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void M6(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        Object obj = this.X;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.b("Requesting app open ad from adapter.");
            try {
                ((Adapter) obj).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), "", c8(str, zzmVar, null), b8(zzmVar), d8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, e8(str, zzmVar), ""), new zzbql(this, zzbprVar));
                return;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                zzbpi.a(iObjectWrapper, e, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void Q7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.X;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            D();
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.b("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.a1;
            if (mediationInterstitialAd != null) {
                try {
                    mediationInterstitialAd.a((Context) ObjectWrapper.o1(iObjectWrapper));
                    return;
                } catch (RuntimeException e) {
                    zzbpi.a(iObjectWrapper, e, "adapter.interstitial.showAd");
                    throw e;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.d("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void S3(IObjectWrapper iObjectWrapper, zzbwi zzbwiVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    @InterfaceC11300zs1
    public final zzbpx T() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void U() throws RemoteException {
        Object obj = this.X;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onResume();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void U7(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar) throws RemoteException {
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.X;
        boolean z = obj instanceof MediationInterstitialAdapter;
        if (!z && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.b("Requesting interstitial ad from adapter.");
        if (z) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
                List list = zzmVar.Z0;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j = zzmVar.Y;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                zzbqd zzbqdVar = new zzbqd(date, zzmVar.Y0, hashSet, zzmVar.f1, d8(zzmVar), zzmVar.b1, zzmVar.m1, zzmVar.o1, e8(str, zzmVar));
                Bundle bundle2 = zzmVar.h1;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.o1(iObjectWrapper), new zzbqo(zzbprVar), c8(str, zzmVar, str2), zzbqdVar, bundle);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
                zzbpi.a(iObjectWrapper, th, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.X;
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), "", c8(str, zzmVar, str2), b8(zzmVar), d8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, e8(str, zzmVar), this.g1), new zzbqh(this, zzbprVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th2);
                zzbpi.a(iObjectWrapper, th2, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    public final Bundle b8(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.h1;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.X.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void c2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar) throws RemoteException {
        AdSize c;
        String str3;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.X;
        boolean z = obj instanceof MediationBannerAdapter;
        if (!z && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.b("Requesting banner ad from adapter.");
        if (zzrVar.i1) {
            c = com.google.android.gms.ads.zzc.d(zzrVar.Z0, zzrVar.Y);
        } else {
            c = com.google.android.gms.ads.zzc.c(zzrVar.Z0, zzrVar.Y, zzrVar.X);
        }
        AdSize adSize = c;
        if (z) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
                List list = zzmVar.Z0;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j = zzmVar.Y;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                zzbqd zzbqdVar = new zzbqd(date, zzmVar.Y0, hashSet, zzmVar.f1, d8(zzmVar), zzmVar.b1, zzmVar.m1, zzmVar.o1, e8(str, zzmVar));
                Bundle bundle2 = zzmVar.h1;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                str3 = "";
                try {
                    mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.o1(iObjectWrapper), new zzbqo(zzbprVar), c8(str, zzmVar, str2), adSize, zzbqdVar, bundle);
                } catch (Throwable th) {
                    th = th;
                    com.google.android.gms.ads.internal.util.client.zzo.e(str3, th);
                    zzbpi.a(iObjectWrapper, th, "adapter.requestBannerAd");
                    throw new RemoteException();
                }
            } catch (Throwable th2) {
                th = th2;
                str3 = "";
            }
        } else {
            Object obj2 = this.X;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.o1(iObjectWrapper), "", c8(str, zzmVar, str2), b8(zzmVar), d8(zzmVar), zzmVar.f1, zzmVar.b1, zzmVar.o1, e8(str, zzmVar), adSize, this.g1), new zzbqg(this, zzbprVar));
                } catch (Throwable th3) {
                    com.google.android.gms.ads.internal.util.client.zzo.e("", th3);
                    zzbpi.a(iObjectWrapper, th3, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
        }
    }

    public final Bundle c8(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.b("Server parameters: ".concat(String.valueOf(str)));
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
                bundle = bundle2;
            }
            if (this.X instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.b1);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final Bundle d() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void d2(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        Object obj = this.X;
        if (obj instanceof Adapter) {
            B6(this.Y0, zzmVar, str, new zzbqp((Adapter) obj, this.Z));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final Bundle e() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final Bundle g() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzea h() {
        Object obj = this.X;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void h0() throws RemoteException {
        Object obj = this.X;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onPause();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    @InterfaceC11300zs1
    public final zzbha i() {
        zzbhb B;
        zzbqo zzbqoVar = this.Y;
        if (zzbqoVar != null && (B = zzbqoVar.B()) != null) {
            return B.a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    @InterfaceC11300zs1
    public final zzbpu j() {
        MediationInterscrollerAd mediationInterscrollerAd = this.e1;
        if (mediationInterscrollerAd != null) {
            return new zzbqn(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void j2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwi zzbwiVar, String str2) throws RemoteException {
        Object obj = this.X;
        if (!(obj instanceof Adapter) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        this.Y0 = iObjectWrapper;
        this.Z = zzbwiVar;
        zzbwiVar.I7(ObjectWrapper.V3(obj));
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    @InterfaceC11300zs1
    public final zzbqa k() {
        UnifiedNativeAdMapper A;
        Object obj = this.X;
        if (obj instanceof MediationNativeAdapter) {
            zzbqo zzbqoVar = this.Y;
            if (zzbqoVar != null && (A = zzbqoVar.A()) != null) {
                return new zzbqs(A);
            }
            return null;
        } else if (obj instanceof Adapter) {
            NativeAdMapper nativeAdMapper = this.c1;
            if (nativeAdMapper != null) {
                return new zzbqq(nativeAdMapper);
            }
            UnifiedNativeAdMapper unifiedNativeAdMapper = this.b1;
            if (unifiedNativeAdMapper != null) {
                return new zzbqs(unifiedNativeAdMapper);
            }
            return null;
        } else {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void k4(IObjectWrapper iObjectWrapper, zzbly zzblyVar, List list) throws RemoteException {
        char c;
        Object obj = this.X;
        if (obj instanceof Adapter) {
            zzbqf zzbqfVar = new zzbqf(this, zzblyVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbme zzbmeVar = (zzbme) it.next();
                String str = zzbmeVar.X;
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
                AdFormat adFormat = null;
                switch (c) {
                    case 0:
                        adFormat = AdFormat.BANNER;
                        break;
                    case 1:
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    case 2:
                        adFormat = AdFormat.REWARDED;
                        break;
                    case 3:
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        adFormat = AdFormat.NATIVE;
                        break;
                    case 5:
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    case 6:
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.fc)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                        break;
                }
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(adFormat, zzbmeVar.Y));
                }
            }
            ((Adapter) obj).initialize((Context) ObjectWrapper.o1(iObjectWrapper), zzbqfVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    @InterfaceC11300zs1
    public final zzbrz l() {
        Object obj = this.X;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbrz.m0(((Adapter) obj).getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    @InterfaceC11300zs1
    public final zzbrz m() {
        Object obj = this.X;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbrz.m0(((Adapter) obj).getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final IObjectWrapper n() throws RemoteException {
        Object obj = this.X;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.V3(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.V3(this.Z0);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void o7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.X;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.b("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.d1;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.a((Context) ObjectWrapper.o1(iObjectWrapper));
                    return;
                } catch (RuntimeException e) {
                    zzbpi.a(iObjectWrapper, e, "adapter.rewarded.showAd");
                    throw e;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzo.g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void p() throws RemoteException {
        Object obj = this.X;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onDestroy();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void s6(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        c2(iObjectWrapper, zzrVar, zzmVar, str, null, zzbprVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void t6(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        U7(iObjectWrapper, zzmVar, str, null, zzbprVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void w3(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        d2(zzmVar, str, null);
    }

    public zzbqm(@InterfaceC5670cr1 MediationAdapter mediationAdapter) {
        this.X = mediationAdapter;
    }
}
