package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;
import o.D60;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zaaa extends Button {
    public zaaa(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    public static final int b(int i, int i2, int i3, int i4) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return i4;
                }
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown color scheme: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            return i3;
        }
        return i2;
    }

    public final void a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = R.drawable.b;
        int i5 = R.drawable.g;
        int b = b(i2, i4, i5, i5);
        int i6 = R.drawable.k;
        int i7 = R.drawable.p;
        int b2 = b(i2, i6, i7, i7);
        if (i != 0 && i != 1) {
            if (i != 2) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown button size: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            b = b2;
        }
        Drawable r = D60.r(resources.getDrawable(b));
        D60.o(r, resources.getColorStateList(R.color.k));
        D60.p(r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r);
        int i8 = R.color.a;
        int i9 = R.color.f;
        setTextColor((ColorStateList) Preconditions.r(resources.getColorStateList(b(i2, i8, i9, i9))));
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    setText((CharSequence) null);
                } else {
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("Unknown button size: ");
                    sb2.append(i);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                setText(resources.getString(R.string.q));
            }
        } else {
            setText(resources.getString(R.string.p));
        }
        setTransformationMethod(null);
        if (DeviceProperties.l(getContext())) {
            setGravity(19);
        }
    }
}
