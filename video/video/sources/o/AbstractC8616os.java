package o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.os  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8616os implements Iterable<Byte>, Serializable {
    public static final int Y = 128;
    public static final int Y0 = 8192;
    public static final int Z = 256;
    public static final AbstractC8616os Z0 = new j(C9740tS0.d);
    public static final f a1;
    public static final int b1 = 255;
    public static final Comparator<AbstractC8616os> c1;
    public int X = 0;

    /* renamed from: o.os$a */
    /* loaded from: classes.dex */
    public class a extends c {
        public int X = 0;
        public final int Y;

        public a() {
            this.Y = AbstractC8616os.this.size();
        }

        @Override // o.AbstractC8616os.g
        public byte I0() {
            int i = this.X;
            if (i < this.Y) {
                this.X = i + 1;
                return AbstractC8616os.this.V(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.os$b */
    /* loaded from: classes.dex */
    public static class b implements Comparator<AbstractC8616os> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC8616os abstractC8616os, AbstractC8616os abstractC8616os2) {
            g it = abstractC8616os.iterator();
            g it2 = abstractC8616os2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(AbstractC8616os.w0(it.I0()), AbstractC8616os.w0(it2.I0()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(abstractC8616os.size(), abstractC8616os2.size());
        }
    }

    /* renamed from: o.os$c */
    /* loaded from: classes.dex */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(I0());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.os$d */
    /* loaded from: classes.dex */
    public static final class d implements f {
        public d() {
        }

        @Override // o.AbstractC8616os.f
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: o.os$e */
    /* loaded from: classes.dex */
    public static final class e extends j {
        private static final long serialVersionUID = 1;
        public final int e1;
        public final int f1;

        public e(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractC8616os.k(i, i + i2, bArr.length);
            this.e1 = i;
            this.f1 = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // o.AbstractC8616os.j, o.AbstractC8616os
        public void M(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d1, O0() + i, bArr, i2, i3);
        }

        @Override // o.AbstractC8616os.j
        public int O0() {
            return this.e1;
        }

        @Override // o.AbstractC8616os.j, o.AbstractC8616os
        public byte V(int i) {
            return this.d1[this.e1 + i];
        }

        @Override // o.AbstractC8616os.j, o.AbstractC8616os
        public byte i(int i) {
            AbstractC8616os.j(i, size());
            return this.d1[this.e1 + i];
        }

        @Override // o.AbstractC8616os.j, o.AbstractC8616os
        public int size() {
            return this.f1;
        }

        public Object writeReplace() {
            return AbstractC8616os.F0(v0());
        }
    }

    /* renamed from: o.os$f */
    /* loaded from: classes.dex */
    public interface f {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* renamed from: o.os$g */
    /* loaded from: classes.dex */
    public interface g extends Iterator<Byte> {
        byte I0();
    }

    /* renamed from: o.os$h */
    /* loaded from: classes.dex */
    public static final class h {
        public final ME a;
        public final byte[] b;

        public /* synthetic */ h(int i, a aVar) {
            this(i);
        }

        public AbstractC8616os a() {
            this.a.Z();
            return new j(this.b);
        }

        public ME b() {
            return this.a;
        }

        public h(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = ME.n1(bArr);
        }
    }

    /* renamed from: o.os$i */
    /* loaded from: classes.dex */
    public static abstract class i extends AbstractC8616os {
        @Override // o.AbstractC8616os
        public void L0(AbstractC6898hs abstractC6898hs) throws IOException {
            J0(abstractC6898hs);
        }

        public abstract boolean N0(AbstractC8616os abstractC8616os, int i, int i2);

        @Override // o.AbstractC8616os
        public final int U() {
            return 0;
        }

        @Override // o.AbstractC8616os
        public final boolean X() {
            return true;
        }

        @Override // o.AbstractC8616os, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* renamed from: o.os$j */
    /* loaded from: classes.dex */
    public static class j extends i {
        private static final long serialVersionUID = 1;
        public final byte[] d1;

        public j(byte[] bArr) {
            bArr.getClass();
            this.d1 = bArr;
        }

        @Override // o.AbstractC8616os
        public final void H0(OutputStream outputStream) throws IOException {
            outputStream.write(v0());
        }

        @Override // o.AbstractC8616os
        public final void J(ByteBuffer byteBuffer) {
            byteBuffer.put(this.d1, O0(), size());
        }

        @Override // o.AbstractC8616os
        public final void J0(AbstractC6898hs abstractC6898hs) throws IOException {
            abstractC6898hs.X(this.d1, O0(), size());
        }

        @Override // o.AbstractC8616os
        public final void K0(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.d1, O0() + i, i2);
        }

        @Override // o.AbstractC8616os
        public void M(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d1, i, bArr, i2, i3);
        }

        @Override // o.AbstractC8616os.i
        public final boolean N0(AbstractC8616os abstractC8616os, int i, int i2) {
            if (i2 <= abstractC8616os.size()) {
                int i3 = i + i2;
                if (i3 <= abstractC8616os.size()) {
                    if (abstractC8616os instanceof j) {
                        j jVar = (j) abstractC8616os;
                        byte[] bArr = this.d1;
                        byte[] bArr2 = jVar.d1;
                        int O0 = O0() + i2;
                        int O02 = O0();
                        int O03 = jVar.O0() + i;
                        while (O02 < O0) {
                            if (bArr[O02] != bArr2[O03]) {
                                return false;
                            }
                            O02++;
                            O03++;
                        }
                        return true;
                    }
                    return abstractC8616os.u0(i, i3).equals(u0(0, i2));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i + C6566gU0.h + i2 + C6566gU0.h + abstractC8616os.size());
            }
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }

        public int O0() {
            return 0;
        }

        @Override // o.AbstractC8616os
        public byte V(int i) {
            return this.d1[i];
        }

        @Override // o.AbstractC8616os
        public final boolean Y() {
            int O0 = O0();
            return BD2.u(this.d1, O0, size() + O0);
        }

        @Override // o.AbstractC8616os
        public final KE d0() {
            return KE.r(this.d1, O0(), size(), true);
        }

        @Override // o.AbstractC8616os
        public final ByteBuffer e() {
            return ByteBuffer.wrap(this.d1, O0(), size()).asReadOnlyBuffer();
        }

        @Override // o.AbstractC8616os
        public final InputStream e0() {
            return new ByteArrayInputStream(this.d1, O0(), size());
        }

        @Override // o.AbstractC8616os
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC8616os) || size() != ((AbstractC8616os) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                int l0 = l0();
                int l02 = jVar.l0();
                if (l0 != 0 && l02 != 0 && l0 != l02) {
                    return false;
                }
                return N0(jVar, 0, size());
            }
            return obj.equals(this);
        }

        @Override // o.AbstractC8616os
        public final List<ByteBuffer> f() {
            return Collections.singletonList(e());
        }

        @Override // o.AbstractC8616os
        public byte i(int i) {
            return this.d1[i];
        }

        @Override // o.AbstractC8616os
        public final int j0(int i, int i2, int i3) {
            return C9740tS0.w(i, this.d1, O0() + i2, i3);
        }

        @Override // o.AbstractC8616os
        public final int k0(int i, int i2, int i3) {
            int O0 = O0() + i2;
            return BD2.w(i, this.d1, O0, i3 + O0);
        }

        @Override // o.AbstractC8616os
        public int size() {
            return this.d1.length;
        }

        @Override // o.AbstractC8616os
        public final AbstractC8616os u0(int i, int i2) {
            int k = AbstractC8616os.k(i, i2, size());
            if (k == 0) {
                return AbstractC8616os.Z0;
            }
            return new e(this.d1, O0() + i, k);
        }

        @Override // o.AbstractC8616os
        public final String z0(Charset charset) {
            return new String(this.d1, O0(), size(), charset);
        }
    }

    /* renamed from: o.os$l */
    /* loaded from: classes.dex */
    public static final class l implements f {
        public l() {
        }

        @Override // o.AbstractC8616os.f
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ l(a aVar) {
            this();
        }
    }

    static {
        f dVar;
        if (T8.c()) {
            dVar = new l(null);
        } else {
            dVar = new d(null);
        }
        a1 = dVar;
        c1 = new b();
    }

    public static AbstractC8616os B(ByteBuffer byteBuffer) {
        return D(byteBuffer, byteBuffer.remaining());
    }

    public static Comparator<AbstractC8616os> C0() {
        return c1;
    }

    public static AbstractC8616os D(ByteBuffer byteBuffer, int i2) {
        k(0, i2, byteBuffer.remaining());
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return new j(bArr);
    }

    public static AbstractC8616os E0(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return G0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        return new C5666cq1(byteBuffer);
    }

    public static AbstractC8616os F(byte[] bArr) {
        return G(bArr, 0, bArr.length);
    }

    public static AbstractC8616os F0(byte[] bArr) {
        return new j(bArr);
    }

    public static AbstractC8616os G(byte[] bArr, int i2, int i3) {
        k(i2, i2 + i3, bArr.length);
        return new j(a1.a(bArr, i2, i3));
    }

    public static AbstractC8616os G0(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    public static AbstractC8616os H(String str) {
        return new j(str.getBytes(C9740tS0.a));
    }

    public static h b0(int i2) {
        return new h(i2, null);
    }

    public static k f0() {
        return new k(128);
    }

    public static AbstractC8616os h(Iterator<AbstractC8616os> it, int i2) {
        if (i2 >= 1) {
            if (i2 == 1) {
                return it.next();
            }
            int i3 = i2 >>> 1;
            return h(it, i3).l(h(it, i2 - i3));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
    }

    public static k h0(int i2) {
        return new k(i2);
    }

    public static void j(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + C6566gU0.h + i3);
        }
    }

    public static int k(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) < 0) {
            if (i2 >= 0) {
                if (i3 < i2) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + C6566gU0.h + i3);
                }
                throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        return i5;
    }

    public static AbstractC8616os m0(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        if (i3 == 0) {
            return null;
        }
        return G(bArr, 0, i3);
    }

    public static AbstractC8616os n0(InputStream inputStream) throws IOException {
        return r0(inputStream, 256, 8192);
    }

    public static AbstractC8616os p(Iterable<AbstractC8616os> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<AbstractC8616os> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return Z0;
        }
        return h(iterable.iterator(), size);
    }

    public static AbstractC8616os p0(InputStream inputStream, int i2) throws IOException {
        return r0(inputStream, i2, i2);
    }

    public static AbstractC8616os r(String str, String str2) throws UnsupportedEncodingException {
        return new j(str.getBytes(str2));
    }

    public static AbstractC8616os r0(InputStream inputStream, int i2, int i3) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC8616os m0 = m0(inputStream, i2);
            if (m0 == null) {
                return p(arrayList);
            }
            arrayList.add(m0);
            i2 = Math.min(i2 * 2, i3);
        }
    }

    public static AbstractC8616os w(String str, Charset charset) {
        return new j(str.getBytes(charset));
    }

    public static int w0(byte b2) {
        return b2 & 255;
    }

    public final String B0() {
        return y0(C9740tS0.a);
    }

    public abstract void H0(OutputStream outputStream) throws IOException;

    public final void I0(OutputStream outputStream, int i2, int i3) throws IOException {
        k(i2, i2 + i3, size());
        if (i3 > 0) {
            K0(outputStream, i2, i3);
        }
    }

    public abstract void J(ByteBuffer byteBuffer);

    public abstract void J0(AbstractC6898hs abstractC6898hs) throws IOException;

    public void K(byte[] bArr, int i2) {
        L(bArr, 0, i2, size());
    }

    public abstract void K0(OutputStream outputStream, int i2, int i3) throws IOException;

    @Deprecated
    public final void L(byte[] bArr, int i2, int i3, int i4) {
        k(i2, i2 + i4, size());
        k(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            M(bArr, i2, i3, i4);
        }
    }

    public abstract void L0(AbstractC6898hs abstractC6898hs) throws IOException;

    public abstract void M(byte[] bArr, int i2, int i3, int i4);

    public final boolean Q(AbstractC8616os abstractC8616os) {
        if (size() >= abstractC8616os.size() && t0(size() - abstractC8616os.size()).equals(abstractC8616os)) {
            return true;
        }
        return false;
    }

    public abstract int U();

    public abstract byte V(int i2);

    public abstract boolean X();

    public abstract boolean Y();

    @Override // java.lang.Iterable
    /* renamed from: a0 */
    public g iterator() {
        return new a();
    }

    public abstract KE d0();

    public abstract ByteBuffer e();

    public abstract InputStream e0();

    public abstract boolean equals(Object obj);

    public abstract List<ByteBuffer> f();

    public final int hashCode() {
        int i2 = this.X;
        if (i2 == 0) {
            int size = size();
            i2 = j0(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.X = i2;
        }
        return i2;
    }

    public abstract byte i(int i2);

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract int j0(int i2, int i3, int i4);

    public abstract int k0(int i2, int i3, int i4);

    public final AbstractC8616os l(AbstractC8616os abstractC8616os) {
        if (Integer.MAX_VALUE - size() >= abstractC8616os.size()) {
            return C5102aV1.P0(this, abstractC8616os);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + C2555Bk.p1 + abstractC8616os.size());
    }

    public final int l0() {
        return this.X;
    }

    public final boolean s0(AbstractC8616os abstractC8616os) {
        if (size() < abstractC8616os.size() || !u0(0, abstractC8616os.size()).equals(abstractC8616os)) {
            return false;
        }
        return true;
    }

    public abstract int size();

    public final AbstractC8616os t0(int i2) {
        return u0(i2, size());
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract AbstractC8616os u0(int i2, int i3);

    public final byte[] v0() {
        int size = size();
        if (size == 0) {
            return C9740tS0.d;
        }
        byte[] bArr = new byte[size];
        M(bArr, 0, 0, size);
        return bArr;
    }

    public final String x0(String str) throws UnsupportedEncodingException {
        try {
            return y0(Charset.forName(str));
        } catch (UnsupportedCharsetException e2) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e2);
            throw unsupportedEncodingException;
        }
    }

    public final String y0(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return z0(charset);
    }

    public abstract String z0(Charset charset);

    /* renamed from: o.os$k */
    /* loaded from: classes.dex */
    public static final class k extends OutputStream {
        public static final byte[] a1 = new byte[0];
        public final int X;
        public final ArrayList<AbstractC8616os> Y;
        public byte[] Y0;
        public int Z;
        public int Z0;

        public k(int i) {
            if (i >= 0) {
                this.X = i;
                this.Y = new ArrayList<>();
                this.Y0 = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public final byte[] a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        public final void d(int i) {
            this.Y.add(new j(this.Y0));
            int length = this.Z + this.Y0.length;
            this.Z = length;
            this.Y0 = new byte[Math.max(this.X, Math.max(i, length >>> 1))];
            this.Z0 = 0;
        }

        public final void f() {
            int i = this.Z0;
            byte[] bArr = this.Y0;
            if (i < bArr.length) {
                if (i > 0) {
                    this.Y.add(new j(a(bArr, i)));
                }
            } else {
                this.Y.add(new j(this.Y0));
                this.Y0 = a1;
            }
            this.Z += this.Z0;
            this.Z0 = 0;
        }

        public synchronized void h() {
            this.Y.clear();
            this.Z = 0;
            this.Z0 = 0;
        }

        public synchronized int i() {
            return this.Z + this.Z0;
        }

        public synchronized AbstractC8616os j() {
            f();
            return AbstractC8616os.p(this.Y);
        }

        public void k(OutputStream outputStream) throws IOException {
            AbstractC8616os[] abstractC8616osArr;
            byte[] bArr;
            int i;
            synchronized (this) {
                ArrayList<AbstractC8616os> arrayList = this.Y;
                abstractC8616osArr = (AbstractC8616os[]) arrayList.toArray(new AbstractC8616os[arrayList.size()]);
                bArr = this.Y0;
                i = this.Z0;
            }
            for (AbstractC8616os abstractC8616os : abstractC8616osArr) {
                abstractC8616os.H0(outputStream);
            }
            outputStream.write(a(bArr, i));
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(i()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.Z0 == this.Y0.length) {
                    d(1);
                }
                byte[] bArr = this.Y0;
                int i2 = this.Z0;
                this.Z0 = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.Y0;
                int length = bArr2.length;
                int i3 = this.Z0;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.Z0 += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    d(i4);
                    System.arraycopy(bArr, i + length2, this.Y0, 0, i4);
                    this.Z0 = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
