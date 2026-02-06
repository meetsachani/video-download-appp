package o;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* loaded from: classes3.dex */
public class ZR<T> implements Iterable<T> {
    public InterfaceC7449k81<? extends T> Y;
    public C3968Ps Z;
    public TZ0<T> b1;
    public final List<NR> X = new LinkedList();
    public InterfaceC5332bS Y0 = null;
    public OR Z0 = new C9051qf0();
    public boolean a1 = true;
    public Locale c1 = Locale.getDefault();
    public List<InterfaceC3944Pm<T>> d1 = Collections.EMPTY_LIST;
    public boolean e1 = false;

    /* loaded from: classes3.dex */
    public class a implements Iterator<T> {
        public final C8684p82 Z;
        public T a1;
        public String[] Y0 = null;
        public long Z0 = 0;
        public final BlockingQueue<C10344vw1<T>> X = new ArrayBlockingQueue(1);
        public final BlockingQueue<C10344vw1<NR>> Y = new LinkedBlockingQueue();

        public a() {
            this.Z = new C8684p82(ZR.this.Z, ZR.this.e1);
            d();
        }

        public final void b() {
            C10344vw1<NR> poll = this.Y.poll();
            while (poll != null && poll.a() != null) {
                ZR.this.X.add(poll.a());
                poll = this.Y.poll();
            }
        }

        public final void c() throws IOException, C5817dS {
            T a;
            this.a1 = null;
            while (this.a1 == null) {
                String[] d = this.Z.d();
                this.Y0 = d;
                if (d == null) {
                    break;
                }
                long b = this.Z.b();
                this.Z0 = b;
                new WH1(b, ZR.this.Y, ZR.this.Y0, ZR.this.d1, this.Y0, this.X, this.Y, new TreeSet(), ZR.this.Z0).run();
                if (!this.Y.isEmpty()) {
                    b();
                } else {
                    C10344vw1<T> poll = this.X.poll();
                    if (poll == null) {
                        a = null;
                    } else {
                        a = poll.a();
                    }
                    this.a1 = a;
                }
            }
            if (this.Y0 == null) {
                this.a1 = null;
            }
        }

        public final void d() {
            try {
                c();
            } catch (IOException | C5817dS e) {
                this.Y0 = null;
                throw new RuntimeException(String.format(ResourceBundle.getBundle(UI0.k, ZR.this.c1).getString("parsing.error"), Long.valueOf(this.Z0), Arrays.toString(this.Y0)), e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a1 != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            T t = this.a1;
            if (t != null) {
                d();
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ResourceBundle.getBundle(UI0.k, ZR.this.c1).getString("read.only.iterator"));
        }
    }

    public final void B() throws IllegalStateException {
        C3968Ps c3968Ps;
        InterfaceC7449k81<? extends T> interfaceC7449k81 = this.Y;
        if (interfaceC7449k81 != null && (c3968Ps = this.Z) != null) {
            try {
                interfaceC7449k81.c(c3968Ps);
                return;
            } catch (Exception e) {
                throw new RuntimeException(ResourceBundle.getBundle(UI0.k, this.c1).getString("header.error"), e);
            }
        }
        throw new IllegalStateException(ResourceBundle.getBundle(UI0.k, this.c1).getString("specify.strategy.reader"));
    }

    public void D(C3968Ps c3968Ps) {
        this.Z = c3968Ps;
    }

    public void F(Locale locale) {
        Locale locale2 = (Locale) C11304zt1.t(locale, Locale.getDefault());
        this.c1 = locale2;
        C3968Ps c3968Ps = this.Z;
        if (c3968Ps != null) {
            c3968Ps.U(locale2);
        }
        InterfaceC7449k81<? extends T> interfaceC7449k81 = this.Y;
        if (interfaceC7449k81 != null) {
            interfaceC7449k81.d(this.c1);
        }
    }

    public void G(OR or) {
        if (or != null) {
            this.Z0 = or;
        }
    }

    public void H(InterfaceC5332bS interfaceC5332bS) {
        this.Y0 = interfaceC5332bS;
    }

    public void J(boolean z) {
        this.e1 = z;
    }

    public void K(InterfaceC7449k81<? extends T> interfaceC7449k81) {
        this.Y = interfaceC7449k81;
    }

    public void L(boolean z) {
        this.a1 = z;
    }

    public void M(boolean z) {
        if (z) {
            this.Z0 = new C9051qf0();
        } else {
            this.Z0 = new C8565of0();
        }
    }

    public void Q(List<InterfaceC3944Pm<T>> list) {
        this.d1 = (List) C11304zt1.t(list, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        B();
        return new a();
    }

    public List<NR> p() {
        TZ0<T> tz0 = this.b1;
        if (tz0 != null) {
            return tz0.j();
        }
        return this.X;
    }

    public OR r() {
        return this.Z0;
    }

    public Stream<T> stream() throws IllegalStateException {
        B();
        TZ0<T> tz0 = new TZ0<>(this.a1, this.c1, new NH(this.Z, this.Y0, this.e1, this.Y, this.Z0, this.d1));
        this.b1 = tz0;
        tz0.m();
        return StreamSupport.stream(this.b1, false);
    }

    public List<T> w() throws IllegalStateException {
        return (List) stream().collect(Collectors.toList());
    }
}
