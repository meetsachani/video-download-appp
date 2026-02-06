package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.List;
import o.AbstractServiceC10718xT;
import o.C6562gT0;
import o.C7330jf;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.internal.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2364i {
    @NotNull
    public static final C2364i a = new C2364i();
    @NotNull
    public static final String[] b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    @InterfaceC9511sW0
    @Nullable
    public static final String a() {
        if (SQ.e(C2364i.class)) {
            return null;
        }
        try {
            com.facebook.M m = com.facebook.M.a;
            Context n = com.facebook.M.n();
            List<ResolveInfo> queryIntentServices = n.getPackageManager().queryIntentServices(new Intent(AbstractServiceC10718xT.Z), 0);
            C6562gT0.o(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            HashSet Ky = C7330jf.Ky(b);
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && Ky.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, C2364i.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String b() {
        if (SQ.e(C2364i.class)) {
            return null;
        }
        try {
            com.facebook.M m = com.facebook.M.a;
            return C6562gT0.C(m0.g, com.facebook.M.n().getPackageName());
        } catch (Throwable th) {
            SQ.c(th, C2364i.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String c(@NotNull String str) {
        if (SQ.e(C2364i.class)) {
            return null;
        }
        try {
            C6562gT0.p(str, "developerDefinedRedirectURI");
            m0 m0Var = m0.a;
            com.facebook.M m = com.facebook.M.a;
            if (m0.h(com.facebook.M.n(), str)) {
                return str;
            }
            if (m0.h(com.facebook.M.n(), b())) {
                return b();
            }
            return "";
        } catch (Throwable th) {
            SQ.c(th, C2364i.class);
            return null;
        }
    }
}
