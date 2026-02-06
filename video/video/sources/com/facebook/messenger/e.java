package com.facebook.messenger;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
import o.C10662xF;
import o.C10977yY;
import o.C4128Rj1;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class e {
    @NotNull
    public static final a e = new a(null);
    @NotNull
    public static final Set<String> f;
    @NotNull
    public static final Set<String> g;
    @NotNull
    public static final Set<String> h;
    @NotNull
    public final Uri a;
    @NotNull
    public final String b;
    @Nullable
    public final String c;
    @Nullable
    public final Uri d;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final Set<String> a() {
            return e.h;
        }

        @NotNull
        public final Set<String> b() {
            return e.g;
        }

        @NotNull
        public final Set<String> c() {
            return e.f;
        }

        @InterfaceC9511sW0
        @NotNull
        public final f d(@NotNull Uri uri, @NotNull String str) {
            C6562gT0.p(uri, "uri");
            C6562gT0.p(str, "mimeType");
            return new f(uri, str);
        }

        public a() {
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("image/*");
        hashSet.add(C4128Rj1.R0);
        hashSet.add(C4128Rj1.P0);
        hashSet.add("image/gif");
        hashSet.add(C4128Rj1.Q0);
        hashSet.add("video/*");
        hashSet.add(C4128Rj1.f);
        hashSet.add("audio/*");
        hashSet.add(C4128Rj1.I);
        g = C10662xF.d6(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add("content");
        hashSet2.add(C10977yY.t);
        hashSet2.add("file");
        f = C10662xF.d6(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("http");
        hashSet3.add("https");
        h = C10662xF.d6(hashSet3);
    }

    public e(@NotNull f fVar) {
        C6562gT0.p(fVar, "builder");
        Uri e2 = fVar.e();
        if (e2 != null) {
            this.a = e2;
            String d = fVar.d();
            if (d != null) {
                this.b = d;
                this.c = fVar.c();
                Uri b = fVar.b();
                this.d = b;
                if (C10662xF.Y1(f, e2.getScheme())) {
                    if (g.contains(d)) {
                        if (b != null && !C10662xF.Y1(h, b.getScheme())) {
                            throw new IllegalArgumentException(C6562gT0.C("Unsupported external uri scheme: ", d().getScheme()).toString());
                        }
                        return;
                    }
                    throw new IllegalArgumentException(C6562gT0.C("Unsupported mime-type: ", f()).toString());
                }
                throw new IllegalArgumentException(C6562gT0.C("Unsupported URI scheme: ", g().getScheme()).toString());
            }
            throw new IllegalStateException("Must provide mimeType");
        }
        throw new IllegalStateException("Must provide non-null uri");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final f h(@NotNull Uri uri, @NotNull String str) {
        return e.d(uri, str);
    }

    @Nullable
    public final Uri d() {
        return this.d;
    }

    @Nullable
    public final String e() {
        return this.c;
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    @NotNull
    public final Uri g() {
        return this.a;
    }
}
