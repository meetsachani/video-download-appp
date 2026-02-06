package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
import o.D6;

/* loaded from: classes3.dex */
class WithinAppServiceBinder extends Binder {
    public final IntentHandler X;

    /* loaded from: classes3.dex */
    public interface IntentHandler {
        Task<Void> a(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.X = intentHandler;
    }

    public void b(final WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.X.a(bindRequest.a).f(new D6(), new OnCompleteListener() { // from class: com.google.firebase.messaging.n
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void a(Task task) {
                    WithinAppServiceConnection.BindRequest.this.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
