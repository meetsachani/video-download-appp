package o;

import android.os.SystemClock;
import androidx.lifecycle.LiveData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C3679Mt;
import o.I11;
import o.InterfaceC2789Dt1;

/* loaded from: classes.dex */
public final class I11<T> implements InterfaceC2789Dt1<T> {
    public final C7364jn1<b<T>> a = new C7364jn1<>();
    public final Map<InterfaceC2789Dt1.a<? super T>, a<T>> b = new HashMap();

    /* loaded from: classes.dex */
    public static final class a<T> implements InterfaceC3583Lt1<b<T>> {
        public final AtomicBoolean a = new AtomicBoolean(true);
        public final InterfaceC2789Dt1.a<? super T> b;
        public final Executor c;

        public a(Executor executor, InterfaceC2789Dt1.a<? super T> aVar) {
            this.c = executor;
            this.b = aVar;
        }

        public static /* synthetic */ void a(a aVar, b bVar) {
            if (!aVar.a.get()) {
                return;
            }
            if (bVar.a()) {
                aVar.b.a((Object) bVar.e());
                return;
            }
            C10907yF1.l(bVar.d());
            aVar.b.onError(bVar.d());
        }

        public void c() {
            this.a.set(false);
        }

        @Override // o.InterfaceC3583Lt1
        /* renamed from: d */
        public void b(final b<T> bVar) {
            this.c.execute(new Runnable() { // from class: o.H11
                @Override // java.lang.Runnable
                public final void run() {
                    I11.a.a(I11.a.this, bVar);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> {
        public final T a;
        public final Throwable b;

        public b(T t, Throwable th) {
            this.a = t;
            this.b = th;
        }

        public static <T> b<T> b(Throwable th) {
            return new b<>(null, (Throwable) C10907yF1.l(th));
        }

        public static <T> b<T> c(T t) {
            return new b<>(t, null);
        }

        public boolean a() {
            if (this.b == null) {
                return true;
            }
            return false;
        }

        public Throwable d() {
            return this.b;
        }

        public T e() {
            if (a()) {
                return this.a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (a()) {
                str = "Value: " + this.a;
            } else {
                str = "Error: " + this.b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    public static /* synthetic */ Object e(final I11 i11, final C3679Mt.a aVar) {
        i11.getClass();
        C5211ay.f().execute(new Runnable() { // from class: o.F11
            @Override // java.lang.Runnable
            public final void run() {
                I11.g(I11.this, aVar);
            }
        });
        return i11 + " [fetch@" + SystemClock.uptimeMillis() + C6566gU0.g;
    }

    public static /* synthetic */ void g(I11 i11, C3679Mt.a aVar) {
        b<T> f = i11.a.f();
        if (f == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (f.a()) {
            aVar.c(f.e());
        } else {
            C10907yF1.l(f.d());
            aVar.f(f.d());
        }
    }

    public static /* synthetic */ void h(I11 i11, a aVar, a aVar2) {
        if (aVar != null) {
            i11.a.p(aVar);
        }
        i11.a.l(aVar2);
    }

    @Override // o.InterfaceC2789Dt1
    public InterfaceFutureC8411o11<T> a() {
        return C3679Mt.a(new C3679Mt.c() { // from class: o.G11
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return I11.e(I11.this, aVar);
            }
        });
    }

    @Override // o.InterfaceC2789Dt1
    public void b(Executor executor, InterfaceC2789Dt1.a<? super T> aVar) {
        synchronized (this.b) {
            try {
                final a<T> aVar2 = this.b.get(aVar);
                if (aVar2 != null) {
                    aVar2.c();
                }
                final a<T> aVar3 = new a<>(executor, aVar);
                this.b.put(aVar, aVar3);
                C5211ay.f().execute(new Runnable() { // from class: o.E11
                    @Override // java.lang.Runnable
                    public final void run() {
                        I11.h(I11.this, aVar2, aVar3);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2789Dt1
    public void d(InterfaceC2789Dt1.a<? super T> aVar) {
        synchronized (this.b) {
            try {
                final a<T> remove = this.b.remove(aVar);
                if (remove != null) {
                    remove.c();
                    C5211ay.f().execute(new Runnable() { // from class: o.D11
                        @Override // java.lang.Runnable
                        public final void run() {
                            I11.this.a.p(remove);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public LiveData<b<T>> i() {
        return this.a;
    }

    public void j(Throwable th) {
        this.a.o(b.b(th));
    }

    public void k(T t) {
        this.a.o(b.c(t));
    }
}
