package o;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.InterfaceC10771xh2;

/* loaded from: classes.dex */
public abstract class VU1 {
    public static final String l = "_Impl";
    public static final int m = 999;
    @Deprecated
    public volatile InterfaceC10528wh2 a;
    public Executor b;
    public Executor c;
    public InterfaceC10771xh2 d;
    public boolean f;
    public boolean g;
    @Deprecated
    public List<b> h;
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> j = new ThreadLocal<>();
    public final Map<String, Object> k = new ConcurrentHashMap();
    public final androidx.room.c e = g();

    /* loaded from: classes.dex */
    public static class a<T extends VU1> {
        public final Class<T> a;
        public final String b;
        public final Context c;
        public ArrayList<b> d;
        public Executor e;
        public Executor f;
        public InterfaceC10771xh2.c g;
        public boolean h;
        public boolean j;
        public boolean l;
        public Set<Integer> n;

        /* renamed from: o  reason: collision with root package name */
        public Set<Integer> f643o;
        public String p;
        public File q;
        public c i = c.AUTOMATIC;
        public boolean k = true;
        public final d m = new d();

        public a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        public a<T> a(b bVar) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(bVar);
            return this;
        }

        public a<T> b(AbstractC3739Nj1... abstractC3739Nj1Arr) {
            if (this.f643o == null) {
                this.f643o = new HashSet();
            }
            for (AbstractC3739Nj1 abstractC3739Nj1 : abstractC3739Nj1Arr) {
                this.f643o.add(Integer.valueOf(abstractC3739Nj1.a));
                this.f643o.add(Integer.valueOf(abstractC3739Nj1.b));
            }
            this.m.b(abstractC3739Nj1Arr);
            return this;
        }

        public a<T> c() {
            this.h = true;
            return this;
        }

        public T d() {
            Executor executor;
            if (this.c != null) {
                if (this.a != null) {
                    Executor executor2 = this.e;
                    if (executor2 == null && this.f == null) {
                        Executor g = C4102Rd.g();
                        this.f = g;
                        this.e = g;
                    } else if (executor2 != null && this.f == null) {
                        this.f = executor2;
                    } else if (executor2 == null && (executor = this.f) != null) {
                        this.e = executor;
                    }
                    Set<Integer> set = this.f643o;
                    if (set != null && this.n != null) {
                        for (Integer num : set) {
                            if (this.n.contains(num)) {
                                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                            }
                        }
                    }
                    if (this.g == null) {
                        this.g = new C6729hA0();
                    }
                    String str = this.p;
                    if (str != null || this.q != null) {
                        if (this.b != null) {
                            if (str != null && this.q != null) {
                                throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                            }
                            this.g = new DW1(str, this.q, this.g);
                        } else {
                            throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                        }
                    }
                    Context context = this.c;
                    XU xu = new XU(context, this.b, this.g, this.m, this.d, this.h, this.i.g(context), this.e, this.f, this.j, this.k, this.l, this.n, this.p, this.q);
                    T t = (T) UU1.b(this.a, VU1.l);
                    t.r(xu);
                    return t;
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }

        public a<T> e(String str) {
            this.p = str;
            return this;
        }

        public a<T> f(File file) {
            this.q = file;
            return this;
        }

        public a<T> g() {
            boolean z;
            if (this.b != null) {
                z = true;
            } else {
                z = false;
            }
            this.j = z;
            return this;
        }

        public a<T> h() {
            this.k = false;
            this.l = true;
            return this;
        }

        public a<T> i(int... iArr) {
            if (this.n == null) {
                this.n = new HashSet(iArr.length);
            }
            for (int i : iArr) {
                this.n.add(Integer.valueOf(i));
            }
            return this;
        }

        public a<T> j() {
            this.k = true;
            this.l = true;
            return this;
        }

        public a<T> k(InterfaceC10771xh2.c cVar) {
            this.g = cVar;
            return this;
        }

        public a<T> l(c cVar) {
            this.i = cVar;
            return this;
        }

        public a<T> m(Executor executor) {
            this.e = executor;
            return this;
        }

        public a<T> n(Executor executor) {
            this.f = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public static boolean e(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        public c g(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService(androidx.appcompat.widget.b.r);
            if (activityManager != null && !e(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public HashMap<Integer, TreeMap<Integer, AbstractC3739Nj1>> a = new HashMap<>();

        public final void a(AbstractC3739Nj1 abstractC3739Nj1) {
            int i = abstractC3739Nj1.a;
            int i2 = abstractC3739Nj1.b;
            TreeMap<Integer, AbstractC3739Nj1> treeMap = this.a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.a.put(Integer.valueOf(i), treeMap);
            }
            AbstractC3739Nj1 abstractC3739Nj12 = treeMap.get(Integer.valueOf(i2));
            if (abstractC3739Nj12 != null) {
                Log.w(UU1.a, "Overriding migration " + abstractC3739Nj12 + " with " + abstractC3739Nj1);
            }
            treeMap.put(Integer.valueOf(i2), abstractC3739Nj1);
        }

        public void b(AbstractC3739Nj1... abstractC3739Nj1Arr) {
            for (AbstractC3739Nj1 abstractC3739Nj1 : abstractC3739Nj1Arr) {
                a(abstractC3739Nj1);
            }
        }

        public List<AbstractC3739Nj1> c(int i, int i2) {
            boolean z;
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            return d(new ArrayList(), z, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
            return r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<AbstractC3739Nj1> d(List<AbstractC3739Nj1> list, boolean z, int i, int i2) {
            TreeMap<Integer, AbstractC3739Nj1> treeMap;
            Set<Integer> keySet;
            int i3;
            boolean z2;
            while (true) {
                if (z) {
                    if (i >= i2) {
                        break;
                    }
                    treeMap = this.a.get(Integer.valueOf(i));
                    if (treeMap != null) {
                        return null;
                    }
                    if (z) {
                        keySet = treeMap.descendingKeySet();
                    } else {
                        keySet = treeMap.keySet();
                    }
                    for (Integer num : keySet) {
                        i3 = num.intValue();
                        if (z) {
                            if (i3 <= i2 && i3 > i) {
                                list.add(treeMap.get(num));
                                z2 = true;
                                break;
                            }
                        } else if (i3 >= i2 && i3 < i) {
                            list.add(treeMap.get(num));
                            z2 = true;
                            break;
                        }
                    }
                    i3 = i;
                    z2 = false;
                    if (!z2) {
                        return null;
                    }
                    i = i3;
                } else {
                    if (i <= i2) {
                        break;
                    }
                    treeMap = this.a.get(Integer.valueOf(i));
                    if (treeMap != null) {
                    }
                }
            }
        }
    }

    public static boolean t() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void A() {
        this.d.getWritableDatabase().s1();
    }

    public void a() {
        if (this.f || !t()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public void b() {
        if (!q() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        InterfaceC10528wh2 writableDatabase = this.d.getWritableDatabase();
        this.e.r(writableDatabase);
        writableDatabase.w0();
    }

    public abstract void d();

    public void e() {
        if (u()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.i.writeLock();
            try {
                writeLock.lock();
                this.e.o();
                this.d.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public InterfaceC2546Bh2 f(String str) {
        a();
        b();
        return this.d.getWritableDatabase().z3(str);
    }

    public abstract androidx.room.c g();

    public abstract InterfaceC10771xh2 h(XU xu);

    @Deprecated
    public void i() {
        this.d.getWritableDatabase().W1();
        if (!q()) {
            this.e.i();
        }
    }

    public Map<String, Object> j() {
        return this.k;
    }

    public Lock k() {
        return this.i.readLock();
    }

    public androidx.room.c l() {
        return this.e;
    }

    public InterfaceC10771xh2 m() {
        return this.d;
    }

    public Executor n() {
        return this.b;
    }

    public ThreadLocal<Integer> o() {
        return this.j;
    }

    public Executor p() {
        return this.c;
    }

    public boolean q() {
        return this.d.getWritableDatabase().W4();
    }

    public void r(XU xu) {
        boolean z;
        InterfaceC10771xh2 h = h(xu);
        this.d = h;
        if (h instanceof CW1) {
            ((CW1) h).d(xu);
        }
        if (xu.g == c.WRITE_AHEAD_LOGGING) {
            z = true;
        } else {
            z = false;
        }
        this.d.setWriteAheadLoggingEnabled(z);
        this.h = xu.e;
        this.b = xu.h;
        this.c = new ExecutorC4064Qr2(xu.i);
        this.f = xu.f;
        this.g = z;
        if (xu.j) {
            this.e.m(xu.b, xu.c);
        }
    }

    public void s(InterfaceC10528wh2 interfaceC10528wh2) {
        this.e.g(interfaceC10528wh2);
    }

    public boolean u() {
        InterfaceC10528wh2 interfaceC10528wh2 = this.a;
        if (interfaceC10528wh2 != null && interfaceC10528wh2.isOpen()) {
            return true;
        }
        return false;
    }

    public Cursor v(String str, Object[] objArr) {
        return this.d.getWritableDatabase().y1(new Z72(str, objArr));
    }

    public Cursor w(InterfaceC11257zh2 interfaceC11257zh2) {
        return x(interfaceC11257zh2, null);
    }

    public Cursor x(InterfaceC11257zh2 interfaceC11257zh2, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal != null) {
            return this.d.getWritableDatabase().x3(interfaceC11257zh2, cancellationSignal);
        }
        return this.d.getWritableDatabase().y1(interfaceC11257zh2);
    }

    public <V> V y(Callable<V> callable) {
        c();
        try {
            try {
                V call = callable.call();
                A();
                return call;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                C11127z92.a(e2);
                i();
                return null;
            }
        } finally {
            i();
        }
    }

    public void z(Runnable runnable) {
        c();
        try {
            runnable.run();
            A();
        } finally {
            i();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(InterfaceC10528wh2 interfaceC10528wh2) {
        }

        public void b(InterfaceC10528wh2 interfaceC10528wh2) {
        }

        public void c(InterfaceC10528wh2 interfaceC10528wh2) {
        }
    }
}
