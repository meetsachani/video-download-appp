package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.Li1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3540Li1 extends InterfaceC3637Mi1 {

    /* renamed from: o.Li1$a */
    /* loaded from: classes.dex */
    public interface a extends InterfaceC3637Mi1, Cloneable {
        a B3(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0;

        a D3(byte[] bArr) throws C9258rT0;

        boolean F3(InputStream inputStream) throws IOException;

        a G3(KE ke) throws IOException;

        a Q3(AbstractC8616os abstractC8616os) throws C9258rT0;

        a U0(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0;

        a V3(byte[] bArr, int i, int i2) throws C9258rT0;

        InterfaceC3540Li1 build();

        a clear();

        /* renamed from: clone */
        a mo14clone();

        a d3(byte[] bArr, int i, int i2, C3151Hj0 c3151Hj0) throws C9258rT0;

        a h4(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException;

        InterfaceC3540Li1 i2();

        boolean l2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException;

        a q3(InterfaceC3540Li1 interfaceC3540Li1);

        a x1(InputStream inputStream) throws IOException;

        a y3(KE ke, C3151Hj0 c3151Hj0) throws IOException;
    }

    void B(OutputStream outputStream) throws IOException;

    AbstractC8616os G();

    int N();

    a k0();

    InterfaceC3892Oy1<? extends InterfaceC3540Li1> k1();

    byte[] p();

    void r0(ME me) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;

    a x();
}
