package o;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class I60 extends AbstractC10695xN0<Drawable> {
    public I60(ImageView imageView) {
        super(imageView);
    }

    @Override // o.AbstractC10695xN0
    /* renamed from: x */
    public void v(Drawable drawable) {
        ((ImageView) this.Y).setImageDrawable(drawable);
    }

    @Deprecated
    public I60(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
