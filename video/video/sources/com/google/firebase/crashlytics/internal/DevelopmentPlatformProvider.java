package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public class DevelopmentPlatformProvider {
    public static final String c = "Unity";
    public static final String d = "Flutter";
    public static final String e = "com.google.firebase.crashlytics.unity_version";
    public static final String f = "flutter_assets/NOTICES.Z";
    public final Context a;
    @InterfaceC11300zs1
    public DevelopmentPlatform b = null;

    /* loaded from: classes3.dex */
    public class DevelopmentPlatform {
        @InterfaceC11300zs1
        public final String a;
        @InterfaceC11300zs1
        public final String b;

        public DevelopmentPlatform() {
            int q = CommonUtils.q(DevelopmentPlatformProvider.this.a, DevelopmentPlatformProvider.e, "string");
            if (q == 0) {
                if (DevelopmentPlatformProvider.this.c(DevelopmentPlatformProvider.f)) {
                    this.a = DevelopmentPlatformProvider.d;
                    this.b = null;
                    Logger.f().k("Development platform is: Flutter");
                    return;
                }
                this.a = null;
                this.b = null;
                return;
            }
            this.a = DevelopmentPlatformProvider.c;
            String string = DevelopmentPlatformProvider.this.a.getResources().getString(q);
            this.b = string;
            Logger f = Logger.f();
            f.k("Unity Editor version is: " + string);
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.a = context;
    }

    public static boolean g(Context context) {
        if (CommonUtils.q(context, e, "string") != 0) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        if (this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @InterfaceC11300zs1
    public String d() {
        return f().a;
    }

    @InterfaceC11300zs1
    public String e() {
        return f().b;
    }

    public final DevelopmentPlatform f() {
        if (this.b == null) {
            this.b = new DevelopmentPlatform();
        }
        return this.b;
    }
}
