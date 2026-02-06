package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbha;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class MediaView extends FrameLayout {
    @InterfaceC11300zs1
    public MediaContent Y0;
    public boolean Z0;
    public ImageView.ScaleType a1;
    public boolean b1;
    public zzb c1;
    public zzc d1;

    public MediaView(@InterfaceC5670cr1 Context context) {
        super(context);
    }

    public final synchronized void a(zzb zzbVar) {
        this.c1 = zzbVar;
        if (this.Z0) {
            NativeAdView.d(zzbVar.a, this.Y0);
        }
    }

    public final synchronized void b(zzc zzcVar) {
        this.d1 = zzcVar;
        if (this.b1) {
            NativeAdView.c(zzcVar.a, this.a1);
        }
    }

    @InterfaceC11300zs1
    public MediaContent getMediaContent() {
        return this.Y0;
    }

    public void setImageScaleType(@InterfaceC5670cr1 ImageView.ScaleType scaleType) {
        this.b1 = true;
        this.a1 = scaleType;
        zzc zzcVar = this.d1;
        if (zzcVar != null) {
            NativeAdView.c(zzcVar.a, scaleType);
        }
    }

    public void setMediaContent(@InterfaceC11300zs1 MediaContent mediaContent) {
        boolean O;
        this.Z0 = true;
        this.Y0 = mediaContent;
        zzb zzbVar = this.c1;
        if (zzbVar != null) {
            NativeAdView.d(zzbVar.a, mediaContent);
        }
        if (mediaContent != null) {
            try {
                zzbha a = mediaContent.a();
                if (a != null) {
                    if (mediaContent.c()) {
                        O = a.F0(ObjectWrapper.V3(this));
                    } else {
                        if (mediaContent.b()) {
                            O = a.O(ObjectWrapper.V3(this));
                        }
                        removeAllViews();
                    }
                    if (O) {
                        return;
                    }
                    removeAllViews();
                }
            } catch (RemoteException e) {
                removeAllViews();
                zzo.e("", e);
            }
        }
    }

    public MediaView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
