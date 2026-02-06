package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zag {
    public final zad a;
    public int b;

    public zag(Uri uri, int i) {
        this.b = 0;
        this.a = new zad(uri);
        this.b = i;
    }

    public abstract void a(@InterfaceC11300zs1 Drawable drawable, boolean z, boolean z2, boolean z3);

    public final void b(Context context, zak zakVar, boolean z) {
        Drawable drawable;
        int i = this.b;
        if (i != 0) {
            drawable = context.getResources().getDrawable(i);
        } else {
            drawable = null;
        }
        a(drawable, z, false, false);
    }

    public final void c(Context context, Bitmap bitmap, boolean z) {
        Asserts.c(bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
