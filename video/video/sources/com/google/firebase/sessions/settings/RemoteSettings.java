package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import com.facebook.share.c;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import java.util.Arrays;
import java.util.Map;
import o.AbstractC10668xG1;
import o.C10217vQ;
import o.C10219vQ1;
import o.C4180Rx1;
import o.C4431Ul2;
import o.C5910dr;
import o.C6143eo1;
import o.C6223f80;
import o.C6562gT0;
import o.C6670gv2;
import o.C7289jT0;
import o.C7458kA2;
import o.C8319ne2;
import o.C8926q81;
import o.C9516sY;
import o.EnumC6964i80;
import o.HM;
import o.InterfaceC4826Yn1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5809dQ;
import o.PU;
import o.RT1;
import o.Y70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class RemoteSettings implements SettingsProvider {
    @NotNull
    public static final Companion g = new Companion(null);
    @Deprecated
    @NotNull
    public static final String h = "SessionConfigFetcher";
    @Deprecated
    @NotNull
    public static final String i = "/";
    @NotNull
    public final InterfaceC5809dQ a;
    @NotNull
    public final FirebaseInstallationsApi b;
    @NotNull
    public final ApplicationInfo c;
    @NotNull
    public final CrashlyticsSettingsFetcher d;
    @NotNull
    public final SettingsCache e;
    @NotNull
    public final InterfaceC4826Yn1 f;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public RemoteSettings(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo applicationInfo, @NotNull CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, @NotNull PU<AbstractC10668xG1> pu) {
        C6562gT0.p(interfaceC5809dQ, "backgroundDispatcher");
        C6562gT0.p(firebaseInstallationsApi, "firebaseInstallationsApi");
        C6562gT0.p(applicationInfo, "appInfo");
        C6562gT0.p(crashlyticsSettingsFetcher, "configsFetcher");
        C6562gT0.p(pu, "dataStore");
        this.a = interfaceC5809dQ;
        this.b = firebaseInstallationsApi;
        this.c = applicationInfo;
        this.d = crashlyticsSettingsFetcher;
        this.e = new SettingsCache(pu);
        this.f = C6143eo1.b(false, 1, null);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean a() {
        return this.e.m();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Y70 b() {
        Integer k = this.e.k();
        if (k != null) {
            Y70.a aVar = Y70.Y;
            return Y70.l(C6223f80.w(k.intValue(), EnumC6964i80.Z0));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double c() {
        return this.e.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #1 {all -> 0x009a, blocks: (B:36:0x0087, B:38:0x008f, B:43:0x00a0), top: B:63:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: all -> 0x009a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x009a, blocks: (B:36:0x0087, B:38:0x008f, B:43:0x00a0), top: B:63:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00bc, B:49:0x00c0, B:52:0x00cb), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00bc, B:49:0x00c0, B:52:0x00cb), top: B:64:0x004a }] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(@NotNull HM<? super C7458kA2> hm) {
        RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        int i2;
        InterfaceC4826Yn1 interfaceC4826Yn1;
        RemoteSettings remoteSettings;
        InterfaceC4826Yn1 interfaceC4826Yn12;
        Throwable th;
        InterfaceC4826Yn1 interfaceC4826Yn13;
        String str;
        try {
            if (hm instanceof RemoteSettings$updateSettings$1) {
                remoteSettings$updateSettings$1 = (RemoteSettings$updateSettings$1) hm;
                int i3 = remoteSettings$updateSettings$1.c1;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    remoteSettings$updateSettings$1.c1 = i3 - Integer.MIN_VALUE;
                    Object obj = remoteSettings$updateSettings$1.a1;
                    Object l = C7289jT0.l();
                    i2 = remoteSettings$updateSettings$1.c1;
                    if (i2 == 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    interfaceC4826Yn12 = (InterfaceC4826Yn1) remoteSettings$updateSettings$1.Y0;
                                    try {
                                        RT1.n(obj);
                                        C7458kA2 c7458kA2 = C7458kA2.a;
                                        interfaceC4826Yn12.h(null);
                                        return c7458kA2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        interfaceC4826Yn12.h(null);
                                        throw th;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC4826Yn13 = (InterfaceC4826Yn1) remoteSettings$updateSettings$1.Z0;
                            remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.Y0;
                            try {
                                RT1.n(obj);
                                str = (String) obj;
                                if (str != null) {
                                    Log.w(h, "Error getting Firebase Installation ID. Skipping this Session Event.");
                                    C7458kA2 c7458kA22 = C7458kA2.a;
                                    interfaceC4826Yn13.h(null);
                                    return c7458kA22;
                                }
                                C4180Rx1 a = C6670gv2.a("X-Crashlytics-Installation-ID", str);
                                C8319ne2 c8319ne2 = C8319ne2.a;
                                String format = String.format(c.g, Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                                C6562gT0.o(format, "format(format, *args)");
                                C4180Rx1 a2 = C6670gv2.a("X-Crashlytics-Device-Model", remoteSettings.h(format));
                                String str2 = Build.VERSION.INCREMENTAL;
                                C6562gT0.o(str2, "INCREMENTAL");
                                C4180Rx1 a3 = C6670gv2.a("X-Crashlytics-OS-Build-Version", remoteSettings.h(str2));
                                String str3 = Build.VERSION.RELEASE;
                                C6562gT0.o(str3, "RELEASE");
                                Map<String, String> W = C8926q81.W(a, a2, a3, C6670gv2.a("X-Crashlytics-OS-Display-Version", remoteSettings.h(str3)), C6670gv2.a("X-Crashlytics-API-Client-Version", remoteSettings.c.n()));
                                Log.d(h, "Fetching settings from server.");
                                CrashlyticsSettingsFetcher crashlyticsSettingsFetcher = remoteSettings.d;
                                RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                                RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                                remoteSettings$updateSettings$1.Y0 = interfaceC4826Yn13;
                                remoteSettings$updateSettings$1.Z0 = null;
                                remoteSettings$updateSettings$1.c1 = 3;
                                if (crashlyticsSettingsFetcher.a(W, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, remoteSettings$updateSettings$1) != l) {
                                    interfaceC4826Yn12 = interfaceC4826Yn13;
                                    C7458kA2 c7458kA23 = C7458kA2.a;
                                    interfaceC4826Yn12.h(null);
                                    return c7458kA23;
                                }
                                return l;
                            } catch (Throwable th3) {
                                th = th3;
                                interfaceC4826Yn12 = interfaceC4826Yn13;
                                interfaceC4826Yn12.h(null);
                                throw th;
                            }
                        }
                        remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.Y0;
                        RT1.n(obj);
                        interfaceC4826Yn1 = (InterfaceC4826Yn1) remoteSettings$updateSettings$1.Z0;
                    } else {
                        RT1.n(obj);
                        if (!this.f.f() && !this.e.i()) {
                            return C7458kA2.a;
                        }
                        interfaceC4826Yn1 = this.f;
                        remoteSettings$updateSettings$1.Y0 = this;
                        remoteSettings$updateSettings$1.Z0 = interfaceC4826Yn1;
                        remoteSettings$updateSettings$1.c1 = 1;
                        if (interfaceC4826Yn1.e(null, remoteSettings$updateSettings$1) != l) {
                            remoteSettings = this;
                        }
                        return l;
                    }
                    if (remoteSettings.e.i()) {
                        Log.d(h, "Remote settings cache not expired. Using cached values.");
                        C7458kA2 c7458kA24 = C7458kA2.a;
                        interfaceC4826Yn1.h(null);
                        return c7458kA24;
                    }
                    Task<String> id = remoteSettings.b.getId();
                    C6562gT0.o(id, "firebaseInstallationsApi.id");
                    remoteSettings$updateSettings$1.Y0 = remoteSettings;
                    remoteSettings$updateSettings$1.Z0 = interfaceC4826Yn1;
                    remoteSettings$updateSettings$1.c1 = 2;
                    Object m = C4431Ul2.m(id, remoteSettings$updateSettings$1);
                    if (m != l) {
                        interfaceC4826Yn13 = interfaceC4826Yn1;
                        obj = m;
                        str = (String) obj;
                        if (str != null) {
                        }
                    }
                    return l;
                }
            }
            if (remoteSettings.e.i()) {
            }
        } catch (Throwable th4) {
            interfaceC4826Yn12 = interfaceC4826Yn1;
            th = th4;
            interfaceC4826Yn12.h(null);
            throw th;
        }
        remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, hm);
        Object obj2 = remoteSettings$updateSettings$1.a1;
        Object l2 = C7289jT0.l();
        i2 = remoteSettings$updateSettings$1.c1;
        if (i2 == 0) {
        }
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean e() {
        return this.e.i();
    }

    @InterfaceC5056aJ2
    public final void g() {
        C5910dr.f(C10217vQ.a(this.a), null, null, new RemoteSettings$clearCachedSettings$1(this, null), 3, null);
    }

    public final String h(String str) {
        return new C10219vQ1(i).o(str, "");
    }
}
