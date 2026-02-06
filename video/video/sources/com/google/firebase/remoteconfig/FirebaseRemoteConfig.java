package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.XN2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfig {
    public static final String n = "";

    /* renamed from: o  reason: collision with root package name */
    public static final long f383o = 0;
    public static final double p = 0.0d;
    public static final boolean q = false;
    public static final byte[] r = new byte[0];
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = -1;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final String z = "FirebaseRemoteConfig";
    public final Context a;
    public final FirebaseApp b;
    @InterfaceC11300zs1
    public final FirebaseABTesting c;
    public final Executor d;
    public final ConfigCacheClient e;
    public final ConfigCacheClient f;
    public final ConfigCacheClient g;
    public final ConfigFetchHandler h;
    public final ConfigGetParameterHandler i;
    public final ConfigMetadataClient j;
    public final FirebaseInstallationsApi k;
    public final ConfigRealtimeHandler l;
    public final RolloutsStateSubscriptionsHandler m;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, @InterfaceC11300zs1 FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.a = context;
        this.b = firebaseApp;
        this.k = firebaseInstallationsApi;
        this.c = firebaseABTesting;
        this.d = executor;
        this.e = configCacheClient;
        this.f = configCacheClient2;
        this.g = configCacheClient3;
        this.h = configFetchHandler;
        this.i = configGetParameterHandler;
        this.j = configMetadataClient;
        this.l = configRealtimeHandler;
        this.m = rolloutsStateSubscriptionsHandler;
    }

    public static boolean A(ConfigContainer configContainer, @InterfaceC11300zs1 ConfigContainer configContainer2) {
        if (configContainer2 != null && configContainer.h().equals(configContainer2.h())) {
            return false;
        }
        return true;
    }

    @InterfaceC5056aJ2
    public static List<Map<String, String>> K(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static /* synthetic */ Void a(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        firebaseRemoteConfig.j.n(firebaseRemoteConfigSettings);
        return null;
    }

    public static /* synthetic */ FirebaseRemoteConfigInfo d(Task task, Task task2) {
        return (FirebaseRemoteConfigInfo) task.r();
    }

    public static /* synthetic */ Task h(final FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2, Task task3) {
        firebaseRemoteConfig.getClass();
        if (task.v() && task.r() != null) {
            ConfigContainer configContainer = (ConfigContainer) task.r();
            if (task2.v() && !A(configContainer, (ConfigContainer) task2.r())) {
                return Tasks.g(Boolean.FALSE);
            }
            return firebaseRemoteConfig.f.k(configContainer).n(firebaseRemoteConfig.d, new Continuation() { // from class: o.Vt0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object a(Task task4) {
                    boolean B;
                    B = FirebaseRemoteConfig.this.B(task4);
                    return Boolean.valueOf(B);
                }
            });
        }
        return Tasks.g(Boolean.FALSE);
    }

    public static /* synthetic */ Void i(FirebaseRemoteConfig firebaseRemoteConfig) {
        firebaseRemoteConfig.f.d();
        firebaseRemoteConfig.e.d();
        firebaseRemoteConfig.g.d();
        firebaseRemoteConfig.j.a();
        return null;
    }

    @InterfaceC5670cr1
    public static FirebaseRemoteConfig t() {
        return u(FirebaseApp.p());
    }

    @InterfaceC5670cr1
    public static FirebaseRemoteConfig u(@InterfaceC5670cr1 FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.l(RemoteConfigComponent.class)).g();
    }

    public final boolean B(Task<ConfigContainer> task) {
        if (task.v()) {
            this.e.d();
            ConfigContainer r2 = task.r();
            if (r2 != null) {
                L(r2.e());
                this.m.d(r2);
                return true;
            }
            Log.e(z, "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    @InterfaceC5670cr1
    public Task<Void> C() {
        return Tasks.d(this.d, new Callable() { // from class: o.Xt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.i(FirebaseRemoteConfig.this);
            }
        });
    }

    public void D(Runnable runnable) {
        this.d.execute(runnable);
    }

    @InterfaceC5670cr1
    public Task<Void> E(@InterfaceC5670cr1 final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.d(this.d, new Callable() { // from class: o.Yt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.a(FirebaseRemoteConfig.this, firebaseRemoteConfigSettings);
            }
        });
    }

    public void F(boolean z2) {
        this.l.e(z2);
    }

    @InterfaceC5670cr1
    public Task<Void> G(@XN2 int i) {
        return I(DefaultsXmlParser.a(this.a, i));
    }

    @InterfaceC5670cr1
    public Task<Void> H(@InterfaceC5670cr1 Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return I(hashMap);
    }

    public final Task<Void> I(Map<String, String> map) {
        try {
            return this.g.k(ConfigContainer.l().b(map).a()).x(FirebaseExecutors.a(), new SuccessContinuation() { // from class: o.Ut0
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task a(Object obj) {
                    Task g;
                    ConfigContainer configContainer = (ConfigContainer) obj;
                    g = Tasks.g(null);
                    return g;
                }
            });
        } catch (JSONException e) {
            Log.e(z, "The provided defaults map could not be processed.", e);
            return Tasks.g(null);
        }
    }

    public void J() {
        this.f.f();
        this.g.f();
        this.e.f();
    }

    @InterfaceC5056aJ2
    public void L(@InterfaceC5670cr1 JSONArray jSONArray) {
        if (this.c != null) {
            try {
                this.c.m(K(jSONArray));
            } catch (AbtException e) {
                Log.w(z, "Could not update ABT experiments.", e);
            } catch (JSONException e2) {
                Log.e(z, "Could not parse ABT experiments from the JSON response.", e2);
            }
        }
    }

    @InterfaceC5670cr1
    public Task<Boolean> j() {
        final Task<ConfigContainer> f = this.e.f();
        final Task<ConfigContainer> f2 = this.f.f();
        return Tasks.m(f, f2).p(this.d, new Continuation() { // from class: o.Tt0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                return FirebaseRemoteConfig.h(FirebaseRemoteConfig.this, f, f2, task);
            }
        });
    }

    @InterfaceC5670cr1
    public ConfigUpdateListenerRegistration k(@InterfaceC5670cr1 ConfigUpdateListener configUpdateListener) {
        return this.l.b(configUpdateListener);
    }

    @InterfaceC5670cr1
    public Task<FirebaseRemoteConfigInfo> l() {
        Task<ConfigContainer> f = this.f.f();
        Task<ConfigContainer> f2 = this.g.f();
        Task<ConfigContainer> f3 = this.e.f();
        final Task d = Tasks.d(this.d, new Callable() { // from class: o.Zt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.this.s();
            }
        });
        return Tasks.m(f, f2, f3, d, this.k.getId(), this.k.c(false)).n(this.d, new Continuation() { // from class: o.au0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                return FirebaseRemoteConfig.d(Task.this, task);
            }
        });
    }

    @InterfaceC5670cr1
    public Task<Void> m() {
        return this.h.i().x(FirebaseExecutors.a(), new SuccessContinuation() { // from class: o.cu0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                Task g;
                ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) obj;
                g = Tasks.g(null);
                return g;
            }
        });
    }

    @InterfaceC5670cr1
    public Task<Void> n(long j) {
        return this.h.j(j).x(FirebaseExecutors.a(), new SuccessContinuation() { // from class: o.Wt0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                Task g;
                ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) obj;
                g = Tasks.g(null);
                return g;
            }
        });
    }

    @InterfaceC5670cr1
    public Task<Boolean> o() {
        return m().x(this.d, new SuccessContinuation() { // from class: o.bu0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                Task j;
                Void r2 = (Void) obj;
                j = FirebaseRemoteConfig.this.j();
                return j;
            }
        });
    }

    @InterfaceC5670cr1
    public Map<String, FirebaseRemoteConfigValue> p() {
        return this.i.d();
    }

    public boolean q(@InterfaceC5670cr1 String str) {
        return this.i.e(str);
    }

    public double r(@InterfaceC5670cr1 String str) {
        return this.i.h(str);
    }

    @InterfaceC5670cr1
    public FirebaseRemoteConfigInfo s() {
        return this.j.d();
    }

    @InterfaceC5670cr1
    public Set<String> v(@InterfaceC5670cr1 String str) {
        return this.i.k(str);
    }

    public long w(@InterfaceC5670cr1 String str) {
        return this.i.m(str);
    }

    public RolloutsStateSubscriptionsHandler x() {
        return this.m;
    }

    @InterfaceC5670cr1
    public String y(@InterfaceC5670cr1 String str) {
        return this.i.o(str);
    }

    @InterfaceC5670cr1
    public FirebaseRemoteConfigValue z(@InterfaceC5670cr1 String str) {
        return this.i.q(str);
    }
}
