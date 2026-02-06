package o;

import android.text.TextUtils;

@Deprecated
/* renamed from: o.bV  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5343bV {
    @Deprecated
    public static String[] a(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr.length != 0) {
            String[] strArr3 = new String[strArr.length + strArr2.length];
            System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
            System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
            return strArr3;
        }
        return strArr2;
    }

    @Deprecated
    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return C9811tl1.c + str + ") AND (" + str2 + C9811tl1.d;
    }
}
