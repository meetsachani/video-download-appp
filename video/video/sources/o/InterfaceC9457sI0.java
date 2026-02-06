package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: o.sI0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9457sI0 extends Cloneable {
    int E0() throws IOException;

    InputStream G0() throws IOException;

    void H0(C5730d60 c5730d60) throws IOException;

    InputStream P3() throws IOException;

    Map<String, List<String>> T1();

    String Z0(String str);

    /* renamed from: clone */
    InterfaceC9457sI0 mo17clone();

    void close();

    long getContentLength();
}
