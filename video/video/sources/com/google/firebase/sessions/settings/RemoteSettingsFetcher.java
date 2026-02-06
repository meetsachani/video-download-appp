package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.sessions.ApplicationInfo;
import java.net.URL;
import java.util.Map;
import o.C5426br;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.C9516sY;
import o.HM;
import o.InterfaceC5809dQ;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {
    @NotNull
    public static final Companion d = new Companion(null);
    @NotNull
    public static final String e = "firebase-settings.crashlytics.com";
    @NotNull
    public static final String f = "android";
    @NotNull
    public final ApplicationInfo a;
    @NotNull
    public final InterfaceC5809dQ b;
    @NotNull
    public final String c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public RemoteSettingsFetcher(@NotNull ApplicationInfo applicationInfo, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull String str) {
        C6562gT0.p(applicationInfo, "appInfo");
        C6562gT0.p(interfaceC5809dQ, "blockingDispatcher");
        C6562gT0.p(str, "baseUrl");
        this.a = applicationInfo;
        this.b = interfaceC5809dQ;
        this.c = str;
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    @Nullable
    public Object a(@NotNull Map<String, String> map, @NotNull VA0<? super JSONObject, ? super HM<? super C7458kA2>, ? extends Object> va0, @NotNull VA0<? super String, ? super HM<? super C7458kA2>, ? extends Object> va02, @NotNull HM<? super C7458kA2> hm) {
        Object h = C5426br.h(this.b, new RemoteSettingsFetcher$doConfigFetch$2(this, map, va0, va02, null), hm);
        if (h == C7289jT0.l()) {
            return h;
        }
        return C7458kA2.a;
    }

    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.a.j()).appendPath(RemoteConfigComponent.f388o).appendQueryParameter(DefaultSettingsSpiCall.l, this.a.i().i()).appendQueryParameter(DefaultSettingsSpiCall.m, this.a.i().n()).build().toString());
    }

    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, InterfaceC5809dQ interfaceC5809dQ, String str, int i, C9516sY c9516sY) {
        this(applicationInfo, interfaceC5809dQ, (i & 4) != 0 ? e : str);
    }
}
