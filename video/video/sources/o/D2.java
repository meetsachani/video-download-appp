package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.AbstractC5713d2;
import o.InterfaceC3540Li1;

/* loaded from: classes.dex */
public abstract class D2<MessageType extends InterfaceC3540Li1> implements InterfaceC3892Oy1<MessageType> {
    public static final C3151Hj0 a = C3151Hj0.d();

    public final MessageType A(MessageType messagetype) throws C9258rT0 {
        if (messagetype != null && !messagetype.isInitialized()) {
            throw B(messagetype).a().j(messagetype);
        }
        return messagetype;
    }

    public final C5263bA2 B(MessageType messagetype) {
        if (messagetype instanceof AbstractC5713d2) {
            return ((AbstractC5713d2) messagetype).H0();
        }
        return new C5263bA2(messagetype);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: C */
    public MessageType d(InputStream inputStream) throws C9258rT0 {
        return w(inputStream, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: D */
    public MessageType w(InputStream inputStream, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return A(j(inputStream, c3151Hj0));
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: E */
    public MessageType q(InputStream inputStream) throws C9258rT0 {
        return e(inputStream, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: F */
    public MessageType e(InputStream inputStream, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return A(f(inputStream, c3151Hj0));
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: G */
    public MessageType v(ByteBuffer byteBuffer) throws C9258rT0 {
        return m(byteBuffer, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC3892Oy1
    /* renamed from: H */
    public MessageType m(ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        KE n = KE.n(byteBuffer);
        InterfaceC3540Li1 interfaceC3540Li1 = (InterfaceC3540Li1) x(n, c3151Hj0);
        try {
            n.a(0);
            return (MessageType) A(interfaceC3540Li1);
        } catch (C9258rT0 e) {
            throw e.j(interfaceC3540Li1);
        }
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: I */
    public MessageType y(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return g(abstractC8616os, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: J */
    public MessageType g(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return A(h(abstractC8616os, c3151Hj0));
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: K */
    public MessageType l(KE ke) throws C9258rT0 {
        return c(ke, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC3892Oy1
    /* renamed from: L */
    public MessageType c(KE ke, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (MessageType) A((InterfaceC3540Li1) x(ke, c3151Hj0));
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: M */
    public MessageType a(byte[] bArr) throws C9258rT0 {
        return o(bArr, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: N */
    public MessageType s(byte[] bArr, int i, int i2) throws C9258rT0 {
        return z(bArr, i, i2, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: O */
    public MessageType z(byte[] bArr, int i, int i2, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return A(b(bArr, i, i2, c3151Hj0));
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: P */
    public MessageType o(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return z(bArr, 0, bArr.length, c3151Hj0);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: Q */
    public MessageType k(InputStream inputStream) throws C9258rT0 {
        return j(inputStream, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: R */
    public MessageType j(InputStream inputStream, C3151Hj0 c3151Hj0) throws C9258rT0 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return f(new AbstractC5713d2.a.C0266a(inputStream, KE.O(read, inputStream)), c3151Hj0);
        } catch (IOException e) {
            throw new C9258rT0(e);
        }
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: S */
    public MessageType r(InputStream inputStream) throws C9258rT0 {
        return f(inputStream, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: T */
    public MessageType f(InputStream inputStream, C3151Hj0 c3151Hj0) throws C9258rT0 {
        KE j = KE.j(inputStream);
        MessageType messagetype = (MessageType) x(j, c3151Hj0);
        try {
            j.a(0);
            return messagetype;
        } catch (C9258rT0 e) {
            throw e.j(messagetype);
        }
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: U */
    public MessageType n(AbstractC8616os abstractC8616os) throws C9258rT0 {
        return h(abstractC8616os, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: V */
    public MessageType h(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        KE d0 = abstractC8616os.d0();
        MessageType messagetype = (MessageType) x(d0, c3151Hj0);
        try {
            d0.a(0);
            return messagetype;
        } catch (C9258rT0 e) {
            throw e.j(messagetype);
        }
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: W */
    public MessageType u(KE ke) throws C9258rT0 {
        return (MessageType) x(ke, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: X */
    public MessageType i(byte[] bArr) throws C9258rT0 {
        return b(bArr, 0, bArr.length, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: Y */
    public MessageType t(byte[] bArr, int i, int i2) throws C9258rT0 {
        return b(bArr, i, i2, a);
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: Z */
    public MessageType b(byte[] bArr, int i, int i2, C3151Hj0 c3151Hj0) throws C9258rT0 {
        KE q = KE.q(bArr, i, i2);
        MessageType messagetype = (MessageType) x(q, c3151Hj0);
        try {
            q.a(0);
            return messagetype;
        } catch (C9258rT0 e) {
            throw e.j(messagetype);
        }
    }

    @Override // o.InterfaceC3892Oy1
    /* renamed from: a0 */
    public MessageType p(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return b(bArr, 0, bArr.length, c3151Hj0);
    }
}
