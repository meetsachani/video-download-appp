package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import o.C2638Cg0;
import o.C9682tD2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {
    public final Provider<HeartBeatInfoStorage> a;
    public final Context b;
    public final Provider<UserAgentPublisher> c;
    public final Set<HeartBeatConsumer> d;
    public final Executor e;

    public DefaultHeartBeatController(final Context context, final String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider, Executor executor) {
        this(new Provider() { // from class: o.dZ
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return DefaultHeartBeatController.d(context, str);
            }
        }, set, executor, provider, context);
    }

    public static /* synthetic */ String c(DefaultHeartBeatController defaultHeartBeatController) {
        String byteArrayOutputStream;
        synchronized (defaultHeartBeatController) {
            try {
                HeartBeatInfoStorage heartBeatInfoStorage = defaultHeartBeatController.a.get();
                List<HeartBeatResult> c = heartBeatInfoStorage.c();
                heartBeatInfoStorage.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < c.size(); i++) {
                    HeartBeatResult heartBeatResult = c.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", heartBeatResult.c());
                    jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", C2638Cg0.Y4);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    public static /* synthetic */ HeartBeatInfoStorage d(Context context, String str) {
        return new HeartBeatInfoStorage(context, str);
    }

    public static /* synthetic */ DefaultHeartBeatController e(Qualified qualified, ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.a(Context.class), ((FirebaseApp) componentContainer.a(FirebaseApp.class)).t(), componentContainer.h(HeartBeatConsumer.class), componentContainer.i(UserAgentPublisher.class), (Executor) componentContainer.g(qualified));
    }

    public static /* synthetic */ Void f(DefaultHeartBeatController defaultHeartBeatController) {
        synchronized (defaultHeartBeatController) {
            defaultHeartBeatController.a.get().m(System.currentTimeMillis(), defaultHeartBeatController.c.get().a());
        }
        return null;
    }

    @InterfaceC5670cr1
    public static Component<DefaultHeartBeatController> g() {
        final Qualified a = Qualified.a(Background.class, Executor.class);
        return Component.i(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).b(Dependency.m(Context.class)).b(Dependency.m(FirebaseApp.class)).b(Dependency.q(HeartBeatConsumer.class)).b(Dependency.o(UserAgentPublisher.class)).b(Dependency.l(a)).f(new ComponentFactory() { // from class: o.fZ
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return DefaultHeartBeatController.e(Qualified.this, componentContainer);
            }
        }).d();
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> a() {
        if (!C9682tD2.a(this.b)) {
            return Tasks.g("");
        }
        return Tasks.d(this.e, new Callable() { // from class: o.eZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatController.c(DefaultHeartBeatController.this);
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @InterfaceC5670cr1
    public synchronized HeartBeatInfo.HeartBeat b(@InterfaceC5670cr1 String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HeartBeatInfoStorage heartBeatInfoStorage = this.a.get();
        if (heartBeatInfoStorage.k(currentTimeMillis)) {
            heartBeatInfoStorage.i();
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    public Task<Void> h() {
        if (this.d.size() <= 0) {
            return Tasks.g(null);
        }
        if (!C9682tD2.a(this.b)) {
            return Tasks.g(null);
        }
        return Tasks.d(this.e, new Callable() { // from class: o.gZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatController.f(DefaultHeartBeatController.this);
            }
        });
    }

    @InterfaceC5056aJ2
    public DefaultHeartBeatController(Provider<HeartBeatInfoStorage> provider, Set<HeartBeatConsumer> set, Executor executor, Provider<UserAgentPublisher> provider2, Context context) {
        this.a = provider;
        this.d = set;
        this.e = executor;
        this.c = provider2;
        this.b = context;
    }
}
