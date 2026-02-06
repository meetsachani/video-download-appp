package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzbdf extends zzbdg {
    @InterfaceC11300zs1
    public static final String b(@InterfaceC11300zs1 String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 == 0) {
            if (length == str.length()) {
                return str;
            }
        } else {
            i = i2;
        }
        return str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final String a(@InterfaceC11300zs1 String str, String str2) {
        String b = b(str);
        String b2 = b(str2);
        if (TextUtils.isEmpty(b)) {
            return b2;
        }
        if (TextUtils.isEmpty(b2)) {
            return b;
        }
        return b + "," + b2;
    }
}
