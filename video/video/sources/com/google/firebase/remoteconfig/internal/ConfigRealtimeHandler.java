package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public class ConfigRealtimeHandler {
    @InterfaceC8710pF0("this")
    public final Set<ConfigUpdateListener> a;
    @InterfaceC8710pF0("this")
    public final ConfigRealtimeHttpClient b;
    public final ConfigFetchHandler c;
    public final FirebaseApp d;
    public final FirebaseInstallationsApi e;
    public final ConfigCacheClient f;
    public final Context g;
    public final String h;
    public final ConfigMetadataClient i;
    public final ScheduledExecutorService j;

    /* loaded from: classes3.dex */
    public class ConfigUpdateListenerRegistrationInternal implements ConfigUpdateListenerRegistration {
        public final ConfigUpdateListener a;

        public ConfigUpdateListenerRegistrationInternal(ConfigUpdateListener configUpdateListener) {
            this.a = configUpdateListener;
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration
        public void remove() {
            ConfigRealtimeHandler.this.d(this.a);
        }
    }

    public ConfigRealtimeHandler(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        this.b = new ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, linkedHashSet, configMetadataClient, scheduledExecutorService);
        this.d = firebaseApp;
        this.c = configFetchHandler;
        this.e = firebaseInstallationsApi;
        this.f = configCacheClient;
        this.g = context;
        this.h = str;
        this.i = configMetadataClient;
        this.j = scheduledExecutorService;
    }

    @InterfaceC5670cr1
    public synchronized ConfigUpdateListenerRegistration b(@InterfaceC5670cr1 ConfigUpdateListener configUpdateListener) {
        this.a.add(configUpdateListener);
        c();
        return new ConfigUpdateListenerRegistrationInternal(configUpdateListener);
    }

    public final synchronized void c() {
        if (!this.a.isEmpty()) {
            this.b.C();
        }
    }

    public final synchronized void d(ConfigUpdateListener configUpdateListener) {
        this.a.remove(configUpdateListener);
    }

    public synchronized void e(boolean z) {
        this.b.z(z);
        if (!z) {
            c();
        }
    }
}
