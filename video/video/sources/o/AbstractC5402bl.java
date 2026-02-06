package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.InterfaceC5143ah;

@Deprecated
/* renamed from: o.bl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5402bl implements InterfaceC5143ah {
    public InterfaceC5143ah.a b;
    public InterfaceC5143ah.a c;
    public InterfaceC5143ah.a d;
    public InterfaceC5143ah.a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public AbstractC5402bl() {
        ByteBuffer byteBuffer = InterfaceC5143ah.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        InterfaceC5143ah.a aVar = InterfaceC5143ah.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public final boolean a() {
        return this.g.hasRemaining();
    }

    @InterfaceC6181ey
    public InterfaceC5143ah.a b(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        return InterfaceC5143ah.a.e;
    }

    @Override // o.InterfaceC5143ah
    @InterfaceC2591Bt
    public boolean c() {
        if (this.h && this.g == InterfaceC5143ah.a) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC5143ah
    @InterfaceC2591Bt
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = InterfaceC5143ah.a;
        return byteBuffer;
    }

    @Override // o.InterfaceC5143ah
    @InterfaceC6181ey
    public final InterfaceC5143ah.a e(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        this.d = aVar;
        this.e = b(aVar);
        if (h()) {
            return this.e;
        }
        return InterfaceC5143ah.a.e;
    }

    @Override // o.InterfaceC5143ah
    public final void flush() {
        this.g = InterfaceC5143ah.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // o.InterfaceC5143ah
    public final void g() {
        this.h = true;
        j();
    }

    @Override // o.InterfaceC5143ah
    public boolean h() {
        if (this.e != InterfaceC5143ah.a.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // o.InterfaceC5143ah
    public final void reset() {
        flush();
        this.f = InterfaceC5143ah.a;
        InterfaceC5143ah.a aVar = InterfaceC5143ah.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
