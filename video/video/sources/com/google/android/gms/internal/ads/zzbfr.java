package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbfr extends RelativeLayout {
    public static final float[] Z0 = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    @InterfaceC11300zs1
    public AnimationDrawable Y0;

    public zzbfr(Context context, zzbfq zzbfqVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.r(zzbfqVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(Z0, null, null));
        shapeDrawable.getPaint().setColor(zzbfqVar.f());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbfqVar.g())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbfqVar.g());
            textView.setTextColor(zzbfqVar.d());
            textView.setTextSize(zzbfqVar.X7());
            com.google.android.gms.ads.internal.client.zzbb.b();
            int D = com.google.android.gms.ads.internal.util.client.zzf.D(context, 4);
            com.google.android.gms.ads.internal.client.zzbb.b();
            textView.setPadding(D, 0, com.google.android.gms.ads.internal.util.client.zzf.D(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzbft> Y7 = zzbfqVar.Y7();
        if (Y7 != null && Y7.size() > 1) {
            this.Y0 = new AnimationDrawable();
            for (zzbft zzbftVar : Y7) {
                try {
                    this.Y0.addFrame((Drawable) ObjectWrapper.o1(zzbftVar.e()), zzbfqVar.b());
                } catch (Exception e) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.Y0);
        } else if (Y7.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.o1(((zzbft) Y7.get(0)).e()));
            } catch (Exception e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.Y0;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
