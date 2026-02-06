package com.google.android.gms.internal.ads;

import java.util.LinkedList;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzfeb {
    public final int b;
    public final int c;
    public final LinkedList a = new LinkedList();
    public final zzffa d = new zzffa();

    public zzfeb(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.d.a();
    }

    public final int b() {
        i();
        return this.a.size();
    }

    public final long c() {
        return this.d.b();
    }

    public final long d() {
        return this.d.c();
    }

    @InterfaceC11300zs1
    public final zzfel e() {
        zzffa zzffaVar = this.d;
        zzffaVar.f();
        i();
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            return null;
        }
        zzfel zzfelVar = (zzfel) linkedList.remove();
        if (zzfelVar != null) {
            zzffaVar.h();
        }
        return zzfelVar;
    }

    public final zzfez f() {
        return this.d.d();
    }

    public final String g() {
        return this.d.e();
    }

    public final boolean h(zzfel zzfelVar) {
        this.d.f();
        i();
        LinkedList linkedList = this.a;
        if (linkedList.size() == this.b) {
            return false;
        }
        linkedList.add(zzfelVar);
        return true;
    }

    public final void i() {
        while (true) {
            LinkedList linkedList = this.a;
            if (!linkedList.isEmpty() && com.google.android.gms.ads.internal.zzv.d().a() - ((zzfel) linkedList.getFirst()).d >= this.c) {
                this.d.g();
                linkedList.remove();
            } else {
                return;
            }
        }
    }
}
