package o;

import android.text.Html;
import android.text.Spanned;

/* renamed from: o.oI0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8479oI0 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 32;
    public static final int i = 256;
    public static final int j = 0;
    public static final int k = 63;

    /* renamed from: o.oI0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Spanned a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        public static Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        public static String c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    public static Spanned a(String str, int i2) {
        return a.a(str, i2);
    }

    public static Spanned b(String str, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return a.b(str, i2, imageGetter, tagHandler);
    }

    public static String c(Spanned spanned, int i2) {
        return a.c(spanned, i2);
    }
}
