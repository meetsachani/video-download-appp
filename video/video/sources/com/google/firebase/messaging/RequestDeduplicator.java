package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import o.C2531Be;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public class RequestDeduplicator {
    public final Executor a;
    @InterfaceC8710pF0("this")
    public final Map<String, Task<String>> b = new C2531Be();

    /* loaded from: classes3.dex */
    public interface GetTokenRequest {
        Task<String> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.a = executor;
    }

    public static /* synthetic */ Task a(RequestDeduplicator requestDeduplicator, String str, Task task) {
        synchronized (requestDeduplicator) {
            requestDeduplicator.b.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> b(final String str, GetTokenRequest getTokenRequest) {
        Task<String> task = this.b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task p = getTokenRequest.start().p(this.a, new Continuation() { // from class: com.google.firebase.messaging.j
            {
                RequestDeduplicator.this = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task2) {
                return RequestDeduplicator.a(RequestDeduplicator.this, str, task2);
            }
        });
        this.b.put(str, p);
        return p;
    }
}
