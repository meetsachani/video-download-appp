package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.a5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1264a5 extends LinearLayout {
    public final Bitmap A00;

    public C1264a5(C1673gi c1673gi, EnumC1281aM enumC1281aM) {
        super(c1673gi);
        this.A00 = YN.A01(YM.AD_CHOICE_ICON);
        c1673gi.A0F().AAz(enumC1281aM.name().toLowerCase(Locale.US));
        A00();
        setAdChoiceIcon(c1673gi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(XV.A0I, XV.A0I, XV.A0I, XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        YB.A0N(this, -859190839);
        YB.A0E(XV.A0C, this);
    }

    private void setAdChoiceIcon(C1673gi c1673gi) {
        ImageView imageView = new ImageView(c1673gi);
        YB.A0K(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, XV.A0U));
        addView(imageView);
    }
}
