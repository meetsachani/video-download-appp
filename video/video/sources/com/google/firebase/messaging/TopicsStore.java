package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TopicsStore {
    @InterfaceC5056aJ2
    public static final String d = "com.google.android.gms.appid";
    @InterfaceC5056aJ2
    public static final String e = "topic_operation_queue";
    public static final String f = ",";
    @InterfaceC8710pF0("TopicsStore.class")
    public static WeakReference<TopicsStore> g;
    public final SharedPreferences a;
    public SharedPreferencesQueue b;
    public final Executor c;

    public TopicsStore(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    @InterfaceC5056aJ2
    public static synchronized void b() {
        synchronized (TopicsStore.class) {
            WeakReference<TopicsStore> weakReference = g;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    @InterfaceC10697xN2
    public static synchronized TopicsStore d(Context context, Executor executor) {
        TopicsStore topicsStore;
        synchronized (TopicsStore.class) {
            try {
                WeakReference<TopicsStore> weakReference = g;
                if (weakReference != null) {
                    topicsStore = weakReference.get();
                } else {
                    topicsStore = null;
                }
                if (topicsStore == null) {
                    topicsStore = new TopicsStore(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    topicsStore.g();
                    g = new WeakReference<>(topicsStore);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return topicsStore;
    }

    public synchronized boolean a(TopicOperation topicOperation) {
        return this.b.b(topicOperation.e());
    }

    public synchronized void c() {
        this.b.g();
    }

    @InterfaceC11300zs1
    public synchronized TopicOperation e() {
        return TopicOperation.a(this.b.l());
    }

    @InterfaceC5670cr1
    public synchronized List<TopicOperation> f() {
        ArrayList arrayList;
        List<String> t = this.b.t();
        arrayList = new ArrayList(t.size());
        for (String str : t) {
            arrayList.add(TopicOperation.a(str));
        }
        return arrayList;
    }

    @InterfaceC10697xN2
    public final synchronized void g() {
        this.b = SharedPreferencesQueue.j(this.a, e, ",", this.c);
    }

    @InterfaceC11300zs1
    public synchronized TopicOperation h() {
        try {
        } catch (NoSuchElementException unused) {
            Log.e("FirebaseMessaging", "Polling operation queue failed");
            return null;
        }
        return TopicOperation.a(this.b.m());
    }

    public synchronized boolean i(TopicOperation topicOperation) {
        return this.b.n(topicOperation.e());
    }
}
