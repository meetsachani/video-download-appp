package com.facebook.messenger;

import java.util.Arrays;
import java.util.List;
import o.C3771Nr1;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class b {
    @NotNull
    public final a a;
    @NotNull
    public final String b;
    @NotNull
    public final String c;
    @NotNull
    public final List<String> d;

    /* loaded from: classes2.dex */
    public enum a {
        REPLY_FLOW,
        COMPOSE_FLOW,
        UNKNOWN;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public b(@NotNull a aVar, @NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        C6562gT0.p(aVar, "origin");
        C6562gT0.p(str, "threadToken");
        C6562gT0.p(str2, "metadata");
        C6562gT0.p(list, C3771Nr1.p.f560o);
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    @NotNull
    public final String a() {
        return this.c;
    }

    @NotNull
    public final a b() {
        return this.a;
    }

    @NotNull
    public final List<String> c() {
        return this.d;
    }

    @NotNull
    public final String d() {
        return this.b;
    }
}
