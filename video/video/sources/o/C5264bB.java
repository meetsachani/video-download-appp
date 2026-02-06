package o;

import android.text.TextUtils;

/* renamed from: o.bB  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5264bB {
    public static final boolean a(CharSequence charSequence) {
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence);
    }
}
