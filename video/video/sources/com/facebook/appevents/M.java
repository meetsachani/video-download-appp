package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.S;
import com.facebook.internal.C2358c;
import com.facebook.internal.l0;
import java.util.ArrayList;
import java.util.List;
import o.C2826Ee0;
import o.C6562gT0;
import o.C7081id;
import o.C7458kA2;
import o.C9516sY;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class M {
    @NotNull
    public static final a f = new a(null);
    public static final String g = M.class.getSimpleName();
    public static final int h = 1000;
    @NotNull
    public final C2358c a;
    @NotNull
    public final String b;
    @NotNull
    public List<C2315e> c;
    @NotNull
    public final List<C2315e> d;
    public int e;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public M(@NotNull C2358c c2358c, @NotNull String str) {
        C6562gT0.p(c2358c, "attributionIdentifiers");
        C6562gT0.p(str, "anonymousAppDeviceGUID");
        this.a = c2358c;
        this.b = str;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final synchronized void a(@NotNull List<C2315e> list) {
        if (SQ.e(this)) {
            return;
        }
        C6562gT0.p(list, "events");
        this.c.addAll(list);
    }

    public final synchronized void b(@NotNull C2315e c2315e) {
        if (SQ.e(this)) {
            return;
        }
        C6562gT0.p(c2315e, "event");
        if (this.c.size() + this.d.size() >= h) {
            this.e++;
        } else {
            this.c.add(c2315e);
        }
    }

    public final synchronized void c(boolean z) {
        if (SQ.e(this)) {
            return;
        }
        if (z) {
            this.c.addAll(this.d);
        }
        this.d.clear();
        this.e = 0;
    }

    public final synchronized int d() {
        if (SQ.e(this)) {
            return 0;
        }
        return this.c.size();
    }

    @NotNull
    public final synchronized List<C2315e> e() {
        if (SQ.e(this)) {
            return null;
        }
        List<C2315e> list = this.c;
        this.c = new ArrayList();
        return list;
    }

    public final int f(@NotNull S s, @NotNull Context context, boolean z, boolean z2) {
        Throwable th;
        Throwable th2;
        if (SQ.e(this)) {
            return 0;
        }
        try {
            C6562gT0.p(s, "request");
            C6562gT0.p(context, "applicationContext");
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            synchronized (this) {
                try {
                    int i = this.e;
                    C2826Ee0 c2826Ee0 = C2826Ee0.a;
                    C2826Ee0.d(this.c);
                    this.d.addAll(this.c);
                    this.c.clear();
                    JSONArray jSONArray = new JSONArray();
                    for (C2315e c2315e : this.d) {
                        try {
                            if (c2315e.h()) {
                                if (!z && c2315e.i()) {
                                }
                                jSONArray.put(c2315e.f());
                            } else {
                                l0 l0Var = l0.a;
                                l0.m0(g, C6562gT0.C("Event with invalid checksum: ", c2315e));
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            throw th2;
                        }
                    }
                    if (jSONArray.length() == 0) {
                        try {
                            return 0;
                        } catch (Throwable th5) {
                            th = th5;
                            SQ.c(th, this);
                            return 0;
                        }
                    }
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    g(s, context, i, jSONArray, z2);
                    return jSONArray.length();
                } catch (Throwable th6) {
                    th2 = th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            th = th;
            SQ.c(th, this);
            return 0;
        }
    }

    public final void g(S s, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            if (!SQ.e(this)) {
                try {
                    C7081id c7081id = C7081id.a;
                    jSONObject = C7081id.a(C7081id.a.CUSTOM_APP_EVENTS, this.a, this.b, z, context);
                    if (this.e > 0) {
                        jSONObject.put("num_skipped_events", i);
                    }
                } catch (JSONException unused) {
                    jSONObject = new JSONObject();
                }
                s.o0(jSONObject);
                Bundle K = s.K();
                String jSONArray2 = jSONArray.toString();
                C6562gT0.o(jSONArray2, "events.toString()");
                K.putString("custom_events", jSONArray2);
                s.s0(jSONArray2);
                s.r0(K);
            }
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
