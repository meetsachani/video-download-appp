package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbui;
import o.InterfaceC10810xr1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.KS1;

/* loaded from: classes2.dex */
public abstract class BaseAdView extends ViewGroup {
    @InterfaceC10810xr1
    public final zzek Y0;

    public BaseAdView(@InterfaceC5670cr1 Context context, int i) {
        super(context);
        this.Y0 = new zzek(this, i);
    }

    public void a() {
        zzbcv.a(getContext());
        if (((Boolean) zzbet.e.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.ub)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.Y0.q();
                        } catch (IllegalStateException e) {
                            zzbui.c(baseAdView.getContext()).b(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.Y0.q();
    }

    public boolean b() {
        return this.Y0.a();
    }

    public boolean c() {
        return this.Y0.b();
    }

    @KS1("android.permission.INTERNET")
    public void d(@InterfaceC5670cr1 final AdRequest adRequest) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzbcv.a(getContext());
        if (((Boolean) zzbet.f.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.Y0.r(adRequest.a);
                        } catch (IllegalStateException e) {
                            zzbui.c(baseAdView.getContext()).b(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.Y0.r(adRequest.a);
    }

    public void e() {
        zzbcv.a(getContext());
        if (((Boolean) zzbet.g.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.vb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.Y0.s();
                        } catch (IllegalStateException e) {
                            zzbui.c(baseAdView.getContext()).b(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.Y0.s();
    }

    public void f() {
        zzbcv.a(getContext());
        if (((Boolean) zzbet.h.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.tb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.Y0.u();
                        } catch (IllegalStateException e) {
                            zzbui.c(baseAdView.getContext()).b(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.Y0.u();
    }

    @InterfaceC5670cr1
    public AdListener getAdListener() {
        return this.Y0.f();
    }

    @InterfaceC11300zs1
    public AdSize getAdSize() {
        return this.Y0.g();
    }

    @InterfaceC5670cr1
    public String getAdUnitId() {
        return this.Y0.o();
    }

    @InterfaceC11300zs1
    public OnPaidEventListener getOnPaidEventListener() {
        return this.Y0.h();
    }

    @InterfaceC11300zs1
    public ResponseInfo getResponseInfo() {
        return this.Y0.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AdSize adSize;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        } else {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzo.e("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int k = adSize.k(context);
                i3 = adSize.d(context);
                i4 = k;
            } else {
                i3 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(@InterfaceC5670cr1 AdListener adListener) {
        zzek zzekVar = this.Y0;
        zzekVar.w(adListener);
        if (adListener == null) {
            zzekVar.v(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzekVar.v((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzekVar.A((AppEventListener) adListener);
        }
    }

    public void setAdSize(@InterfaceC5670cr1 AdSize adSize) {
        this.Y0.x(adSize);
    }

    public void setAdUnitId(@InterfaceC5670cr1 String str) {
        this.Y0.z(str);
    }

    public void setOnPaidEventListener(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener) {
        this.Y0.C(onPaidEventListener);
    }

    public BaseAdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.Y0 = new zzek(this, attributeSet, false, i);
    }

    public BaseAdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.Y0 = new zzek(this, attributeSet, false, i2);
    }

    public BaseAdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.Y0 = new zzek(this, attributeSet, z, i2);
    }

    public BaseAdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.Y0 = new zzek(this, attributeSet, z);
    }
}
