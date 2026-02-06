package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public class AbtComponent {
    @InterfaceC8710pF0("this")
    public final Map<String, FirebaseABTesting> a = new HashMap();
    public final Context b;
    public final Provider<AnalyticsConnector> c;

    @InterfaceC5056aJ2(otherwise = 3)
    public AbtComponent(Context context, Provider<AnalyticsConnector> provider) {
        this.b = context;
        this.c = provider;
    }

    @InterfaceC5056aJ2
    public FirebaseABTesting a(String str) {
        return new FirebaseABTesting(this.b, this.c, str);
    }

    public synchronized FirebaseABTesting b(String str) {
        try {
            if (!this.a.containsKey(str)) {
                this.a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a.get(str);
    }
}
