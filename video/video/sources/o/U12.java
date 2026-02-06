package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class U12 {
    public static final int b = 0;
    public static final int c = 1;
    public final c a;

    /* loaded from: classes.dex */
    public static final class b implements c {
        public final List<C3006Fw1> a;
        public final CameraCaptureSession.StateCallback b;
        public final Executor c;
        public final int d;
        public C5567cQ0 e = null;
        public CaptureRequest f = null;

        public b(int i, List<C3006Fw1> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.d = i;
            this.a = Collections.unmodifiableList(new ArrayList(list));
            this.b = stateCallback;
            this.c = executor;
        }

        @Override // o.U12.c
        public C5567cQ0 a() {
            return this.e;
        }

        @Override // o.U12.c
        public Executor d() {
            return this.c;
        }

        @Override // o.U12.c
        public CameraCaptureSession.StateCallback e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.e, bVar.e) && this.d == bVar.d && this.a.size() == bVar.a.size()) {
                    for (int i = 0; i < this.a.size(); i++) {
                        if (!this.a.get(i).equals(bVar.a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // o.U12.c
        public void f(C5567cQ0 c5567cQ0) {
            if (this.d != 1) {
                this.e = c5567cQ0;
                return;
            }
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }

        @Override // o.U12.c
        public CaptureRequest g() {
            return this.f;
        }

        @Override // o.U12.c
        public List<C3006Fw1> h() {
            return this.a;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() ^ 31;
            int i = (hashCode2 << 5) - hashCode2;
            C5567cQ0 c5567cQ0 = this.e;
            if (c5567cQ0 == null) {
                hashCode = 0;
            } else {
                hashCode = c5567cQ0.hashCode();
            }
            int i2 = hashCode ^ i;
            return this.d ^ ((i2 << 5) - i2);
        }

        @Override // o.U12.c
        public Object i() {
            return null;
        }

        @Override // o.U12.c
        public int j() {
            return this.d;
        }

        @Override // o.U12.c
        public void k(CaptureRequest captureRequest) {
            this.f = captureRequest;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        C5567cQ0 a();

        Executor d();

        CameraCaptureSession.StateCallback e();

        void f(C5567cQ0 c5567cQ0);

        CaptureRequest g();

        List<C3006Fw1> h();

        Object i();

        int j();

        void k(CaptureRequest captureRequest);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    public U12(int i, List<C3006Fw1> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new b(i, list, executor, stateCallback);
        } else {
            this.a = new a(i, list, executor, stateCallback);
        }
    }

    public static List<OutputConfiguration> i(List<C3006Fw1> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C3006Fw1 c3006Fw1 : list) {
            arrayList.add((OutputConfiguration) c3006Fw1.n());
        }
        return arrayList;
    }

    public static List<C3006Fw1> j(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration outputConfiguration : list) {
            arrayList.add(C3006Fw1.o(outputConfiguration));
        }
        return arrayList;
    }

    public static U12 l(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return new U12(new a(obj));
    }

    public Executor a() {
        return this.a.d();
    }

    public C5567cQ0 b() {
        return this.a.a();
    }

    public List<C3006Fw1> c() {
        return this.a.h();
    }

    public CaptureRequest d() {
        return this.a.g();
    }

    public int e() {
        return this.a.j();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof U12)) {
            return false;
        }
        return this.a.equals(((U12) obj).a);
    }

    public CameraCaptureSession.StateCallback f() {
        return this.a.e();
    }

    public void g(C5567cQ0 c5567cQ0) {
        this.a.f(c5567cQ0);
    }

    public void h(CaptureRequest captureRequest) {
        this.a.k(captureRequest);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object k() {
        return this.a.i();
    }

    /* loaded from: classes.dex */
    public static final class a implements c {
        public final SessionConfiguration a;
        public final List<C3006Fw1> b;

        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.a = sessionConfiguration;
            this.b = Collections.unmodifiableList(U12.j(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // o.U12.c
        public C5567cQ0 a() {
            return C5567cQ0.f(this.a.getInputConfiguration());
        }

        @Override // o.U12.c
        public Executor d() {
            return this.a.getExecutor();
        }

        @Override // o.U12.c
        public CameraCaptureSession.StateCallback e() {
            return this.a.getStateCallback();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Objects.equals(this.a, ((a) obj).a);
        }

        @Override // o.U12.c
        public void f(C5567cQ0 c5567cQ0) {
            this.a.setInputConfiguration((InputConfiguration) c5567cQ0.e());
        }

        @Override // o.U12.c
        public CaptureRequest g() {
            return this.a.getSessionParameters();
        }

        @Override // o.U12.c
        public List<C3006Fw1> h() {
            return this.b;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // o.U12.c
        public Object i() {
            return this.a;
        }

        @Override // o.U12.c
        public int j() {
            return this.a.getSessionType();
        }

        @Override // o.U12.c
        public void k(CaptureRequest captureRequest) {
            this.a.setSessionParameters(captureRequest);
        }

        public a(int i, List<C3006Fw1> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i, U12.i(list), executor, stateCallback));
        }
    }

    public U12(c cVar) {
        this.a = cVar;
    }
}
