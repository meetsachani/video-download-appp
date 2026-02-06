package o;

import android.text.Html;
import android.text.Spanned;

/* renamed from: o.qI0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8965qI0 {
    public static final Spanned a(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return C8479oI0.b(str, i, imageGetter, tagHandler);
    }

    public static /* synthetic */ Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        return C8479oI0.b(str, i, imageGetter, tagHandler);
    }

    public static final String c(Spanned spanned, int i) {
        return C8479oI0.c(spanned, i);
    }

    public static /* synthetic */ String d(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return C8479oI0.c(spanned, i);
    }
}
