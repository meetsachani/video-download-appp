package o;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: o.Zn2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4934Zn2 {
    public static final b a = new b();

    /* renamed from: o.Zn2$b */
    /* loaded from: classes4.dex */
    public static final class b implements f, d {
        @Override // o.C4934Zn2.f
        public boolean a(Thread thread) {
            return true;
        }

        @Override // o.C4934Zn2.d
        public boolean b(ThreadGroup threadGroup) {
            return true;
        }

        public b() {
        }
    }

    /* renamed from: o.Zn2$c */
    /* loaded from: classes4.dex */
    public static class c implements f, d {
        public final String a;

        public c(String str) {
            C11147zE2.V(str, "name", new Object[0]);
            this.a = str;
        }

        @Override // o.C4934Zn2.f
        public boolean a(Thread thread) {
            if (thread != null && thread.getName().equals(this.a)) {
                return true;
            }
            return false;
        }

        @Override // o.C4934Zn2.d
        public boolean b(ThreadGroup threadGroup) {
            if (threadGroup != null && threadGroup.getName().equals(this.a)) {
                return true;
            }
            return false;
        }
    }

    @FunctionalInterface
    /* renamed from: o.Zn2$d */
    /* loaded from: classes4.dex */
    public interface d {
        boolean b(ThreadGroup threadGroup);
    }

    /* renamed from: o.Zn2$e */
    /* loaded from: classes4.dex */
    public static class e implements f {
        public final long a;

        public e(long j) {
            if (j > 0) {
                this.a = j;
                return;
            }
            throw new IllegalArgumentException("The thread id must be greater than zero");
        }

        @Override // o.C4934Zn2.f
        public boolean a(Thread thread) {
            if (thread != null && thread.getId() == this.a) {
                return true;
            }
            return false;
        }
    }

    @FunctionalInterface
    /* renamed from: o.Zn2$f */
    /* loaded from: classes4.dex */
    public interface f {
        boolean a(Thread thread);
    }

    public static Thread a(long j) {
        Collection<Thread> h = h(new e(j));
        if (h.isEmpty()) {
            return null;
        }
        return h.iterator().next();
    }

    public static Thread b(long j, String str) {
        C11147zE2.V(str, "threadGroupName", new Object[0]);
        Thread a2 = a(j);
        if (a2 != null && a2.getThreadGroup() != null && a2.getThreadGroup().getName().equals(str)) {
            return a2;
        }
        return null;
    }

    public static Thread c(long j, ThreadGroup threadGroup) {
        C11147zE2.V(threadGroup, "threadGroup", new Object[0]);
        Thread a2 = a(j);
        if (a2 != null && threadGroup.equals(a2.getThreadGroup())) {
            return a2;
        }
        return null;
    }

    public static Collection<ThreadGroup> d(ThreadGroup threadGroup, boolean z, d dVar) {
        ThreadGroup[] threadGroupArr;
        int enumerate;
        C11147zE2.V(threadGroup, "group", new Object[0]);
        C11147zE2.V(dVar, "predicate", new Object[0]);
        int activeGroupCount = threadGroup.activeGroupCount();
        while (true) {
            int i = activeGroupCount + (activeGroupCount / 2) + 1;
            threadGroupArr = new ThreadGroup[i];
            enumerate = threadGroup.enumerate(threadGroupArr, z);
            if (enumerate < i) {
                break;
            }
            activeGroupCount = enumerate;
        }
        ArrayList arrayList = new ArrayList(enumerate);
        for (int i2 = 0; i2 < enumerate; i2++) {
            if (dVar.b(threadGroupArr[i2])) {
                arrayList.add(threadGroupArr[i2]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<ThreadGroup> e(d dVar) {
        return d(n(), true, dVar);
    }

    public static Collection<ThreadGroup> f(String str) {
        return e(new c(str));
    }

    public static Collection<Thread> g(ThreadGroup threadGroup, boolean z, f fVar) {
        Thread[] threadArr;
        int enumerate;
        C11147zE2.V(threadGroup, "The group must not be null", new Object[0]);
        C11147zE2.V(fVar, "The predicate must not be null", new Object[0]);
        int activeCount = threadGroup.activeCount();
        while (true) {
            int i = activeCount + (activeCount / 2) + 1;
            threadArr = new Thread[i];
            enumerate = threadGroup.enumerate(threadArr, z);
            if (enumerate < i) {
                break;
            }
            activeCount = enumerate;
        }
        ArrayList arrayList = new ArrayList(enumerate);
        for (int i2 = 0; i2 < enumerate; i2++) {
            if (fVar.a(threadArr[i2])) {
                arrayList.add(threadArr[i2]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<Thread> h(f fVar) {
        return g(n(), true, fVar);
    }

    public static Collection<Thread> i(String str) {
        return h(new c(str));
    }

    public static Collection<Thread> j(String str, String str2) {
        C11147zE2.V(str, "threadName", new Object[0]);
        C11147zE2.V(str2, "threadGroupName", new Object[0]);
        Collection<ThreadGroup> e2 = e(new c(str2));
        if (e2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        c cVar = new c(str);
        for (ThreadGroup threadGroup : e2) {
            arrayList.addAll(g(threadGroup, false, cVar));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<Thread> k(String str, ThreadGroup threadGroup) {
        return g(threadGroup, false, new c(str));
    }

    public static Collection<ThreadGroup> l() {
        return e(a);
    }

    public static Collection<Thread> m() {
        return h(a);
    }

    public static ThreadGroup n() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        return threadGroup;
    }

    public static void o(final Thread thread, Duration duration) throws InterruptedException {
        thread.getClass();
        C9660t80.a(new InterfaceC4619Wk0() { // from class: o.Yn2
            @Override // o.InterfaceC4619Wk0
            public final void accept(Object obj, Object obj2) {
                thread.join(((Long) obj).longValue(), ((Integer) obj2).intValue());
            }
        }, duration);
    }

    public static void p(Duration duration) throws InterruptedException {
        C9660t80.a(new InterfaceC4619Wk0() { // from class: o.Xn2
            @Override // o.InterfaceC4619Wk0
            public final void accept(Object obj, Object obj2) {
                Thread.sleep(((Long) obj).longValue(), ((Integer) obj2).intValue());
            }
        }, duration);
    }
}
