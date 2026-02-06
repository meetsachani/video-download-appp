package o;

import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* renamed from: o.Ec2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2820Ec2<T> {
    public static final char r = 0;
    public int a;
    public final char b;
    public final char c;
    public final char d;
    public final String e;
    public boolean f;
    public InterfaceC7449k81<T> g;
    public final Writer h;
    public VI0 i;
    public final OR j;
    public List<NR> k;
    public boolean l;
    public C8105mm<T> m;
    public Locale n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f449o;
    public final InterfaceC7846lm1<Class<?>, Field> p;
    public final String q;

    public C2820Ec2(char c, String str, InterfaceC7449k81<T> interfaceC7449k81, char c2, char c3, OR or, Writer writer, boolean z, InterfaceC7846lm1<Class<?>, Field> interfaceC7846lm1, String str2) {
        this.a = 0;
        this.f = false;
        this.k = new ArrayList();
        this.l = true;
        this.m = null;
        this.n = Locale.getDefault();
        this.d = c;
        this.e = str;
        this.g = interfaceC7449k81;
        this.c = c2;
        this.b = c3;
        this.j = or;
        this.h = writer;
        this.f449o = z;
        this.p = interfaceC7846lm1;
        this.q = C4500Ve2.L(str2);
    }

    public final void b(T t) throws XR {
        if (this.g == null) {
            this.g = C3297Iv1.d(t.getClass(), this.n, this.q);
        }
        if (!this.p.isEmpty()) {
            this.g.a(this.p);
        }
        if (this.i == null) {
            this.i = new C4553Vs(this.h, this.b, this.c, this.d, this.e);
        }
        String[] f = this.g.f(t);
        if (f.length > 0) {
            this.i.K2(f, this.f449o);
        }
        this.f = true;
    }

    public List<NR> c() {
        List<NR> list = this.k;
        this.k = new ArrayList();
        list.sort(Comparator.comparingLong(new ToLongFunction() { // from class: o.Cc2
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((NR) obj).b();
            }
        }));
        return list;
    }

    @Deprecated
    public boolean d() {
        return this.j instanceof C9051qf0;
    }

    public void e(Locale locale) {
        this.n = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }

    public void f(boolean z) {
        this.l = z;
    }

    public final void g(Iterator<T> it) throws InterruptedException {
        while (it.hasNext()) {
            T next = it.next();
            if (next != null) {
                C8105mm<T> c8105mm = this.m;
                int i = this.a + 1;
                this.a = i;
                c8105mm.n(i, this.g, next, this.j);
            }
        }
        this.m.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(T t) throws JR, XR {
        if (t != null) {
            if (!this.f) {
                b(t);
            }
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            int i = this.a + 1;
            this.a = i;
            try {
                new VH1(i, this.g, t, arrayBlockingQueue, linkedBlockingQueue, new TreeSet(), this.j).run();
                if (!linkedBlockingQueue.isEmpty()) {
                    for (C10344vw1 c10344vw1 = (C10344vw1) linkedBlockingQueue.poll(); c10344vw1 != null && c10344vw1.a() != null; c10344vw1 = (C10344vw1) linkedBlockingQueue.poll()) {
                        this.k.add(c10344vw1.a());
                    }
                    return;
                }
                C10344vw1 c10344vw12 = (C10344vw1) arrayBlockingQueue.poll();
                if (c10344vw12 != null && c10344vw12.a() != null) {
                    this.i.K2((String[]) c10344vw12.a(), this.f449o);
                }
            } catch (RuntimeException e) {
                if (e.getCause() != null) {
                    if (!(e.getCause() instanceof YR)) {
                        if (!(e.getCause() instanceof JR)) {
                            if (e.getCause() instanceof XR) {
                                throw ((XR) e.getCause());
                            }
                        } else {
                            throw ((JR) e.getCause());
                        }
                    } else {
                        throw ((YR) e.getCause());
                    }
                }
                throw e;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(Iterator<T> it) throws JR, XR {
        C8455oC1 c8455oC1 = new C8455oC1(it);
        Object peek = c8455oC1.peek();
        if (!c8455oC1.hasNext()) {
            return;
        }
        if (!this.f) {
            b(peek);
        }
        C8105mm<T> c8105mm = new C8105mm<>(this.l, this.n);
        this.m = c8105mm;
        c8105mm.m();
        try {
            try {
                g(c8455oC1);
                this.k.addAll(this.m.j());
                StreamSupport.stream(this.m, false).forEach(new Consumer() { // from class: o.Dc2
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        r0.i.K2((String[]) obj, C2820Ec2.this.f449o);
                    }
                });
            } catch (RejectedExecutionException unused) {
                if (!(this.m.k() instanceof RuntimeException)) {
                    if (!(this.m.k() instanceof JR)) {
                        if (this.m.k() instanceof XR) {
                            throw ((XR) this.m.k());
                        }
                        throw new RuntimeException(ResourceBundle.getBundle(UI0.k, this.n).getString("error.writing.beans"), this.m.k());
                    }
                    throw ((JR) this.m.k());
                }
                throw ((RuntimeException) this.m.k());
            } catch (Exception e) {
                this.m.shutdownNow();
                if (this.m.k() instanceof RuntimeException) {
                    throw ((RuntimeException) this.m.k());
                }
                throw new RuntimeException(ResourceBundle.getBundle(UI0.k, this.n).getString("error.writing.beans"), e);
            }
        } catch (Throwable th) {
            this.k.addAll(this.m.j());
            throw th;
        }
    }

    public void j(List<T> list) throws JR, XR {
        if (C6748hF.P(list)) {
            i(list.iterator());
        }
    }

    public void k(Stream<T> stream) throws JR, XR {
        i(stream.iterator());
    }

    public C2820Ec2(InterfaceC7449k81<T> interfaceC7449k81, OR or, boolean z, VI0 vi0, InterfaceC7846lm1<Class<?>, Field> interfaceC7846lm1, String str) {
        this.a = 0;
        this.f = false;
        this.k = new ArrayList();
        this.l = true;
        this.m = null;
        this.n = Locale.getDefault();
        this.g = interfaceC7449k81;
        this.j = or;
        this.f449o = z;
        this.i = vi0;
        this.d = (char) 0;
        this.e = "";
        this.c = (char) 0;
        this.b = (char) 0;
        this.h = null;
        this.p = interfaceC7846lm1;
        this.q = C4500Ve2.L(str);
    }
}
