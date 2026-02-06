package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.Z;
import com.facebook.internal.a0;
import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class K extends a0 {
    @NotNull
    public static final a i1 = new a(null);
    public static final long j1 = 5000;
    @NotNull
    public final String f1;
    @NotNull
    public final String g1;
    public final long h1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final K a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @Nullable String str4) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "applicationId");
            C6562gT0.p(str2, "loggerRef");
            C6562gT0.p(str3, "graphApiVersion");
            return new K(context, str, str2, str3, j, str4);
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @Nullable String str4) {
        super(context, Z.f0, Z.g0, Z.D, str, str4);
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "applicationId");
        C6562gT0.p(str2, "loggerRef");
        C6562gT0.p(str3, "graphApiVersion");
        this.f1 = str2;
        this.g1 = str3;
        this.h1 = j;
    }

    @Override // com.facebook.internal.a0
    public void f(@NotNull Bundle bundle) {
        C6562gT0.p(bundle, "data");
        bundle.putString(Z.u0, this.f1);
        bundle.putString(Z.w0, this.g1);
        bundle.putLong(Z.v0, this.h1);
    }
}
