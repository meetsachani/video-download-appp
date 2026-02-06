package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import o.InterfaceC10251va;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zze {
    public final Executor a;

    public zze(Executor executor) {
        this.a = executor;
    }

    @InterfaceC10251va
    public final Executor a() {
        return this.a;
    }

    @InterfaceC10251va
    public final void b(@InterfaceC11300zs1 final String str, @InterfaceC11300zs1 final String str2, final zzd... zzdVarArr) {
        this.a.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzc
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                if (TextUtils.isEmpty(str3)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String str4 = str2;
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str4);
                        return;
                    }
                }
                zzd[] zzdVarArr2 = zzdVarArr;
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                for (final zzd zzdVar : zzdVarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(zzd.this.b(lowerCase, jSONObject));
                        }
                    });
                    zzdVar.a().execute(futureTask);
                    try {
                    } catch (InterruptedException e) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e);
                    } catch (ExecutionException e2) {
                        Log.d("UserMessagingPlatform", "Failed to run Action[" + lowerCase + "]: ", e2.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
