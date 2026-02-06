package o;

import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: o.oN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8499oN0 {

    /* renamed from: o.oN0$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(InterfaceC8499oN0 interfaceC8499oN0);
    }

    androidx.camera.core.g a();

    int c();

    void close();

    void d();

    int e();

    void f(a aVar, Executor executor);

    androidx.camera.core.g g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
