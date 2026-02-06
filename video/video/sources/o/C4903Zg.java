package o;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC5143ah;

@Deprecated
/* renamed from: o.Zg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4903Zg {
    public final AbstractC5317bO0<InterfaceC5143ah> a;
    public final List<InterfaceC5143ah> b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public InterfaceC5143ah.a d;
    public InterfaceC5143ah.a e;
    public boolean f;

    public C4903Zg(AbstractC5317bO0<InterfaceC5143ah> abstractC5317bO0) {
        this.a = abstractC5317bO0;
        InterfaceC5143ah.a aVar = InterfaceC5143ah.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f = false;
    }

    @InterfaceC6181ey
    public InterfaceC5143ah.a a(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        if (!aVar.equals(InterfaceC5143ah.a.e)) {
            for (int i = 0; i < this.a.size(); i++) {
                InterfaceC5143ah interfaceC5143ah = this.a.get(i);
                InterfaceC5143ah.a e = interfaceC5143ah.e(aVar);
                if (interfaceC5143ah.h()) {
                    C9542sf.i(!e.equals(InterfaceC5143ah.a.e));
                    aVar = e;
                }
            }
            this.e = aVar;
            return aVar;
        }
        throw new InterfaceC5143ah.b(aVar);
    }

    public void b() {
        this.b.clear();
        this.d = this.e;
        this.f = false;
        for (int i = 0; i < this.a.size(); i++) {
            InterfaceC5143ah interfaceC5143ah = this.a.get(i);
            interfaceC5143ah.flush();
            if (interfaceC5143ah.h()) {
                this.b.add(interfaceC5143ah);
            }
        }
        this.c = new ByteBuffer[this.b.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = this.b.get(i2).d();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public ByteBuffer d() {
        if (!g()) {
            return InterfaceC5143ah.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (!byteBuffer.hasRemaining()) {
            h(InterfaceC5143ah.a);
        }
        return byteBuffer;
    }

    public InterfaceC5143ah.a e() {
        return this.d;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4903Zg)) {
            return false;
        }
        C4903Zg c4903Zg = (C4903Zg) obj;
        if (this.a.size() != c4903Zg.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i) != c4903Zg.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        if (this.f && this.b.get(c()).c() && !this.c[c()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return !this.b.isEmpty();
    }

    public final void h(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        boolean z2;
        for (boolean z3 = true; z3; z3 = z) {
            z = false;
            for (int i = 0; i <= c(); i++) {
                if (!this.c[i].hasRemaining()) {
                    InterfaceC5143ah interfaceC5143ah = this.b.get(i);
                    if (interfaceC5143ah.c()) {
                        if (!this.c[i].hasRemaining() && i < c()) {
                            this.b.get(i + 1).g();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = InterfaceC5143ah.a;
                        }
                        interfaceC5143ah.f(byteBuffer2);
                        this.c[i] = interfaceC5143ah.d();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z |= z2;
                    }
                }
            }
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i() {
        if (g() && !this.f) {
            this.f = true;
            this.b.get(0).g();
        }
    }

    public void j(ByteBuffer byteBuffer) {
        if (g() && !this.f) {
            h(byteBuffer);
        }
    }

    public void k() {
        for (int i = 0; i < this.a.size(); i++) {
            InterfaceC5143ah interfaceC5143ah = this.a.get(i);
            interfaceC5143ah.flush();
            interfaceC5143ah.reset();
        }
        this.c = new ByteBuffer[0];
        InterfaceC5143ah.a aVar = InterfaceC5143ah.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f = false;
    }
}
