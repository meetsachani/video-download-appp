package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import o.InterfaceC10810xr1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class NativeAdViewHolder {
    @InterfaceC5670cr1
    public static final WeakHashMap c = new WeakHashMap();
    @InterfaceC10810xr1
    public zzbgq a;
    public WeakReference b;

    public NativeAdViewHolder(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Map<String, View> map, @InterfaceC5670cr1 Map<String, View> map2) {
        Preconditions.s(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzo.d("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = c;
        if (weakHashMap.get(view) != null) {
            zzo.d("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.b = new WeakReference(view);
        this.a = zzbb.a().k(view, d(map), d(map2));
    }

    public static final HashMap d(Map map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public final void a(@InterfaceC5670cr1 View view) {
        try {
            this.a.c3(ObjectWrapper.V3(view));
        } catch (RemoteException e) {
            zzo.e("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public void b(@InterfaceC5670cr1 NativeAd nativeAd) {
        View view;
        IObjectWrapper iObjectWrapper = (IObjectWrapper) nativeAd.B();
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (view == null) {
            zzo.g("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = c;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        zzbgq zzbgqVar = this.a;
        if (zzbgqVar != null) {
            try {
                zzbgqVar.p4(iObjectWrapper);
            } catch (RemoteException e) {
                zzo.e("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void c() {
        View view;
        zzbgq zzbgqVar = this.a;
        if (zzbgqVar != null) {
            try {
                zzbgqVar.f();
            } catch (RemoteException e) {
                zzo.e("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (view != null) {
            c.remove(view);
        }
    }
}
