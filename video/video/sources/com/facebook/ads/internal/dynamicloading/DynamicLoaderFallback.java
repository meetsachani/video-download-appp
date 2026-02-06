package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
@Keep
/* loaded from: classes2.dex */
public class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    /* loaded from: classes2.dex */
    public class a implements InvocationHandler {
        public final /* synthetic */ List a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ List c;
        public final /* synthetic */ List d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ List f;
        public final /* synthetic */ List g;
        public final /* synthetic */ Method h;
        public final /* synthetic */ Method i;

        public a(List list, Map map, List list2, List list3, Map map2, List list4, List list5, Method method, Method method2) {
            this.a = list;
            this.b = map;
            this.c = list2;
            this.d = list3;
            this.e = map2;
            this.f = list4;
            this.g = list5;
            this.h = method;
            this.i = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        @InterfaceC11300zs1
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object newProxyInstance;
            if (method.getReturnType().isPrimitive()) {
                if (method.getReturnType().equals(Void.TYPE)) {
                    Iterator it = this.a.iterator();
                    while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.b))) {
                    }
                    for (Method method2 : this.c) {
                        if (DynamicLoaderFallback.equalsMethods(method, method2) && DynamicLoaderFallback.reportError(obj, this.b)) {
                            return null;
                        }
                    }
                    return null;
                }
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            } else if (method.getReturnType().equals(String.class)) {
                return "";
            } else {
                if (method.getReturnType().equals(obj.getClass().getInterfaces()[0])) {
                    newProxyInstance = obj;
                } else {
                    newProxyInstance = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                }
                Iterator it2 = this.d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.e.get(obj), (AdListener) objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method method3 : this.f) {
                    if (DynamicLoaderFallback.equalsMethods(method, method3)) {
                        this.e.put(newProxyInstance, obj);
                    }
                }
                for (Method method4 : this.g) {
                    if (DynamicLoaderFallback.equalsMethods(method, method4)) {
                        for (Object obj2 : objArr) {
                            if (obj2 instanceof Ad) {
                                this.b.put(newProxyInstance, (Ad) obj2);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.h)) {
                    this.b.put(objArr[1], (Ad) objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.i)) {
                    this.b.put(objArr[1], (Ad) objArr[0]);
                }
                return newProxyInstance;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public final /* synthetic */ AdListener X;
        public final /* synthetic */ Ad Y;

        public b(AdListener adListener, Ad ad) {
            this.X = adListener;
            this.Y = ad;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.onError(this.Y, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder."));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        if (method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        c cVar = new c(null);
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.c(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(cVar.b());
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(cVar.b());
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.b());
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.b());
        dynamicLoader.createNativeAdApi(null, null);
        Method b2 = cVar.b();
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method b3 = cVar.b();
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.c(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(cVar.b());
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(cVar.b());
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.c(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.b());
        interstitialAdApi.loadAd(null);
        arrayList2.add(cVar.b());
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.c(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.b());
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(cVar.b());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        AdViewApi adViewApi = (AdViewApi) cVar.c(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.b());
        adViewApi.loadAd(null);
        arrayList2.add(cVar.b());
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        ((AdView.AdViewLoadConfigBuilder) cVar.c(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.c(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.c(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.c(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, b2, b3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(@InterfaceC11300zs1 Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad), 500L);
        return true;
    }

    /* loaded from: classes2.dex */
    public static class c {
        @InterfaceC11300zs1
        public Method a;
        public final InvocationHandler b;

        /* loaded from: classes2.dex */
        public class a implements InvocationHandler {
            public a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            @InterfaceC11300zs1
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if (!"toString".equals(method.getName())) {
                    c.this.a = method;
                    return null;
                }
                return null;
            }
        }

        public c() {
            this.b = new a();
        }

        @InterfaceC11300zs1
        public Method b() {
            return this.a;
        }

        public <T> T c(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.b));
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }
}
