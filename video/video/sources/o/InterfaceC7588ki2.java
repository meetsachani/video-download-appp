package o;

import android.graphics.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* renamed from: o.ki2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7588ki2 extends Closeable {

    /* renamed from: o.ki2$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static final int a = 0;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.ki2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public @interface InterfaceC0300a {
        }

        public static a c(int i, InterfaceC7588ki2 interfaceC7588ki2) {
            return new C10533wj(i, interfaceC7588ki2);
        }

        public abstract int a();

        public abstract InterfaceC7588ki2 b();
    }

    default Matrix G5() {
        return new Matrix();
    }

    int Q4();

    Surface T3(Executor executor, InterfaceC10929yL<a> interfaceC10929yL);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    Size h0();

    void u3(float[] fArr, float[] fArr2);
}
