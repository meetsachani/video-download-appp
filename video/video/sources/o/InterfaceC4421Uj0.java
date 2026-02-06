package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.Uj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4421Uj0 extends CU {
    int c(int i) throws IOException;

    boolean g(int i, boolean z) throws IOException;

    long getLength();

    long getPosition();

    boolean h(byte[] bArr, int i, int i2, boolean z) throws IOException;

    void i();

    boolean j(byte[] bArr, int i, int i2, boolean z) throws IOException;

    long n();

    void p(int i) throws IOException;

    <E extends Throwable> void q(long j, E e) throws Throwable;

    int r(byte[] bArr, int i, int i2) throws IOException;

    @Override // o.CU
    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;

    void t(int i) throws IOException;

    boolean v(int i, boolean z) throws IOException;

    void x(byte[] bArr, int i, int i2) throws IOException;
}
