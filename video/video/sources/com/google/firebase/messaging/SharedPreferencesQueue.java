package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SharedPreferencesQueue {
    public final SharedPreferences a;
    public final String b;
    public final String c;
    public final Executor e;
    @InterfaceC8710pF0("internalQueue")
    @InterfaceC5056aJ2
    public final ArrayDeque<String> d = new ArrayDeque<>();
    @InterfaceC8710pF0("internalQueue")
    public boolean f = false;

    public SharedPreferencesQueue(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
        this.e = executor;
    }

    @InterfaceC10697xN2
    public static SharedPreferencesQueue j(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences, str, str2, executor);
        sharedPreferencesQueue.k();
        return sharedPreferencesQueue;
    }

    public boolean b(@InterfaceC5670cr1 String str) {
        boolean f;
        if (!TextUtils.isEmpty(str) && !str.contains(this.c)) {
            synchronized (this.d) {
                f = f(this.d.add(str));
            }
            return f;
        }
        return false;
    }

    @InterfaceC8710pF0("internalQueue")
    public void c() {
        this.f = true;
    }

    @InterfaceC5056aJ2
    public void d() {
        synchronized (this.d) {
            c();
        }
    }

    @InterfaceC8710pF0("internalQueue")
    public final String e(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        f(z);
        return str;
    }

    @InterfaceC8710pF0("internalQueue")
    public final boolean f(boolean z) {
        if (z && !this.f) {
            s();
        }
        return z;
    }

    public void g() {
        synchronized (this.d) {
            this.d.clear();
            f(true);
        }
    }

    @InterfaceC8710pF0("internalQueue")
    public void h() {
        this.f = false;
        s();
    }

    @InterfaceC5056aJ2
    public void i() {
        synchronized (this.d) {
            h();
        }
    }

    @InterfaceC10697xN2
    public final void k() {
        synchronized (this.d) {
            try {
                this.d.clear();
                String string = this.a.getString(this.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.c)) {
                    String[] split = string.split(this.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    @InterfaceC11300zs1
    public String l() {
        String peek;
        synchronized (this.d) {
            peek = this.d.peek();
        }
        return peek;
    }

    public String m() {
        String e;
        synchronized (this.d) {
            e = e(this.d.remove());
        }
        return e;
    }

    public boolean n(@InterfaceC11300zs1 Object obj) {
        boolean f;
        synchronized (this.d) {
            f = f(this.d.remove(obj));
        }
        return f;
    }

    @InterfaceC8710pF0("internalQueue")
    @InterfaceC5670cr1
    public String o() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.c);
        }
        return sb.toString();
    }

    @InterfaceC5056aJ2
    public String p() {
        String o2;
        synchronized (this.d) {
            o2 = o();
        }
        return o2;
    }

    public int q() {
        int size;
        synchronized (this.d) {
            size = this.d.size();
        }
        return size;
    }

    @InterfaceC10697xN2
    public final void r() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, o()).commit();
        }
    }

    public final void s() {
        this.e.execute(new Runnable() { // from class: com.google.firebase.messaging.k
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferencesQueue.this.r();
            }
        });
    }

    @InterfaceC5670cr1
    public List<String> t() {
        ArrayList arrayList;
        synchronized (this.d) {
            arrayList = new ArrayList(this.d);
        }
        return arrayList;
    }
}
