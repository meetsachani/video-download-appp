package o;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: o.so2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9581so2<T> extends AbstractC10695xN0<T> {
    public AbstractC9581so2(ImageView imageView) {
        super(imageView);
    }

    @Override // o.AbstractC10695xN0
    public void v(T t) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.Y).getLayoutParams();
        Drawable x = x(t);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            x = new C11064yu0(x, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.Y).setImageDrawable(x);
    }

    public abstract Drawable x(T t);

    @Deprecated
    public AbstractC9581so2(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
