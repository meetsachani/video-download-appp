package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbcv;
import o.InterfaceC11300zs1;
import o.JT;

/* loaded from: classes2.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    public final ImageButton Y0;
    public final zzah Z0;

    public zzu(Context context, zzt zztVar, @InterfaceC11300zs1 zzah zzahVar) {
        super(context);
        zzs zzsVar;
        this.Z0 = zzahVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.Y0 = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbb.b();
        int D = com.google.android.gms.ads.internal.util.client.zzf.D(context, zztVar.a);
        zzbb.b();
        int D2 = com.google.android.gms.ads.internal.util.client.zzf.D(context, 0);
        zzbb.b();
        int D3 = com.google.android.gms.ads.internal.util.client.zzf.D(context, zztVar.b);
        zzbb.b();
        imageButton.setPadding(D, D2, D3, com.google.android.gms.ads.internal.util.client.zzf.D(context, zztVar.c));
        imageButton.setContentDescription("Interstitial close button");
        zzbb.b();
        int D4 = com.google.android.gms.ads.internal.util.client.zzf.D(context, zztVar.d + zztVar.a + zztVar.b);
        zzbb.b();
        addView(imageButton, new FrameLayout.LayoutParams(D4, com.google.android.gms.ads.internal.util.client.zzf.D(context, zztVar.d + zztVar.c), 17));
        long longValue = ((Long) zzbd.c().b(zzbcv.p1)).longValue();
        if (longValue <= 0) {
            return;
        }
        if (((Boolean) zzbd.c().b(zzbcv.q1)).booleanValue()) {
            zzsVar = new zzs(this);
        } else {
            zzsVar = null;
        }
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzsVar);
    }

    public final void b(boolean z) {
        if (z) {
            ImageButton imageButton = this.Y0;
            imageButton.setVisibility(8);
            if (((Long) zzbd.c().b(zzbcv.p1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
                return;
            }
            return;
        }
        this.Y0.setVisibility(0);
    }

    public final void c() {
        String str = (String) zzbd.c().b(zzbcv.o1);
        if (PlatformVersion.j() && !TextUtils.isEmpty(str) && !JT.d.equals(str)) {
            Resources f = com.google.android.gms.ads.internal.zzv.t().f();
            if (f != null) {
                Drawable drawable = null;
                try {
                    if ("white".equals(str)) {
                        drawable = f.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                    } else if ("black".equals(str)) {
                        drawable = f.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                    }
                } catch (Resources.NotFoundException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Close button resource not found, falling back to default.");
                }
                if (drawable == null) {
                    this.Y0.setImageResource(17301527);
                    return;
                }
                ImageButton imageButton = this.Y0;
                imageButton.setImageDrawable(drawable);
                imageButton.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            this.Y0.setImageResource(17301527);
            return;
        }
        this.Y0.setImageResource(17301527);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzah zzahVar = this.Z0;
        if (zzahVar != null) {
            zzahVar.j();
        }
    }
}
