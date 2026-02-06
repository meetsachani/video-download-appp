package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class DC0 {
    @NotNull
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, CC0>> a = new ConcurrentHashMap<>();

    public static /* synthetic */ List b(DC0 dc0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            com.facebook.M m = com.facebook.M.a;
            str = com.facebook.M.o();
        }
        return dc0.a(str);
    }

    public static /* synthetic */ CC0 d(DC0 dc0, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            com.facebook.M m = com.facebook.M.a;
            str = com.facebook.M.o();
        }
        return dc0.c(str, str2);
    }

    public static /* synthetic */ boolean f(DC0 dc0, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            com.facebook.M m = com.facebook.M.a;
            str = com.facebook.M.o();
        }
        return dc0.e(str, str2, z);
    }

    public static /* synthetic */ void h(DC0 dc0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            com.facebook.M m = com.facebook.M.a;
            str = com.facebook.M.o();
        }
        dc0.g(str);
    }

    public static /* synthetic */ void j(DC0 dc0, String str, CC0 cc0, int i, Object obj) {
        if ((i & 1) != 0) {
            com.facebook.M m = com.facebook.M.a;
            str = com.facebook.M.o();
        }
        dc0.i(str, cc0);
    }

    public static /* synthetic */ void l(DC0 dc0, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            com.facebook.M m = com.facebook.M.a;
            str = com.facebook.M.o();
        }
        dc0.k(str, str2, z);
    }

    public static /* synthetic */ void n(DC0 dc0, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            com.facebook.M m = com.facebook.M.a;
            str = com.facebook.M.o();
        }
        dc0.m(str, list);
    }

    @Nullable
    public final List<CC0> a(@NotNull String str) {
        C6562gT0.p(str, RemoteConfigConstants.RequestFieldKey.W);
        ConcurrentHashMap<String, CC0> concurrentHashMap = this.a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry<String, CC0> entry : concurrentHashMap.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    @Nullable
    public final CC0 c(@NotNull String str, @NotNull String str2) {
        C6562gT0.p(str, RemoteConfigConstants.RequestFieldKey.W);
        C6562gT0.p(str2, "name");
        ConcurrentHashMap<String, CC0> concurrentHashMap = this.a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(str2);
    }

    public final boolean e(@NotNull String str, @NotNull String str2, boolean z) {
        C6562gT0.p(str, RemoteConfigConstants.RequestFieldKey.W);
        C6562gT0.p(str2, "name");
        CC0 c = c(str, str2);
        if (c == null) {
            return z;
        }
        return c.f();
    }

    public final void g(@NotNull String str) {
        C6562gT0.p(str, RemoteConfigConstants.RequestFieldKey.W);
        this.a.remove(str);
    }

    public final void i(@NotNull String str, @NotNull CC0 cc0) {
        C6562gT0.p(str, RemoteConfigConstants.RequestFieldKey.W);
        C6562gT0.p(cc0, "gateKeeper");
        if (!this.a.containsKey(str)) {
            this.a.put(str, new ConcurrentHashMap<>());
        }
        ConcurrentHashMap<String, CC0> concurrentHashMap = this.a.get(str);
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.put(cc0.e(), cc0);
    }

    public final void k(@NotNull String str, @NotNull String str2, boolean z) {
        C6562gT0.p(str, RemoteConfigConstants.RequestFieldKey.W);
        C6562gT0.p(str2, "name");
        i(str, new CC0(str2, z));
    }

    public final void m(@NotNull String str, @NotNull List<CC0> list) {
        C6562gT0.p(str, RemoteConfigConstants.RequestFieldKey.W);
        C6562gT0.p(list, "gateKeeperList");
        ConcurrentHashMap<String, CC0> concurrentHashMap = new ConcurrentHashMap<>();
        for (CC0 cc0 : list) {
            concurrentHashMap.put(cc0.e(), cc0);
        }
        this.a.put(str, concurrentHashMap);
    }
}
