package com.facebook.appevents;

import android.content.Context;
import com.facebook.internal.C2358c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.appevents.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2316f {
    @NotNull
    public final HashMap<C2311a, M> a = new HashMap<>();

    public final synchronized void a(@NotNull C2311a c2311a, @NotNull C2315e c2315e) {
        C6562gT0.p(c2311a, "accessTokenAppIdPair");
        C6562gT0.p(c2315e, "appEvent");
        M e = e(c2311a);
        if (e != null) {
            e.b(c2315e);
        }
    }

    public final synchronized void b(@Nullable L l) {
        if (l == null) {
            return;
        }
        for (Map.Entry<C2311a, List<C2315e>> entry : l.c()) {
            M e = e(entry.getKey());
            if (e != null) {
                for (C2315e c2315e : entry.getValue()) {
                    e.b(c2315e);
                }
            }
        }
    }

    @Nullable
    public final synchronized M c(@NotNull C2311a c2311a) {
        C6562gT0.p(c2311a, "accessTokenAppIdPair");
        return this.a.get(c2311a);
    }

    public final synchronized int d() {
        int i;
        i = 0;
        for (M m : this.a.values()) {
            i += m.d();
        }
        return i;
    }

    public final synchronized M e(C2311a c2311a) {
        M m = this.a.get(c2311a);
        if (m == null) {
            com.facebook.M m2 = com.facebook.M.a;
            Context n = com.facebook.M.n();
            C2358c f = C2358c.f.f(n);
            if (f != null) {
                m = new M(f, C2327q.b.f(n));
            }
        }
        if (m == null) {
            return null;
        }
        this.a.put(c2311a, m);
        return m;
    }

    @NotNull
    public final synchronized Set<C2311a> f() {
        Set<C2311a> keySet;
        keySet = this.a.keySet();
        C6562gT0.o(keySet, "stateMap.keys");
        return keySet;
    }
}
