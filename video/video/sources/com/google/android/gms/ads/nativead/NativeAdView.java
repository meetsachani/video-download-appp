package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbgk;
import o.HS1;
import o.InterfaceC10810xr1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class NativeAdView extends FrameLayout {
    @InterfaceC10810xr1
    public final FrameLayout Y0;
    @InterfaceC11300zs1
    @InterfaceC10810xr1
    public final zzbgk Z0;

    public NativeAdView(@InterfaceC5670cr1 Context context) {
        super(context);
        this.Y0 = e(context);
        this.Z0 = f();
    }

    public static /* synthetic */ void c(@InterfaceC5670cr1 NativeAdView nativeAdView, @InterfaceC5670cr1 ImageView.ScaleType scaleType) {
        zzbgk zzbgkVar = nativeAdView.Z0;
        if (zzbgkVar != null && scaleType != null) {
            try {
                zzbgkVar.L6(ObjectWrapper.V3(scaleType));
            } catch (RemoteException e) {
                zzo.e("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    public static /* synthetic */ void d(@InterfaceC5670cr1 NativeAdView nativeAdView, @InterfaceC5670cr1 MediaContent mediaContent) {
        zzbgk zzbgkVar = nativeAdView.Z0;
        if (zzbgkVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzez) {
                zzbgkVar.N5(((zzez) mediaContent).g());
            } else if (mediaContent == null) {
                zzbgkVar.N5(null);
            } else {
                zzo.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzo.e("Unable to call setMediaContent on delegate", e);
        }
    }

    public void a() {
        zzbgk zzbgkVar = this.Z0;
        if (zzbgkVar == null) {
            return;
        }
        try {
            zzbgkVar.c();
        } catch (RemoteException e) {
            zzo.e("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@InterfaceC5670cr1 View view, int i, @InterfaceC5670cr1 ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.Y0);
    }

    @InterfaceC11300zs1
    public final View b(@InterfaceC5670cr1 String str) {
        zzbgk zzbgkVar = this.Z0;
        if (zzbgkVar != null) {
            try {
                IObjectWrapper I = zzbgkVar.I(str);
                if (I != null) {
                    return (View) ObjectWrapper.o1(I);
                }
            } catch (RemoteException e) {
                zzo.e("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@InterfaceC5670cr1 View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.Y0;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        zzbgk zzbgkVar = this.Z0;
        if (zzbgkVar != null) {
            if (((Boolean) zzbd.c().b(zzbcv.Pb)).booleanValue()) {
                try {
                    zzbgkVar.L0(ObjectWrapper.V3(motionEvent));
                } catch (RemoteException e) {
                    zzo.e("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final FrameLayout e(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @InterfaceC11300zs1
    @HS1({"overlayFrame"})
    public final zzbgk f() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.Y0;
        return zzbb.a().j(frameLayout.getContext(), this, frameLayout);
    }

    public final void g(String str, @InterfaceC11300zs1 View view) {
        zzbgk zzbgkVar = this.Z0;
        if (zzbgkVar == null) {
            return;
        }
        try {
            zzbgkVar.C5(str, ObjectWrapper.V3(view));
        } catch (RemoteException e) {
            zzo.e("Unable to call setAssetView on delegate", e);
        }
    }

    @InterfaceC11300zs1
    public AdChoicesView getAdChoicesView() {
        View b = b("3011");
        if (b instanceof AdChoicesView) {
            return (AdChoicesView) b;
        }
        return null;
    }

    @InterfaceC11300zs1
    public final View getAdvertiserView() {
        return b("3005");
    }

    @InterfaceC11300zs1
    public final View getBodyView() {
        return b("3004");
    }

    @InterfaceC11300zs1
    public final View getCallToActionView() {
        return b("3002");
    }

    @InterfaceC11300zs1
    public final View getHeadlineView() {
        return b("3001");
    }

    @InterfaceC11300zs1
    public final View getIconView() {
        return b("3003");
    }

    @InterfaceC11300zs1
    public final View getImageView() {
        return b("3008");
    }

    @InterfaceC11300zs1
    public final MediaView getMediaView() {
        View b = b("3010");
        if (b instanceof MediaView) {
            return (MediaView) b;
        }
        if (b != null) {
            zzo.b("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    @InterfaceC11300zs1
    public final View getPriceView() {
        return b("3007");
    }

    @InterfaceC11300zs1
    public final View getStarRatingView() {
        return b("3009");
    }

    @InterfaceC11300zs1
    public final View getStoreView() {
        return b("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@InterfaceC5670cr1 View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbgk zzbgkVar = this.Z0;
        if (zzbgkVar == null) {
            return;
        }
        try {
            zzbgkVar.p2(ObjectWrapper.V3(view), i);
        } catch (RemoteException e) {
            zzo.e("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.Y0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@InterfaceC5670cr1 View view) {
        if (this.Y0 == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@InterfaceC11300zs1 AdChoicesView adChoicesView) {
        g("3011", adChoicesView);
    }

    public final void setAdvertiserView(@InterfaceC11300zs1 View view) {
        g("3005", view);
    }

    public final void setBodyView(@InterfaceC11300zs1 View view) {
        g("3004", view);
    }

    public final void setCallToActionView(@InterfaceC11300zs1 View view) {
        g("3002", view);
    }

    public final void setClickConfirmingView(@InterfaceC11300zs1 View view) {
        zzbgk zzbgkVar = this.Z0;
        if (zzbgkVar == null) {
            return;
        }
        try {
            zzbgkVar.P1(ObjectWrapper.V3(view));
        } catch (RemoteException e) {
            zzo.e("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(@InterfaceC11300zs1 View view) {
        g("3001", view);
    }

    public final void setIconView(@InterfaceC11300zs1 View view) {
        g("3003", view);
    }

    public final void setImageView(@InterfaceC11300zs1 View view) {
        g("3008", view);
    }

    public final void setMediaView(@InterfaceC11300zs1 MediaView mediaView) {
        g("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.a(new zzb(this));
        mediaView.b(new zzc(this));
    }

    public void setNativeAd(@InterfaceC5670cr1 NativeAd nativeAd) {
        zzbgk zzbgkVar = this.Z0;
        if (zzbgkVar == null) {
            return;
        }
        try {
            zzbgkVar.T6((IObjectWrapper) nativeAd.B());
        } catch (RemoteException e) {
            zzo.e("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(@InterfaceC11300zs1 View view) {
        g("3007", view);
    }

    public final void setStarRatingView(@InterfaceC11300zs1 View view) {
        g("3009", view);
    }

    public final void setStoreView(@InterfaceC11300zs1 View view) {
        g("3006", view);
    }

    public NativeAdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = e(context);
        this.Z0 = f();
    }

    public NativeAdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = e(context);
        this.Z0 = f();
    }

    @TargetApi(21)
    public NativeAdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Y0 = e(context);
        this.Z0 = f();
    }
}
