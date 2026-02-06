package o;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import o.InterfaceC4844Ys;

@Deprecated
/* loaded from: classes2.dex */
public final class J72 implements InterfaceC4844Ys {
    public static final String m = "SimpleCache";
    public static final int n = 10;

    /* renamed from: o  reason: collision with root package name */
    public static final String f500o = ".uid";
    public static final HashSet<File> p = new HashSet<>();
    public final File b;
    public final InterfaceC6659gt c;
    public final C9355rt d;
    @InterfaceC11300zs1
    public final C7386jt e;
    public final HashMap<String, ArrayList<InterfaceC4844Ys.b>> f;
    public final Random g;
    public final boolean h;
    public long i;
    public long j;
    public boolean k;
    public InterfaceC4844Ys.a l;

    /* loaded from: classes2.dex */
    public class a extends Thread {
        public final /* synthetic */ ConditionVariable X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.X = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (J72.this) {
                this.X.open();
                J72.this.B();
                J72.this.c.f();
            }
        }
    }

    @Deprecated
    public J72(File file, InterfaceC6659gt interfaceC6659gt) {
        this(file, interfaceC6659gt, null, null, false, true);
    }

    public static synchronized boolean C(File file) {
        boolean contains;
        synchronized (J72.class) {
            contains = p.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    public static long E(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(f500o)) {
                try {
                    return J(name);
                } catch (NumberFormatException unused) {
                    I31.d(m, "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized boolean F(File file) {
        boolean add;
        synchronized (J72.class) {
            add = p.add(file.getAbsoluteFile());
        }
        return add;
    }

    public static long J(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static synchronized void N(File file) {
        synchronized (J72.class) {
            p.remove(file.getAbsoluteFile());
        }
    }

    public static void x(File file) throws InterfaceC4844Ys.a {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            I31.d(m, str);
            throw new InterfaceC4844Ys.a(str);
        }
    }

    public static long y(File file) throws IOException {
        long abs;
        long nextLong = new SecureRandom().nextLong();
        if (nextLong == Long.MIN_VALUE) {
            abs = 0;
        } else {
            abs = Math.abs(nextLong);
        }
        String l = Long.toString(abs, 16);
        File file2 = new File(file, l + f500o);
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    @InterfaceC10697xN2
    public static void z(File file, @InterfaceC11300zs1 InterfaceC5100aV interfaceC5100aV) {
        if (!file.exists()) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            file.delete();
            return;
        }
        if (interfaceC5100aV != null) {
            long E = E(listFiles);
            if (E != -1) {
                try {
                    C7386jt.a(interfaceC5100aV, E);
                } catch (YU unused) {
                    I31.n(m, "Failed to delete file metadata: " + E);
                }
                try {
                    C9355rt.g(interfaceC5100aV, E);
                } catch (YU unused2) {
                    I31.n(m, "Failed to delete file metadata: " + E);
                }
            }
        }
        TD2.x1(file);
    }

    public final K72 A(String str, long j, long j2) {
        K72 e;
        C9106qt h = this.d.h(str);
        if (h == null) {
            return K72.m(str, j, j2);
        }
        while (true) {
            e = h.e(j, j2);
            if (!e.Y0 || e.Z0.length() == e.Z) {
                break;
            }
            L();
        }
        return e;
    }

    public final void B() {
        if (!this.b.exists()) {
            try {
                x(this.b);
            } catch (InterfaceC4844Ys.a e) {
                this.l = e;
                return;
            }
        }
        File[] listFiles = this.b.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.b;
            I31.d(m, str);
            this.l = new InterfaceC4844Ys.a(str);
            return;
        }
        long E = E(listFiles);
        this.i = E;
        if (E == -1) {
            try {
                this.i = y(this.b);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.b;
                I31.e(m, str2, e2);
                this.l = new InterfaceC4844Ys.a(str2, e2);
                return;
            }
        }
        try {
            this.d.p(this.i);
            C7386jt c7386jt = this.e;
            if (c7386jt != null) {
                c7386jt.f(this.i);
                Map<String, C6902ht> c = this.e.c();
                D(this.b, true, listFiles, c);
                this.e.h(c.keySet());
            } else {
                D(this.b, true, listFiles, null);
            }
            this.d.t();
            try {
                this.d.u();
            } catch (IOException e3) {
                I31.e(m, "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + this.b;
            I31.e(m, str3, e4);
            this.l = new InterfaceC4844Ys.a(str3, e4);
        }
    }

    public final void D(File file, boolean z, @InterfaceC11300zs1 File[] fileArr, @InterfaceC11300zs1 Map<String, C6902ht> map) {
        C6902ht c6902ht;
        long j;
        long j2;
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    D(file2, false, file2.listFiles(), map);
                } else if (!z || (!C9355rt.q(name) && !name.endsWith(f500o))) {
                    if (map != null) {
                        c6902ht = map.remove(name);
                    } else {
                        c6902ht = null;
                    }
                    if (c6902ht != null) {
                        j = c6902ht.a;
                        j2 = c6902ht.b;
                    } else {
                        j = -1;
                        j2 = C10323vs.b;
                    }
                    K72 j3 = K72.j(file2, j, j2, this.d);
                    if (j3 != null) {
                        v(j3);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    public final void G(K72 k72) {
        ArrayList<InterfaceC4844Ys.b> arrayList = this.f.get(k72.X);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).e(this, k72);
            }
        }
        this.c.e(this, k72);
    }

    public final void H(C8376nt c8376nt) {
        ArrayList<InterfaceC4844Ys.b> arrayList = this.f.get(c8376nt.X);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, c8376nt);
            }
        }
        this.c.a(this, c8376nt);
    }

    public final void I(K72 k72, C8376nt c8376nt) {
        ArrayList<InterfaceC4844Ys.b> arrayList = this.f.get(k72.X);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).d(this, k72, c8376nt);
            }
        }
        this.c.d(this, k72, c8376nt);
    }

    public final void K(C8376nt c8376nt) {
        C9106qt h = this.d.h(c8376nt.X);
        if (h != null && h.k(c8376nt)) {
            this.j -= c8376nt.Z;
            if (this.e != null) {
                String name = c8376nt.Z0.getName();
                try {
                    this.e.g(name);
                } catch (IOException unused) {
                    I31.n(m, "Failed to remove file index entry for: " + name);
                }
            }
            this.d.r(h.b);
            H(c8376nt);
        }
    }

    public final void L() {
        ArrayList arrayList = new ArrayList();
        for (C9106qt c9106qt : this.d.i()) {
            Iterator<K72> it = c9106qt.f().iterator();
            while (it.hasNext()) {
                K72 next = it.next();
                if (next.Z0.length() != next.Z) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            K((C8376nt) arrayList.get(i));
        }
    }

    public final K72 M(String str, K72 k72) {
        boolean z;
        if (!this.h) {
            return k72;
        }
        String name = ((File) C9542sf.g(k72.Z0)).getName();
        long j = k72.Z;
        long currentTimeMillis = System.currentTimeMillis();
        C7386jt c7386jt = this.e;
        if (c7386jt != null) {
            try {
                c7386jt.i(name, j, currentTimeMillis);
            } catch (IOException unused) {
                I31.n(m, "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        K72 l = this.d.h(str).l(k72, currentTimeMillis, z);
        I(k72, l);
        return l;
    }

    @Override // o.InterfaceC4844Ys
    public synchronized long a() {
        return this.i;
    }

    @Override // o.InterfaceC4844Ys
    public synchronized File b(String str, long j, long j2) throws InterfaceC4844Ys.a {
        Throwable th;
        try {
            try {
                C9542sf.i(!this.k);
                w();
                C9106qt h = this.d.h(str);
                C9542sf.g(h);
                C9542sf.i(h.h(j, j2));
                if (!this.b.exists()) {
                    try {
                        x(this.b);
                        L();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.c.c(this, str, j, j2);
                File file = new File(this.b, Integer.toString(this.g.nextInt(10)));
                if (!file.exists()) {
                    x(file);
                }
                return K72.o(file, h.a, j, System.currentTimeMillis());
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // o.InterfaceC4844Ys
    public synchronized void c(String str, InterfaceC4844Ys.b bVar) {
        if (this.k) {
            return;
        }
        ArrayList<InterfaceC4844Ys.b> arrayList = this.f.get(str);
        if (arrayList != null) {
            arrayList.remove(bVar);
            if (arrayList.isEmpty()) {
                this.f.remove(str);
            }
        }
    }

    @Override // o.InterfaceC4844Ys
    public synchronized InterfaceC6278fM d(String str) {
        C9542sf.i(!this.k);
        return this.d.k(str);
    }

    @Override // o.InterfaceC4844Ys
    public synchronized long e(String str, long j, long j2) {
        long j3;
        long j4;
        long j5 = Long.MAX_VALUE;
        if (j2 == -1) {
            j3 = Long.MAX_VALUE;
        } else {
            j3 = j + j2;
        }
        if (j3 >= 0) {
            j5 = j3;
        }
        long j6 = j;
        j4 = 0;
        while (j6 < j5) {
            long h = h(str, j6, j5 - j6);
            if (h > 0) {
                j4 += h;
            } else {
                h = -h;
            }
            j6 += h;
        }
        return j4;
    }

    @Override // o.InterfaceC4844Ys
    @InterfaceC11300zs1
    public synchronized C8376nt f(String str, long j, long j2) throws InterfaceC4844Ys.a {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            C9542sf.i(!this.k);
            w();
            K72 A = A(str, j, j2);
            if (A.Y0) {
                return M(str, A);
            } else if (this.d.o(str).j(j, A.Z)) {
                return A;
            } else {
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // o.InterfaceC4844Ys
    public synchronized void g() {
        if (this.k) {
            return;
        }
        this.f.clear();
        L();
        try {
            this.d.u();
            N(this.b);
        } catch (IOException e) {
            I31.e(m, "Storing index file failed", e);
            N(this.b);
        }
        this.k = true;
    }

    @Override // o.InterfaceC4844Ys
    public synchronized long h(String str, long j, long j2) {
        long j3;
        C9542sf.i(!this.k);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        C9106qt h = this.d.h(str);
        if (h != null) {
            j3 = h.c(j, j2);
        } else {
            j3 = -j2;
        }
        return j3;
    }

    @Override // o.InterfaceC4844Ys
    public synchronized Set<String> i() {
        C9542sf.i(!this.k);
        return new HashSet(this.d.m());
    }

    @Override // o.InterfaceC4844Ys
    public synchronized void j(C8376nt c8376nt) {
        C9542sf.i(!this.k);
        K(c8376nt);
    }

    @Override // o.InterfaceC4844Ys
    public synchronized long k() {
        C9542sf.i(!this.k);
        return this.j;
    }

    @Override // o.InterfaceC4844Ys
    public synchronized void l(C8376nt c8376nt) {
        C9542sf.i(!this.k);
        C9106qt c9106qt = (C9106qt) C9542sf.g(this.d.h(c8376nt.X));
        c9106qt.m(c8376nt.Y);
        this.d.r(c9106qt.b);
        notifyAll();
    }

    @Override // o.InterfaceC4844Ys
    public synchronized void m(String str, C6533gM c6533gM) throws InterfaceC4844Ys.a {
        C9542sf.i(!this.k);
        w();
        this.d.e(str, c6533gM);
        try {
            this.d.u();
        } catch (IOException e) {
            throw new InterfaceC4844Ys.a(e);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:? -> B:10:0x001e). Please submit an issue!!! */
    @Override // o.InterfaceC4844Ys
    public synchronized C8376nt n(String str, long j, long j2) throws InterruptedException, InterfaceC4844Ys.a {
        try {
            C9542sf.i(!this.k);
            w();
            while (true) {
                C8376nt f = f(str, j, j2);
                long j3 = j2;
                long j4 = j;
                String str2 = str;
                if (f != null) {
                    return f;
                }
                try {
                    wait();
                    str = str2;
                    j = j4;
                    j2 = j3;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // o.InterfaceC4844Ys
    public synchronized void o(File file, long j) throws InterfaceC4844Ys.a {
        boolean z = true;
        C9542sf.i(!this.k);
        if (!file.exists()) {
            return;
        }
        if (j == 0) {
            file.delete();
            return;
        }
        K72 k72 = (K72) C9542sf.g(K72.l(file, j, this.d));
        C9106qt c9106qt = (C9106qt) C9542sf.g(this.d.h(k72.X));
        C9542sf.i(c9106qt.h(k72.Y, k72.Z));
        long g = InterfaceC6278fM.g(c9106qt.d());
        if (g != -1) {
            if (k72.Y + k72.Z > g) {
                z = false;
            }
            C9542sf.i(z);
        }
        if (this.e != null) {
            try {
                this.e.i(file.getName(), k72.Z, k72.a1);
            } catch (IOException e) {
                throw new InterfaceC4844Ys.a(e);
            }
        }
        v(k72);
        try {
            this.d.u();
            notifyAll();
        } catch (IOException e2) {
            throw new InterfaceC4844Ys.a(e2);
        }
    }

    @Override // o.InterfaceC4844Ys
    public synchronized void p(String str) {
        C9542sf.i(!this.k);
        for (C8376nt c8376nt : s(str)) {
            K(c8376nt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r3.c(r4, r6) >= r6) goto L8;
     */
    @Override // o.InterfaceC4844Ys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean q(String str, long j, long j2) {
        boolean z;
        z = true;
        C9542sf.i(!this.k);
        C9106qt h = this.d.h(str);
        if (h != null) {
        }
        z = false;
        return z;
    }

    @Override // o.InterfaceC4844Ys
    public synchronized NavigableSet<C8376nt> r(String str, InterfaceC4844Ys.b bVar) {
        try {
            C9542sf.i(!this.k);
            C9542sf.g(str);
            C9542sf.g(bVar);
            ArrayList<InterfaceC4844Ys.b> arrayList = this.f.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f.put(str, arrayList);
            }
            arrayList.add(bVar);
        } catch (Throwable th) {
            throw th;
        }
        return s(str);
    }

    @Override // o.InterfaceC4844Ys
    public synchronized NavigableSet<C8376nt> s(String str) {
        TreeSet treeSet;
        try {
            C9542sf.i(!this.k);
            C9106qt h = this.d.h(str);
            if (h != null && !h.g()) {
                treeSet = new TreeSet((Collection) h.f());
            }
            treeSet = new TreeSet();
        } catch (Throwable th) {
            throw th;
        }
        return treeSet;
    }

    public final void v(K72 k72) {
        this.d.o(k72.X).a(k72);
        this.j += k72.Z;
        G(k72);
    }

    public synchronized void w() throws InterfaceC4844Ys.a {
        InterfaceC4844Ys.a aVar = this.l;
        if (aVar != null) {
            throw aVar;
        }
    }

    public J72(File file, InterfaceC6659gt interfaceC6659gt, InterfaceC5100aV interfaceC5100aV) {
        this(file, interfaceC6659gt, interfaceC5100aV, null, false, false);
    }

    public J72(File file, InterfaceC6659gt interfaceC6659gt, @InterfaceC11300zs1 InterfaceC5100aV interfaceC5100aV, @InterfaceC11300zs1 byte[] bArr, boolean z, boolean z2) {
        this(file, interfaceC6659gt, new C9355rt(interfaceC5100aV, file, bArr, z, z2), (interfaceC5100aV == null || z2) ? null : new C7386jt(interfaceC5100aV));
    }

    public J72(File file, InterfaceC6659gt interfaceC6659gt, C9355rt c9355rt, @InterfaceC11300zs1 C7386jt c7386jt) {
        if (F(file)) {
            this.b = file;
            this.c = interfaceC6659gt;
            this.d = c9355rt;
            this.e = c7386jt;
            this.f = new HashMap<>();
            this.g = new Random();
            this.h = interfaceC6659gt.b();
            this.i = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
