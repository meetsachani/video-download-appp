package o;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import o.C9072qk1;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* renamed from: o.hk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6868hk1 {
    public static final int n = 128;
    @NotNull
    public final C6718h71 a;
    @NotNull
    public final C6718h71 b;
    @NotNull
    public final C6718h71 c;
    @NotNull
    public final C6718h71 d;
    @NotNull
    public final C6718h71 e;
    @NotNull
    public final C6718h71 f;
    @NotNull
    public final C6718h71 g;
    @NotNull
    public final C6718h71 h;
    @NotNull
    public final C6718h71 i;
    @NotNull
    public final C6718h71 j;
    @NotNull
    public final C6718h71 k;
    @NotNull
    public final Map<String, C6718h71> l;
    @NotNull
    public static final a m = new a(null);
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final Map<String, String> f763o = C8926q81.M(C6670gv2.a("embedding.weight", "embed.weight"), C6670gv2.a("dense1.weight", "fc1.weight"), C6670gv2.a("dense2.weight", "fc2.weight"), C6670gv2.a("dense3.weight", "fc3.weight"), C6670gv2.a("dense1.bias", "fc1.bias"), C6670gv2.a("dense2.bias", "fc2.bias"), C6670gv2.a("dense3.bias", "fc3.bias"));

    /* renamed from: o.hk1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @Nullable
        public final C6868hk1 a(@NotNull File file) {
            C6562gT0.p(file, "file");
            Map<String, C6718h71> b = b(file);
            if (b == null) {
                return null;
            }
            try {
                return new C6868hk1(b, null);
            } catch (Exception unused) {
                return null;
            }
        }

        public final Map<String, C6718h71> b(File file) {
            C6249fE2 c6249fE2 = C6249fE2.a;
            Map<String, C6718h71> c = C6249fE2.c(file);
            if (c == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map a = C6868hk1.a();
            for (Map.Entry<String, C6718h71> entry : c.entrySet()) {
                String key = entry.getKey();
                if (a.containsKey(entry.getKey()) && (key = (String) a.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(key, entry.getValue());
            }
            return hashMap;
        }

        public a() {
        }
    }

    public /* synthetic */ C6868hk1(Map map, C9516sY c9516sY) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (SQ.e(C6868hk1.class)) {
            return null;
        }
        try {
            return f763o;
        } catch (Throwable th) {
            SQ.c(th, C6868hk1.class);
            return null;
        }
    }

    @Nullable
    public final C6718h71 b(@NotNull C6718h71 c6718h71, @NotNull String[] strArr, @NotNull String str) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            C6562gT0.p(c6718h71, "dense");
            C6562gT0.p(strArr, "texts");
            C6562gT0.p(str, "task");
            C3786Nv1 c3786Nv1 = C3786Nv1.a;
            C6718h71 c = C3786Nv1.c(C3786Nv1.e(strArr, 128, this.a), this.b);
            C3786Nv1.a(c, this.e);
            C3786Nv1.i(c);
            C6718h71 c2 = C3786Nv1.c(c, this.c);
            C3786Nv1.a(c2, this.f);
            C3786Nv1.i(c2);
            C6718h71 g = C3786Nv1.g(c2, 2);
            C6718h71 c3 = C3786Nv1.c(g, this.d);
            C3786Nv1.a(c3, this.g);
            C3786Nv1.i(c3);
            C6718h71 g2 = C3786Nv1.g(c, c.b(1));
            C6718h71 g3 = C3786Nv1.g(g, g.b(1));
            C6718h71 g4 = C3786Nv1.g(c3, c3.b(1));
            C3786Nv1.f(g2, 1);
            C3786Nv1.f(g3, 1);
            C3786Nv1.f(g4, 1);
            C6718h71 d = C3786Nv1.d(C3786Nv1.b(new C6718h71[]{g2, g3, g4, c6718h71}), this.h, this.j);
            C3786Nv1.i(d);
            C6718h71 d2 = C3786Nv1.d(d, this.i, this.k);
            C3786Nv1.i(d2);
            C6718h71 c6718h712 = this.l.get(C6562gT0.C(str, ".weight"));
            C6718h71 c6718h713 = this.l.get(C6562gT0.C(str, ".bias"));
            if (c6718h712 != null && c6718h713 != null) {
                C6718h71 d3 = C3786Nv1.d(d2, c6718h712, c6718h713);
                C3786Nv1.j(d3);
                return d3;
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public C6868hk1(Map<String, C6718h71> map) {
        C6718h71 c6718h71 = map.get("embed.weight");
        if (c6718h71 != null) {
            this.a = c6718h71;
            C3786Nv1 c3786Nv1 = C3786Nv1.a;
            C6718h71 c6718h712 = map.get("convs.0.weight");
            if (c6718h712 != null) {
                this.b = C3786Nv1.l(c6718h712);
                C6718h71 c6718h713 = map.get("convs.1.weight");
                if (c6718h713 != null) {
                    this.c = C3786Nv1.l(c6718h713);
                    C6718h71 c6718h714 = map.get("convs.2.weight");
                    if (c6718h714 != null) {
                        this.d = C3786Nv1.l(c6718h714);
                        C6718h71 c6718h715 = map.get("convs.0.bias");
                        if (c6718h715 != null) {
                            this.e = c6718h715;
                            C6718h71 c6718h716 = map.get("convs.1.bias");
                            if (c6718h716 != null) {
                                this.f = c6718h716;
                                C6718h71 c6718h717 = map.get("convs.2.bias");
                                if (c6718h717 != null) {
                                    this.g = c6718h717;
                                    C6718h71 c6718h718 = map.get("fc1.weight");
                                    if (c6718h718 != null) {
                                        this.h = C3786Nv1.k(c6718h718);
                                        C6718h71 c6718h719 = map.get("fc2.weight");
                                        if (c6718h719 != null) {
                                            this.i = C3786Nv1.k(c6718h719);
                                            C6718h71 c6718h7110 = map.get("fc1.bias");
                                            if (c6718h7110 != null) {
                                                this.j = c6718h7110;
                                                C6718h71 c6718h7111 = map.get("fc2.bias");
                                                if (c6718h7111 != null) {
                                                    this.k = c6718h7111;
                                                    this.l = new HashMap();
                                                    for (String str : B22.u(C9072qk1.a.MTML_INTEGRITY_DETECT.g(), C9072qk1.a.MTML_APP_EVENT_PREDICTION.g())) {
                                                        String C = C6562gT0.C(str, ".weight");
                                                        String C2 = C6562gT0.C(str, ".bias");
                                                        C6718h71 c6718h7112 = map.get(C);
                                                        C6718h71 c6718h7113 = map.get(C2);
                                                        if (c6718h7112 != null) {
                                                            C3786Nv1 c3786Nv12 = C3786Nv1.a;
                                                            this.l.put(C, C3786Nv1.k(c6718h7112));
                                                        }
                                                        if (c6718h7113 != null) {
                                                            this.l.put(C2, c6718h7113);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
