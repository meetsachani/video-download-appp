package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzdvz extends com.google.android.gms.ads.internal.client.zzds {
    @InterfaceC5056aJ2
    public final Map X = new HashMap();
    public final Context Y;
    public final zzdvn Y0;
    public final WeakReference Z;
    public final zzgdj Z0;
    public zzdvc a1;

    public zzdvz(Context context, WeakReference weakReference, zzdvn zzdvnVar, zzdwa zzdwaVar, zzgdj zzgdjVar) {
        this.Y = context;
        this.Z = weakReference;
        this.Y0 = zzdvnVar;
        this.Z0 = zzgdjVar;
    }

    public static AdRequest e8() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest.Builder().e(AdMobAdapter.class, bundle).p();
    }

    public static String f8(Object obj) {
        ResponseInfo o2;
        com.google.android.gms.ads.internal.client.zzdx h;
        if (obj instanceof LoadAdError) {
            o2 = ((LoadAdError) obj).g();
        } else if (obj instanceof AppOpenAd) {
            o2 = ((AppOpenAd) obj).d();
        } else if (obj instanceof InterstitialAd) {
            o2 = ((InterstitialAd) obj).d();
        } else if (obj instanceof RewardedAd) {
            o2 = ((RewardedAd) obj).f();
        } else if (obj instanceof RewardedInterstitialAd) {
            o2 = ((RewardedInterstitialAd) obj).f();
        } else if (obj instanceof AdView) {
            o2 = ((AdView) obj).getResponseInfo();
        } else if (obj instanceof NativeAd) {
            o2 = ((NativeAd) obj).o();
        } else {
            return "";
        }
        if (o2 != null && (h = o2.h()) != null) {
            try {
                return h.h();
            } catch (RemoteException unused) {
                return "";
            }
        }
        return "";
    }

    public final void Z7(zzdvc zzdvcVar) {
        this.a1 = zzdvcVar;
    }

    public final synchronized void a8(String str, Object obj, String str2) {
        this.X.put(str, obj);
        g8(f8(obj), str2);
    }

    public final synchronized void b8(final String str, String str2, final String str3) {
        char c;
        try {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1372958932:
                    if (str2.equals("INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    return;
                                }
                                RewardedInterstitialAd.h(d8(), str, e8(), new zzdvv(this, str, str3));
                                return;
                            }
                            RewardedAd.i(d8(), str, e8(), new zzdvu(this, str, str3));
                            return;
                        }
                        AdLoader.Builder builder = new AdLoader.Builder(d8(), str);
                        builder.d(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdvo
                            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                            public final void a(NativeAd nativeAd) {
                                zzdvz.this.a8(str, nativeAd, str3);
                            }
                        });
                        builder.e(new zzdvw(this, str3));
                        builder.a().b(e8());
                        return;
                    }
                    InterstitialAd.f(d8(), str, e8(), new zzdvt(this, str, str3));
                    return;
                }
                AdView adView = new AdView(d8());
                adView.setAdSize(AdSize.k);
                adView.setAdUnitId(str);
                adView.setAdListener(new zzdvs(this, str, adView, str3));
                adView.d(e8());
                return;
            }
            AppOpenAd.f(d8(), str, e8(), new zzdvr(this, str, str3));
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:6:0x000b, B:8:0x0013, B:10:0x0025, B:12:0x0029, B:14:0x002d, B:16:0x0031, B:22:0x003b, B:24:0x0046, B:27:0x004d, B:29:0x0051, B:32:0x0058, B:34:0x005c, B:37:0x0068, B:39:0x006c, B:42:0x0078, B:44:0x0088, B:46:0x008c, B:48:0x0090, B:21:0x0038), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:6:0x000b, B:8:0x0013, B:10:0x0025, B:12:0x0029, B:14:0x002d, B:16:0x0031, B:22:0x003b, B:24:0x0046, B:27:0x004d, B:29:0x0051, B:32:0x0058, B:34:0x005c, B:37:0x0068, B:39:0x006c, B:42:0x0078, B:44:0x0088, B:46:0x008c, B:48:0x0090, B:21:0x0038), top: B:55:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c8(String str, String str2) {
        Map map;
        Object obj;
        try {
            Activity b = this.Y0.b();
            if (b != null && (obj = (map = this.X).get(str)) != null) {
                zzbcm zzbcmVar = zzbcv.I9;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                    if (!(obj instanceof AppOpenAd)) {
                        if (!(obj instanceof InterstitialAd)) {
                            if (!(obj instanceof RewardedAd)) {
                                if (obj instanceof RewardedInterstitialAd) {
                                }
                                h8(f8(obj), str2);
                                if (!(obj instanceof AppOpenAd)) {
                                    ((AppOpenAd) obj).k(b);
                                    return;
                                } else if (obj instanceof InterstitialAd) {
                                    ((InterstitialAd) obj).k(b);
                                    return;
                                } else if (obj instanceof RewardedAd) {
                                    ((RewardedAd) obj).q(b, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvp
                                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                                        public final void f(RewardItem rewardItem) {
                                        }
                                    });
                                    return;
                                } else if (obj instanceof RewardedInterstitialAd) {
                                    ((RewardedInterstitialAd) obj).o(b, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvq
                                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                                        public final void f(RewardItem rewardItem) {
                                        }
                                    });
                                    return;
                                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                                    Intent intent = new Intent();
                                    Context d8 = d8();
                                    intent.setClassName(d8, OutOfContextTestingActivity.X);
                                    intent.putExtra(OutOfContextTestingActivity.Y, str);
                                    com.google.android.gms.ads.internal.zzv.v();
                                    com.google.android.gms.ads.internal.util.zzs.u(d8, intent);
                                    return;
                                }
                            }
                        }
                    }
                }
                map.remove(str);
                h8(f8(obj), str2);
                if (!(obj instanceof AppOpenAd)) {
                }
            }
        } finally {
        }
    }

    public final Context d8() {
        Context context = (Context) this.Z.get();
        if (context == null) {
            return this.Y;
        }
        return context;
    }

    public final synchronized void g8(String str, String str2) {
        try {
            zzgcy.r(this.a1.c(str), new zzdvx(this, str2), this.Z0);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "OutOfContextTester.setAdAsOutOfContext");
            this.Y0.f(str2);
        }
    }

    public final synchronized void h8(String str, String str2) {
        try {
            zzgcy.r(this.a1.c(str), new zzdvy(this, str2), this.Z0);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "OutOfContextTester.setAdAsShown");
            this.Y0.f(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void x3(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.o1(iObjectWrapper2);
        if (context != null && viewGroup != null) {
            Map map = this.X;
            Object obj = map.get(str);
            if (obj != null) {
                map.remove(str);
            }
            if (obj instanceof AdView) {
                zzdwa.a(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                zzdwa.b(context, viewGroup, (NativeAd) obj);
            }
        }
    }
}
