package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC6181ey
@InterfaceC11149zF0
@InterfaceC5601ca0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public class TT {
    public static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, h>> b = new Y71().l().i();
    public static final Logger c = Logger.getLogger(TT.class.getName());
    public static final ThreadLocal<ArrayList<h>> d = new a();
    public final j a;

    /* loaded from: classes3.dex */
    public class a extends ThreadLocal<ArrayList<h>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<h> initialValue() {
            return C10608x11.u(3);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        h a();

        boolean b();
    }

    /* loaded from: classes3.dex */
    public final class c extends ReentrantLock implements b {
        public final h X;

        public /* synthetic */ c(TT tt, h hVar, boolean z, a aVar) {
            this(hVar, z);
        }

        @Override // o.TT.b
        public h a() {
            return this.X;
        }

        @Override // o.TT.b
        public boolean b() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            TT.this.a(this);
            try {
                super.lock();
            } finally {
                TT.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            TT.this.a(this);
            try {
                super.lockInterruptibly();
            } finally {
                TT.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            TT.this.a(this);
            try {
                return super.tryLock();
            } finally {
                TT.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                TT.h(this);
            }
        }

        public c(h hVar, boolean z) {
            super(z);
            this.X = (h) C10664xF1.E(hVar);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            TT.this.a(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                TT.h(this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class e extends ReentrantReadWriteLock implements b {
        public final d X;
        public final f Y;
        public final h Z;

        public /* synthetic */ e(TT tt, h hVar, boolean z, a aVar) {
            this(tt, hVar, z);
        }

        @Override // o.TT.b
        public h a() {
            return this.Z;
        }

        @Override // o.TT.b
        public boolean b() {
            if (!isWriteLockedByCurrentThread() && getReadHoldCount() <= 0) {
                return false;
            }
            return true;
        }

        public e(TT tt, h hVar, boolean z) {
            super(z);
            this.X = new d(this);
            this.Y = new f(this);
            this.Z = (h) C10664xF1.E(hVar);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.X;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.Y;
        }
    }

    /* loaded from: classes3.dex */
    public static class g extends IllegalStateException {
        public static final StackTraceElement[] X = new StackTraceElement[0];
        public static final AbstractC9481sO0<String> Y = AbstractC9481sO0.V(TT.class.getName(), g.class.getName(), h.class.getName());

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(h hVar, h hVar2) {
            super(r1.toString());
            String d = hVar.d();
            String d2 = hVar2.d();
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 4 + String.valueOf(d2).length());
            sb.append(d);
            sb.append(B8.d);
            sb.append(d2);
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (l.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(X);
                    return;
                } else if (!Y.contains(stackTrace[i].getClassName())) {
                    setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                    return;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class h {
        public final Map<h, g> a = new Y71().l().i();
        public final Map<h, k> b = new Y71().l().i();
        public final String c;

        public h(String str) {
            this.c = (String) C10664xF1.E(str);
        }

        public void a(j jVar, h hVar) {
            boolean z;
            if (this != hVar) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.x0(z, "Attempted to acquire multiple locks with the same rank %s", hVar.d());
            if (this.a.containsKey(hVar)) {
                return;
            }
            k kVar = this.b.get(hVar);
            if (kVar != null) {
                jVar.e(new k(hVar, this, kVar.a(), null));
                return;
            }
            g c = hVar.c(this, C10856y22.z());
            if (c == null) {
                this.a.put(hVar, new g(hVar, this));
                return;
            }
            k kVar2 = new k(hVar, this, c, null);
            this.b.put(hVar, kVar2);
            jVar.e(kVar2);
        }

        public void b(j jVar, List<h> list) {
            for (h hVar : list) {
                a(jVar, hVar);
            }
        }

        @MB
        public final g c(h hVar, Set<h> set) {
            if (!set.add(this)) {
                return null;
            }
            g gVar = this.a.get(hVar);
            if (gVar != null) {
                return gVar;
            }
            for (Map.Entry<h, g> entry : this.a.entrySet()) {
                h key = entry.getKey();
                g c = key.c(hVar, set);
                if (c != null) {
                    g gVar2 = new g(key, this);
                    gVar2.setStackTrace(entry.getValue().getStackTrace());
                    gVar2.initCause(c);
                    return gVar2;
                }
            }
            return null;
        }

        public String d() {
            return this.c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC4238Sm
    /* loaded from: classes3.dex */
    public static abstract class i implements j {
        public static final i X = new a("THROW", 0);
        public static final i Y = new b("WARN", 1);
        public static final i Z = new c("DISABLED", 2);
        public static final /* synthetic */ i[] Y0 = g();

        /* loaded from: classes3.dex */
        public enum b extends i {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.TT.j
            public void e(k kVar) {
                TT.c.log(Level.SEVERE, "Detected potential deadlock", (Throwable) kVar);
            }
        }

        public i(String str, int i) {
        }

        public static /* synthetic */ i[] g() {
            return new i[]{X, Y, Z};
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) Y0.clone();
        }

        public /* synthetic */ i(String str, int i, a aVar) {
            this(str, i);
        }

        /* loaded from: classes3.dex */
        public enum a extends i {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.TT.j
            public void e(k kVar) {
                throw kVar;
            }
        }

        /* loaded from: classes3.dex */
        public enum c extends i {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // o.TT.j
            public void e(k kVar) {
            }
        }
    }

    @InterfaceC4238Sm
    /* loaded from: classes3.dex */
    public interface j {
        void e(k kVar);
    }

    @InterfaceC4238Sm
    /* loaded from: classes3.dex */
    public static final class k extends g {
        public final g Z;

        public /* synthetic */ k(h hVar, h hVar2, g gVar, a aVar) {
            this(hVar, hVar2, gVar);
        }

        public g a() {
            return this.Z;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.Z; th != null; th = th.getCause()) {
                sb.append(C6566gU0.h);
                sb.append(th.getMessage());
            }
            return sb.toString();
        }

        public k(h hVar, h hVar2, g gVar) {
            super(hVar, hVar2);
            this.Z = gVar;
            initCause(gVar);
        }
    }

    @InterfaceC4238Sm
    /* loaded from: classes3.dex */
    public static final class l<E extends Enum<E>> extends TT {
        public final Map<E, h> e;

        @InterfaceC5299bJ2
        public l(j jVar, Map<E, h> map) {
            super(jVar, null);
            this.e = map;
        }

        public ReentrantLock o(E e) {
            return p(e, false);
        }

        public ReentrantLock p(E e, boolean z) {
            if (this.a == i.Z) {
                return new ReentrantLock(z);
            }
            h hVar = this.e.get(e);
            Objects.requireNonNull(hVar);
            return new c(this, hVar, z, null);
        }

        public ReentrantReadWriteLock q(E e) {
            return r(e, false);
        }

        public ReentrantReadWriteLock r(E e, boolean z) {
            if (this.a == i.Z) {
                return new ReentrantReadWriteLock(z);
            }
            h hVar = this.e.get(e);
            Objects.requireNonNull(hVar);
            return new e(this, hVar, z, null);
        }
    }

    public /* synthetic */ TT(j jVar, a aVar) {
        this(jVar);
    }

    @InterfaceC5299bJ2
    public static <E extends Enum<E>> Map<E, h> e(Class<E> cls) {
        EnumMap W = C7935m81.W(cls);
        E[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        ArrayList u = C10608x11.u(length);
        int i2 = 0;
        for (E e2 : enumConstants) {
            h hVar = new h(f(e2));
            u.add(hVar);
            W.put((EnumMap) e2, (E) hVar);
        }
        for (int i3 = 1; i3 < length; i3++) {
            ((h) u.get(i3)).b(i.X, u.subList(0, i3));
        }
        while (i2 < length - 1) {
            i2++;
            ((h) u.get(i2)).b(i.Z, u.subList(i2, length));
        }
        return Collections.unmodifiableMap(W);
    }

    public static String f(Enum<?> r3) {
        String simpleName = r3.getDeclaringClass().getSimpleName();
        String name = r3.name();
        StringBuilder sb = new StringBuilder(simpleName.length() + 1 + String.valueOf(name).length());
        sb.append(simpleName);
        sb.append(UE.h);
        sb.append(name);
        return sb.toString();
    }

    public static <E extends Enum<E>> Map<? extends E, h> g(Class<E> cls) {
        ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, h>> concurrentMap = b;
        Map<? extends E, h> map = (Map<? extends E, h>) concurrentMap.get(cls);
        if (map != null) {
            return map;
        }
        Map<? extends Enum<?>, h> e2 = e(cls);
        return (Map) C3743Nk1.a(concurrentMap.putIfAbsent(cls, e2), e2);
    }

    public static void h(b bVar) {
        if (!bVar.b()) {
            ArrayList<h> arrayList = d.get();
            h a2 = bVar.a();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == a2) {
                    arrayList.remove(size);
                    return;
                }
            }
        }
    }

    public static TT i(j jVar) {
        return new TT(jVar);
    }

    public static <E extends Enum<E>> l<E> j(Class<E> cls, j jVar) {
        C10664xF1.E(cls);
        C10664xF1.E(jVar);
        return new l<>(jVar, g(cls));
    }

    public final void a(b bVar) {
        if (!bVar.b()) {
            ArrayList<h> arrayList = d.get();
            h a2 = bVar.a();
            a2.b(this.a, arrayList);
            arrayList.add(a2);
        }
    }

    public ReentrantLock k(String str) {
        return l(str, false);
    }

    public ReentrantLock l(String str, boolean z) {
        if (this.a == i.Z) {
            return new ReentrantLock(z);
        }
        return new c(this, new h(str), z, null);
    }

    public ReentrantReadWriteLock m(String str) {
        return n(str, false);
    }

    public ReentrantReadWriteLock n(String str, boolean z) {
        if (this.a == i.Z) {
            return new ReentrantReadWriteLock(z);
        }
        return new e(this, new h(str), z, null);
    }

    public TT(j jVar) {
        this.a = (j) C10664xF1.E(jVar);
    }

    /* loaded from: classes3.dex */
    public class d extends ReentrantReadWriteLock.ReadLock {
        @GJ2
        public final e X;

        public d(e eVar) {
            super(eVar);
            this.X = eVar;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            TT.this.a(this.X);
            try {
                super.lock();
            } finally {
                TT.h(this.X);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            TT.this.a(this.X);
            try {
                super.lockInterruptibly();
            } finally {
                TT.h(this.X);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            TT.this.a(this.X);
            try {
                return super.tryLock();
            } finally {
                TT.h(this.X);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                TT.h(this.X);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            TT.this.a(this.X);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                TT.h(this.X);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f extends ReentrantReadWriteLock.WriteLock {
        @GJ2
        public final e X;

        public f(e eVar) {
            super(eVar);
            this.X = eVar;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            TT.this.a(this.X);
            try {
                super.lock();
            } finally {
                TT.h(this.X);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            TT.this.a(this.X);
            try {
                super.lockInterruptibly();
            } finally {
                TT.h(this.X);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            TT.this.a(this.X);
            try {
                return super.tryLock();
            } finally {
                TT.h(this.X);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                TT.h(this.X);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            TT.this.a(this.X);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                TT.h(this.X);
            }
        }
    }
}
