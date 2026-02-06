package com.facebook.login;

import com.facebook.C0376a;
import com.facebook.C2381j;
import java.util.Set;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import o.InterfaceC8289nW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class J {
    @NotNull
    public final C0376a a;
    @Nullable
    public final C2381j b;
    @NotNull
    public final Set<String> c;
    @NotNull
    public final Set<String> d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8289nW0
    public J(@NotNull C0376a c0376a, @NotNull Set<String> set, @NotNull Set<String> set2) {
        this(c0376a, null, set, set2, 2, null);
        C6562gT0.p(c0376a, C9998uW1.m);
        C6562gT0.p(set, "recentlyGrantedPermissions");
        C6562gT0.p(set2, "recentlyDeniedPermissions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ J f(J j, C0376a c0376a, C2381j c2381j, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            c0376a = j.a;
        }
        if ((i & 2) != 0) {
            c2381j = j.b;
        }
        if ((i & 4) != 0) {
            set = j.c;
        }
        if ((i & 8) != 0) {
            set2 = j.d;
        }
        return j.e(c0376a, c2381j, set, set2);
    }

    @NotNull
    public final C0376a a() {
        return this.a;
    }

    @Nullable
    public final C2381j b() {
        return this.b;
    }

    @NotNull
    public final Set<String> c() {
        return this.c;
    }

    @NotNull
    public final Set<String> d() {
        return this.d;
    }

    @NotNull
    public final J e(@NotNull C0376a c0376a, @Nullable C2381j c2381j, @NotNull Set<String> set, @NotNull Set<String> set2) {
        C6562gT0.p(c0376a, C9998uW1.m);
        C6562gT0.p(set, "recentlyGrantedPermissions");
        C6562gT0.p(set2, "recentlyDeniedPermissions");
        return new J(c0376a, c2381j, set, set2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            J j = (J) obj;
            return C6562gT0.g(this.a, j.a) && C6562gT0.g(this.b, j.b) && C6562gT0.g(this.c, j.c) && C6562gT0.g(this.d, j.d);
        }
        return false;
    }

    @NotNull
    public final C0376a g() {
        return this.a;
    }

    @Nullable
    public final C2381j h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        C2381j c2381j = this.b;
        return ((((hashCode + (c2381j == null ? 0 : c2381j.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @NotNull
    public final Set<String> i() {
        return this.d;
    }

    @NotNull
    public final Set<String> j() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "LoginResult(accessToken=" + this.a + ", authenticationToken=" + this.b + ", recentlyGrantedPermissions=" + this.c + ", recentlyDeniedPermissions=" + this.d + ')';
    }

    @InterfaceC8289nW0
    public J(@NotNull C0376a c0376a, @Nullable C2381j c2381j, @NotNull Set<String> set, @NotNull Set<String> set2) {
        C6562gT0.p(c0376a, C9998uW1.m);
        C6562gT0.p(set, "recentlyGrantedPermissions");
        C6562gT0.p(set2, "recentlyDeniedPermissions");
        this.a = c0376a;
        this.b = c2381j;
        this.c = set;
        this.d = set2;
    }

    public /* synthetic */ J(C0376a c0376a, C2381j c2381j, Set set, Set set2, int i, C9516sY c9516sY) {
        this(c0376a, (i & 2) != 0 ? null : c2381j, set, set2);
    }
}
