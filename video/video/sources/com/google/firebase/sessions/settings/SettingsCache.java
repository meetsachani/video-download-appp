package com.google.firebase.sessions.settings;

import o.AG1;
import o.AbstractC10668xG1;
import o.AbstractC4225Si2;
import o.C11154zG1;
import o.C4467Uv0;
import o.C5668cr;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.C9516sY;
import o.FV;
import o.HM;
import o.InterfaceC3882Ov0;
import o.InterfaceC5056aJ2;
import o.InterfaceC9974uQ;
import o.PU;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SettingsCache {
    @Deprecated
    @NotNull
    public static final String d = "SettingsCache";
    @NotNull
    public final PU<AbstractC10668xG1> a;
    public SessionConfigs b;
    @NotNull
    public static final Companion c = new Companion(null);
    @Deprecated
    @NotNull
    public static final AbstractC10668xG1.a<Boolean> e = C11154zG1.a(LocalOverrideSettings.c);
    @Deprecated
    @NotNull
    public static final AbstractC10668xG1.a<Double> f = C11154zG1.b(LocalOverrideSettings.e);
    @Deprecated
    @NotNull
    public static final AbstractC10668xG1.a<Integer> g = C11154zG1.d("firebase_sessions_restart_timeout");
    @Deprecated
    @NotNull
    public static final AbstractC10668xG1.a<Integer> h = C11154zG1.d("firebase_sessions_cache_duration");
    @Deprecated
    @NotNull
    public static final AbstractC10668xG1.a<Long> i = C11154zG1.e("firebase_sessions_cache_updated_time");

    @FV(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public int a1;

        public AnonymousClass1(HM<? super AnonymousClass1> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            SettingsCache settingsCache;
            Object l = C7289jT0.l();
            int i = this.a1;
            if (i != 0) {
                if (i == 1) {
                    settingsCache = (SettingsCache) this.Z0;
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                InterfaceC3882Ov0 data = settingsCache2.a.getData();
                this.Z0 = settingsCache2;
                this.a1 = 1;
                Object u0 = C4467Uv0.u0(data, this);
                if (u0 == l) {
                    return l;
                }
                settingsCache = settingsCache2;
                obj = u0;
            }
            settingsCache.r(((AbstractC10668xG1) obj).e());
            return C7458kA2.a;
        }

        @Override // o.VA0
        @Nullable
        /* renamed from: U */
        public final Object i(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable HM<? super C7458kA2> hm) {
            return ((AnonymousClass1) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        @NotNull
        public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
            return new AnonymousClass1(hm);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final AbstractC10668xG1.a<Integer> a() {
            return SettingsCache.h;
        }

        @NotNull
        public final AbstractC10668xG1.a<Long> b() {
            return SettingsCache.i;
        }

        @NotNull
        public final AbstractC10668xG1.a<Integer> c() {
            return SettingsCache.g;
        }

        @NotNull
        public final AbstractC10668xG1.a<Double> d() {
            return SettingsCache.f;
        }

        @NotNull
        public final AbstractC10668xG1.a<Boolean> e() {
            return SettingsCache.e;
        }

        private Companion() {
        }
    }

    public SettingsCache(@NotNull PU<AbstractC10668xG1> pu) {
        C6562gT0.p(pu, "dataStore");
        this.a = pu;
        C5668cr.b(null, new AnonymousClass1(null), 1, null);
    }

    public final boolean i() {
        SessionConfigs sessionConfigs = this.b;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            C6562gT0.S("sessionConfigs");
            sessionConfigs = null;
        }
        Long i2 = sessionConfigs.i();
        SessionConfigs sessionConfigs3 = this.b;
        if (sessionConfigs3 == null) {
            C6562gT0.S("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer h2 = sessionConfigs2.h();
        if (i2 != null && h2 != null && (System.currentTimeMillis() - i2.longValue()) / 1000 < h2.intValue()) {
            return false;
        }
        return true;
    }

    @InterfaceC5056aJ2
    @Nullable
    public final Object j(@NotNull HM<? super C7458kA2> hm) {
        Object a = AG1.a(this.a, new SettingsCache$removeConfigs$2(this, null), hm);
        if (a == C7289jT0.l()) {
            return a;
        }
        return C7458kA2.a;
    }

    @Nullable
    public final Integer k() {
        SessionConfigs sessionConfigs = this.b;
        if (sessionConfigs == null) {
            C6562gT0.S("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.k();
    }

    @Nullable
    public final Double l() {
        SessionConfigs sessionConfigs = this.b;
        if (sessionConfigs == null) {
            C6562gT0.S("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.l();
    }

    @Nullable
    public final Boolean m() {
        SessionConfigs sessionConfigs = this.b;
        if (sessionConfigs == null) {
            C6562gT0.S("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.j();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        android.util.Log.w(com.google.firebase.sessions.settings.SettingsCache.d, "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object n(AbstractC10668xG1.a<T> aVar, T t, HM<? super C7458kA2> hm) {
        SettingsCache$updateConfigValue$1 settingsCache$updateConfigValue$1;
        int i2;
        if (hm instanceof SettingsCache$updateConfigValue$1) {
            settingsCache$updateConfigValue$1 = (SettingsCache$updateConfigValue$1) hm;
            int i3 = settingsCache$updateConfigValue$1.a1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                settingsCache$updateConfigValue$1.a1 = i3 - Integer.MIN_VALUE;
                Object obj = settingsCache$updateConfigValue$1.Y0;
                Object l = C7289jT0.l();
                i2 = settingsCache$updateConfigValue$1.a1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    PU<AbstractC10668xG1> pu = this.a;
                    SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(t, aVar, this, null);
                    settingsCache$updateConfigValue$1.a1 = 1;
                    if (AG1.a(pu, settingsCache$updateConfigValue$2, settingsCache$updateConfigValue$1) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }
        }
        settingsCache$updateConfigValue$1 = new SettingsCache$updateConfigValue$1(this, hm);
        Object obj2 = settingsCache$updateConfigValue$1.Y0;
        Object l2 = C7289jT0.l();
        i2 = settingsCache$updateConfigValue$1.a1;
        if (i2 == 0) {
        }
        return C7458kA2.a;
    }

    @Nullable
    public final Object o(@Nullable Double d2, @NotNull HM<? super C7458kA2> hm) {
        Object n = n(f, d2, hm);
        if (n == C7289jT0.l()) {
            return n;
        }
        return C7458kA2.a;
    }

    @Nullable
    public final Object p(@Nullable Integer num, @NotNull HM<? super C7458kA2> hm) {
        Object n = n(h, num, hm);
        if (n == C7289jT0.l()) {
            return n;
        }
        return C7458kA2.a;
    }

    @Nullable
    public final Object q(@Nullable Long l, @NotNull HM<? super C7458kA2> hm) {
        Object n = n(i, l, hm);
        if (n == C7289jT0.l()) {
            return n;
        }
        return C7458kA2.a;
    }

    public final void r(AbstractC10668xG1 abstractC10668xG1) {
        this.b = new SessionConfigs((Boolean) abstractC10668xG1.c(e), (Double) abstractC10668xG1.c(f), (Integer) abstractC10668xG1.c(g), (Integer) abstractC10668xG1.c(h), (Long) abstractC10668xG1.c(i));
    }

    @Nullable
    public final Object s(@Nullable Integer num, @NotNull HM<? super C7458kA2> hm) {
        Object n = n(g, num, hm);
        if (n == C7289jT0.l()) {
            return n;
        }
        return C7458kA2.a;
    }

    @Nullable
    public final Object t(@Nullable Boolean bool, @NotNull HM<? super C7458kA2> hm) {
        Object n = n(e, bool, hm);
        if (n == C7289jT0.l()) {
            return n;
        }
        return C7458kA2.a;
    }
}
