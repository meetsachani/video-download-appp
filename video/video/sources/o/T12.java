package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.C3597Ly;
import o.C9066qj;
import o.HJ;

/* loaded from: classes.dex */
public final class T12 {
    public final List<e> a;
    public final List<CameraDevice.StateCallback> b;
    public final List<CameraCaptureSession.StateCallback> c;
    public final List<AbstractC3393Jv> d;
    public final List<c> e;
    public final C3597Ly f;
    public InputConfiguration g;

    /* loaded from: classes.dex */
    public static class a {
        public final Set<e> a = new LinkedHashSet();
        public final C3597Ly.a b = new C3597Ly.a();
        public final List<CameraDevice.StateCallback> c = new ArrayList();
        public final List<CameraCaptureSession.StateCallback> d = new ArrayList();
        public final List<c> e = new ArrayList();
        public final List<AbstractC3393Jv> f = new ArrayList();
        public InputConfiguration g;
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public static b s(InterfaceC6743hD2<?> interfaceC6743hD2, Size size) {
            d y = interfaceC6743hD2.y(null);
            if (y != null) {
                b bVar = new b();
                y.a(size, interfaceC6743hD2, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC6743hD2.v(interfaceC6743hD2.toString()));
        }

        public b a(Collection<AbstractC3393Jv> collection) {
            for (AbstractC3393Jv abstractC3393Jv : collection) {
                this.b.c(abstractC3393Jv);
                if (!this.f.contains(abstractC3393Jv)) {
                    this.f.add(abstractC3393Jv);
                }
            }
            return this;
        }

        public b b(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback stateCallback : collection) {
                f(stateCallback);
            }
            return this;
        }

        public b c(Collection<AbstractC3393Jv> collection) {
            this.b.a(collection);
            return this;
        }

        public b d(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                m(stateCallback);
            }
            return this;
        }

        public b e(AbstractC3393Jv abstractC3393Jv) {
            this.b.c(abstractC3393Jv);
            if (!this.f.contains(abstractC3393Jv)) {
                this.f.add(abstractC3393Jv);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.c.contains(stateCallback)) {
                return this;
            }
            this.c.add(stateCallback);
            return this;
        }

        public b g(c cVar) {
            this.e.add(cVar);
            return this;
        }

        public b h(HJ hj) {
            this.b.e(hj);
            return this;
        }

        public b i(D10 d10) {
            return j(d10, N80.n);
        }

        public b j(D10 d10, N80 n80) {
            this.a.add(e.a(d10).b(n80).a());
            return this;
        }

        public b k(e eVar) {
            this.a.add(eVar);
            this.b.f(eVar.e());
            for (D10 d10 : eVar.d()) {
                this.b.f(d10);
            }
            return this;
        }

        public b l(AbstractC3393Jv abstractC3393Jv) {
            this.b.c(abstractC3393Jv);
            return this;
        }

        public b m(CameraCaptureSession.StateCallback stateCallback) {
            if (this.d.contains(stateCallback)) {
                return this;
            }
            this.d.add(stateCallback);
            return this;
        }

        public b n(D10 d10) {
            return o(d10, N80.n);
        }

        public b o(D10 d10, N80 n80) {
            this.a.add(e.a(d10).b(n80).a());
            this.b.f(d10);
            return this;
        }

        public b p(String str, Object obj) {
            this.b.g(str, obj);
            return this;
        }

        public T12 q() {
            return new T12(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.f), new ArrayList(this.e), this.b.h(), this.g);
        }

        public b r() {
            this.a.clear();
            this.b.i();
            return this;
        }

        public List<AbstractC3393Jv> t() {
            return Collections.unmodifiableList(this.f);
        }

        public boolean u(AbstractC3393Jv abstractC3393Jv) {
            boolean r = this.b.r(abstractC3393Jv);
            boolean remove = this.f.remove(abstractC3393Jv);
            if (!r && !remove) {
                return false;
            }
            return true;
        }

        public b v(D10 d10) {
            e eVar;
            Iterator<e> it = this.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    eVar = it.next();
                    if (eVar.e().equals(d10)) {
                        break;
                    }
                } else {
                    eVar = null;
                    break;
                }
            }
            if (eVar != null) {
                this.a.remove(eVar);
            }
            this.b.s(d10);
            return this;
        }

        public b w(Range<Integer> range) {
            this.b.u(range);
            return this;
        }

        public b x(HJ hj) {
            this.b.v(hj);
            return this;
        }

        public b y(InputConfiguration inputConfiguration) {
            this.g = inputConfiguration;
            return this;
        }

        public b z(int i) {
            this.b.w(i);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(T12 t12, f fVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Size size, InterfaceC6743hD2<?> interfaceC6743hD2, b bVar);
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public static final int a = -1;

        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract e a();

            public abstract a b(N80 n80);

            public abstract a c(String str);

            public abstract a d(List<D10> list);

            public abstract a e(D10 d10);

            public abstract a f(int i);
        }

        public static a a(D10 d10) {
            return new C9066qj.b().e(d10).d(Collections.EMPTY_LIST).c(null).f(-1).b(N80.n);
        }

        public abstract N80 b();

        public abstract String c();

        public abstract List<D10> d();

        public abstract D10 e();

        public abstract int f();
    }

    /* loaded from: classes.dex */
    public enum f {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* loaded from: classes.dex */
    public static final class g extends a {
        public static final List<Integer> k = Arrays.asList(1, 5, 3);
        public static final String l = "ValidatingBuilder";
        public final C3345Ji2 h = new C3345Ji2();
        public boolean i = true;
        public boolean j = false;

        public void a(T12 t12) {
            C3597Ly i = t12.i();
            if (i.i() != -1) {
                this.j = true;
                this.b.w(g(i.i(), this.b.p()));
            }
            h(i.e());
            this.b.b(t12.i().h());
            this.c.addAll(t12.b());
            this.d.addAll(t12.j());
            this.b.a(t12.h());
            this.f.addAll(t12.k());
            this.e.addAll(t12.c());
            if (t12.f() != null) {
                this.g = t12.f();
            }
            this.a.addAll(t12.g());
            this.b.n().addAll(i.g());
            if (!e().containsAll(this.b.n())) {
                C7433k41.a(l, "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.i = false;
            }
            this.b.e(i.f());
        }

        public <T> void b(HJ.a<T> aVar, T t) {
            this.b.d(aVar, t);
        }

        public T12 c() {
            if (this.i) {
                ArrayList arrayList = new ArrayList(this.a);
                this.h.c(arrayList);
                return new T12(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.f), new ArrayList(this.e), this.b.h(), this.g);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        public void d() {
            this.a.clear();
            this.b.i();
        }

        public final List<D10> e() {
            ArrayList arrayList = new ArrayList();
            for (e eVar : this.a) {
                arrayList.add(eVar.e());
                for (D10 d10 : eVar.d()) {
                    arrayList.add(d10);
                }
            }
            return arrayList;
        }

        public boolean f() {
            if (this.j && this.i) {
                return true;
            }
            return false;
        }

        public final int g(int i, int i2) {
            List<Integer> list = k;
            if (list.indexOf(Integer.valueOf(i)) >= list.indexOf(Integer.valueOf(i2))) {
                return i;
            }
            return i2;
        }

        public final void h(Range<Integer> range) {
            Range<Integer> range2 = AbstractC4008Qd2.a;
            if (!range.equals(range2)) {
                if (this.b.l().equals(range2)) {
                    this.b.u(range);
                } else if (!this.b.l().equals(range)) {
                    this.i = false;
                    C7433k41.a(l, "Different ExpectedFrameRateRange values");
                }
            }
        }
    }

    public T12(List<e> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC3393Jv> list4, List<c> list5, C3597Ly c3597Ly, InputConfiguration inputConfiguration) {
        this.a = list;
        this.b = Collections.unmodifiableList(list2);
        this.c = Collections.unmodifiableList(list3);
        this.d = Collections.unmodifiableList(list4);
        this.e = Collections.unmodifiableList(list5);
        this.f = c3597Ly;
        this.g = inputConfiguration;
    }

    public static T12 a() {
        return new T12(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C3597Ly.a().h(), null);
    }

    public List<CameraDevice.StateCallback> b() {
        return this.b;
    }

    public List<c> c() {
        return this.e;
    }

    public Range<Integer> d() {
        return this.f.e();
    }

    public HJ e() {
        return this.f.f();
    }

    public InputConfiguration f() {
        return this.g;
    }

    public List<e> g() {
        return this.a;
    }

    public List<AbstractC3393Jv> h() {
        return this.f.c();
    }

    public C3597Ly i() {
        return this.f;
    }

    public List<CameraCaptureSession.StateCallback> j() {
        return this.c;
    }

    public List<AbstractC3393Jv> k() {
        return this.d;
    }

    public List<D10> l() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.a) {
            arrayList.add(eVar.e());
            for (D10 d10 : eVar.d()) {
                arrayList.add(d10);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int m() {
        return this.f.i();
    }
}
