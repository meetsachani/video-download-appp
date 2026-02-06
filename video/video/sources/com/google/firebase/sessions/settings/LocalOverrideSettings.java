package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.sessions.settings.SettingsProvider;
import o.C6223f80;
import o.C6562gT0;
import o.C7458kA2;
import o.C9516sY;
import o.EnumC6964i80;
import o.HM;
import o.Y70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class LocalOverrideSettings implements SettingsProvider {
    @NotNull
    public static final Companion b = new Companion(null);
    @Deprecated
    @NotNull
    public static final String c = "firebase_sessions_enabled";
    @Deprecated
    @NotNull
    public static final String d = "firebase_sessions_sessions_restart_timeout";
    @Deprecated
    @NotNull
    public static final String e = "firebase_sessions_sampling_rate";
    public final Bundle a;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public LocalOverrideSettings(@NotNull Context context) {
        C6562gT0.p(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public static /* synthetic */ void f() {
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean a() {
        if (this.a.containsKey(c)) {
            return Boolean.valueOf(this.a.getBoolean(c));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Y70 b() {
        if (this.a.containsKey(d)) {
            return Y70.l(C6223f80.w(this.a.getInt(d), EnumC6964i80.Z0));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double c() {
        if (this.a.containsKey(e)) {
            return Double.valueOf(this.a.getDouble(e));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Object d(@NotNull HM<? super C7458kA2> hm) {
        return SettingsProvider.DefaultImpls.b(this, hm);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean e() {
        return SettingsProvider.DefaultImpls.a(this);
    }
}
