package o;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: o.Tn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4339Tn extends AbstractC10695xN0<Bitmap> {
    public C4339Tn(ImageView imageView) {
        super(imageView);
    }

    @Override // o.AbstractC10695xN0
    /* renamed from: x */
    public void v(Bitmap bitmap) {
        ((ImageView) this.Y).setImageBitmap(bitmap);
    }

    @Deprecated
    public C4339Tn(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
