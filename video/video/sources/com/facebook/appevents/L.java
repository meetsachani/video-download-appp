package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C10662xF;
import o.C6562gT0;
import o.C9516sY;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class L implements Serializable {
    @NotNull
    public static final a Y = new a(null);
    private static final long serialVersionUID = 20160629001L;
    @NotNull
    public final HashMap<C2311a, List<C2315e>> X;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Serializable {
        @NotNull
        public static final a Y = new a(null);
        private static final long serialVersionUID = 20160629001L;
        @NotNull
        public final HashMap<C2311a, List<C2315e>> X;

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public a() {
            }
        }

        public b(@NotNull HashMap<C2311a, List<C2315e>> hashMap) {
            C6562gT0.p(hashMap, "proxyEvents");
            this.X = hashMap;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new L(this.X);
        }
    }

    public L() {
        this.X = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return new b(this.X);
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void a(@NotNull C2311a c2311a, @NotNull List<C2315e> list) {
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(c2311a, "accessTokenAppIdPair");
                C6562gT0.p(list, "appEvents");
                if (!this.X.containsKey(c2311a)) {
                    this.X.put(c2311a, C10662xF.b6(list));
                    return;
                }
                List<C2315e> list2 = this.X.get(c2311a);
                if (list2 == null) {
                    return;
                }
                list2.addAll(list);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final boolean b(@NotNull C2311a c2311a) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            C6562gT0.p(c2311a, "accessTokenAppIdPair");
            return this.X.containsKey(c2311a);
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    @NotNull
    public final Set<Map.Entry<C2311a, List<C2315e>>> c() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            Set<Map.Entry<C2311a, List<C2315e>>> entrySet = this.X.entrySet();
            C6562gT0.o(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @Nullable
    public final List<C2315e> d(@NotNull C2311a c2311a) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            C6562gT0.p(c2311a, "accessTokenAppIdPair");
            return this.X.get(c2311a);
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @NotNull
    public final Set<C2311a> e() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            Set<C2311a> keySet = this.X.keySet();
            C6562gT0.o(keySet, "events.keys");
            return keySet;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public L(@NotNull HashMap<C2311a, List<C2315e>> hashMap) {
        C6562gT0.p(hashMap, "appEventMap");
        HashMap<C2311a, List<C2315e>> hashMap2 = new HashMap<>();
        this.X = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
