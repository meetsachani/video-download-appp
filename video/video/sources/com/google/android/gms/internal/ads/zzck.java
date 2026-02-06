package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzck {
    public final zzfyc a;
    public final List b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public zzck(zzfyc zzfycVar) {
        this.a = zzfycVar;
        zzcl zzclVar = zzcl.e;
        this.d = false;
    }

    public final zzcl a(zzcl zzclVar) throws zzcm {
        zzcl zzclVar2 = zzcl.e;
        if (!zzclVar.equals(zzclVar2)) {
            int i = 0;
            while (true) {
                zzfyc zzfycVar = this.a;
                if (i < zzfycVar.size()) {
                    zzcn zzcnVar = (zzcn) zzfycVar.get(i);
                    zzcl a = zzcnVar.a(zzclVar);
                    if (zzcnVar.g()) {
                        zzdc.f(!a.equals(zzclVar2));
                        zzclVar = a;
                    }
                    i++;
                } else {
                    return zzclVar;
                }
            }
        } else {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
    }

    public final ByteBuffer b() {
        if (!h()) {
            return zzcn.a;
        }
        ByteBuffer byteBuffer = this.c[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(zzcn.a);
        return this.c[i()];
    }

    public final void c() {
        List list = this.b;
        list.clear();
        this.d = false;
        int i = 0;
        while (true) {
            zzfyc zzfycVar = this.a;
            if (i >= zzfycVar.size()) {
                break;
            }
            zzcn zzcnVar = (zzcn) zzfycVar.get(i);
            zzcnVar.c();
            if (zzcnVar.g()) {
                list.add(zzcnVar);
            }
            i++;
        }
        this.c = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= i(); i2++) {
            this.c[i2] = ((zzcn) list.get(i2)).b();
        }
    }

    public final void d() {
        if (h() && !this.d) {
            this.d = true;
            ((zzcn) this.b.get(0)).f();
        }
    }

    public final void e(ByteBuffer byteBuffer) {
        if (h() && !this.d) {
            j(byteBuffer);
        }
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzfyc zzfycVar = this.a;
        int size = zzfycVar.size();
        zzfyc zzfycVar2 = ((zzck) obj).a;
        if (size != zzfycVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzfycVar.size(); i++) {
            if (zzfycVar.get(i) != zzfycVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        int i = 0;
        while (true) {
            zzfyc zzfycVar = this.a;
            if (i < zzfycVar.size()) {
                zzcn zzcnVar = (zzcn) zzfycVar.get(i);
                zzcnVar.c();
                zzcnVar.e();
                i++;
            } else {
                this.c = new ByteBuffer[0];
                zzcl zzclVar = zzcl.e;
                this.d = false;
                return;
            }
        }
    }

    public final boolean g() {
        if (this.d && ((zzcn) this.b.get(i())).h() && !this.c[i()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (!this.b.isEmpty()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return this.c.length - 1;
    }

    public final void j(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            z = false;
            for (int i = 0; i <= i(); i++) {
                if (!this.c[i].hasRemaining()) {
                    List list = this.b;
                    zzcn zzcnVar = (zzcn) list.get(i);
                    if (zzcnVar.h()) {
                        if (!this.c[i].hasRemaining() && i < i()) {
                            ((zzcn) list.get(i + 1)).f();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = zzcn.a;
                        }
                        zzcnVar.d(byteBuffer2);
                        this.c[i] = zzcnVar.b();
                        boolean z2 = true;
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    }
                }
            }
        } while (z);
    }
}
