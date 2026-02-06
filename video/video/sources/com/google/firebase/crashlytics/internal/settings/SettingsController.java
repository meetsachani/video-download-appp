package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SettingsController implements SettingsProvider {
    public static final String j = "existing_instance_identifier";
    public static final String k = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";
    public final Context a;
    public final SettingsRequest b;
    public final SettingsJsonParser c;
    public final CurrentTimeProvider d;
    public final CachedSettingsIo e;
    public final SettingsSpiCall f;
    public final DataCollectionArbiter g;
    public final AtomicReference<Settings> h;
    public final AtomicReference<TaskCompletionSource<Settings>> i;

    public SettingsController(Context context, SettingsRequest settingsRequest, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference<Settings> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new TaskCompletionSource());
        this.a = context;
        this.b = settingsRequest;
        this.d = currentTimeProvider;
        this.c = settingsJsonParser;
        this.e = cachedSettingsIo;
        this.f = settingsSpiCall;
        this.g = dataCollectionArbiter;
        atomicReference.set(DefaultSettingsJsonTransform.b(currentTimeProvider));
    }

    public static SettingsController l(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String g = idManager.g();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        return new SettingsController(context, new SettingsRequest(str, idManager.h(), idManager.i(), idManager.j(), idManager, CommonUtils.h(CommonUtils.n(context), str, str3, str2), str3, str2, DeliveryMechanism.e(g).g()), systemCurrentTimeProvider, new SettingsJsonParser(systemCurrentTimeProvider), new CachedSettingsIo(fileStore), new DefaultSettingsSpiCall(String.format(Locale.US, k, str), httpRequestFactory), dataCollectionArbiter);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Task<Settings> a() {
        return this.i.get().a();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Settings b() {
        return this.h.get();
    }

    public boolean k() {
        return !n().equals(this.b.f);
    }

    public final Settings m(SettingsCacheBehavior settingsCacheBehavior) {
        Settings settings = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject b = this.e.b();
                if (b != null) {
                    Settings b2 = this.c.b(b);
                    if (b2 != null) {
                        q(b, "Loaded cached settings: ");
                        long a = this.d.a();
                        if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && b2.a(a)) {
                            Logger.f().k("Cached settings have expired.");
                            return null;
                        }
                        try {
                            Logger.f().k("Returning cached settings.");
                            return b2;
                        } catch (Exception e) {
                            e = e;
                            settings = b2;
                            Logger.f().e("Failed to get cached settings", e);
                            return settings;
                        }
                    }
                    Logger.f().e("Failed to parse cached settings data.", null);
                    return null;
                }
                Logger.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final String n() {
        return CommonUtils.r(this.a).getString(j, "");
    }

    public Task<Void> o(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
        Settings m;
        if (!k() && (m = m(settingsCacheBehavior)) != null) {
            this.h.set(m);
            this.i.get().e(m);
            return Tasks.g(null);
        }
        Settings m2 = m(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (m2 != null) {
            this.h.set(m2);
            this.i.get().e(m2);
        }
        return this.g.k(executor).x(executor, new SuccessContinuation<Void, Void>() { // from class: com.google.firebase.crashlytics.internal.settings.SettingsController.1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            @InterfaceC5670cr1
            /* renamed from: b */
            public Task<Void> a(@InterfaceC11300zs1 Void r5) throws Exception {
                JSONObject a = SettingsController.this.f.a(SettingsController.this.b, true);
                if (a != null) {
                    Settings b = SettingsController.this.c.b(a);
                    SettingsController.this.e.c(b.c, a);
                    SettingsController.this.q(a, "Loaded settings: ");
                    SettingsController settingsController = SettingsController.this;
                    settingsController.r(settingsController.b.f);
                    SettingsController.this.h.set(b);
                    ((TaskCompletionSource) SettingsController.this.i.get()).e(b);
                }
                return Tasks.g(null);
            }
        });
    }

    public Task<Void> p(Executor executor) {
        return o(SettingsCacheBehavior.USE_CACHE, executor);
    }

    public final void q(JSONObject jSONObject, String str) throws JSONException {
        Logger f = Logger.f();
        f.b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    public final boolean r(String str) {
        SharedPreferences.Editor edit = CommonUtils.r(this.a).edit();
        edit.putString(j, str);
        edit.apply();
        return true;
    }
}
