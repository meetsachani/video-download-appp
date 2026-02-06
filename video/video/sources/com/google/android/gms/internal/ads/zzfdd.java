package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfdd {
    public static Bundle a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return new Bundle();
        }
        return bundle2;
    }

    public static void b(Bundle bundle, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void c(Bundle bundle, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void d(Bundle bundle, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void e(Bundle bundle, @InterfaceC11300zs1 String str, int i, boolean z) {
        if (z) {
            bundle.putInt(str, i);
        }
    }

    public static void f(Bundle bundle, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, boolean z) {
        if (z && str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void g(Bundle bundle, @InterfaceC11300zs1 String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }
}
