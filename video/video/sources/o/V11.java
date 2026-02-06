package o;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class V11 {

    /* loaded from: classes.dex */
    public interface a<D> {
        void a(Q11<D> q11);

        Q11<D> b(int i, Bundle bundle);

        void c(Q11<D> q11, D d);
    }

    public static void c(boolean z) {
        W11.d = z;
    }

    public static <T extends KZ0 & HH2> V11 d(T t) {
        return new W11(t, t.A());
    }

    public abstract void a(int i);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> Q11<D> e(int i);

    public boolean f() {
        return false;
    }

    public abstract <D> Q11<D> g(int i, Bundle bundle, a<D> aVar);

    public abstract void h();

    public abstract <D> Q11<D> i(int i, Bundle bundle, a<D> aVar);
}
