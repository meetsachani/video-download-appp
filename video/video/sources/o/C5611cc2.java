package o;

@Deprecated
/* renamed from: o.cc2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5611cc2 extends C4968Zx0 {
    public final long c;

    public C5611cc2(InterfaceC4421Uj0 interfaceC4421Uj0, long j) {
        super(interfaceC4421Uj0);
        boolean z;
        if (interfaceC4421Uj0.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.c = j;
    }

    @Override // o.C4968Zx0, o.InterfaceC4421Uj0
    public long getLength() {
        return super.getLength() - this.c;
    }

    @Override // o.C4968Zx0, o.InterfaceC4421Uj0
    public long getPosition() {
        return super.getPosition() - this.c;
    }

    @Override // o.C4968Zx0, o.InterfaceC4421Uj0
    public long n() {
        return super.n() - this.c;
    }

    @Override // o.C4968Zx0, o.InterfaceC4421Uj0
    public <E extends Throwable> void q(long j, E e) throws Throwable {
        super.q(j + this.c, e);
    }
}
