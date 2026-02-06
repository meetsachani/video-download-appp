package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: o.Dp2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2774Dp2 extends CT1 {
    public final WeakReference<Context> b;

    public C2774Dp2(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // o.CT1, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable a = a(i);
        Context context = this.b.get();
        if (a != null && context != null) {
            C9010qT1.h().x(context, i, a);
        }
        return a;
    }
}
