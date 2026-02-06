package com.google.firebase.sessions.settings;

import android.content.Context;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import com.google.firebase.sessions.SessionEvents;
import o.AbstractC10668xG1;
import o.C6223f80;
import o.C6551gQ1;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.C9450sG1;
import o.C9516sY;
import o.EnumC6964i80;
import o.HM;
import o.InterfaceC11186zO1;
import o.InterfaceC5809dQ;
import o.JJ1;
import o.PU;
import o.RT1;
import o.TW0;
import o.Y70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SessionsSettings {
    @NotNull
    public static final Companion c = new Companion(null);
    @NotNull
    public static final InterfaceC11186zO1<Context, PU<AbstractC10668xG1>> d = C9450sG1.b(SessionDataStoreConfigs.a.b(), null, null, null, 14, null);
    @NotNull
    public final SettingsProvider a;
    @NotNull
    public final SettingsProvider b;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ TW0<Object>[] a = {C6551gQ1.v(new JJ1(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        public final PU<AbstractC10668xG1> b(Context context) {
            return (PU) SessionsSettings.d.a(context, a[0]);
        }

        @NotNull
        public final SessionsSettings c() {
            Object l = FirebaseKt.c(Firebase.a).l(SessionsSettings.class);
            C6562gT0.o(l, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) l;
        }

        private Companion() {
        }
    }

    public SessionsSettings(@NotNull SettingsProvider settingsProvider, @NotNull SettingsProvider settingsProvider2) {
        C6562gT0.p(settingsProvider, "localOverrideSettings");
        C6562gT0.p(settingsProvider2, "remoteSettings");
        this.a = settingsProvider;
        this.b = settingsProvider2;
    }

    public final double b() {
        Double c2 = this.a.c();
        if (c2 != null) {
            double doubleValue = c2.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double c3 = this.b.c();
        if (c3 != null) {
            double doubleValue2 = c3.doubleValue();
            if (e(doubleValue2)) {
                return doubleValue2;
            }
            return 1.0d;
        }
        return 1.0d;
    }

    public final long c() {
        Y70 b = this.a.b();
        if (b != null) {
            long n0 = b.n0();
            if (f(n0)) {
                return n0;
            }
        }
        Y70 b2 = this.b.b();
        if (b2 != null) {
            long n02 = b2.n0();
            if (f(n02)) {
                return n02;
            }
        }
        Y70.a aVar = Y70.Y;
        return C6223f80.w(30, EnumC6964i80.a1);
    }

    public final boolean d() {
        Boolean a = this.a.a();
        if (a != null) {
            return a.booleanValue();
        }
        Boolean a2 = this.b.a();
        if (a2 != null) {
            return a2.booleanValue();
        }
        return true;
    }

    public final boolean e(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    public final boolean f(long j) {
        if (Y70.T(j) && Y70.O(j)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r6.d(r0) != r1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(@NotNull HM<? super C7458kA2> hm) {
        SessionsSettings$updateSettings$1 sessionsSettings$updateSettings$1;
        int i;
        SessionsSettings sessionsSettings;
        if (hm instanceof SessionsSettings$updateSettings$1) {
            sessionsSettings$updateSettings$1 = (SessionsSettings$updateSettings$1) hm;
            int i2 = sessionsSettings$updateSettings$1.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sessionsSettings$updateSettings$1.b1 = i2 - Integer.MIN_VALUE;
                Object obj = sessionsSettings$updateSettings$1.Z0;
                Object l = C7289jT0.l();
                i = sessionsSettings$updateSettings$1.b1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            RT1.n(obj);
                            return C7458kA2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionsSettings = (SessionsSettings) sessionsSettings$updateSettings$1.Y0;
                    RT1.n(obj);
                } else {
                    RT1.n(obj);
                    SettingsProvider settingsProvider = this.a;
                    sessionsSettings$updateSettings$1.Y0 = this;
                    sessionsSettings$updateSettings$1.b1 = 1;
                    if (settingsProvider.d(sessionsSettings$updateSettings$1) != l) {
                        sessionsSettings = this;
                    }
                    return l;
                }
                SettingsProvider settingsProvider2 = sessionsSettings.b;
                sessionsSettings$updateSettings$1.Y0 = null;
                sessionsSettings$updateSettings$1.b1 = 2;
            }
        }
        sessionsSettings$updateSettings$1 = new SessionsSettings$updateSettings$1(this, hm);
        Object obj2 = sessionsSettings$updateSettings$1.Z0;
        Object l2 = C7289jT0.l();
        i = sessionsSettings$updateSettings$1.b1;
        if (i == 0) {
        }
        SettingsProvider settingsProvider22 = sessionsSettings.b;
        sessionsSettings$updateSettings$1.Y0 = null;
        sessionsSettings$updateSettings$1.b1 = 2;
    }

    public SessionsSettings(Context context, InterfaceC5809dQ interfaceC5809dQ, InterfaceC5809dQ interfaceC5809dQ2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(interfaceC5809dQ2, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, interfaceC5809dQ, null, 4, null), c.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionsSettings(@NotNull FirebaseApp firebaseApp, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC5809dQ interfaceC5809dQ2, @NotNull FirebaseInstallationsApi firebaseInstallationsApi) {
        this(r2, interfaceC5809dQ, interfaceC5809dQ2, firebaseInstallationsApi, SessionEvents.a.c(firebaseApp));
        C6562gT0.p(firebaseApp, "firebaseApp");
        C6562gT0.p(interfaceC5809dQ, "blockingDispatcher");
        C6562gT0.p(interfaceC5809dQ2, "backgroundDispatcher");
        C6562gT0.p(firebaseInstallationsApi, "firebaseInstallationsApi");
        Context n = firebaseApp.n();
        C6562gT0.o(n, "firebaseApp.applicationContext");
    }
}
