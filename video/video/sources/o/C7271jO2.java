package o;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.jO2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7271jO2 {
    @NotNull
    public final C4972Zy1 a;
    public final boolean b;
    @NotNull
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    @Nullable
    public final Long h;
    public final long i;
    @NotNull
    public final List<C4972Zy1> j;

    public C7271jO2(@NotNull C4972Zy1 c4972Zy1, boolean z, @NotNull String str, long j, long j2, long j3, int i, @Nullable Long l, long j4) {
        C6562gT0.p(c4972Zy1, "canonicalPath");
        C6562gT0.p(str, "comment");
        this.a = c4972Zy1;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = l;
        this.i = j4;
        this.j = new ArrayList();
    }

    @NotNull
    public final C4972Zy1 a() {
        return this.a;
    }

    @NotNull
    public final List<C4972Zy1> b() {
        return this.j;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.e;
    }

    public final int e() {
        return this.g;
    }

    public final long f() {
        return this.d;
    }

    @Nullable
    public final Long g() {
        return this.h;
    }

    public final long h() {
        return this.i;
    }

    public final long i() {
        return this.f;
    }

    public final boolean j() {
        return this.b;
    }

    public /* synthetic */ C7271jO2(C4972Zy1 c4972Zy1, boolean z, String str, long j, long j2, long j3, int i, Long l, long j4, int i2, C9516sY c9516sY) {
        this(c4972Zy1, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? -1L : j, (i2 & 16) != 0 ? -1L : j2, (i2 & 32) != 0 ? -1L : j3, (i2 & 64) != 0 ? -1 : i, (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? -1L : j4);
    }
}
