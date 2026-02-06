package o;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.C8580oj;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* renamed from: o.hY1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6822hY1 {
    public static final long a = 86400000;
    public static final long b = 30000;
    public static final long c = 1000;
    public static final long d = 10000;

    /* renamed from: o.hY1$a */
    /* loaded from: classes2.dex */
    public static class a {
        public ND a;
        public Map<EnumC10429wH1, b> b = new HashMap();

        public a a(EnumC10429wH1 enumC10429wH1, b bVar) {
            this.b.put(enumC10429wH1, bVar);
            return this;
        }

        public AbstractC6822hY1 b() {
            if (this.a != null) {
                if (this.b.keySet().size() >= EnumC10429wH1.values().length) {
                    Map<EnumC10429wH1, b> map = this.b;
                    this.b = new HashMap();
                    return AbstractC6822hY1.d(this.a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public a c(ND nd) {
            this.a = nd;
            return this;
        }
    }

    @InterfaceC6615gi
    /* renamed from: o.hY1$b */
    /* loaded from: classes2.dex */
    public static abstract class b {

        @InterfaceC6615gi.a
        /* renamed from: o.hY1$b$a */
        /* loaded from: classes2.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set<c> set);

            public abstract a d(long j);
        }

        public static a a() {
            return new C8580oj.b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set<c> c();

        public abstract long d();
    }

    /* renamed from: o.hY1$c */
    /* loaded from: classes2.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static AbstractC6822hY1 d(ND nd, Map<EnumC10429wH1, b> map) {
        return new C8336nj(nd, map);
    }

    public static AbstractC6822hY1 f(ND nd) {
        return b().a(EnumC10429wH1.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(EnumC10429wH1.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(EnumC10429wH1.VERY_LOW, b.a().b(86400000L).d(86400000L).c(j(c.DEVICE_IDLE)).a()).c(nd).b();
    }

    public static <T> Set<T> j(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, i2) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2)));
    }

    @ES1(api = 21)
    public JobInfo.Builder c(JobInfo.Builder builder, EnumC10429wH1 enumC10429wH1, long j, int i) {
        builder.setMinimumLatency(h(enumC10429wH1, j, i));
        k(builder, i().get(enumC10429wH1).c());
        return builder;
    }

    public abstract ND e();

    public Set<c> g(EnumC10429wH1 enumC10429wH1) {
        return i().get(enumC10429wH1).c();
    }

    public long h(EnumC10429wH1 enumC10429wH1, long j, int i) {
        long a2 = j - e().a();
        b bVar = i().get(enumC10429wH1);
        return Math.min(Math.max(a(i, bVar.b()), a2), bVar.d());
    }

    public abstract Map<EnumC10429wH1, b> i();

    @ES1(api = 21)
    public final void k(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
