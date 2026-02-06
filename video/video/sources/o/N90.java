package o;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public final class N90 {
    public static final int a = 16777216;
    public static final int b = Integer.MIN_VALUE;
    public static final String[] c = new String[0];
    public static final String d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    public static final String e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    public static final String f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    public static final String g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    public static final String h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    public static final String i = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";
    public static final int j = 2048;
    public static final int k = 1024;

    /* loaded from: classes.dex */
    public static class a {
        public static CharSequence a(EditorInfo editorInfo, int i) {
            return editorInfo.getInitialSelectedText(i);
        }

        public static CharSequence b(EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }

        public static CharSequence c(EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        public static void d(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(EditorInfo editorInfo) {
            return editorInfo.isStylusHandwritingEnabled();
        }

        public static void b(EditorInfo editorInfo, boolean z) {
            editorInfo.setStylusHandwritingEnabled(z);
        }
    }

    public static String[] a(EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            if (strArr != null) {
                return strArr;
            }
            return c;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return c;
        }
        String[] stringArray = bundle.getStringArray(d);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(e);
        }
        if (stringArray != null) {
            return stringArray;
        }
        return c;
    }

    public static CharSequence b(EditorInfo editorInfo, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i2);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i3 = editorInfo.extras.getInt(g);
        int i4 = editorInfo.extras.getInt(h);
        int i5 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i4 - i3 != i5 || (charSequence = editorInfo.extras.getCharSequence(f)) == null) {
            return null;
        }
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3, i4);
        }
        return TextUtils.substring(charSequence, i3, i4);
    }

    public static CharSequence c(EditorInfo editorInfo, int i2, int i3) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i2, i3);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f)) == null) {
            return null;
        }
        int i4 = editorInfo.extras.getInt(h);
        int min = Math.min(i2, charSequence.length() - i4);
        if ((i3 & 1) != 0) {
            return charSequence.subSequence(i4, min + i4);
        }
        return TextUtils.substring(charSequence, i4, min + i4);
    }

    public static CharSequence d(EditorInfo editorInfo, int i2, int i3) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i2, i3);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f)) == null) {
            return null;
        }
        int i4 = editorInfo.extras.getInt(g);
        int min = Math.min(i2, i4);
        if ((i3 & 1) != 0) {
            return charSequence.subSequence(i4 - min, i4);
        }
        return TextUtils.substring(charSequence, i4 - min, i4);
    }

    public static int e(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey(d);
        boolean containsKey2 = editorInfo.extras.containsKey(e);
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        if (!containsKey2) {
            return 0;
        }
        return 2;
    }

    public static boolean f(CharSequence charSequence, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i2));
        }
        return Character.isLowSurrogate(charSequence.charAt(i2));
    }

    public static boolean g(int i2) {
        int i3 = i2 & 4095;
        if (i3 != 129 && i3 != 225 && i3 != 18) {
            return false;
        }
        return true;
    }

    public static boolean h(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        if (bundle != null && bundle.containsKey(i)) {
            return editorInfo.extras.getBoolean(i);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            return b.a(editorInfo);
        }
        return false;
    }

    public static void i(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(d, strArr);
        editorInfo.extras.putStringArray(e, strArr);
    }

    public static void j(EditorInfo editorInfo, CharSequence charSequence, int i2) {
        int i3;
        int i4;
        C10907yF1.l(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i2);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        if (i5 > i6) {
            i3 = i6 - i2;
        } else {
            i3 = i5 - i2;
        }
        if (i5 > i6) {
            i4 = i5 - i2;
        } else {
            i4 = i6 - i2;
        }
        int length = charSequence.length();
        if (i2 >= 0 && i3 >= 0 && i4 <= length) {
            if (g(editorInfo.inputType)) {
                m(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                m(editorInfo, charSequence, i3, i4);
                return;
            } else {
                n(editorInfo, charSequence, i3, i4);
                return;
            }
        }
        m(editorInfo, null, 0, 0);
    }

    public static void k(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            j(editorInfo, charSequence, 0);
        }
    }

    public static void l(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            b.b(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean(i, z);
    }

    public static void m(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence(f, spannableStringBuilder);
        editorInfo.extras.putInt(g, i2);
        editorInfo.extras.putInt(h, i3);
    }

    public static void n(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        int i4;
        CharSequence subSequence;
        int i5 = i3 - i2;
        if (i5 > 1024) {
            i4 = 0;
        } else {
            i4 = i5;
        }
        int i6 = 2048 - i4;
        int min = Math.min(charSequence.length() - i3, i6 - Math.min(i2, (int) (i6 * 0.8d)));
        int min2 = Math.min(i2, i6 - min);
        int i7 = i2 - min2;
        if (f(charSequence, i7, 0)) {
            i7++;
            min2--;
        }
        if (f(charSequence, (i3 + min) - 1, 1)) {
            min--;
        }
        int i8 = min2 + i4 + min;
        if (i4 != i5) {
            subSequence = TextUtils.concat(charSequence.subSequence(i7, i7 + min2), charSequence.subSequence(i3, min + i3));
        } else {
            subSequence = charSequence.subSequence(i7, i8 + i7);
        }
        m(editorInfo, subSequence, min2, i4 + min2);
    }
}
