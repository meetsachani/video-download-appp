package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class zzbzg {
    public final Clock a;
    public final zzbzr b;
    public final String e;
    public final String f;
    public final Object d = new Object();
    public long g = -1;
    public long h = -1;
    public long i = 0;
    public long j = -1;
    public long k = -1;
    public final LinkedList c = new LinkedList();

    public zzbzg(Clock clock, zzbzr zzbzrVar, String str, String str2) {
        this.a = clock;
        this.b = zzbzrVar;
        this.e = str;
        this.f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.e);
                bundle.putString("slotid", this.f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.j);
                bundle.putLong("tresponse", this.k);
                bundle.putLong("timp", this.g);
                bundle.putLong("tload", this.h);
                bundle.putLong("pcc", this.i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzbzf) it.next()).b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String c() {
        return this.e;
    }

    public final void d() {
        synchronized (this.d) {
            try {
                if (this.k != -1) {
                    zzbzf zzbzfVar = new zzbzf(this);
                    zzbzfVar.d();
                    this.c.add(zzbzfVar);
                    this.i++;
                    zzbzr zzbzrVar = this.b;
                    zzbzrVar.e();
                    zzbzrVar.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            try {
                if (this.k != -1) {
                    LinkedList linkedList = this.c;
                    if (!linkedList.isEmpty()) {
                        zzbzf zzbzfVar = (zzbzf) linkedList.getLast();
                        if (zzbzfVar.a() == -1) {
                            zzbzfVar.c();
                            this.b.d(this);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.d) {
            try {
                if (this.k != -1 && this.g == -1) {
                    this.g = this.a.b();
                    this.b.d(this);
                }
                this.b.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.d) {
            this.b.g();
        }
    }

    public final void h(boolean z) {
        synchronized (this.d) {
            try {
                if (this.k != -1) {
                    this.h = this.a.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.d) {
            this.b.h();
        }
    }

    public final void j(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        synchronized (this.d) {
            long b = this.a.b();
            this.j = b;
            this.b.i(zzmVar, b);
        }
    }

    public final void k(long j) {
        synchronized (this.d) {
            try {
                this.k = j;
                if (j != -1) {
                    this.b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
