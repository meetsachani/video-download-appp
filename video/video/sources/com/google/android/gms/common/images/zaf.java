package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zaf extends zag {
    public final WeakReference<ImageManager.OnImageLoadedListener> c;

    public zaf(ImageManager.OnImageLoadedListener onImageLoadedListener, Uri uri) {
        super(uri, 0);
        Asserts.c(onImageLoadedListener);
        this.c = new WeakReference<>(onImageLoadedListener);
    }

    @Override // com.google.android.gms.common.images.zag
    public final void a(@InterfaceC11300zs1 Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (!z2 && (onImageLoadedListener = this.c.get()) != null) {
            onImageLoadedListener.a(this.a.a, drawable, z3);
        }
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaf)) {
            return false;
        }
        zaf zafVar = (zaf) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = this.c.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = zafVar.c.get();
        if (onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.b(onImageLoadedListener2, onImageLoadedListener) && Objects.b(zafVar.a, this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.c(this.a);
    }
}
