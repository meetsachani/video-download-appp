package o;

import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import o.C6161et;
import o.C8322nf1;

@Deprecated
/* loaded from: classes2.dex */
public class DY implements InterfaceC8430o60 {
    public static final SparseArray<Constructor<? extends InterfaceC8187n60>> c = c();
    public final C6161et.d a;
    public final Executor b;

    @Deprecated
    public DY(C6161et.d dVar) {
        this(dVar, new D6());
    }

    public static SparseArray<Constructor<? extends InterfaceC8187n60>> c() {
        SparseArray<Constructor<? extends InterfaceC8187n60>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, d(C5825dU.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, d(OH0.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, d(C9037qb2.class));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    public static Constructor<? extends InterfaceC8187n60> d(Class<?> cls) {
        try {
            return cls.asSubclass(InterfaceC8187n60.class).getConstructor(C8322nf1.class, C6161et.d.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    @Override // o.InterfaceC8430o60
    public InterfaceC8187n60 a(C5972e60 c5972e60) {
        int P0 = TD2.P0(c5972e60.Y, c5972e60.Z);
        if (P0 != 0 && P0 != 1 && P0 != 2) {
            if (P0 == 4) {
                return new C7250jJ1(new C8322nf1.c().L(c5972e60.Y).l(c5972e60.a1).a(), this.a, this.b);
            }
            throw new IllegalArgumentException("Unsupported type: " + P0);
        }
        return b(c5972e60, P0);
    }

    public final InterfaceC8187n60 b(C5972e60 c5972e60, int i) {
        Constructor<? extends InterfaceC8187n60> constructor = c.get(i);
        if (constructor != null) {
            try {
                return constructor.newInstance(new C8322nf1.c().L(c5972e60.Y).H(c5972e60.Y0).l(c5972e60.a1).a(), this.a, this.b);
            } catch (Exception e) {
                throw new IllegalStateException("Failed to instantiate downloader for content type " + i, e);
            }
        }
        throw new IllegalStateException("Module missing for content type " + i);
    }

    public DY(C6161et.d dVar, Executor executor) {
        this.a = (C6161et.d) C9542sf.g(dVar);
        this.b = (Executor) C9542sf.g(executor);
    }
}
