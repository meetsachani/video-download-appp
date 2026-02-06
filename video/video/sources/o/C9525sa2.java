package o;

import android.text.Spannable;
import android.text.SpannableString;

/* renamed from: o.sa2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9525sa2 {
    public static final void a(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void b(Spannable spannable, int i, int i2, Object obj) {
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final void c(Spannable spannable, C11197zR0 c11197zR0, Object obj) {
        spannable.setSpan(obj, c11197zR0.d().intValue(), c11197zR0.h().intValue(), 17);
    }

    public static final Spannable d(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }
}
