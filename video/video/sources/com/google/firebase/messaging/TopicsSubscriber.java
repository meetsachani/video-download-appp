package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C2531Be;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;
import o.UE;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TopicsSubscriber {
    public static final String i = "INTERNAL_SERVER_ERROR";
    public static final String j = "SERVICE_NOT_AVAILABLE";
    public static final long k = 30;
    public static final long l = 30;
    public static final long m = TimeUnit.HOURS.toSeconds(8);
    public final Context a;
    public final Metadata b;
    public final GmsRpc c;
    public final FirebaseMessaging d;
    public final ScheduledExecutorService f;
    public final TopicsStore h;
    @InterfaceC8710pF0("pendingOperations")
    public final Map<String, ArrayDeque<TaskCompletionSource<Void>>> e = new C2531Be();
    @InterfaceC8710pF0("this")
    public boolean g = false;

    public TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, @InterfaceC5670cr1 ScheduledExecutorService scheduledExecutorService) {
        this.d = firebaseMessaging;
        this.b = metadata;
        this.h = topicsStore;
        this.c = gmsRpc;
        this.a = context;
        this.f = scheduledExecutorService;
    }

    public static /* synthetic */ TopicsSubscriber a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        return new TopicsSubscriber(firebaseMessaging, metadata, TopicsStore.d(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    @InterfaceC10697xN2
    public static <T> void c(Task<T> task) throws IOException {
        try {
            Tasks.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        }
    }

    @InterfaceC5056aJ2
    public static Task<TopicsSubscriber> f(final FirebaseMessaging firebaseMessaging, final Metadata metadata, final GmsRpc gmsRpc, final Context context, @InterfaceC5670cr1 final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.d(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TopicsSubscriber.a(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
            }
        });
    }

    public static boolean i() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public final void b(TopicOperation topicOperation, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.e) {
            try {
                String e = topicOperation.e();
                if (this.e.containsKey(e)) {
                    arrayDeque = this.e.get(e);
                } else {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                    this.e.put(e, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC10697xN2
    public final void d(String str) throws IOException {
        c(this.c.k(this.d.n(), str));
    }

    @InterfaceC10697xN2
    public final void e(String str) throws IOException {
        c(this.c.l(this.d.n(), str));
    }

    @InterfaceC5056aJ2
    public TopicsStore g() {
        return this.h;
    }

    public boolean h() {
        if (this.h.e() != null) {
            return true;
        }
        return false;
    }

    public synchronized boolean j() {
        return this.g;
    }

    public final void k(TopicOperation topicOperation) {
        synchronized (this.e) {
            try {
                String e = topicOperation.e();
                if (!this.e.containsKey(e)) {
                    return;
                }
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.e.get(e);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.e.remove(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[Catch: IOException -> 0x001f, TryCatch #0 {IOException -> 0x001f, blocks: (B:3:0x0003, B:20:0x0033, B:22:0x0039, B:23:0x0053, B:25:0x0060, B:26:0x007c, B:28:0x0089, B:8:0x0015, B:13:0x0022), top: B:42:0x0003 }] */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l(TopicOperation topicOperation) throws IOException {
        char c;
        try {
            String b = topicOperation.b();
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b.equals("U")) {
                    c = 1;
                    if (c == 0) {
                        if (c != 1) {
                            if (i()) {
                                Log.d("FirebaseMessaging", "Unknown topic operation" + topicOperation + UE.h);
                            }
                        } else {
                            e(topicOperation.c());
                            if (i()) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + topicOperation.c() + " succeeded.");
                            }
                        }
                    } else {
                        d(topicOperation.c());
                        if (i()) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + topicOperation.c() + " succeeded.");
                        }
                    }
                    return true;
                }
                c = 65535;
                if (c == 0) {
                }
                return true;
            }
            if (b.equals("S")) {
                c = 0;
                if (c == 0) {
                }
                return true;
            }
            c = 65535;
            if (c == 0) {
            }
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                if (e.getMessage() == null) {
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                throw e;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    public void m(Runnable runnable, long j2) {
        this.f.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    @InterfaceC5056aJ2
    public Task<Void> n(TopicOperation topicOperation) {
        this.h.a(topicOperation);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        b(topicOperation, taskCompletionSource);
        return taskCompletionSource.a();
    }

    public synchronized void o(boolean z) {
        this.g = z;
    }

    public final void p() {
        if (!j()) {
            t(0L);
        }
    }

    public void q() {
        if (h()) {
            p();
        }
    }

    public Task<Void> r(String str) {
        Task<Void> n = n(TopicOperation.f(str));
        q();
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (i() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean s() throws IOException {
        while (true) {
            synchronized (this) {
                try {
                    TopicOperation e = this.h.e();
                    if (e == null) {
                        break;
                    } else if (!l(e)) {
                        return false;
                    } else {
                        this.h.i(e);
                        k(e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void t(long j2) {
        m(new TopicsSyncTask(this, this.a, this.b, Math.min(Math.max(30L, 2 * j2), m)), j2);
        o(true);
    }

    public Task<Void> u(String str) {
        Task<Void> n = n(TopicOperation.g(str));
        q();
        return n;
    }
}
