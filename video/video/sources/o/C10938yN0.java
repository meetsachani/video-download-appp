package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: o.yN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10938yN0 {
    public <Z> AbstractC7247jI2<ImageView, Z> a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C4339Tn(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new I60(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
