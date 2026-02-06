package o;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import o.C8843po;

/* renamed from: o.no  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8356no {

    /* renamed from: o.no$a */
    /* loaded from: classes.dex */
    public static class a {
        public static ColorFilter a(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }

    public static ColorFilter a(int i, EnumC8600oo enumC8600oo) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a2 = C8843po.b.a(enumC8600oo);
            if (a2 == null) {
                return null;
            }
            return a.a(i, a2);
        }
        PorterDuff.Mode a3 = C8843po.a(enumC8600oo);
        if (a3 == null) {
            return null;
        }
        return new PorterDuffColorFilter(i, a3);
    }
}
