package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.login.C2388e;
import java.util.ArrayList;
import o.C10229vT;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.internal.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2363h {
    @NotNull
    public static final a b = new a(null);
    @NotNull
    public Uri a;

    /* renamed from: com.facebook.internal.h$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public Uri a(@NotNull String str, @Nullable Bundle bundle) {
            C6562gT0.p(str, "action");
            l0 l0Var = l0.a;
            c0 c0Var = c0.a;
            String b = c0.b();
            StringBuilder sb = new StringBuilder();
            com.facebook.M m = com.facebook.M.a;
            sb.append(com.facebook.M.B());
            sb.append("/dialog/");
            sb.append(str);
            return l0.g(b, sb.toString(), bundle);
        }

        public a() {
        }
    }

    public C2363h(@NotNull String str, @Nullable Bundle bundle) {
        Uri a2;
        C6562gT0.p(str, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        J[] valuesCustom = J.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (J j : valuesCustom) {
            arrayList.add(j.g());
        }
        if (arrayList.contains(str)) {
            l0 l0Var = l0.a;
            c0 c0Var = c0.a;
            a2 = l0.g(c0.g(), C6562gT0.C("/dialog/", str), bundle);
        } else {
            a2 = b.a(str, bundle);
        }
        this.a = a2;
    }

    @InterfaceC9511sW0
    @NotNull
    public static Uri a(@NotNull String str, @Nullable Bundle bundle) {
        if (SQ.e(C2363h.class)) {
            return null;
        }
        try {
            return b.a(str, bundle);
        } catch (Throwable th) {
            SQ.c(th, C2363h.class);
            return null;
        }
    }

    @NotNull
    public final Uri b() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean c(@NotNull Activity activity, @Nullable String str) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            C10229vT d = new C10229vT.i(C2388e.Y.b()).d();
            d.a.setPackage(str);
            try {
                d.t(activity, this.a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final void d(@NotNull Uri uri) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(uri, "<set-?>");
            this.a = uri;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
