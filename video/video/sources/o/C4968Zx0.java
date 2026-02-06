package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.Zx0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4968Zx0 implements InterfaceC4421Uj0 {
    public final InterfaceC4421Uj0 b;

    public C4968Zx0(InterfaceC4421Uj0 interfaceC4421Uj0) {
        this.b = interfaceC4421Uj0;
    }

    @Override // o.InterfaceC4421Uj0
    public int c(int i) throws IOException {
        return this.b.c(i);
    }

    @Override // o.InterfaceC4421Uj0
    public boolean g(int i, boolean z) throws IOException {
        return this.b.g(i, z);
    }

    @Override // o.InterfaceC4421Uj0
    public long getLength() {
        return this.b.getLength();
    }

    @Override // o.InterfaceC4421Uj0
    public long getPosition() {
        return this.b.getPosition();
    }

    @Override // o.InterfaceC4421Uj0
    public boolean h(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.b.h(bArr, i, i2, z);
    }

    @Override // o.InterfaceC4421Uj0
    public void i() {
        this.b.i();
    }

    @Override // o.InterfaceC4421Uj0
    public boolean j(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.b.j(bArr, i, i2, z);
    }

    @Override // o.InterfaceC4421Uj0
    public long n() {
        return this.b.n();
    }

    @Override // o.InterfaceC4421Uj0
    public void p(int i) throws IOException {
        this.b.p(i);
    }

    @Override // o.InterfaceC4421Uj0
    public <E extends Throwable> void q(long j, E e) throws Throwable {
        this.b.q(j, e);
    }

    @Override // o.InterfaceC4421Uj0
    public int r(byte[] bArr, int i, int i2) throws IOException {
        return this.b.r(bArr, i, i2);
    }

    @Override // o.InterfaceC4421Uj0, o.CU
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.b.read(bArr, i, i2);
    }

    @Override // o.InterfaceC4421Uj0
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.b.readFully(bArr, i, i2);
    }

    @Override // o.InterfaceC4421Uj0
    public void t(int i) throws IOException {
        this.b.t(i);
    }

    @Override // o.InterfaceC4421Uj0
    public boolean v(int i, boolean z) throws IOException {
        return this.b.v(i, z);
    }

    @Override // o.InterfaceC4421Uj0
    public void x(byte[] bArr, int i, int i2) throws IOException {
        this.b.x(bArr, i, i2);
    }
}
