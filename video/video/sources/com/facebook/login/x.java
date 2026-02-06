package com.facebook.login;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC8289nW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class x {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    public static final String e = "openid";
    @NotNull
    public final Set<String> a;
    @NotNull
    public final String b;
    @NotNull
    public final String c;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    @InterfaceC8289nW0
    public x(@Nullable Collection<String> collection) {
        this(collection, null, 2, null);
    }

    @NotNull
    public final String a() {
        return this.c;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final Set<String> c() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x(Collection collection, String str, int i, C9516sY c9516sY) {
        this(collection, str);
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            C6562gT0.o(str, "randomUUID().toString()");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8289nW0
    public x(@Nullable Collection<String> collection, @NotNull String str) {
        this(collection, str, P.c());
        C6562gT0.p(str, "nonce");
        P p = P.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x(Collection collection, String str, String str2, int i, C9516sY c9516sY) {
        this(collection, str, str2);
        collection = (i & 1) != 0 ? null : collection;
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            C6562gT0.o(str, "randomUUID().toString()");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(@Nullable Collection<String> collection, @NotNull String str, @NotNull String str2) {
        boolean z;
        C6562gT0.p(str, "nonce");
        C6562gT0.p(str2, "codeVerifier");
        O o2 = O.a;
        if (O.a(str)) {
            P p = P.a;
            if (P.d(str2)) {
                z = true;
                if (!z) {
                    HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
                    hashSet.add("openid");
                    Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
                    C6562gT0.o(unmodifiableSet, "unmodifiableSet(permissions)");
                    this.a = unmodifiableSet;
                    this.b = str;
                    this.c = str2;
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        z = false;
        if (!z) {
        }
    }
}
