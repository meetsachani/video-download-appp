package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes.dex */
public final class JE1 {
    public static final PorterDuffColorFilter a(PorterDuff.Mode mode, int i) {
        return new PorterDuffColorFilter(i, mode);
    }

    public static final PorterDuffXfermode b(PorterDuff.Mode mode) {
        return new PorterDuffXfermode(mode);
    }
}
