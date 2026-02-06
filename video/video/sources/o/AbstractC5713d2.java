package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.AbstractC5713d2;
import o.AbstractC5713d2.a;
import o.AbstractC8616os;
import o.InterfaceC3540Li1;

/* renamed from: o.d2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5713d2<MessageType extends AbstractC5713d2<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC3540Li1 {
    protected int memoizedHashCode = 0;

    /* renamed from: o.d2$b */
    /* loaded from: classes.dex */
    public interface b {
        int k();
    }

    @Deprecated
    public static <T> void a(Iterable<T> iterable, Collection<? super T> collection) {
        a.s1(iterable, (List) collection);
    }

    public static <T> void a0(Iterable<T> iterable, List<? super T> list) {
        a.s1(iterable, list);
    }

    public static void e0(AbstractC8616os abstractC8616os) throws IllegalArgumentException {
        if (abstractC8616os.Y()) {
            return;
        }
        throw new IllegalArgumentException("Byte string is not UTF-8.");
    }

    @Override // o.InterfaceC3540Li1
    public void B(OutputStream outputStream) throws IOException {
        int N = N();
        ME j1 = ME.j1(outputStream, ME.J0(ME.L0(N) + N));
        j1.Z1(N);
        r0(j1);
        j1.e1();
    }

    public int B0() {
        throw new UnsupportedOperationException();
    }

    public int E0(InterfaceC9026qY1 interfaceC9026qY1) {
        int B0 = B0();
        if (B0 == -1) {
            int g = interfaceC9026qY1.g(this);
            Z0(g);
            return g;
        }
        return B0;
    }

    @Override // o.InterfaceC3540Li1
    public AbstractC8616os G() {
        try {
            AbstractC8616os.h b0 = AbstractC8616os.b0(N());
            r0(b0.b());
            return b0.a();
        } catch (IOException e) {
            throw new RuntimeException(G0("ByteString"), e);
        }
    }

    public final String G0(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public C5263bA2 H0() {
        return new C5263bA2(this);
    }

    public void Z0(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC3540Li1
    public byte[] p() {
        try {
            byte[] bArr = new byte[N()];
            ME n1 = ME.n1(bArr);
            r0(n1);
            n1.Z();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(G0("byte array"), e);
        }
    }

    @Override // o.InterfaceC3540Li1
    public void writeTo(OutputStream outputStream) throws IOException {
        ME j1 = ME.j1(outputStream, ME.J0(N()));
        r0(j1);
        j1.e1();
    }

    /* renamed from: o.d2$a */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends AbstractC5713d2<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC3540Li1.a {
        public static C5263bA2 K1(InterfaceC3540Li1 interfaceC3540Li1) {
            return new C5263bA2(interfaceC3540Li1);
        }

        @Deprecated
        public static <T> void r1(Iterable<T> iterable, Collection<? super T> collection) {
            s1(iterable, (List) collection);
        }

        public static <T> void s1(Iterable<T> iterable, List<? super T> list) {
            C9740tS0.d(iterable);
            if (iterable instanceof InterfaceC6581gZ0) {
                List<?> D1 = ((InterfaceC6581gZ0) iterable).D1();
                InterfaceC6581gZ0 interfaceC6581gZ0 = (InterfaceC6581gZ0) list;
                int size = list.size();
                for (Object obj : D1) {
                    if (obj == null) {
                        String str = "Element at index " + (interfaceC6581gZ0.size() - size) + " is null.";
                        for (int size2 = interfaceC6581gZ0.size() - 1; size2 >= size; size2--) {
                            interfaceC6581gZ0.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (obj instanceof AbstractC8616os) {
                        interfaceC6581gZ0.E3((AbstractC8616os) obj);
                    } else {
                        interfaceC6581gZ0.add((String) obj);
                    }
                }
            } else if (iterable instanceof InterfaceC7989mH1) {
                list.addAll((Collection) iterable);
            } else {
                t1(iterable, list);
            }
        }

        public static <T> void t1(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: A1 */
        public BuilderType Q3(AbstractC8616os abstractC8616os) throws C9258rT0 {
            try {
                KE d0 = abstractC8616os.d0();
                G3(d0);
                d0.a(0);
                return this;
            } catch (C9258rT0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(v1("ByteString"), e2);
            }
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: B1 */
        public BuilderType B3(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
            try {
                KE d0 = abstractC8616os.d0();
                y3(d0, c3151Hj0);
                d0.a(0);
                return this;
            } catch (C9258rT0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(v1("ByteString"), e2);
            }
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: C1 */
        public BuilderType G3(KE ke) throws IOException {
            return y3(ke, C3151Hj0.d());
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: D1 */
        public abstract BuilderType y3(KE ke, C3151Hj0 c3151Hj0) throws IOException;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC3540Li1.a
        /* renamed from: E1 */
        public BuilderType q3(InterfaceC3540Li1 interfaceC3540Li1) {
            if (u0().getClass().isInstance(interfaceC3540Li1)) {
                return (BuilderType) w1((AbstractC5713d2) interfaceC3540Li1);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: F1 */
        public BuilderType D3(byte[] bArr) throws C9258rT0 {
            return V3(bArr, 0, bArr.length);
        }

        @Override // o.InterfaceC3540Li1.a
        public boolean F3(InputStream inputStream) throws IOException {
            return l2(inputStream, C3151Hj0.d());
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: G1 */
        public BuilderType V3(byte[] bArr, int i, int i2) throws C9258rT0 {
            try {
                KE q = KE.q(bArr, i, i2);
                G3(q);
                q.a(0);
                return this;
            } catch (C9258rT0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(v1("byte array"), e2);
            }
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: H1 */
        public BuilderType d3(byte[] bArr, int i, int i2, C3151Hj0 c3151Hj0) throws C9258rT0 {
            try {
                KE q = KE.q(bArr, i, i2);
                y3(q, c3151Hj0);
                q.a(0);
                return this;
            } catch (C9258rT0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(v1("byte array"), e2);
            }
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: J1 */
        public BuilderType U0(byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return d3(bArr, 0, bArr.length, c3151Hj0);
        }

        @Override // o.InterfaceC3540Li1.a
        public boolean l2(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            h4(new C0266a(inputStream, KE.O(read, inputStream)), c3151Hj0);
            return true;
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: u1 */
        public abstract BuilderType mo14clone();

        public final String v1(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public abstract BuilderType w1(MessageType messagetype);

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: y1 */
        public BuilderType x1(InputStream inputStream) throws IOException {
            KE j = KE.j(inputStream);
            G3(j);
            j.a(0);
            return this;
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: z1 */
        public BuilderType h4(InputStream inputStream, C3151Hj0 c3151Hj0) throws IOException {
            KE j = KE.j(inputStream);
            y3(j, c3151Hj0);
            j.a(0);
            return this;
        }

        /* renamed from: o.d2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0266a extends FilterInputStream {
            public int X;

            public C0266a(InputStream inputStream, int i) {
                super(inputStream);
                this.X = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.X);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.X <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.X--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, this.X));
                if (skip >= 0) {
                    this.X = (int) (this.X - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.X;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.X -= read;
                }
                return read;
            }
        }
    }
}
