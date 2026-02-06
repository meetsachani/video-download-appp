package o;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

/* loaded from: classes.dex */
public final class GF {
    public static final ColorDrawable a(int i) {
        return new ColorDrawable(i);
    }

    public static final ColorDrawable b(Color color) {
        int argb;
        argb = color.toArgb();
        return new ColorDrawable(argb);
    }
}
