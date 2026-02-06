package o;

import android.text.Spanned;
import android.text.SpannedString;

/* renamed from: o.va2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10254va2 {
    public static final /* synthetic */ <T> T[] a(Spanned spanned, int i, int i2) {
        C6562gT0.y(4, "T");
        return (T[]) spanned.getSpans(i, i2, Object.class);
    }

    public static /* synthetic */ Object[] b(Spanned spanned, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        C6562gT0.y(4, "T");
        return spanned.getSpans(i, i2, Object.class);
    }

    public static final Spanned c(CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
