package o;

import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.rp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9340rp0 {
    public final boolean a;
    public final boolean b;
    @Nullable
    public final C4972Zy1 c;
    @Nullable
    public final Long d;
    @Nullable
    public final Long e;
    @Nullable
    public final Long f;
    @Nullable
    public final Long g;
    @NotNull
    public final Map<AW0<?>, Object> h;

    public C9340rp0() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ C9340rp0 b(C9340rp0 c9340rp0, boolean z, boolean z2, C4972Zy1 c4972Zy1, Long l, Long l2, Long l3, Long l4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c9340rp0.a;
        }
        if ((i & 2) != 0) {
            z2 = c9340rp0.b;
        }
        if ((i & 4) != 0) {
            c4972Zy1 = c9340rp0.c;
        }
        if ((i & 8) != 0) {
            l = c9340rp0.d;
        }
        if ((i & 16) != 0) {
            l2 = c9340rp0.e;
        }
        if ((i & 32) != 0) {
            l3 = c9340rp0.f;
        }
        if ((i & 64) != 0) {
            l4 = c9340rp0.g;
        }
        Map<AW0<?>, Object> map2 = map;
        if ((i & 128) != 0) {
            map2 = c9340rp0.h;
        }
        Long l5 = l4;
        Map map3 = map2;
        Long l6 = l2;
        Long l7 = l3;
        return c9340rp0.a(z, z2, c4972Zy1, l, l6, l7, l5, map3);
    }

    @NotNull
    public final C9340rp0 a(boolean z, boolean z2, @Nullable C4972Zy1 c4972Zy1, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<AW0<?>, ? extends Object> map) {
        C6562gT0.p(map, "extras");
        return new C9340rp0(z, z2, c4972Zy1, l, l2, l3, l4, map);
    }

    @Nullable
    public final <T> T c(@NotNull AW0<? extends T> aw0) {
        C6562gT0.p(aw0, "type");
        Object obj = this.h.get(aw0);
        if (obj == null) {
            return null;
        }
        return (T) BW0.a(aw0, obj);
    }

    @Nullable
    public final Long d() {
        return this.e;
    }

    @NotNull
    public final Map<AW0<?>, Object> e() {
        return this.h;
    }

    @Nullable
    public final Long f() {
        return this.g;
    }

    @Nullable
    public final Long g() {
        return this.f;
    }

    @Nullable
    public final Long h() {
        return this.d;
    }

    @Nullable
    public final C4972Zy1 i() {
        return this.c;
    }

    public final boolean j() {
        return this.b;
    }

    public final boolean k() {
        return this.a;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        if (this.d != null) {
            arrayList.add("byteCount=" + this.d);
        }
        if (this.e != null) {
            arrayList.add("createdAt=" + this.e);
        }
        if (this.f != null) {
            arrayList.add("lastModifiedAt=" + this.f);
        }
        if (this.g != null) {
            arrayList.add("lastAccessedAt=" + this.g);
        }
        if (!this.h.isEmpty()) {
            arrayList.add("extras=" + this.h);
        }
        return C10662xF.p3(arrayList, C6566gU0.h, "FileMetadata(", C9811tl1.d, 0, null, null, 56, null);
    }

    public C9340rp0(boolean z, boolean z2, @Nullable C4972Zy1 c4972Zy1, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<AW0<?>, ? extends Object> map) {
        C6562gT0.p(map, "extras");
        this.a = z;
        this.b = z2;
        this.c = c4972Zy1;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = C8926q81.D0(map);
    }

    public /* synthetic */ C9340rp0(boolean z, boolean z2, C4972Zy1 c4972Zy1, Long l, Long l2, Long l3, Long l4, Map map, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : c4972Zy1, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : l4, (i & 128) != 0 ? C8926q81.z() : map);
    }
}
