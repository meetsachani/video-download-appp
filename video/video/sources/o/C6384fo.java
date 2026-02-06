package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: o.fo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6384fo extends AbstractC9581so2<Bitmap> {
    public C6384fo(ImageView imageView) {
        super(imageView);
    }

    @Override // o.AbstractC9581so2
    /* renamed from: y */
    public Drawable x(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.Y).getResources(), bitmap);
    }

    @Deprecated
    public C6384fo(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
