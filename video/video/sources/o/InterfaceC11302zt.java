package o;

import java.io.IOException;
import okhttp3.Request;

/* renamed from: o.zt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC11302zt<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    InterfaceC11302zt<T> mo16clone();

    FT1<T> execute() throws IOException;

    void g3(InterfaceC3386Jt<T> interfaceC3386Jt);

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C8120mp2 timeout();
}
