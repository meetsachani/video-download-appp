package o;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: o.Ym2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4823Ym2 {
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static String b(String str) {
        return TextUtils.htmlEncode(str);
    }
}
