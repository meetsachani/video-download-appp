package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzam {
    public final Context a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();

    public zzam(Application application) {
        this.a = application.getApplicationContext();
    }

    public final Object a(String str) {
        Object obj;
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() != null && (obj = ((Bundle) atomicReference.get()).get(str)) != null) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        return null;
    }

    public final void b(Context context) {
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() == null) {
            try {
                atomicReference.set(Wrappers.a(context).c(context.getPackageName(), 128).metaData);
            } catch (PackageManager.NameNotFoundException | NullPointerException e) {
                Log.w("UserMessagingPlatform", "Failed to get metadata. ", e);
            }
        }
    }

    public final void c(Map map) {
        Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map.toString()));
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            try {
                hashMap.put((Enum) ((Method) this.e.get()).invoke(null, str), (Enum) ((Method) this.d.get()).invoke(null, map.get(str)));
            } catch (Exception e) {
                Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
            }
        }
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() != null && !hashMap.isEmpty()) {
            try {
                ((Method) atomicReference.get()).invoke(this.b.get(), hashMap);
            } catch (Exception e2) {
                Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e2);
            }
        }
    }

    public final boolean d() {
        AtomicReference atomicReference = this.g;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context context = this.a;
        if (context == null) {
            atomicReference.set(Boolean.FALSE);
            return false;
        }
        try {
            this.b.set(FirebaseAnalytics.class.getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            this.c.set(FirebaseAnalytics.class.getDeclaredMethod("setConsent", Map.class));
            Class<?> cls = Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentStatus");
            Class<?> cls2 = Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentType");
            Method declaredMethod = cls.getDeclaredMethod("valueOf", String.class);
            Method declaredMethod2 = cls2.getDeclaredMethod("valueOf", String.class);
            this.d.set(declaredMethod);
            this.e.set(declaredMethod2);
            this.g.set(Boolean.TRUE);
            return true;
        } catch (Exception e) {
            Log.w("UserMessagingPlatform", "No Firebase class found. ", e);
            this.g.set(Boolean.FALSE);
            return false;
        }
    }
}
