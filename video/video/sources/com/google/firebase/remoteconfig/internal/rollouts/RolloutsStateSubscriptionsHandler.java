package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class RolloutsStateSubscriptionsHandler {
    public ConfigCacheClient a;
    public RolloutsStateFactory b;
    public Executor c;
    public Set<RolloutsStateSubscriber> d = Collections.newSetFromMap(new ConcurrentHashMap());

    public RolloutsStateSubscriptionsHandler(@InterfaceC5670cr1 ConfigCacheClient configCacheClient, @InterfaceC5670cr1 RolloutsStateFactory rolloutsStateFactory, @InterfaceC5670cr1 Executor executor) {
        this.a = configCacheClient;
        this.b = rolloutsStateFactory;
        this.c = executor;
    }

    public static /* synthetic */ void a(RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler, Task task, final RolloutsStateSubscriber rolloutsStateSubscriber, ConfigContainer configContainer) {
        rolloutsStateSubscriptionsHandler.getClass();
        try {
            ConfigContainer configContainer2 = (ConfigContainer) task.r();
            if (configContainer2 != null) {
                final RolloutsState b = rolloutsStateSubscriptionsHandler.b.b(configContainer2);
                rolloutsStateSubscriptionsHandler.c.execute(new Runnable() { // from class: o.SU1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RolloutsStateSubscriber.this.a(b);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e) {
            Log.w(FirebaseRemoteConfig.z, "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    public void d(@InterfaceC5670cr1 ConfigContainer configContainer) {
        try {
            final RolloutsState b = this.b.b(configContainer);
            for (final RolloutsStateSubscriber rolloutsStateSubscriber : this.d) {
                this.c.execute(new Runnable() { // from class: o.TU1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RolloutsStateSubscriber.this.a(b);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e) {
            Log.w(FirebaseRemoteConfig.z, "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e);
        }
    }

    public void e(@InterfaceC5670cr1 final RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.d.add(rolloutsStateSubscriber);
        final Task<ConfigContainer> f = this.a.f();
        f.l(this.c, new OnSuccessListener() { // from class: o.RU1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void a(Object obj) {
                RolloutsStateSubscriptionsHandler.a(RolloutsStateSubscriptionsHandler.this, f, rolloutsStateSubscriber, (ConfigContainer) obj);
            }
        });
    }
}
