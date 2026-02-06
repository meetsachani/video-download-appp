package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zai;
import com.google.android.gms.internal.base.zaj;
import java.lang.ref.WeakReference;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zae extends zag {
    public final WeakReference<ImageView> c;

    public zae(ImageView imageView, int i) {
        super(Uri.EMPTY, i);
        Asserts.c(imageView);
        this.c = new WeakReference<>(imageView);
    }

    @Override // com.google.android.gms.common.images.zag
    public final void a(@InterfaceC11300zs1 Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = this.c.get();
        if (imageView != null) {
            if (!z2 && !z3 && (imageView instanceof zaj)) {
                zaj zajVar = (zaj) imageView;
                throw null;
            }
            boolean z4 = false;
            if (!z2 && !z) {
                z4 = true;
            }
            if (z4) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 != null) {
                    if (drawable2 instanceof zai) {
                        drawable2 = ((zai) drawable2).a();
                    }
                } else {
                    drawable2 = null;
                }
                drawable = new zai(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (!(imageView instanceof zaj)) {
                if (drawable != null && z4) {
                    ((zai) drawable).b(250);
                    return;
                }
                return;
            }
            zaj zajVar2 = (zaj) imageView;
            throw null;
        }
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = this.c.get();
        ImageView imageView2 = ((zae) obj).c.get();
        if (imageView2 != null && imageView != null && Objects.b(imageView2, imageView)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.c(imageView);
        this.c = new WeakReference<>(imageView);
    }
}
