package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* loaded from: classes3.dex */
class InstallerPackageNameProvider {
    public static final String b = "";
    public String a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    public synchronized String a(Context context) {
        String str;
        try {
            if (this.a == null) {
                this.a = b(context);
            }
            if ("".equals(this.a)) {
                str = null;
            } else {
                str = this.a;
            }
        } finally {
        }
        return str;
    }
}
