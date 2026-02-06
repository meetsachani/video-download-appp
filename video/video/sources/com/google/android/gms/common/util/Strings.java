package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;
import o.InterfaceC11300zs1;
import o.InterfaceC8800pd0;

@KeepForSdk
/* loaded from: classes2.dex */
public class Strings {
    public static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static String a(@InterfaceC11300zs1 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @InterfaceC8800pd0(expression = {"#1"}, result = false)
    @KeepForSdk
    public static boolean b(@InterfaceC11300zs1 String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
