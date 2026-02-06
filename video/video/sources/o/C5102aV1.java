package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.AbstractC8616os;
import o.InterfaceC8148mw2;

/* renamed from: o.aV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5102aV1 extends AbstractC8616os {
    public static final int[] i1 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, C3503Kz.h0, 233, 377, InterfaceC8148mw2.e.z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int d1;
    public final AbstractC8616os e1;
    public final AbstractC8616os f1;
    public final int g1;
    public final int h1;

    /* renamed from: o.aV1$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC8616os.c {
        public final c X;
        public AbstractC8616os.g Y = c();

        public a() {
            this.X = new c(C5102aV1.this, null);
        }

        @Override // o.AbstractC8616os.g
        public byte I0() {
            AbstractC8616os.g gVar = this.Y;
            if (gVar != null) {
                byte I0 = gVar.I0();
                if (!this.Y.hasNext()) {
                    this.Y = c();
                }
                return I0;
            }
            throw new NoSuchElementException();
        }

        public final AbstractC8616os.g c() {
            if (this.X.hasNext()) {
                return this.X.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.aV1$c */
    /* loaded from: classes.dex */
    public static final class c implements Iterator<AbstractC8616os.i> {
        public final ArrayDeque<C5102aV1> X;
        public AbstractC8616os.i Y;

        public /* synthetic */ c(AbstractC8616os abstractC8616os, a aVar) {
            this(abstractC8616os);
        }

        public final AbstractC8616os.i b(AbstractC8616os abstractC8616os) {
            while (abstractC8616os instanceof C5102aV1) {
                C5102aV1 c5102aV1 = (C5102aV1) abstractC8616os;
                this.X.push(c5102aV1);
                abstractC8616os = c5102aV1.e1;
            }
            return (AbstractC8616os.i) abstractC8616os;
        }

        public final AbstractC8616os.i c() {
            AbstractC8616os.i b;
            do {
                ArrayDeque<C5102aV1> arrayDeque = this.X;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    b = b(this.X.pop().f1);
                } else {
                    return null;
                }
            } while (b.isEmpty());
            return b;
        }

        @Override // java.util.Iterator
        /* renamed from: d */
        public AbstractC8616os.i next() {
            AbstractC8616os.i iVar = this.Y;
            if (iVar != null) {
                this.Y = c();
                return iVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(AbstractC8616os abstractC8616os) {
            if (abstractC8616os instanceof C5102aV1) {
                C5102aV1 c5102aV1 = (C5102aV1) abstractC8616os;
                ArrayDeque<C5102aV1> arrayDeque = new ArrayDeque<>(c5102aV1.U());
                this.X = arrayDeque;
                arrayDeque.push(c5102aV1);
                this.Y = b(c5102aV1.e1);
                return;
            }
            this.X = null;
            this.Y = (AbstractC8616os.i) abstractC8616os;
        }
    }

    public /* synthetic */ C5102aV1(AbstractC8616os abstractC8616os, AbstractC8616os abstractC8616os2, a aVar) {
        this(abstractC8616os, abstractC8616os2);
    }

    public static AbstractC8616os P0(AbstractC8616os abstractC8616os, AbstractC8616os abstractC8616os2) {
        if (abstractC8616os2.size() == 0) {
            return abstractC8616os;
        }
        if (abstractC8616os.size() == 0) {
            return abstractC8616os2;
        }
        int size = abstractC8616os.size() + abstractC8616os2.size();
        if (size < 128) {
            return Q0(abstractC8616os, abstractC8616os2);
        }
        if (abstractC8616os instanceof C5102aV1) {
            C5102aV1 c5102aV1 = (C5102aV1) abstractC8616os;
            if (c5102aV1.f1.size() + abstractC8616os2.size() < 128) {
                return new C5102aV1(c5102aV1.e1, Q0(c5102aV1.f1, abstractC8616os2));
            } else if (c5102aV1.e1.U() > c5102aV1.f1.U() && c5102aV1.U() > abstractC8616os2.U()) {
                return new C5102aV1(c5102aV1.e1, new C5102aV1(c5102aV1.f1, abstractC8616os2));
            }
        }
        if (size < i1[Math.max(abstractC8616os.U(), abstractC8616os2.U()) + 1]) {
            return new b(null).b(abstractC8616os, abstractC8616os2);
        }
        return new C5102aV1(abstractC8616os, abstractC8616os2);
    }

    public static AbstractC8616os Q0(AbstractC8616os abstractC8616os, AbstractC8616os abstractC8616os2) {
        int size = abstractC8616os.size();
        int size2 = abstractC8616os2.size();
        byte[] bArr = new byte[size + size2];
        abstractC8616os.L(bArr, 0, 0, size);
        abstractC8616os2.L(bArr, 0, size, size2);
        return AbstractC8616os.F0(bArr);
    }

    public static C5102aV1 T0(AbstractC8616os abstractC8616os, AbstractC8616os abstractC8616os2) {
        return new C5102aV1(abstractC8616os, abstractC8616os2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // o.AbstractC8616os
    public void H0(OutputStream outputStream) throws IOException {
        this.e1.H0(outputStream);
        this.f1.H0(outputStream);
    }

    @Override // o.AbstractC8616os
    public void J(ByteBuffer byteBuffer) {
        this.e1.J(byteBuffer);
        this.f1.J(byteBuffer);
    }

    @Override // o.AbstractC8616os
    public void J0(AbstractC6898hs abstractC6898hs) throws IOException {
        this.e1.J0(abstractC6898hs);
        this.f1.J0(abstractC6898hs);
    }

    @Override // o.AbstractC8616os
    public void K0(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.g1;
        if (i3 <= i4) {
            this.e1.K0(outputStream, i, i2);
        } else if (i >= i4) {
            this.f1.K0(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.e1.K0(outputStream, i, i5);
            this.f1.K0(outputStream, 0, i2 - i5);
        }
    }

    @Override // o.AbstractC8616os
    public void L0(AbstractC6898hs abstractC6898hs) throws IOException {
        this.f1.L0(abstractC6898hs);
        this.e1.L0(abstractC6898hs);
    }

    @Override // o.AbstractC8616os
    public void M(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.g1;
        if (i4 <= i5) {
            this.e1.M(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f1.M(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.e1.M(bArr, i, i2, i6);
            this.f1.M(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public final boolean R0(AbstractC8616os abstractC8616os) {
        boolean N0;
        c cVar = new c(this, null);
        AbstractC8616os.i next = cVar.next();
        c cVar2 = new c(abstractC8616os, null);
        AbstractC8616os.i next2 = cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                N0 = next.N0(next2, i2, min);
            } else {
                N0 = next2.N0(next, i, min);
            }
            if (!N0) {
                return false;
            }
            i3 += min;
            int i4 = this.d1;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i = 0;
                next = cVar.next();
            } else {
                i += min;
                next = next;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // o.AbstractC8616os
    public int U() {
        return this.h1;
    }

    @Override // o.AbstractC8616os
    public byte V(int i) {
        int i2 = this.g1;
        if (i < i2) {
            return this.e1.V(i);
        }
        return this.f1.V(i - i2);
    }

    @Override // o.AbstractC8616os
    public boolean X() {
        if (this.d1 >= i1[this.h1]) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8616os
    public boolean Y() {
        int k0 = this.e1.k0(0, 0, this.g1);
        AbstractC8616os abstractC8616os = this.f1;
        if (abstractC8616os.k0(k0, 0, abstractC8616os.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC8616os, java.lang.Iterable
    /* renamed from: a0 */
    public AbstractC8616os.g iterator() {
        return new a();
    }

    @Override // o.AbstractC8616os
    public KE d0() {
        return KE.j(new d());
    }

    @Override // o.AbstractC8616os
    public ByteBuffer e() {
        return ByteBuffer.wrap(v0()).asReadOnlyBuffer();
    }

    @Override // o.AbstractC8616os
    public InputStream e0() {
        return new d();
    }

    @Override // o.AbstractC8616os
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8616os)) {
            return false;
        }
        AbstractC8616os abstractC8616os = (AbstractC8616os) obj;
        if (this.d1 != abstractC8616os.size()) {
            return false;
        }
        if (this.d1 == 0) {
            return true;
        }
        int l0 = l0();
        int l02 = abstractC8616os.l0();
        if (l0 != 0 && l02 != 0 && l0 != l02) {
            return false;
        }
        return R0(abstractC8616os);
    }

    @Override // o.AbstractC8616os
    public List<ByteBuffer> f() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().e());
        }
        return arrayList;
    }

    @Override // o.AbstractC8616os
    public byte i(int i) {
        AbstractC8616os.j(i, this.d1);
        return V(i);
    }

    @Override // o.AbstractC8616os
    public int j0(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.g1;
        if (i4 <= i5) {
            return this.e1.j0(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f1.j0(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f1.j0(this.e1.j0(i, i2, i6), 0, i3 - i6);
    }

    @Override // o.AbstractC8616os
    public int k0(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.g1;
        if (i4 <= i5) {
            return this.e1.k0(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f1.k0(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f1.k0(this.e1.k0(i, i2, i6), 0, i3 - i6);
    }

    @Override // o.AbstractC8616os
    public int size() {
        return this.d1;
    }

    @Override // o.AbstractC8616os
    public AbstractC8616os u0(int i, int i2) {
        int k = AbstractC8616os.k(i, i2, this.d1);
        if (k == 0) {
            return AbstractC8616os.Z0;
        }
        if (k == this.d1) {
            return this;
        }
        int i3 = this.g1;
        if (i2 <= i3) {
            return this.e1.u0(i, i2);
        }
        if (i >= i3) {
            return this.f1.u0(i - i3, i2 - i3);
        }
        return new C5102aV1(this.e1.t0(i), this.f1.u0(0, i2 - this.g1));
    }

    public Object writeReplace() {
        return AbstractC8616os.F0(v0());
    }

    @Override // o.AbstractC8616os
    public String z0(Charset charset) {
        return new String(v0(), charset);
    }

    /* renamed from: o.aV1$b */
    /* loaded from: classes.dex */
    public static class b {
        public final ArrayDeque<AbstractC8616os> a;

        public b() {
            this.a = new ArrayDeque<>();
        }

        public final AbstractC8616os b(AbstractC8616os abstractC8616os, AbstractC8616os abstractC8616os2) {
            c(abstractC8616os);
            c(abstractC8616os2);
            AbstractC8616os pop = this.a.pop();
            while (!this.a.isEmpty()) {
                pop = new C5102aV1(this.a.pop(), pop, null);
            }
            return pop;
        }

        public final void c(AbstractC8616os abstractC8616os) {
            if (abstractC8616os.X()) {
                e(abstractC8616os);
            } else if (abstractC8616os instanceof C5102aV1) {
                C5102aV1 c5102aV1 = (C5102aV1) abstractC8616os;
                c(c5102aV1.e1);
                c(c5102aV1.f1);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC8616os.getClass());
            }
        }

        public final int d(int i) {
            int binarySearch = Arrays.binarySearch(C5102aV1.i1, i);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        public final void e(AbstractC8616os abstractC8616os) {
            int d = d(abstractC8616os.size());
            int[] iArr = C5102aV1.i1;
            int i = iArr[d + 1];
            if (!this.a.isEmpty() && this.a.peek().size() < i) {
                int i2 = iArr[d];
                AbstractC8616os pop = this.a.pop();
                while (!this.a.isEmpty() && this.a.peek().size() < i2) {
                    pop = new C5102aV1(this.a.pop(), pop, null);
                }
                C5102aV1 c5102aV1 = new C5102aV1(pop, abstractC8616os, null);
                while (!this.a.isEmpty()) {
                    if (this.a.peek().size() >= C5102aV1.i1[d(c5102aV1.size()) + 1]) {
                        break;
                    }
                    c5102aV1 = new C5102aV1(this.a.pop(), c5102aV1, null);
                }
                this.a.push(c5102aV1);
                return;
            }
            this.a.push(abstractC8616os);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C5102aV1(AbstractC8616os abstractC8616os, AbstractC8616os abstractC8616os2) {
        this.e1 = abstractC8616os;
        this.f1 = abstractC8616os2;
        int size = abstractC8616os.size();
        this.g1 = size;
        this.d1 = size + abstractC8616os2.size();
        this.h1 = Math.max(abstractC8616os.U(), abstractC8616os2.U()) + 1;
    }

    /* renamed from: o.aV1$d */
    /* loaded from: classes.dex */
    public class d extends InputStream {
        public c X;
        public AbstractC8616os.i Y;
        public int Y0;
        public int Z;
        public int Z0;
        public int a1;

        public d() {
            d();
        }

        public final void a() {
            if (this.Y != null) {
                int i = this.Y0;
                int i2 = this.Z;
                if (i == i2) {
                    this.Z0 += i2;
                    this.Y0 = 0;
                    if (this.X.hasNext()) {
                        AbstractC8616os.i next = this.X.next();
                        this.Y = next;
                        this.Z = next.size();
                        return;
                    }
                    this.Y = null;
                    this.Z = 0;
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return C5102aV1.this.size() - (this.Z0 + this.Y0);
        }

        public final void d() {
            c cVar = new c(C5102aV1.this, null);
            this.X = cVar;
            AbstractC8616os.i next = cVar.next();
            this.Y = next;
            this.Z = next.size();
            this.Y0 = 0;
            this.Z0 = 0;
        }

        public final int f(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                a();
                if (this.Y == null) {
                    if (i3 == i2) {
                        return -1;
                    }
                } else {
                    int min = Math.min(this.Z - this.Y0, i3);
                    if (bArr != null) {
                        this.Y.L(bArr, this.Y0, i, min);
                        i += min;
                    }
                    this.Y0 += min;
                    i3 -= min;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.a1 = this.Z0 + this.Y0;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return f(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            d();
            f(null, 0, this.a1);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return f(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            AbstractC8616os.i iVar = this.Y;
            if (iVar == null) {
                return -1;
            }
            int i = this.Y0;
            this.Y0 = i + 1;
            return iVar.i(i) & 255;
        }
    }
}
