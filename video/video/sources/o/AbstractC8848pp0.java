package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
/* renamed from: o.pp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8848pp0 implements Closeable {
    public final boolean X;
    public boolean Y;
    @NotNull
    public final ReentrantLock Y0 = GO2.b();
    public int Z;

    @InterfaceC8303na2({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    /* renamed from: o.pp0$a */
    /* loaded from: classes4.dex */
    public static final class a implements J82 {
        @NotNull
        public final AbstractC8848pp0 X;
        public long Y;
        public boolean Z;

        public a(@NotNull AbstractC8848pp0 abstractC8848pp0, long j) {
            C6562gT0.p(abstractC8848pp0, "fileHandle");
            this.X = abstractC8848pp0;
            this.Y = j;
        }

        public final boolean a() {
            return this.Z;
        }

        @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.Z) {
                return;
            }
            this.Z = true;
            ReentrantLock k = this.X.k();
            k.lock();
            try {
                AbstractC8848pp0 abstractC8848pp0 = this.X;
                abstractC8848pp0.Z--;
                if (this.X.Z == 0 && this.X.Y) {
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    k.unlock();
                    this.X.o();
                }
            } finally {
                k.unlock();
            }
        }

        @NotNull
        public final AbstractC8848pp0 d() {
            return this.X;
        }

        public final long f() {
            return this.Y;
        }

        @Override // o.J82, java.io.Flushable
        public void flush() {
            if (!this.Z) {
                this.X.p();
                return;
            }
            throw new IllegalStateException("closed");
        }

        public final void h(boolean z) {
            this.Z = z;
        }

        public final void i(long j) {
            this.Y = j;
        }

        @Override // o.J82
        @NotNull
        public C8120mp2 timeout() {
            return C8120mp2.NONE;
        }

        @Override // o.J82
        public void write(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "source");
            if (!this.Z) {
                this.X.M(this.Y, c5422bq, j);
                this.Y += j;
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    @InterfaceC8303na2({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    /* renamed from: o.pp0$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC7072ia2 {
        @NotNull
        public final AbstractC8848pp0 X;
        public long Y;
        public boolean Z;

        public b(@NotNull AbstractC8848pp0 abstractC8848pp0, long j) {
            C6562gT0.p(abstractC8848pp0, "fileHandle");
            this.X = abstractC8848pp0;
            this.Y = j;
        }

        public final boolean a() {
            return this.Z;
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.Z) {
                return;
            }
            this.Z = true;
            ReentrantLock k = this.X.k();
            k.lock();
            try {
                AbstractC8848pp0 abstractC8848pp0 = this.X;
                abstractC8848pp0.Z--;
                if (this.X.Z == 0 && this.X.Y) {
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    k.unlock();
                    this.X.o();
                }
            } finally {
                k.unlock();
            }
        }

        @NotNull
        public final AbstractC8848pp0 d() {
            return this.X;
        }

        public final long f() {
            return this.Y;
        }

        public final void h(boolean z) {
            this.Z = z;
        }

        public final void i(long j) {
            this.Y = j;
        }

        @Override // o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "sink");
            if (!this.Z) {
                long x = this.X.x(this.Y, c5422bq, j);
                if (x != -1) {
                    this.Y += x;
                }
                return x;
            }
            throw new IllegalStateException("closed");
        }

        @Override // o.InterfaceC7072ia2
        @NotNull
        public C8120mp2 timeout() {
            return C8120mp2.NONE;
        }
    }

    public AbstractC8848pp0(boolean z) {
        this.X = z;
    }

    public static /* synthetic */ J82 E(AbstractC8848pp0 abstractC8848pp0, long j, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 0;
            }
            return abstractC8848pp0.C(j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    public static /* synthetic */ InterfaceC7072ia2 G(AbstractC8848pp0 abstractC8848pp0, long j, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 0;
            }
            return abstractC8848pp0.F(j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
    }

    public final void A(long j) throws IOException {
        if (this.X) {
            ReentrantLock reentrantLock = this.Y0;
            reentrantLock.lock();
            try {
                if (!this.Y) {
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    reentrantLock.unlock();
                    r(j);
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    @NotNull
    public final J82 C(long j) throws IOException {
        if (this.X) {
            ReentrantLock reentrantLock = this.Y0;
            reentrantLock.lock();
            try {
                if (!this.Y) {
                    this.Z++;
                    reentrantLock.unlock();
                    return new a(this, j);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    @NotNull
    public final InterfaceC7072ia2 F(long j) throws IOException {
        ReentrantLock reentrantLock = this.Y0;
        reentrantLock.lock();
        try {
            if (!this.Y) {
                this.Z++;
                reentrantLock.unlock();
                return new b(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void H(long j, @NotNull C5422bq c5422bq, long j2) throws IOException {
        C6562gT0.p(c5422bq, "source");
        if (this.X) {
            ReentrantLock reentrantLock = this.Y0;
            reentrantLock.lock();
            try {
                if (!this.Y) {
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    reentrantLock.unlock();
                    M(j, c5422bq, j2);
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public final void I(long j, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "array");
        if (this.X) {
            ReentrantLock reentrantLock = this.Y0;
            reentrantLock.lock();
            try {
                if (!this.Y) {
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    reentrantLock.unlock();
                    t(j, bArr, i, i2);
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public final void M(long j, C5422bq c5422bq, long j2) {
        C8648p.e(c5422bq.size(), 0L, j2);
        long j3 = j + j2;
        long j4 = j;
        while (j4 < j3) {
            PZ1 pz1 = c5422bq.X;
            C6562gT0.m(pz1);
            int min = (int) Math.min(j3 - j4, pz1.c - pz1.b);
            t(j4, pz1.a, pz1.b, min);
            pz1.b += min;
            long j5 = min;
            j4 += j5;
            c5422bq.R(c5422bq.size() - j5);
            if (pz1.b == pz1.c) {
                c5422bq.X = pz1.b();
                UZ1.d(pz1);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.Y0;
        reentrantLock.lock();
        try {
            if (this.Y) {
                return;
            }
            this.Y = true;
            if (this.Z != 0) {
                return;
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
            o();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() throws IOException {
        if (this.X) {
            ReentrantLock reentrantLock = this.Y0;
            reentrantLock.lock();
            try {
                if (!this.Y) {
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    reentrantLock.unlock();
                    p();
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    @NotNull
    public final J82 j() throws IOException {
        return C(size());
    }

    @NotNull
    public final ReentrantLock k() {
        return this.Y0;
    }

    public final boolean l() {
        return this.X;
    }

    public final long m(@NotNull J82 j82) throws IOException {
        long j;
        C6562gT0.p(j82, "sink");
        if (j82 instanceof LO1) {
            LO1 lo1 = (LO1) j82;
            j = lo1.Y.size();
            j82 = lo1.X;
        } else {
            j = 0;
        }
        if ((j82 instanceof a) && ((a) j82).d() == this) {
            a aVar = (a) j82;
            if (!aVar.a()) {
                return aVar.f() + j;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle");
    }

    public final long n(@NotNull InterfaceC7072ia2 interfaceC7072ia2) throws IOException {
        long j;
        C6562gT0.p(interfaceC7072ia2, "source");
        if (interfaceC7072ia2 instanceof MO1) {
            MO1 mo1 = (MO1) interfaceC7072ia2;
            j = mo1.Y.size();
            interfaceC7072ia2 = mo1.X;
        } else {
            j = 0;
        }
        if ((interfaceC7072ia2 instanceof b) && ((b) interfaceC7072ia2).d() == this) {
            b bVar = (b) interfaceC7072ia2;
            if (!bVar.a()) {
                return bVar.f() - j;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("source was not created by this FileHandle");
    }

    public abstract void o() throws IOException;

    public abstract void p() throws IOException;

    public abstract int q(long j, @NotNull byte[] bArr, int i, int i2) throws IOException;

    public abstract void r(long j) throws IOException;

    public abstract long s() throws IOException;

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.Y0;
        reentrantLock.lock();
        try {
            if (!this.Y) {
                C7458kA2 c7458kA2 = C7458kA2.a;
                reentrantLock.unlock();
                return s();
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void t(long j, @NotNull byte[] bArr, int i, int i2) throws IOException;

    public final int u(long j, @NotNull byte[] bArr, int i, int i2) throws IOException {
        C6562gT0.p(bArr, "array");
        ReentrantLock reentrantLock = this.Y0;
        reentrantLock.lock();
        try {
            if (!this.Y) {
                C7458kA2 c7458kA2 = C7458kA2.a;
                reentrantLock.unlock();
                return q(j, bArr, i, i2);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long v(long j, @NotNull C5422bq c5422bq, long j2) throws IOException {
        C6562gT0.p(c5422bq, "sink");
        ReentrantLock reentrantLock = this.Y0;
        reentrantLock.lock();
        try {
            if (!this.Y) {
                C7458kA2 c7458kA2 = C7458kA2.a;
                reentrantLock.unlock();
                return x(j, c5422bq, j2);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long x(long j, C5422bq c5422bq, long j2) {
        int i;
        if (j2 >= 0) {
            long j3 = j2 + j;
            long j4 = j;
            while (true) {
                if (j4 >= j3) {
                    break;
                }
                PZ1 Z = c5422bq.Z(1);
                int q = q(j4, Z.a, Z.c, (int) Math.min(j3 - j4, 8192 - i));
                if (q == -1) {
                    if (Z.b == Z.c) {
                        c5422bq.X = Z.b();
                        UZ1.d(Z);
                    }
                    if (j == j4) {
                        return -1L;
                    }
                } else {
                    Z.c += q;
                    long j5 = q;
                    j4 += j5;
                    c5422bq.R(c5422bq.size() + j5);
                }
            }
            return j4 - j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    public final void y(@NotNull J82 j82, long j) throws IOException {
        C6562gT0.p(j82, "sink");
        if (j82 instanceof LO1) {
            LO1 lo1 = (LO1) j82;
            J82 j822 = lo1.X;
            if ((j822 instanceof a) && ((a) j822).d() == this) {
                a aVar = (a) j822;
                if (!aVar.a()) {
                    lo1.N0();
                    aVar.i(j);
                    return;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        } else if ((j82 instanceof a) && ((a) j82).d() == this) {
            a aVar2 = (a) j82;
            if (!aVar2.a()) {
                aVar2.i(j);
                return;
            }
            throw new IllegalStateException("closed");
        } else {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
    }

    public final void z(@NotNull InterfaceC7072ia2 interfaceC7072ia2, long j) throws IOException {
        C6562gT0.p(interfaceC7072ia2, "source");
        if (interfaceC7072ia2 instanceof MO1) {
            MO1 mo1 = (MO1) interfaceC7072ia2;
            InterfaceC7072ia2 interfaceC7072ia22 = mo1.X;
            if ((interfaceC7072ia22 instanceof b) && ((b) interfaceC7072ia22).d() == this) {
                b bVar = (b) interfaceC7072ia22;
                if (!bVar.a()) {
                    long size = mo1.Y.size();
                    long f = j - (bVar.f() - size);
                    if (0 <= f && f < size) {
                        mo1.skip(f);
                        return;
                    }
                    mo1.Y.h();
                    bVar.i(j);
                    return;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("source was not created by this FileHandle");
        } else if ((interfaceC7072ia2 instanceof b) && ((b) interfaceC7072ia2).d() == this) {
            b bVar2 = (b) interfaceC7072ia2;
            if (!bVar2.a()) {
                bVar2.i(j);
                return;
            }
            throw new IllegalStateException("closed");
        } else {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
    }
}
