package com.facebook.bolts;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import o.C6562gT0;
import o.C8222nF;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.bolts.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2331c {
    @NotNull
    public final Uri a;
    @NotNull
    public final Uri b;
    @NotNull
    public final List<a> c;

    /* renamed from: com.facebook.bolts.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public final String a;
        @NotNull
        public final String b;
        @NotNull
        public final Uri c;
        @NotNull
        public final String d;

        public a(@NotNull String str, @NotNull String str2, @NotNull Uri uri, @NotNull String str3) {
            C6562gT0.p(str, "packageName");
            C6562gT0.p(str2, "className");
            C6562gT0.p(uri, "url");
            C6562gT0.p(str3, "appName");
            this.a = str;
            this.b = str2;
            this.c = uri;
            this.d = str3;
        }

        @NotNull
        public final String a() {
            return this.d;
        }

        @NotNull
        public final String b() {
            return this.b;
        }

        @NotNull
        public final String c() {
            return this.a;
        }

        @NotNull
        public final Uri d() {
            return this.c;
        }
    }

    public C2331c(@NotNull Uri uri, @Nullable List<a> list, @NotNull Uri uri2) {
        C6562gT0.p(uri, "sourceUrl");
        C6562gT0.p(uri2, "webUrl");
        this.a = uri;
        this.b = uri2;
        this.c = list == null ? C8222nF.H() : list;
    }

    @NotNull
    public final Uri a() {
        return this.a;
    }

    @NotNull
    public final List<a> b() {
        List<a> unmodifiableList = Collections.unmodifiableList(this.c);
        C6562gT0.o(unmodifiableList, "unmodifiableList(field)");
        return unmodifiableList;
    }

    @NotNull
    public final Uri c() {
        return this.b;
    }
}
